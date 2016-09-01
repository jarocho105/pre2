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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.PedidoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class PedidoPuntoVentaDetalleFormJInternalFrame extends PedidoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedidoPuntoVenta;
	
	protected JMenuBar jmenuBarDetallePedidoPuntoVenta;
	
	protected JMenu jmenuDetallePedidoPuntoVenta;
	protected JMenu jmenuDetalleArchivoPedidoPuntoVenta;
	protected JMenu jmenuDetalleAccionesPedidoPuntoVenta;
	protected JMenu jmenuDetalleDatosPedidoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsPedidoPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidoPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetallePedidoPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesa="";

	protected EstadoPedidoPuntoVentaBeanSwingJInternalFrame estadopedidopuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidopuntoventa="";
	
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;
	
	

	public DetallePedidoPuntoVentaBeanSwingJInternalFrame detallepedidopuntoventaBeanSwingJInternalFrame=null;
	public DetallePedidoPuntoVentaBeanSwingJInternalFrame detallepedidopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePedidoPuntoVenta=false;
	public DetallePedidoPuntoVentaSessionBean detallepedidopuntoventaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public CajaSessionBean cajaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public MesaSessionBean mesaSessionBean;
	public EstadoPedidoPuntoVentaSessionBean estadopedidopuntoventaSessionBean;	
	
	public PedidoPuntoVentaLogic pedidopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosPedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionPedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralPedidoPuntoVenta;
	
	protected JPanel jPanelCamposPedidoPuntoVenta;    
	protected JPanel jPanelCamposOcultosPedidoPuntoVenta;    	
	protected JPanel jPanelAccionesPedidoPuntoVenta;
	protected JPanel jPanelAccionesFormularioPedidoPuntoVenta;
    
	
	
	protected Integer iXPanelCamposPedidoPuntoVenta=0;
	protected Integer iYPanelCamposPedidoPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosPedidoPuntoVenta=0;
	protected Integer iYPanelCamposOcultosPedidoPuntoVenta=0;
	
	

	protected JPanel jPanelCamposFintotalPedidoPuntoVenta;
	protected Integer iXPanelCamposFintotalPedidoPuntoVenta=0;
	protected Integer iYPanelCamposFintotalPedidoPuntoVenta=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedidoPuntoVenta;
	public JButton jButtonModificarPedidoPuntoVenta;
	public JButton jButtonActualizarPedidoPuntoVenta;
    public JButton jButtonEliminarPedidoPuntoVenta;
	public JButton jButtonCancelarPedidoPuntoVenta;
    public JButton jButtonGuardarCambiosPedidoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaPedidoPuntoVenta;
	protected JButton jButtonCerrarPedidoPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionPedidoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedidoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedidoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedidoPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoPuntoVenta;
	protected JButton jButtonModificarToolBarPedidoPuntoVenta;
	protected JButton jButtonActualizarToolBarPedidoPuntoVenta;
    protected JButton jButtonEliminarToolBarPedidoPuntoVenta;
	protected JButton jButtonCancelarToolBarPedidoPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarPedidoPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarPedidoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoPuntoVenta;
	protected JButton jButtonCerrarToolBarPedidoPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarPedidoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoPuntoVenta;
	protected JMenuItem jMenuItemModificarPedidoPuntoVenta;
	protected JMenuItem jMenuItemActualizarPedidoPuntoVenta;
    protected JMenuItem jMenuItemEliminarPedidoPuntoVenta;
	protected JMenuItem jMenuItemCancelarPedidoPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosPedidoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoPuntoVenta;
	protected JMenuItem jMenuItemCerrarPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionPedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarPedidoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedidoPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedidoPuntoVenta;
	public JLabel jLabelIdPedidoPuntoVenta;
	public JLabel jLabelidPedidoPuntoVenta;
	public JButton jButtonidPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialPedidoPuntoVenta;
	public JLabel jLabelnumero_secuencialPedidoPuntoVenta;
	public JTextField jTextFieldnumero_secuencialPedidoPuntoVenta;
	public JButton jButtonnumero_secuencialPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clientePedidoPuntoVenta;
	public JLabel jLabelcodigo_clientePedidoPuntoVenta;
	public JTextField jTextFieldcodigo_clientePedidoPuntoVenta;
	public JButton jButtoncodigo_clientePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clientePedidoPuntoVenta;
	public JLabel jLabelnombre_clientePedidoPuntoVenta;
	public JTextArea jTextAreanombre_clientePedidoPuntoVenta;
	public JScrollPane jscrollPanenombre_clientePedidoPuntoVenta;
	public JButton jButtonnombre_clientePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_clientePedidoPuntoVenta;
	public JLabel jLabeldireccion_clientePedidoPuntoVenta;
	public JTextArea jTextAreadireccion_clientePedidoPuntoVenta;
	public JScrollPane jscrollPanedireccion_clientePedidoPuntoVenta;
	public JButton jButtondireccion_clientePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_clientePedidoPuntoVenta;
	public JLabel jLabeltelefono_clientePedidoPuntoVenta;
	public JTextArea jTextAreatelefono_clientePedidoPuntoVenta;
	public JScrollPane jscrollPanetelefono_clientePedidoPuntoVenta;
	public JButton jButtontelefono_clientePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltarjeta_clientePedidoPuntoVenta;
	public JLabel jLabeltarjeta_clientePedidoPuntoVenta;
	public JTextField jTextFieldtarjeta_clientePedidoPuntoVenta;
	public JButton jButtontarjeta_clientePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfechaPedidoPuntoVenta;
	public JLabel jLabelfechaPedidoPuntoVenta;
	//public JFormattedTextField jDateChooserfechaPedidoPuntoVenta;

	public JDateChooser jDateChooserfechaPedidoPuntoVenta;
	public JButton jButtonfechaPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelhoraPedidoPuntoVenta;
	public JLabel jLabelhoraPedidoPuntoVenta;
	public JSpinner jSpinnerhoraPedidoPuntoVenta= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhoraPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalPedidoPuntoVenta;
	public JLabel jLabelsub_totalPedidoPuntoVenta;
	public JTextField jTextFieldsub_totalPedidoPuntoVenta;
	public JButton jButtonsub_totalPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelivaPedidoPuntoVenta;
	public JLabel jLabelivaPedidoPuntoVenta;
	public JTextField jTextFieldivaPedidoPuntoVenta;
	public JButton jButtonivaPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelicePedidoPuntoVenta;
	public JLabel jLabelicePedidoPuntoVenta;
	public JTextField jTextFieldicePedidoPuntoVenta;
	public JButton jButtonicePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoPedidoPuntoVenta;
	public JLabel jLabeldescuentoPedidoPuntoVenta;
	public JTextField jTextFielddescuentoPedidoPuntoVenta;
	public JButton jButtondescuentoPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotalPedidoPuntoVenta;
	public JLabel jLabeltotalPedidoPuntoVenta;
	public JTextField jTextFieldtotalPedidoPuntoVenta;
	public JButton jButtontotalPedidoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedidoPuntoVenta;
	public JLabel jLabelid_empresaPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedidoPuntoVenta;
	public JButton jButtonid_empresaPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPedidoPuntoVenta;
	public JLabel jLabelid_sucursalPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPedidoPuntoVenta;
	public JButton jButtonid_sucursalPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioPedidoPuntoVenta;
	public JLabel jLabelid_usuarioPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioPedidoPuntoVenta;
	public JButton jButtonid_usuarioPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_usuarioPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorPedidoPuntoVenta;
	public JLabel jLabelid_vendedorPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorPedidoPuntoVenta;
	public JButton jButtonid_vendedorPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_vendedorPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorPedidoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorPedidoPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_cajaPedidoPuntoVenta;
	public JLabel jLabelid_cajaPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaPedidoPuntoVenta;
	public JButton jButtonid_cajaPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_cajaPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cajaPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePedidoPuntoVenta;
	public JLabel jLabelid_clientePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePedidoPuntoVenta;
	public JButton jButtonid_clientePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_clientePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_clientePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioPedidoPuntoVenta;
	public JLabel jLabelid_tipo_precioPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioPedidoPuntoVenta;
	public JButton jButtonid_tipo_precioPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_precioPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesaPedidoPuntoVenta;
	public JLabel jLabelid_mesaPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesaPedidoPuntoVenta;
	public JButton jButtonid_mesaPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_mesaPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_mesaPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta;
	public JLabel jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta;
	public JButton jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedidoPuntoVenta;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1115;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=579;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidoPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedidoPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioPedidoPuntoVenta=new JPanel();
				this.jmenuBarDetallePedidoPuntoVenta=new JMenuBar();
				this.jTtoolBarDetallePedidoPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidoPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarPedidoPuntoVenta() {
		return this.jButtonActualizarToolBarPedidoPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarPedidoPuntoVenta() {
		return this.jButtonEliminarToolBarPedidoPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarPedidoPuntoVenta() {
		return this.jButtonCancelarToolBarPedidoPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionPedidoPuntoVenta() {
		return this.jButtonProcesarInformacionPedidoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoPuntoVenta)	{
		this.jButtonProcesarInformacionPedidoPuntoVenta = jButtonProcesarInformacionPedidoPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesPedidoPuntoVenta) {
		this.jComboBoxTiposRelacionesPedidoPuntoVenta = jComboBoxTiposRelacionesPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesPedidoPuntoVenta) {
		this.jComboBoxTiposAccionesPedidoPuntoVenta = jComboBoxTiposAccionesPedidoPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioPedidoPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta = jComboBoxTiposAccionesFormularioPedidoPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		
		this.pedidopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedidoPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarPedidoPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedidoPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedidoPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedidoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedidoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedidoPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedidoPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedidoPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedidoPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedidoPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedidoPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedidoPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedidoPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedidoPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedidoPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedidoPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedidoPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedidoPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedidoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedidoPuntoVenta.add(this.jMenuItemDetalleCerrarPedidoPuntoVenta);
		
		this.jmenuDetalleAccionesPedidoPuntoVenta.add(this.jMenuItemActualizarPedidoPuntoVenta);
		this.jmenuDetalleAccionesPedidoPuntoVenta.add(this.jMenuItemEliminarPedidoPuntoVenta);
		this.jmenuDetalleAccionesPedidoPuntoVenta.add(this.jMenuItemCancelarPedidoPuntoVenta);		
		
		//this.jmenuDetalleDatosPedidoPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByPedidoPuntoVenta);				
		this.jmenuDetalleDatosPedidoPuntoVenta.add(this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta);				
				
		//this.jmenuDetalleAccionesPedidoPuntoVenta.add(this.jMenuItemGuardarCambiosPedidoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedidoPuntoVenta.add(this.jmenuDetalleArchivoPedidoPuntoVenta);		
		this.jmenuBarDetallePedidoPuntoVenta.add(this.jmenuDetalleAccionesPedidoPuntoVenta);		
		this.jmenuBarDetallePedidoPuntoVenta.add(this.jmenuDetalleDatosPedidoPuntoVenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoPuntoVenta.add(this.jmenuDetallePedidoPuntoVenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposPedidoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedidoPuntoVenta = new JLabelMe();
		jLabelIdPedidoPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedidoPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedidoPuntoVenta= new GridBagLayout();

		this.jPanelidPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);

		jLabelidPedidoPuntoVenta = new JLabel();
		jLabelidPedidoPuntoVenta.setText("Id");

		jLabelidPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_secuencialPedidoPuntoVenta = new JLabelMe();
		this.jLabelnumero_secuencialPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_NUMERO_SECUENCIAL+" : *");
		this.jLabelnumero_secuencialPedidoPuntoVenta.setToolTipText("No. Secuencial");
		this.jLabelnumero_secuencialPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_NUMERO_SECUENCIAL);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelnumero_secuencialPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextFieldnumero_secuencialPedidoPuntoVenta= new JTextFieldMe();

		jTextFieldnumero_secuencialPedidoPuntoVenta.setEnabled(false);
		jTextFieldnumero_secuencialPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialPedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clientePedidoPuntoVenta = new JLabelMe();
		this.jLabelcodigo_clientePedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clientePedidoPuntoVenta.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clientePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clientePedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelcodigo_clientePedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextFieldcodigo_clientePedidoPuntoVenta= new JTextFieldMe();

		jTextFieldcodigo_clientePedidoPuntoVenta.setEnabled(false);
		jTextFieldcodigo_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clientePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoncodigo_clientePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clientePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clientePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clientePedidoPuntoVentaBusqueda.setText("U");
		this.jButtoncodigo_clientePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clientePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clientePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clientePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clientePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clientePedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clientePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clientePedidoPuntoVenta = new JLabelMe();
		this.jLabelnombre_clientePedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clientePedidoPuntoVenta.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clientePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clientePedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelnombre_clientePedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextAreanombre_clientePedidoPuntoVenta= new JTextAreaMe();
		jTextAreanombre_clientePedidoPuntoVenta.setEnabled(false);
		jTextAreanombre_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePedidoPuntoVenta.setLineWrap(true);
		jTextAreanombre_clientePedidoPuntoVenta.setWrapStyleWord(true);
		jTextAreanombre_clientePedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clientePedidoPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clientePedidoPuntoVenta = new JScrollPane(jTextAreanombre_clientePedidoPuntoVenta);
		jscrollPanenombre_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_clientePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnombre_clientePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clientePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clientePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clientePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonnombre_clientePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clientePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clientePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clientePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clientePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clientePedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clientePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_clientePedidoPuntoVenta = new JLabelMe();
		this.jLabeldireccion_clientePedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE+" : *");
		this.jLabeldireccion_clientePedidoPuntoVenta.setToolTipText("Direccion Cliente");
		this.jLabeldireccion_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_clientePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_clientePedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPaneldireccion_clientePedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextAreadireccion_clientePedidoPuntoVenta= new JTextAreaMe();
		jTextAreadireccion_clientePedidoPuntoVenta.setEnabled(false);
		jTextAreadireccion_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clientePedidoPuntoVenta.setLineWrap(true);
		jTextAreadireccion_clientePedidoPuntoVenta.setWrapStyleWord(true);
		jTextAreadireccion_clientePedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_clientePedidoPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_clientePedidoPuntoVenta = new JScrollPane(jTextAreadireccion_clientePedidoPuntoVenta);
		jscrollPanedireccion_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccion_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccion_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccion_clientePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondireccion_clientePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clientePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clientePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_clientePedidoPuntoVentaBusqueda.setText("U");
		this.jButtondireccion_clientePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_clientePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_clientePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_clientePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_clientePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_clientePedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_clientePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_clientePedidoPuntoVenta = new JLabelMe();
		this.jLabeltelefono_clientePedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE+" : *");
		this.jLabeltelefono_clientePedidoPuntoVenta.setToolTipText("Telefono Cliente");
		this.jLabeltelefono_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_clientePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_clientePedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPaneltelefono_clientePedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextAreatelefono_clientePedidoPuntoVenta= new JTextAreaMe();
		jTextAreatelefono_clientePedidoPuntoVenta.setEnabled(false);
		jTextAreatelefono_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clientePedidoPuntoVenta.setLineWrap(true);
		jTextAreatelefono_clientePedidoPuntoVenta.setWrapStyleWord(true);
		jTextAreatelefono_clientePedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_clientePedidoPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_clientePedidoPuntoVenta = new JScrollPane(jTextAreatelefono_clientePedidoPuntoVenta);
		jscrollPanetelefono_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetelefono_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetelefono_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtontelefono_clientePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontelefono_clientePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clientePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clientePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_clientePedidoPuntoVentaBusqueda.setText("U");
		this.jButtontelefono_clientePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_clientePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_clientePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_clientePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_clientePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_clientePedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_clientePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltarjeta_clientePedidoPuntoVenta = new JLabelMe();
		this.jLabeltarjeta_clientePedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE+" :");
		this.jLabeltarjeta_clientePedidoPuntoVenta.setToolTipText("Tarjeta Cliente");
		this.jLabeltarjeta_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltarjeta_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltarjeta_clientePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltarjeta_clientePedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPaneltarjeta_clientePedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextFieldtarjeta_clientePedidoPuntoVenta= new JTextFieldMe();

		jTextFieldtarjeta_clientePedidoPuntoVenta.setEnabled(false);
		jTextFieldtarjeta_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtarjeta_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtarjeta_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtarjeta_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontarjeta_clientePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontarjeta_clientePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_clientePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_clientePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontarjeta_clientePedidoPuntoVentaBusqueda.setText("U");
		this.jButtontarjeta_clientePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontarjeta_clientePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontarjeta_clientePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtarjeta_clientePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtarjeta_clientePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tarjeta_clientePedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontarjeta_clientePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfechaPedidoPuntoVenta = new JLabelMe();
		this.jLabelfechaPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPedidoPuntoVenta.setToolTipText("Fecha");
		this.jLabelfechaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelfechaPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		//jFormattedTextFieldfechaPedidoPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfechaPedidoPuntoVenta= new JDateChooser();
		jDateChooserfechaPedidoPuntoVenta.setEnabled(false);
		jDateChooserfechaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPedidoPuntoVenta.setDate(new Date());
		jDateChooserfechaPedidoPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPedidoPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfechaPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonfechaPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelhoraPedidoPuntoVenta = new JLabelMe();
		this.jLabelhoraPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_HORA+" : *");
		this.jLabelhoraPedidoPuntoVenta.setToolTipText("Hora");
		this.jLabelhoraPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoraPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoraPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoraPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_HORA);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelhoraPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		//jFormattedTextFieldhoraPedidoPuntoVenta= new JFormattedTextFieldMe();

		jSpinnerhoraPedidoPuntoVenta= new JSpinner(new SpinnerDateModel());;
		jSpinnerhoraPedidoPuntoVenta.setEnabled(false);
		JSpinner.DateEditor timeEditorhoraPedidoPuntoVenta = new JSpinner.DateEditor(jSpinnerhoraPedidoPuntoVenta, "HH:mm:ss");

		jSpinnerhoraPedidoPuntoVenta.setEditor(timeEditorhoraPedidoPuntoVenta);

		jSpinnerhoraPedidoPuntoVenta.setValue(new Date());

		jSpinnerhoraPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhoraPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhoraPedidoPuntoVenta.setValue(new Date());
		//jSpinnerhoraPedidoPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhoraPedidoPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhoraPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonhoraPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoraPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonhoraPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoraPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoraPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhoraPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhoraPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horaPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoraPedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalPedidoPuntoVenta = new JLabelMe();
		this.jLabelsub_totalPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalPedidoPuntoVenta.setToolTipText("Sub Total");
		this.jLabelsub_totalPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelsub_totalPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextFieldsub_totalPedidoPuntoVenta= new JTextFieldMe();
		jTextFieldsub_totalPedidoPuntoVenta.setEnabled(false);
		jTextFieldsub_totalPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalPedidoPuntoVenta.setText("0.0");

		this.jButtonsub_totalPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonsub_totalPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonsub_totalPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalPedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelivaPedidoPuntoVenta = new JLabelMe();
		this.jLabelivaPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaPedidoPuntoVenta.setToolTipText("Iva");
		this.jLabelivaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelivaPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextFieldivaPedidoPuntoVenta= new JTextFieldMe();
		jTextFieldivaPedidoPuntoVenta.setEnabled(false);
		jTextFieldivaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaPedidoPuntoVenta.setText("0.0");

		this.jButtonivaPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonivaPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonivaPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaPedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelicePedidoPuntoVenta = new JLabelMe();
		this.jLabelicePedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabelicePedidoPuntoVenta.setToolTipText("Ice");
		this.jLabelicePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelicePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelicePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelicePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelicePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelicePedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelicePedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextFieldicePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldicePedidoPuntoVenta.setEnabled(false);
		jTextFieldicePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldicePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldicePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldicePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldicePedidoPuntoVenta.setText("0.0");

		this.jButtonicePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonicePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonicePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonicePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonicePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonicePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonicePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonicePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldicePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldicePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"icePedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonicePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoPedidoPuntoVenta = new JLabelMe();
		this.jLabeldescuentoPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoPedidoPuntoVenta.setToolTipText("Descuento");
		this.jLabeldescuentoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPaneldescuentoPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextFielddescuentoPedidoPuntoVenta= new JTextFieldMe();
		jTextFielddescuentoPedidoPuntoVenta.setEnabled(false);
		jTextFielddescuentoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoPedidoPuntoVenta.setText("0.0");

		this.jButtondescuentoPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuentoPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoPedidoPuntoVentaBusqueda.setText("U");
		this.jButtondescuentoPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoPedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotalPedidoPuntoVenta = new JLabelMe();
		this.jLabeltotalPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalPedidoPuntoVenta.setToolTipText("Total");
		this.jLabeltotalPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPaneltotalPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jTextFieldtotalPedidoPuntoVenta= new JTextFieldMe();
		jTextFieldtotalPedidoPuntoVenta.setEnabled(false);
		jTextFieldtotalPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalPedidoPuntoVenta.setText("0.0");

		this.jButtontotalPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotalPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalPedidoPuntoVentaBusqueda.setText("U");
		this.jButtontotalPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalPedidoPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedidoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedidoPuntoVenta = new JLabelMe();
		this.jLabelid_empresaPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedidoPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_empresaPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedidoPuntoVenta.setEnabled(false);

		this.jButtonid_empresaPedidoPuntoVenta= new JButtonMe();
		this.jButtonid_empresaPedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoPuntoVenta.setText("Buscar");
		this.jButtonid_empresaPedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoPuntoVenta"));

		this.jButtonid_empresaPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaPedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaPedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoPuntoVentaUpdate"));



					
		this.jLabelid_sucursalPedidoPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPedidoPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_sucursalPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPedidoPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalPedidoPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalPedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalPedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoPuntoVenta"));

		this.jButtonid_sucursalPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalPedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalPedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoPuntoVentaUpdate"));



					
		this.jLabelid_usuarioPedidoPuntoVenta = new JLabelMe();
		this.jLabelid_usuarioPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioPedidoPuntoVenta.setToolTipText("Usuario");
		this.jLabelid_usuarioPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_usuarioPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_usuarioPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_usuarioPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioPedidoPuntoVenta.setEnabled(false);

		this.jButtonid_usuarioPedidoPuntoVenta= new JButtonMe();
		this.jButtonid_usuarioPedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoPuntoVenta.setText("Buscar");
		this.jButtonid_usuarioPedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioPedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoPuntoVenta"));

		this.jButtonid_usuarioPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_usuarioPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_usuarioPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioPedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioPedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_usuarioPedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_usuarioPedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioPedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoPuntoVentaUpdate"));



					
		this.jLabelid_vendedorPedidoPuntoVenta = new JLabelMe();
		this.jLabelid_vendedorPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorPedidoPuntoVenta.setToolTipText("Vendedor");
		this.jLabelid_vendedorPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_vendedorPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_vendedorPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_vendedorPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorPedidoPuntoVenta= new JButtonMe();
		this.jButtonid_vendedorPedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedidoPuntoVenta.setText("Buscar");
		this.jButtonid_vendedorPedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorPedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoPuntoVenta"));

		this.jButtonid_vendedorPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_vendedorPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_vendedorPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorPedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorPedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_vendedorPedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_vendedorPedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorPedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoPuntoVentaUpdate"));


		jButtonid_vendedorPedidoPuntoVentaArbol= new JButtonMe();
		jButtonid_vendedorPedidoPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoPuntoVentaArbol.setText("Arbol");
		jButtonid_vendedorPedidoPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorPedidoPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoPuntoVentaArbol"));



					
		this.jLabelid_cajaPedidoPuntoVenta = new JLabelMe();
		this.jLabelid_cajaPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaPedidoPuntoVenta.setToolTipText("Caja");
		this.jLabelid_cajaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_cajaPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_cajaPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_cajaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaPedidoPuntoVenta= new JButtonMe();
		this.jButtonid_cajaPedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaPedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaPedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaPedidoPuntoVenta.setText("Buscar");
		this.jButtonid_cajaPedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaPedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaPedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaPedidoPuntoVenta"));

		this.jButtonid_cajaPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_cajaPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_cajaPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaPedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_cajaPedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_cajaPedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaPedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaPedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaPedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_cajaPedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaPedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaPedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaPedidoPuntoVentaUpdate"));



					
		this.jLabelid_clientePedidoPuntoVenta = new JLabelMe();
		this.jLabelid_clientePedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePedidoPuntoVenta.setToolTipText("Cliente");
		this.jLabelid_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_clientePedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_clientePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_clientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePedidoPuntoVenta= new JButtonMe();
		this.jButtonid_clientePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoPuntoVenta.setText("Buscar");
		this.jButtonid_clientePedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoPuntoVenta"));

		this.jButtonid_clientePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_clientePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_clientePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_clientePedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_clientePedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_clientePedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoPuntoVentaUpdate"));



					
		this.jLabelid_tipo_precioPedidoPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_precioPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioPedidoPuntoVenta.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_precioPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_tipo_precioPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_precioPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioPedidoPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_precioPedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedidoPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_precioPedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioPedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedidoPuntoVenta"));

		this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioPedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioPedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_precioPedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_precioPedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioPedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedidoPuntoVentaUpdate"));



					
		this.jLabelid_mesaPedidoPuntoVenta = new JLabelMe();
		this.jLabelid_mesaPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDMESA+" : *");
		this.jLabelid_mesaPedidoPuntoVenta.setToolTipText("Mesa");
		this.jLabelid_mesaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesaPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDMESA);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_mesaPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_mesaPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_mesaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesaPedidoPuntoVenta= new JButtonMe();
		this.jButtonid_mesaPedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaPedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaPedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaPedidoPuntoVenta.setText("Buscar");
		this.jButtonid_mesaPedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesaPedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaPedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaPedidoPuntoVenta"));

		this.jButtonid_mesaPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_mesaPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesaPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_mesaPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesaPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesaPedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_mesaPedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_mesaPedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaPedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaPedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesaPedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_mesaPedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesaPedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaPedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaPedidoPuntoVentaUpdate"));



					
		this.jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta = new JLabelMe();
		this.jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta.setText(""+PedidoPuntoVentaConstantesFunciones.LABEL_IDESTADOPEDIDOPUNTOVENTA+" : *");
		this.jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta.setToolTipText("Estado");
		this.jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta.setToolTipText(PedidoPuntoVentaConstantesFunciones.LABEL_IDESTADOPEDIDOPUNTOVENTA);
		this.gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta.setLayout(this.gridaBagLayoutPedidoPuntoVenta);


		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta= new JButtonMe();
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta.setText("Buscar");
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_punto_ventaPedidoPuntoVenta"));

		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda"));

		if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_punto_ventaPedidoPuntoVentaUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetallePedidoPuntoVenta = new PedidoPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedido Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoPuntoVenta= new GridBagLayout();
		

		
		String sToolTipPedidoPuntoVenta="";
		sToolTipPedidoPuntoVenta=PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoPuntoVenta+="(PuntoVenta.PedidoPuntoVenta)";
		}
		
		if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedidoPuntoVenta = new JButtonMe();
		this.jButtonModificarPedidoPuntoVenta = new JButtonMe();
        this.jButtonActualizarPedidoPuntoVenta = new JButtonMe();
        this.jButtonEliminarPedidoPuntoVenta = new JButtonMe();
        this.jButtonCancelarPedidoPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosPedidoPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarPedidoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosPedidoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedidoPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralPedidoPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Punto Venta";
		
		if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposPedidoPuntoVenta.setName("jPanelCamposPedidoPuntoVenta"); 

		this.jPanelCamposOcultosPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedidoPuntoVenta.setName("jPanelCamposOcultosPedidoPuntoVenta"); 

        this.jPanelAccionesPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesPedidoPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedidoPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalPedidoPuntoVenta.setName("jPanelCamposFintotalPedidoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedidoPuntoVenta.setText("Nuevo");
		this.jButtonModificarPedidoPuntoVenta.setText("Editar");
        this.jButtonActualizarPedidoPuntoVenta.setText("Actualizar");
        this.jButtonEliminarPedidoPuntoVenta.setText("Eliminar");
        this.jButtonCancelarPedidoPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosPedidoPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedidoPuntoVenta.setText("Guardar");
		this.jButtonCerrarPedidoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoPuntoVenta,"nuevo_button","Nuevo",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedidoPuntoVenta,"modificar_button","Editar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedidoPuntoVenta,"actualizar_button","Actualizar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedidoPuntoVenta,"eliminar_button","Eliminar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedidoPuntoVenta,"cancelar_button","Cancelar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedidoPuntoVenta,"guardarcambios_button","Guardar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoPuntoVenta,"guardarcambiostabla_button","Guardar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoPuntoVenta,"cerrar_button","Salir",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedidoPuntoVenta.setToolTipText("Nuevo"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedidoPuntoVenta.setToolTipText("Editar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedidoPuntoVenta.setToolTipText("Actualizar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedidoPuntoVenta.setToolTipText("Eliminar)"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedidoPuntoVenta.setToolTipText("Cancelar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedidoPuntoVenta.setToolTipText("Guardar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedidoPuntoVenta.setToolTipText("Guardar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoPuntoVenta.setToolTipText("Salir"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoPuntoVenta";
		inputMap = this.jButtonNuevoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedidoPuntoVenta";
		inputMap = this.jButtonActualizarPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedidoPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarPedidoPuntoVenta";
		inputMap = this.jButtonEliminarPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedidoPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarPedidoPuntoVenta";
		inputMap = this.jButtonCancelarPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedidoPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarPedidoPuntoVenta";
		inputMap = this.jButtonCerrarPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedidoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedidoPuntoVenta.setToolTipText("Nuevo PedidoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedidoPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedidoPuntoVenta.setToolTipText("Sin Cerrar Ventana PedidoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedidoPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedidoPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesPedidoPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedidoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesPedidoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedidoPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedidoPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedidoPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedidoPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedidoPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposPedidoPuntoVenta.setLayout(gridaBagLayoutCamposPedidoPuntoVenta);
		this.jPanelCamposOcultosPedidoPuntoVenta.setLayout(gridaBagLayoutCamposOcultosPedidoPuntoVenta);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalPedidoPuntoVenta= new GridBagLayout();
		this.jPanelCamposFintotalPedidoPuntoVenta.setLayout(gridaBagLayoutCamposFintotalPedidoPuntoVenta);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidPedidoPuntoVenta.add(jLabelIdPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidPedidoPuntoVenta.add(jLabelidPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaPedidoPuntoVenta.add(jLabelid_empresaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoPuntoVenta.add(jButtonid_empresaPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoPuntoVenta.add(jButtonid_empresaPedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaPedidoPuntoVenta.add(jComboBoxid_empresaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalPedidoPuntoVenta.add(jLabelid_sucursalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoPuntoVenta.add(jButtonid_sucursalPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoPuntoVenta.add(jButtonid_sucursalPedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalPedidoPuntoVenta.add(jComboBoxid_sucursalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioPedidoPuntoVenta.add(jLabelid_usuarioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedidoPuntoVenta.add(jButtonid_usuarioPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedidoPuntoVenta.add(jButtonid_usuarioPedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioPedidoPuntoVenta.add(jComboBoxid_usuarioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_vendedorPedidoPuntoVenta.add(jLabelid_vendedorPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPedidoPuntoVenta.add(jButtonid_vendedorPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPedidoPuntoVenta.add(jButtonid_vendedorPedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_vendedorPedidoPuntoVenta.add(jComboBoxid_vendedorPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cajaPedidoPuntoVenta.add(jLabelid_cajaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaPedidoPuntoVenta.add(jButtonid_cajaPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaPedidoPuntoVenta.add(jButtonid_cajaPedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cajaPedidoPuntoVenta.add(jComboBoxid_cajaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clientePedidoPuntoVenta.add(jLabelid_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePedidoPuntoVenta.add(jButtonid_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoPuntoVenta.add(jButtonid_clientePedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 4;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoPuntoVenta.add(jButtonid_clientePedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clientePedidoPuntoVenta.add(jComboBoxid_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_precioPedidoPuntoVenta.add(jLabelid_tipo_precioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPedidoPuntoVenta.add(jButtonid_tipo_precioPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPedidoPuntoVenta.add(jButtonid_tipo_precioPedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_precioPedidoPuntoVenta.add(jComboBoxid_tipo_precioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesaPedidoPuntoVenta.add(jLabelid_mesaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesaPedidoPuntoVenta.add(jButtonid_mesaPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesaPedidoPuntoVenta.add(jButtonid_mesaPedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesaPedidoPuntoVenta.add(jComboBoxid_mesaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta.add(jLabelid_estado_pedido_punto_ventaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta.add(jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta.add(jButtonid_estado_pedido_punto_ventaPedidoPuntoVentaUpdate, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta.add(jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialPedidoPuntoVenta.add(jLabelnumero_secuencialPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialPedidoPuntoVenta.add(jButtonnumero_secuencialPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialPedidoPuntoVenta.add(jTextFieldnumero_secuencialPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcodigo_clientePedidoPuntoVenta.add(jLabelcodigo_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clientePedidoPuntoVenta.add(jButtoncodigo_clientePedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcodigo_clientePedidoPuntoVenta.add(jTextFieldcodigo_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnombre_clientePedidoPuntoVenta.add(jLabelnombre_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clientePedidoPuntoVenta.add(jButtonnombre_clientePedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnombre_clientePedidoPuntoVenta.add(jscrollPanenombre_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldireccion_clientePedidoPuntoVenta.add(jLabeldireccion_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_clientePedidoPuntoVenta.add(jButtondireccion_clientePedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldireccion_clientePedidoPuntoVenta.add(jscrollPanedireccion_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltelefono_clientePedidoPuntoVenta.add(jLabeltelefono_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_clientePedidoPuntoVenta.add(jButtontelefono_clientePedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltelefono_clientePedidoPuntoVenta.add(jscrollPanetelefono_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltarjeta_clientePedidoPuntoVenta.add(jLabeltarjeta_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltarjeta_clientePedidoPuntoVenta.add(jButtontarjeta_clientePedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltarjeta_clientePedidoPuntoVenta.add(jTextFieldtarjeta_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaPedidoPuntoVenta.add(jLabelfechaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPedidoPuntoVenta.add(jButtonfechaPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaPedidoPuntoVenta.add(jDateChooserfechaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelhoraPedidoPuntoVenta.add(jLabelhoraPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoraPedidoPuntoVenta.add(jButtonhoraPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelhoraPedidoPuntoVenta.add(jSpinnerhoraPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsub_totalPedidoPuntoVenta.add(jLabelsub_totalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalPedidoPuntoVenta.add(jButtonsub_totalPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsub_totalPedidoPuntoVenta.add(jTextFieldsub_totalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaPedidoPuntoVenta.add(jLabelivaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaPedidoPuntoVenta.add(jButtonivaPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaPedidoPuntoVenta.add(jTextFieldivaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelicePedidoPuntoVenta.add(jLabelicePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelicePedidoPuntoVenta.add(jButtonicePedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelicePedidoPuntoVenta.add(jTextFieldicePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuentoPedidoPuntoVenta.add(jLabeldescuentoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoPedidoPuntoVenta.add(jButtondescuentoPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuentoPedidoPuntoVenta.add(jTextFielddescuentoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalPedidoPuntoVenta.add(jLabeltotalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalPedidoPuntoVenta.add(jButtontotalPedidoPuntoVentaBusqueda, this.gridBagConstraintsPedidoPuntoVenta);
	}

	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalPedidoPuntoVenta.add(jTextFieldtotalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelidPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelid_vendedorPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelid_cajaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelid_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelid_tipo_precioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelid_mesaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelid_estado_pedido_punto_ventaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelnumero_secuencialPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelcodigo_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelnombre_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPaneldireccion_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPaneltelefono_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPaneltarjeta_clientePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelfechaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposPedidoPuntoVenta.add(this.jPanelhoraPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposPedidoPuntoVenta % 3==0) {
		iXPanelCamposPedidoPuntoVenta=0;
		iYPanelCamposPedidoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposOcultosPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposOcultosPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosPedidoPuntoVenta.add(this.jPanelid_empresaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposOcultosPedidoPuntoVenta % 3==0) {
		iXPanelCamposOcultosPedidoPuntoVenta=0;
		iYPanelCamposOcultosPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposOcultosPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposOcultosPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosPedidoPuntoVenta.add(this.jPanelid_sucursalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposOcultosPedidoPuntoVenta % 3==0) {
		iXPanelCamposOcultosPedidoPuntoVenta=0;
		iYPanelCamposOcultosPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposOcultosPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposOcultosPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosPedidoPuntoVenta.add(this.jPanelid_usuarioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposOcultosPedidoPuntoVenta % 3==0) {
		iXPanelCamposOcultosPedidoPuntoVenta=0;
		iYPanelCamposOcultosPedidoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposFintotalPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposFintotalPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalPedidoPuntoVenta.add(this.jPanelsub_totalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposFintotalPedidoPuntoVenta % 3==0) {
		iXPanelCamposFintotalPedidoPuntoVenta=0;
		iYPanelCamposFintotalPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposFintotalPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposFintotalPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalPedidoPuntoVenta.add(this.jPanelivaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposFintotalPedidoPuntoVenta % 3==0) {
		iXPanelCamposFintotalPedidoPuntoVenta=0;
		iYPanelCamposFintotalPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposFintotalPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposFintotalPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalPedidoPuntoVenta.add(this.jPanelicePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposFintotalPedidoPuntoVenta % 3==0) {
		iXPanelCamposFintotalPedidoPuntoVenta=0;
		iYPanelCamposFintotalPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposFintotalPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposFintotalPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalPedidoPuntoVenta.add(this.jPaneldescuentoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposFintotalPedidoPuntoVenta % 3==0) {
		iXPanelCamposFintotalPedidoPuntoVenta=0;
		iYPanelCamposFintotalPedidoPuntoVenta++;
	}
	this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoPuntoVenta.gridy = iYPanelCamposFintotalPedidoPuntoVenta;
	this.gridBagConstraintsPedidoPuntoVenta.gridx = iXPanelCamposFintotalPedidoPuntoVenta++;
	this.gridBagConstraintsPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalPedidoPuntoVenta.add(this.jPaneltotalPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);



	if(iXPanelCamposFintotalPedidoPuntoVenta % 3==0) {
		iXPanelCamposFintotalPedidoPuntoVenta=0;
		iYPanelCamposFintotalPedidoPuntoVenta++;
	}
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesPedidoPuntoVenta.setLayout(gridaBagLayoutAccionesPedidoPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioPedidoPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioPedidoPuntoVenta);
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoPuntoVenta.add(this.jComboBoxTiposAccionesFormularioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoPuntoVenta.add(this.jCheckBoxPostAccionNuevoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.pedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.pedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoPuntoVenta.add(this.jCheckBoxPostAccionSinMensajePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedidoPuntoVenta.add(this.jButtonModificarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);							

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedidoPuntoVenta.add(this.jButtonEliminarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
			
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoPuntoVenta.add(this.jButtonActualizarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoPuntoVenta.add(this.jButtonGuardarCambiosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);	
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedidoPuntoVenta.add(this.jButtonCancelarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsPedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoPuntoVenta.gridx =0;
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedidoPuntoVenta = new PedidoPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedido Punto Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedido Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidoPuntoVentaModel pedidopuntoventaModel=new PedidoPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidoPuntoVentaModel.PedidoPuntoVentaFocusTraversalPolicy pedidopuntoventaFocusTraversalPolicy = pedidopuntoventaModel.new PedidoPuntoVentaFocusTraversalPolicy(this);
			
			//pedidopuntoventaFocusTraversalPolicy.setpedidopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidopuntoventaModel);
			
			
			this.jContentPaneDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetallePedidoPuntoVenta.setLayout(gridaBagLayoutDetallePedidoPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionPedidoPuntoVenta=   new JScrollPane(jContentPaneDetallePedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedidoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetallePedidoPuntoVenta.add(jPanelCamposPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);
			
			
			
			
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
						&& pedidopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoPuntoVenta(this.puedeCargarPorParteDetallePedidoPuntoVenta,false,-1);
					
					if(this.pedidopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedidoPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
						this.jContentPaneDetallePedidoPuntoVenta.add(this.jTabbedPaneRelacionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedidoPuntoVenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;

		this.jContentPaneDetallePedidoPuntoVenta.add(jPanelCamposFintotalPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedidoPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsPedidoPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetallePedidoPuntoVenta.add(jPanelCamposOcultosPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);
				
					this.jPanelCamposOcultosPedidoPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	        this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePedidoPuntoVenta.add(this.jPanelAccionesFormularioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);							
			
			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetallePedidoPuntoVenta.add(this.jPanelAccionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedidoPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedidoPuntoVenta=   new JScrollPane(this.jPanelCamposPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedidoPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			
			
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
			
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedidoPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionPedidoPuntoVenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetallePedidoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
		this.detallepedidopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.detallepedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.detallepedidopuntoventaBeanSwingJInternalFrame=null;//new DetallePedidoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallepedidopuntoventaBeanSwingJInternalFramePopup=new DetallePedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallepedidopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {

				DetallePedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallepedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.detallepedidopuntoventaBeanSwingJInternalFrame=new DetallePedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallepedidopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallepedidopuntoventaBeanSwingJInternalFrame.setdetallepedidopuntoventaSessionBean(this.detallepedidopuntoventaSessionBean);

				//this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
				//this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
				//this.jContentPaneDetallePedidoPuntoVenta.add(this.detallepedidopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPedidoPuntoVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPedidoPuntoVenta.add("Detalle Pedidos",this.detallepedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPedidoPuntoVenta.setComponentAt(iIndexTab,this.detallepedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallepedidopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.detallepedidopuntoventaBeanSwingJInternalFrame=null;//new DetallePedidoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePedidoPuntoVenta) {
					this.jTabbedPaneRelacionesPedidoPuntoVenta.add("Detalle Pedidos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetallePedidoPuntoVentaBeanSwingJInternalFrame(List<PedidoPuntoVenta> pedidopuntoventas,PedidoPuntoVenta pedidopuntoventa,DetallePedidoPuntoVentaBeanSwingJInternalFrame detallepedidopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallepedidopuntoventaBeanSwingJInternalFrame=new DetallePedidoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallepedidopuntoventaBeanSwingJInternalFrame.getDetallePedidoPuntoVentaLogic().setConnexion(this.pedidopuntoventaLogic.getConnexion());

					detallepedidopuntoventaBeanSwingJInternalFrame.setpedidopuntoventasForeignKey(pedidopuntoventas);
					detallepedidopuntoventaBeanSwingJInternalFrame.setpedidopuntoventaForeignKey(pedidopuntoventa);
					detallepedidopuntoventaBeanSwingJInternalFrame.detallepedidopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionPedidoPuntoVenta(true);
					detallepedidopuntoventaBeanSwingJInternalFrame.detallepedidopuntoventaSessionBean.setlidPedidoPuntoVentaActual(pedidopuntoventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallepedidopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePedidoPuntoVenta(detallepedidopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallepedidopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaPedidoPuntoVenta(true);
					detallepedidopuntoventaBeanSwingJInternalFrame.setid_pedido_punto_ventaFK_IdPedidoPuntoVenta(pedidopuntoventa.getId());

					if(!this.conCargarFormDetalle) {
						detallepedidopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallepedidopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFramePedidoPuntoVentaForeignKey(pedidopuntoventa,1,false,true,true);
					detallepedidopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallepedidopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdPedidoPuntoVenta");
					detallepedidopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPedidoPuntoVenta");
					detallepedidopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(true);
					detallepedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("n",detallepedidopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallepedidopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallepedidopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					detallepedidopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallepedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoPuntoVenta("relacionado");
					} else {
						detallepedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoPuntoVenta("no_relacionado");
					}

					detallepedidopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePedidoPuntoVenta().setVisible(false);

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
