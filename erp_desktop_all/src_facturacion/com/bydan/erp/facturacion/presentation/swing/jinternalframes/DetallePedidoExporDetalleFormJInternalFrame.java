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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.facturacion.util.DetallePedidoExporConstantesFunciones;

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
public class DetallePedidoExporDetalleFormJInternalFrame extends DetallePedidoExporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePedidoExpor;
	
	protected JMenuBar jmenuBarDetalleDetallePedidoExpor;
	
	protected JMenu jmenuDetalleDetallePedidoExpor;
	protected JMenu jmenuDetalleArchivoDetallePedidoExpor;
	protected JMenu jmenuDetalleAccionesDetallePedidoExpor;
	protected JMenu jmenuDetalleDatosDetallePedidoExpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedidoExpor;	
	protected GridBagConstraints gridBagConstraintsDetallePedidoExpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePedidoExporBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePedidoExpor;		
	
	
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

	protected PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidoexpor="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EstadoDetallePedidoBeanSwingJInternalFrame estadodetallepedidoexporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallepedidoexpor="";
	
	public DetallePedidoExporSessionBean detallepedidoexporSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public PedidoExporSessionBean pedidoexporSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EstadoDetallePedidoSessionBean estadodetallepedidoexporSessionBean;	
	
	public DetallePedidoExporLogic detallepedidoexporLogic;
	
	public JScrollPane jScrollPanelDatosDetallePedidoExpor;
	public JScrollPane jScrollPanelDatosEdicionDetallePedidoExpor;
	public JScrollPane jScrollPanelDatosGeneralDetallePedidoExpor;
	
	protected JPanel jPanelCamposDetallePedidoExpor;    
	protected JPanel jPanelCamposOcultosDetallePedidoExpor;    	
	protected JPanel jPanelAccionesDetallePedidoExpor;
	protected JPanel jPanelAccionesFormularioDetallePedidoExpor;
    
	
	
	protected Integer iXPanelCamposDetallePedidoExpor=0;
	protected Integer iYPanelCamposDetallePedidoExpor=0;
	
	protected Integer iXPanelCamposOcultosDetallePedidoExpor=0;
	protected Integer iYPanelCamposOcultosDetallePedidoExpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePedidoExpor;
	public JButton jButtonModificarDetallePedidoExpor;
	public JButton jButtonActualizarDetallePedidoExpor;
    public JButton jButtonEliminarDetallePedidoExpor;
	public JButton jButtonCancelarDetallePedidoExpor;
    public JButton jButtonGuardarCambiosDetallePedidoExpor;
	public JButton jButtonGuardarCambiosTablaDetallePedidoExpor;
	protected JButton jButtonCerrarDetallePedidoExpor;
	
	
	protected JButton jButtonProcesarInformacionDetallePedidoExpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePedidoExpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePedidoExpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePedidoExpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedidoExpor;
	protected JButton jButtonModificarToolBarDetallePedidoExpor;
	protected JButton jButtonActualizarToolBarDetallePedidoExpor;
    protected JButton jButtonEliminarToolBarDetallePedidoExpor;
	protected JButton jButtonCancelarToolBarDetallePedidoExpor;
    protected JButton jButtonGuardarCambiosToolBarDetallePedidoExpor;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePedidoExpor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedidoExpor;
	protected JButton jButtonCerrarToolBarDetallePedidoExpor;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePedidoExpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedidoExpor;
	protected JMenuItem jMenuItemModificarDetallePedidoExpor;
	protected JMenuItem jMenuItemActualizarDetallePedidoExpor;
    protected JMenuItem jMenuItemEliminarDetallePedidoExpor;
	protected JMenuItem jMenuItemCancelarDetallePedidoExpor;
    protected JMenuItem jMenuItemGuardarCambiosDetallePedidoExpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedidoExpor;
	protected JMenuItem jMenuItemCerrarDetallePedidoExpor;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedidoExpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedidoExpor;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePedidoExpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedidoExpor;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedidoExpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedidoExpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedidoExpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePedidoExpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePedidoExpor;
	public JLabel jLabelIdDetallePedidoExpor;
	public JLabel jLabelidDetallePedidoExpor;
	public JButton jButtonidDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetallePedidoExpor;
	public JLabel jLabelcantidadDetallePedidoExpor;
	public JTextField jTextFieldcantidadDetallePedidoExpor;
	public JButton jButtoncantidadDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetallePedidoExpor;
	public JLabel jLabelprecioDetallePedidoExpor;
	public JTextField jTextFieldprecioDetallePedidoExpor;
	public JButton jButtonprecioDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajeDetallePedidoExpor;
	public JLabel jLabeldescuento_porcentajeDetallePedidoExpor;
	public JTextField jTextFielddescuento_porcentajeDetallePedidoExpor;
	public JButton jButtondescuento_porcentajeDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorDetallePedidoExpor;
	public JLabel jLabeldescuento_valorDetallePedidoExpor;
	public JTextField jTextFielddescuento_valorDetallePedidoExpor;
	public JButton jButtondescuento_valorDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelivaDetallePedidoExpor;
	public JLabel jLabelivaDetallePedidoExpor;
	public JTextField jTextFieldivaDetallePedidoExpor;
	public JButton jButtonivaDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetallePedidoExpor;
	public JLabel jLabeltotalDetallePedidoExpor;
	public JTextField jTextFieldtotalDetallePedidoExpor;
	public JButton jButtontotalDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneliceDetallePedidoExpor;
	public JLabel jLabeliceDetallePedidoExpor;
	public JTextField jTextFieldiceDetallePedidoExpor;
	public JButton jButtoniceDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelcostoDetallePedidoExpor;
	public JLabel jLabelcostoDetallePedidoExpor;
	public JTextField jTextFieldcostoDetallePedidoExpor;
	public JButton jButtoncostoDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelutilidadDetallePedidoExpor;
	public JLabel jLabelutilidadDetallePedidoExpor;
	public JTextField jTextFieldutilidadDetallePedidoExpor;
	public JButton jButtonutilidadDetallePedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetallePedidoExpor;
	public JLabel jLabelid_empresaDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePedidoExpor;
	public JButton jButtonid_empresaDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallePedidoExpor;
	public JLabel jLabelid_sucursalDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallePedidoExpor;
	public JButton jButtonid_sucursalDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetallePedidoExpor;
	public JLabel jLabelid_ejercicioDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetallePedidoExpor;
	public JButton jButtonid_ejercicioDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetallePedidoExpor;
	public JLabel jLabelid_periodoDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetallePedidoExpor;
	public JButton jButtonid_periodoDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_periodoDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetallePedidoExpor;
	public JLabel jLabelid_anioDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetallePedidoExpor;
	public JButton jButtonid_anioDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_anioDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_anioDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetallePedidoExpor;
	public JLabel jLabelid_mesDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetallePedidoExpor;
	public JButton jButtonid_mesDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_mesDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_mesDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_pedido_exporDetallePedidoExpor;
	public JLabel jLabelid_pedido_exporDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_exporDetallePedidoExpor;
	public JButton jButtonid_pedido_exporDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_pedido_exporDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_pedido_exporDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetallePedidoExpor;
	public JLabel jLabelid_bodegaDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetallePedidoExpor;
	public JButton jButtonid_bodegaDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetallePedidoExpor;
	public JLabel jLabelid_productoDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetallePedidoExpor;
	public JButton jButtonid_productoDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetallePedidoExpor;
	public JLabel jLabelid_unidadDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetallePedidoExpor;
	public JButton jButtonid_unidadDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_pedidoDetallePedidoExpor;
	public JLabel jLabelid_estado_detalle_pedidoDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_pedidoDetallePedidoExpor;
	public JButton jButtonid_estado_detalle_pedidoDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePedidoExpor;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePedidoExporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePedidoExpor=new JPanel();
				this.jPanelAccionesFormularioDetallePedidoExpor=new JPanel();
				this.jmenuBarDetalleDetallePedidoExpor=new JMenuBar();
				this.jTtoolBarDetalleDetallePedidoExpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoExporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePedidoExporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoExporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoExporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoExporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePedidoExpor() {
		return this.jButtonActualizarToolBarDetallePedidoExpor;
	}
	
	public JButton getjButtonEliminarToolBarDetallePedidoExpor() {
		return this.jButtonEliminarToolBarDetallePedidoExpor;
	}
	
	public JButton getjButtonCancelarToolBarDetallePedidoExpor() {
		return this.jButtonCancelarToolBarDetallePedidoExpor;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePedidoExpor() {
		return this.jButtonProcesarInformacionDetallePedidoExpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedidoExpor)	{
		this.jButtonProcesarInformacionDetallePedidoExpor = jButtonProcesarInformacionDetallePedidoExpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedidoExpor() {
		return this.jComboBoxTiposAccionesDetallePedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedidoExpor(
			JComboBox jComboBoxTiposRelacionesDetallePedidoExpor) {
		this.jComboBoxTiposRelacionesDetallePedidoExpor = jComboBoxTiposRelacionesDetallePedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedidoExpor(
			JComboBox jComboBoxTiposAccionesDetallePedidoExpor) {
		this.jComboBoxTiposAccionesDetallePedidoExpor = jComboBoxTiposAccionesDetallePedidoExpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePedidoExpor() {
		return this.jComboBoxTiposAccionesFormularioDetallePedidoExpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePedidoExpor(
			JComboBox jComboBoxTiposAccionesFormularioDetallePedidoExpor) {
		this.jComboBoxTiposAccionesFormularioDetallePedidoExpor = jComboBoxTiposAccionesFormularioDetallePedidoExpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallepedidoexporSessionBean=new DetallePedidoExporSessionBean();
		
		this.detallepedidoexporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidoexporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidoexporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoExporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido Exportacion MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePedidoExpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePedidoExpor=new JButtonMe();
				this.jButtonModificarToolBarDetallePedidoExpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePedidoExpor,this.jTtoolBarDetalleDetallePedidoExpor,
							"actualizar","actualizar","Actualizar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePedidoExpor,this.jTtoolBarDetalleDetallePedidoExpor,
							"eliminar","eliminar","Eliminar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePedidoExpor,this.jTtoolBarDetalleDetallePedidoExpor,
							"cancelar","cancelar","Cancelar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePedidoExpor,this.jTtoolBarDetalleDetallePedidoExpor,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePedidoExpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePedidoExpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePedidoExpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePedidoExpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePedidoExpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedidoExpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedidoExpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedidoExpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePedidoExpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePedidoExpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePedidoExpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePedidoExpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePedidoExpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePedidoExpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePedidoExpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePedidoExpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePedidoExpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePedidoExpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePedidoExpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePedidoExpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePedidoExpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedidoExpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedidoExpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedidoExpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedidoExpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedidoExpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePedidoExpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePedidoExpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePedidoExpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedidoExpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedidoExpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedidoExpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedidoExpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedidoExpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedidoExpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePedidoExpor.add(this.jMenuItemDetalleCerrarDetallePedidoExpor);
		
		this.jmenuDetalleAccionesDetallePedidoExpor.add(this.jMenuItemActualizarDetallePedidoExpor);
		this.jmenuDetalleAccionesDetallePedidoExpor.add(this.jMenuItemEliminarDetallePedidoExpor);
		this.jmenuDetalleAccionesDetallePedidoExpor.add(this.jMenuItemCancelarDetallePedidoExpor);		
		
		//this.jmenuDetalleDatosDetallePedidoExpor.add(this.jMenuItemDetalleAbrirOrderByDetallePedidoExpor);				
		this.jmenuDetalleDatosDetallePedidoExpor.add(this.jMenuItemDetalleMostarOcultarDetallePedidoExpor);				
				
		//this.jmenuDetalleAccionesDetallePedidoExpor.add(this.jMenuItemGuardarCambiosDetallePedidoExpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePedidoExpor.add(this.jmenuDetalleArchivoDetallePedidoExpor);		
		this.jmenuBarDetalleDetallePedidoExpor.add(this.jmenuDetalleAccionesDetallePedidoExpor);		
		this.jmenuBarDetalleDetallePedidoExpor.add(this.jmenuDetalleDatosDetallePedidoExpor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePedidoExpor);				
	}
	
	
	public void inicializarElementosCamposDetallePedidoExpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePedidoExpor = new JLabelMe();
		jLabelIdDetallePedidoExpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePedidoExpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePedidoExpor= new GridBagLayout();

		this.jPanelidDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);

		jLabelidDetallePedidoExpor = new JLabel();
		jLabelidDetallePedidoExpor.setText("Id");

		jLabelidDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadDetallePedidoExpor = new JLabelMe();
		this.jLabelcantidadDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetallePedidoExpor.setToolTipText("Cantidad");
		this.jLabelcantidadDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelcantidadDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFieldcantidadDetallePedidoExpor= new JTextFieldMe();
		jTextFieldcantidadDetallePedidoExpor.setEnabled(false);
		jTextFieldcantidadDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetallePedidoExpor.setText("0");

		this.jButtoncantidadDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtoncantidadDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetallePedidoExporBusqueda.setText("U");
		this.jButtoncantidadDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetallePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetallePedidoExpor = new JLabelMe();
		this.jLabelprecioDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetallePedidoExpor.setToolTipText("Precio");
		this.jLabelprecioDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelprecioDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFieldprecioDetallePedidoExpor= new JTextFieldMe();
		jTextFieldprecioDetallePedidoExpor.setEnabled(false);
		jTextFieldprecioDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetallePedidoExpor.setText("0.0");

		this.jButtonprecioDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonprecioDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetallePedidoExporBusqueda.setText("U");
		this.jButtonprecioDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetallePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajeDetallePedidoExpor = new JLabelMe();
		this.jLabeldescuento_porcentajeDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajeDetallePedidoExpor.setToolTipText("Dscto %");
		this.jLabeldescuento_porcentajeDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajeDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajeDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajeDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPaneldescuento_porcentajeDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFielddescuento_porcentajeDetallePedidoExpor= new JTextFieldMe();
		jTextFielddescuento_porcentajeDetallePedidoExpor.setEnabled(false);
		jTextFielddescuento_porcentajeDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajeDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajeDetallePedidoExpor.setText("0.0");

		this.jButtondescuento_porcentajeDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajeDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajeDetallePedidoExporBusqueda.setText("U");
		this.jButtondescuento_porcentajeDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajeDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajeDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajeDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajeDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajeDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajeDetallePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorDetallePedidoExpor = new JLabelMe();
		this.jLabeldescuento_valorDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorDetallePedidoExpor.setToolTipText("Dscto Valor");
		this.jLabeldescuento_valorDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPaneldescuento_valorDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFielddescuento_valorDetallePedidoExpor= new JTextFieldMe();
		jTextFielddescuento_valorDetallePedidoExpor.setEnabled(false);
		jTextFielddescuento_valorDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorDetallePedidoExpor.setText("0.0");

		this.jButtondescuento_valorDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtondescuento_valorDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorDetallePedidoExporBusqueda.setText("U");
		this.jButtondescuento_valorDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorDetallePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelivaDetallePedidoExpor = new JLabelMe();
		this.jLabelivaDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetallePedidoExpor.setToolTipText("Iva");
		this.jLabelivaDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelivaDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFieldivaDetallePedidoExpor= new JTextFieldMe();
		jTextFieldivaDetallePedidoExpor.setEnabled(false);
		jTextFieldivaDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetallePedidoExpor.setText("0.0");

		this.jButtonivaDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonivaDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetallePedidoExporBusqueda.setText("U");
		this.jButtonivaDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetallePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetallePedidoExpor = new JLabelMe();
		this.jLabeltotalDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetallePedidoExpor.setToolTipText("Total");
		this.jLabeltotalDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPaneltotalDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFieldtotalDetallePedidoExpor= new JTextFieldMe();
		jTextFieldtotalDetallePedidoExpor.setEnabled(false);
		jTextFieldtotalDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetallePedidoExpor.setText("0.0");

		this.jButtontotalDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtontotalDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetallePedidoExporBusqueda.setText("U");
		this.jButtontotalDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetallePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeliceDetallePedidoExpor = new JLabelMe();
		this.jLabeliceDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetallePedidoExpor.setToolTipText("Ice");
		this.jLabeliceDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPaneliceDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFieldiceDetallePedidoExpor= new JTextFieldMe();
		jTextFieldiceDetallePedidoExpor.setEnabled(false);
		jTextFieldiceDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetallePedidoExpor.setText("0.0");

		this.jButtoniceDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtoniceDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetallePedidoExporBusqueda.setText("U");
		this.jButtoniceDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetallePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelcostoDetallePedidoExpor = new JLabelMe();
		this.jLabelcostoDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDetallePedidoExpor.setToolTipText("Costo");
		this.jLabelcostoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelcostoDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFieldcostoDetallePedidoExpor= new JTextFieldMe();
		jTextFieldcostoDetallePedidoExpor.setEnabled(false);
		jTextFieldcostoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDetallePedidoExpor.setText("0.0");

		this.jButtoncostoDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtoncostoDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDetallePedidoExporBusqueda.setText("U");
		this.jButtoncostoDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDetallePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelutilidadDetallePedidoExpor = new JLabelMe();
		this.jLabelutilidadDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_UTILIDAD+" : *");
		this.jLabelutilidadDetallePedidoExpor.setToolTipText("Utilidad");
		this.jLabelutilidadDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidadDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidadDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidadDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_UTILIDAD);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelutilidadDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jTextFieldutilidadDetallePedidoExpor= new JTextFieldMe();
		jTextFieldutilidadDetallePedidoExpor.setEnabled(false);
		jTextFieldutilidadDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidadDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidadDetallePedidoExpor.setText("0.0");

		this.jButtonutilidadDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonutilidadDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidadDetallePedidoExporBusqueda.setText("U");
		this.jButtonutilidadDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidadDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidadDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidadDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidadDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidadDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidadDetallePedidoExporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePedidoExpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetallePedidoExpor = new JLabelMe();
		this.jLabelid_empresaDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePedidoExpor.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_empresaDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_empresaDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_empresaDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePedidoExpor.setEnabled(false);

		this.jButtonid_empresaDetallePedidoExpor= new JButtonMe();
		this.jButtonid_empresaDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoExpor.setText("Buscar");
		this.jButtonid_empresaDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoExpor"));

		this.jButtonid_empresaDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_empresaDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoExporUpdate.setText("U");
		this.jButtonid_empresaDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoExporUpdate"));



					
		this.jLabelid_sucursalDetallePedidoExpor = new JLabelMe();
		this.jLabelid_sucursalDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallePedidoExpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_sucursalDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_sucursalDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_sucursalDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallePedidoExpor.setEnabled(false);

		this.jButtonid_sucursalDetallePedidoExpor= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoExpor.setText("Buscar");
		this.jButtonid_sucursalDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoExpor"));

		this.jButtonid_sucursalDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_sucursalDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoExporUpdate.setText("U");
		this.jButtonid_sucursalDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoExporUpdate"));



					
		this.jLabelid_ejercicioDetallePedidoExpor = new JLabelMe();
		this.jLabelid_ejercicioDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetallePedidoExpor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_ejercicioDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_ejercicioDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_ejercicioDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetallePedidoExpor.setEnabled(false);

		this.jButtonid_ejercicioDetallePedidoExpor= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoExpor.setText("Buscar");
		this.jButtonid_ejercicioDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoExpor"));

		this.jButtonid_ejercicioDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_ejercicioDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePedidoExporUpdate.setText("U");
		this.jButtonid_ejercicioDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoExporUpdate"));



					
		this.jLabelid_periodoDetallePedidoExpor = new JLabelMe();
		this.jLabelid_periodoDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetallePedidoExpor.setToolTipText("Periodo");
		this.jLabelid_periodoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_periodoDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_periodoDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_periodoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetallePedidoExpor.setEnabled(false);

		this.jButtonid_periodoDetallePedidoExpor= new JButtonMe();
		this.jButtonid_periodoDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoExpor.setText("Buscar");
		this.jButtonid_periodoDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoExpor"));

		this.jButtonid_periodoDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_periodoDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_periodoDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_periodoDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePedidoExporUpdate.setText("U");
		this.jButtonid_periodoDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoExporUpdate"));



					
		this.jLabelid_anioDetallePedidoExpor = new JLabelMe();
		this.jLabelid_anioDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetallePedidoExpor.setToolTipText("Anio");
		this.jLabelid_anioDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_anioDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_anioDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_anioDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetallePedidoExpor.setEnabled(false);

		this.jButtonid_anioDetallePedidoExpor= new JButtonMe();
		this.jButtonid_anioDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoExpor.setText("Buscar");
		this.jButtonid_anioDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoExpor"));

		this.jButtonid_anioDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_anioDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_anioDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_anioDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_anioDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePedidoExporUpdate.setText("U");
		this.jButtonid_anioDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoExporUpdate"));



					
		this.jLabelid_mesDetallePedidoExpor = new JLabelMe();
		this.jLabelid_mesDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetallePedidoExpor.setToolTipText("Mes");
		this.jLabelid_mesDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_mesDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_mesDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_mesDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetallePedidoExpor.setEnabled(false);

		this.jButtonid_mesDetallePedidoExpor= new JButtonMe();
		this.jButtonid_mesDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoExpor.setText("Buscar");
		this.jButtonid_mesDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoExpor"));

		this.jButtonid_mesDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_mesDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_mesDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_mesDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_mesDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePedidoExporUpdate.setText("U");
		this.jButtonid_mesDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoExporUpdate"));



					
		this.jLabelid_pedido_exporDetallePedidoExpor = new JLabelMe();
		this.jLabelid_pedido_exporDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDPEDIDOEXPOR+" : *");
		this.jLabelid_pedido_exporDetallePedidoExpor.setToolTipText("Pedido Exportacion");
		this.jLabelid_pedido_exporDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pedido_exporDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pedido_exporDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_exporDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedido_exporDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedido_exporDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDPEDIDOEXPOR);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_pedido_exporDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_pedido_exporDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_pedido_exporDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_exporDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_exporDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_exporDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedido_exporDetallePedidoExpor= new JButtonMe();
		this.jButtonid_pedido_exporDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_exporDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_exporDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_exporDetallePedidoExpor.setText("Buscar");
		this.jButtonid_pedido_exporDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedido_exporDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_exporDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedido_exporDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_exporDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_exporDetallePedidoExpor"));

		this.jButtonid_pedido_exporDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_pedido_exporDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_exporDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_exporDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_exporDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_pedido_exporDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedido_exporDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_exporDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedido_exporDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_exporDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_exporDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedido_exporDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_pedido_exporDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_pedido_exporDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_exporDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_exporDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_exporDetallePedidoExporUpdate.setText("U");
		this.jButtonid_pedido_exporDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedido_exporDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_exporDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedido_exporDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_exporDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_exporDetallePedidoExporUpdate"));



					
		this.jLabelid_bodegaDetallePedidoExpor = new JLabelMe();
		this.jLabelid_bodegaDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetallePedidoExpor.setToolTipText("Bodega");
		this.jLabelid_bodegaDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_bodegaDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_bodegaDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_bodegaDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetallePedidoExpor= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoExpor.setText("Buscar");
		this.jButtonid_bodegaDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoExpor"));

		this.jButtonid_bodegaDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_bodegaDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoExporUpdate.setText("U");
		this.jButtonid_bodegaDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoExporUpdate"));



					
		this.jLabelid_productoDetallePedidoExpor = new JLabelMe();
		this.jLabelid_productoDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetallePedidoExpor.setToolTipText("Producto");
		this.jLabelid_productoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_productoDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_productoDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_productoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetallePedidoExpor= new JButtonMe();
		this.jButtonid_productoDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoExpor.setText("Buscar");
		this.jButtonid_productoDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoExpor"));

		this.jButtonid_productoDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_productoDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_productoDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_productoDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_productoDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoExporUpdate.setText("U");
		this.jButtonid_productoDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoExporUpdate"));



					
		this.jLabelid_unidadDetallePedidoExpor = new JLabelMe();
		this.jLabelid_unidadDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetallePedidoExpor.setToolTipText("Unidad");
		this.jLabelid_unidadDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_unidadDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_unidadDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_unidadDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetallePedidoExpor= new JButtonMe();
		this.jButtonid_unidadDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoExpor.setText("Buscar");
		this.jButtonid_unidadDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoExpor"));

		this.jButtonid_unidadDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_unidadDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_unidadDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_unidadDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoExporUpdate.setText("U");
		this.jButtonid_unidadDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoExporUpdate"));



					
		this.jLabelid_estado_detalle_pedidoDetallePedidoExpor = new JLabelMe();
		this.jLabelid_estado_detalle_pedidoDetallePedidoExpor.setText(""+DetallePedidoExporConstantesFunciones.LABEL_IDESTADODETALLEPEDIDOEXPOR+" : *");
		this.jLabelid_estado_detalle_pedidoDetallePedidoExpor.setToolTipText("Estado");
		this.jLabelid_estado_detalle_pedidoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_pedidoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_pedidoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_pedidoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_pedidoDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_pedidoDetallePedidoExpor.setToolTipText(DetallePedidoExporConstantesFunciones.LABEL_IDESTADODETALLEPEDIDOEXPOR);
		this.gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		this.jPanelid_estado_detalle_pedidoDetallePedidoExpor.setLayout(this.gridaBagLayoutDetallePedidoExpor);


		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_pedidoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_detalle_pedidoDetallePedidoExpor= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetallePedidoExpor.setText("Buscar");
		this.jButtonid_estado_detalle_pedidoDetallePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_pedidoDetallePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetallePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetallePedidoExpor"));

		this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda.setText("U");
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetallePedidoExporBusqueda"));

		if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate.setText("U");
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetallePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetallePedidoExporUpdate"));



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
		//this.jInternalFrameDetalleDetallePedidoExpor = new DetallePedidoExporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Pedido Exportacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedidoExpor= new GridBagLayout();
		

		
		String sToolTipDetallePedidoExpor="";
		sToolTipDetallePedidoExpor=DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedidoExpor+="(Facturacion.DetallePedidoExpor)";
		}
		
		if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedidoExpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePedidoExpor = new JButtonMe();
		this.jButtonModificarDetallePedidoExpor = new JButtonMe();
        this.jButtonActualizarDetallePedidoExpor = new JButtonMe();
        this.jButtonEliminarDetallePedidoExpor = new JButtonMe();
        this.jButtonCancelarDetallePedidoExpor = new JButtonMe();
        this.jButtonGuardarCambiosDetallePedidoExpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePedidoExpor = new JButtonMe();
		this.jButtonCerrarDetallePedidoExpor = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedidoExpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePedidoExpor = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePedidoExpor = new JScrollPane();
		//this.jScrollPanelDatosDetallePedidoExporTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido Exportacion";
		
		if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Exportacions" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetallePedidoExporTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePedidoExpor.setName("jPanelCamposDetallePedidoExpor"); 

		this.jPanelCamposOcultosDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePedidoExpor.setName("jPanelCamposOcultosDetallePedidoExpor"); 

        this.jPanelAccionesDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedidoExpor.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedidoExpor.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePedidoExpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePedidoExpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePedidoExpor.setText("Nuevo");
		this.jButtonModificarDetallePedidoExpor.setText("Editar");
        this.jButtonActualizarDetallePedidoExpor.setText("Actualizar");
        this.jButtonEliminarDetallePedidoExpor.setText("Eliminar");
        this.jButtonCancelarDetallePedidoExpor.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePedidoExpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePedidoExpor.setText("Guardar");
		this.jButtonCerrarDetallePedidoExpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedidoExpor,"nuevo_button","Nuevo",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePedidoExpor,"modificar_button","Editar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePedidoExpor,"actualizar_button","Actualizar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePedidoExpor,"eliminar_button","Eliminar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePedidoExpor,"cancelar_button","Cancelar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePedidoExpor,"guardarcambios_button","Guardar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedidoExpor,"guardarcambiostabla_button","Guardar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedidoExpor,"cerrar_button","Salir",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePedidoExpor.setToolTipText("Nuevo"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePedidoExpor.setToolTipText("Editar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePedidoExpor.setToolTipText("Actualizar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePedidoExpor.setToolTipText("Eliminar)"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePedidoExpor.setToolTipText("Cancelar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePedidoExpor.setToolTipText("Guardar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePedidoExpor.setToolTipText("Guardar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedidoExpor.setToolTipText("Salir"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedidoExpor";
		inputMap = this.jButtonNuevoDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedidoExpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePedidoExpor";
		inputMap = this.jButtonActualizarDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePedidoExpor"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePedidoExpor";
		inputMap = this.jButtonEliminarDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePedidoExpor"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePedidoExpor";
		inputMap = this.jButtonCancelarDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePedidoExpor"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePedidoExpor";
		inputMap = this.jButtonCerrarDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedidoExpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedidoExpor";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedidoExpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePedidoExpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePedidoExpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePedidoExpor.setToolTipText("Nuevo DetallePedidoExpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePedidoExpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePedidoExpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePedidoExpor.setToolTipText("Sin Cerrar Ventana DetallePedidoExpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePedidoExpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePedidoExpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePedidoExpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedidoExpor.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedidoExpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePedidoExpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePedidoExpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePedidoExpor = new JLabelMe();
		
		this.jLabelAccionesDetallePedidoExpor.setText("Acciones");		
		this.jLabelAccionesDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePedidoExpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePedidoExpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePedidoExpor=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePedidoExpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoExpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoExpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePedidoExpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedidoExpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedidoExpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePedidoExpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePedidoExpor = new GridBagLayout();
		
		this.jPanelCamposDetallePedidoExpor.setLayout(gridaBagLayoutCamposDetallePedidoExpor);
		this.jPanelCamposOcultosDetallePedidoExpor.setLayout(gridaBagLayoutCamposOcultosDetallePedidoExpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidDetallePedidoExpor.add(jLabelIdDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidDetallePedidoExpor.add(jLabelidDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaDetallePedidoExpor.add(jLabelid_empresaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedidoExpor.add(jButtonid_empresaDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedidoExpor.add(jButtonid_empresaDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaDetallePedidoExpor.add(jComboBoxid_empresaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalDetallePedidoExpor.add(jLabelid_sucursalDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedidoExpor.add(jButtonid_sucursalDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedidoExpor.add(jButtonid_sucursalDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalDetallePedidoExpor.add(jComboBoxid_sucursalDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioDetallePedidoExpor.add(jLabelid_ejercicioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePedidoExpor.add(jButtonid_ejercicioDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePedidoExpor.add(jButtonid_ejercicioDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioDetallePedidoExpor.add(jComboBoxid_ejercicioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoDetallePedidoExpor.add(jLabelid_periodoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePedidoExpor.add(jButtonid_periodoDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePedidoExpor.add(jButtonid_periodoDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoDetallePedidoExpor.add(jComboBoxid_periodoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioDetallePedidoExpor.add(jLabelid_anioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePedidoExpor.add(jButtonid_anioDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePedidoExpor.add(jButtonid_anioDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioDetallePedidoExpor.add(jComboBoxid_anioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesDetallePedidoExpor.add(jLabelid_mesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePedidoExpor.add(jButtonid_mesDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePedidoExpor.add(jButtonid_mesDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesDetallePedidoExpor.add(jComboBoxid_mesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_pedido_exporDetallePedidoExpor.add(jLabelid_pedido_exporDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_exporDetallePedidoExpor.add(jButtonid_pedido_exporDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_exporDetallePedidoExpor.add(jButtonid_pedido_exporDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_pedido_exporDetallePedidoExpor.add(jComboBoxid_pedido_exporDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_bodegaDetallePedidoExpor.add(jLabelid_bodegaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedidoExpor.add(jButtonid_bodegaDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedidoExpor.add(jButtonid_bodegaDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_bodegaDetallePedidoExpor.add(jComboBoxid_bodegaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_productoDetallePedidoExpor.add(jLabelid_productoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetallePedidoExpor.add(jButtonid_productoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedidoExpor.add(jButtonid_productoDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 4;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedidoExpor.add(jButtonid_productoDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_productoDetallePedidoExpor.add(jComboBoxid_productoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_unidadDetallePedidoExpor.add(jLabelid_unidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedidoExpor.add(jButtonid_unidadDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedidoExpor.add(jButtonid_unidadDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_unidadDetallePedidoExpor.add(jComboBoxid_unidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_detalle_pedidoDetallePedidoExpor.add(jLabelid_estado_detalle_pedidoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_pedidoDetallePedidoExpor.add(jButtonid_estado_detalle_pedidoDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_pedidoDetallePedidoExpor.add(jButtonid_estado_detalle_pedidoDetallePedidoExporUpdate, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_detalle_pedidoDetallePedidoExpor.add(jComboBoxid_estado_detalle_pedidoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcantidadDetallePedidoExpor.add(jLabelcantidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetallePedidoExpor.add(jButtoncantidadDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcantidadDetallePedidoExpor.add(jTextFieldcantidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelprecioDetallePedidoExpor.add(jLabelprecioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetallePedidoExpor.add(jButtonprecioDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelprecioDetallePedidoExpor.add(jTextFieldprecioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_porcentajeDetallePedidoExpor.add(jLabeldescuento_porcentajeDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajeDetallePedidoExpor.add(jButtondescuento_porcentajeDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_porcentajeDetallePedidoExpor.add(jTextFielddescuento_porcentajeDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_valorDetallePedidoExpor.add(jLabeldescuento_valorDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorDetallePedidoExpor.add(jButtondescuento_valorDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_valorDetallePedidoExpor.add(jTextFielddescuento_valorDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaDetallePedidoExpor.add(jLabelivaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetallePedidoExpor.add(jButtonivaDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaDetallePedidoExpor.add(jTextFieldivaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalDetallePedidoExpor.add(jLabeltotalDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetallePedidoExpor.add(jButtontotalDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalDetallePedidoExpor.add(jTextFieldtotalDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceDetallePedidoExpor.add(jLabeliceDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetallePedidoExpor.add(jButtoniceDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceDetallePedidoExpor.add(jTextFieldiceDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcostoDetallePedidoExpor.add(jLabelcostoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDetallePedidoExpor.add(jButtoncostoDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcostoDetallePedidoExpor.add(jTextFieldcostoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelutilidadDetallePedidoExpor.add(jLabelutilidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidadDetallePedidoExpor.add(jButtonutilidadDetallePedidoExporBusqueda, this.gridBagConstraintsDetallePedidoExpor);
	}

	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoExpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelutilidadDetallePedidoExpor.add(jTextFieldutilidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelidDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelid_pedido_exporDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelid_bodegaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelid_productoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelid_unidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelid_estado_detalle_pedidoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelcantidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelprecioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPaneldescuento_porcentajeDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPaneldescuento_valorDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPanelivaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetallePedidoExpor.add(this.jPaneltotalDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposDetallePedidoExpor % 1==0) {
		iXPanelCamposDetallePedidoExpor=0;
		iYPanelCamposDetallePedidoExpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPanelid_empresaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPanelid_sucursalDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPanelid_ejercicioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPanelid_periodoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPanelid_anioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPanelid_mesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPaneliceDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPanelcostoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
	}
	this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoExpor.gridy = iYPanelCamposOcultosDetallePedidoExpor;
	this.gridBagConstraintsDetallePedidoExpor.gridx = iXPanelCamposOcultosDetallePedidoExpor++;
	this.gridBagConstraintsDetallePedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoExpor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetallePedidoExpor.add(this.jPanelutilidadDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);



	if(iXPanelCamposOcultosDetallePedidoExpor % 1==0) {
		iXPanelCamposOcultosDetallePedidoExpor=0;
		iYPanelCamposOcultosDetallePedidoExpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePedidoExpor= new GridBagLayout();
		this.jPanelAccionesDetallePedidoExpor.setLayout(gridaBagLayoutAccionesDetallePedidoExpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePedidoExpor= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePedidoExpor.setLayout(gridaBagLayoutAccionesFormularioDetallePedidoExpor);
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedidoExpor.add(this.jComboBoxTiposAccionesFormularioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedidoExpor.add(this.jCheckBoxPostAccionNuevoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallepedidoexporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedidoExpor.add(this.jCheckBoxPostAccionSinCerrarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallepedidoexporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedidoExpor.add(this.jCheckBoxPostAccionSinMensajeDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePedidoExpor.add(this.jButtonModificarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);							

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePedidoExpor.add(this.jButtonEliminarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
			
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoExpor.add(this.jButtonActualizarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoExpor.add(this.jButtonGuardarCambiosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);	
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;		
		this.gridBagConstraintsDetallePedidoExpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoExpor.add(this.jButtonCancelarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedidoExpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoExpor.gridx = 0;		
			//this.gridBagConstraintsDetallePedidoExpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedidoExpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoExpor.gridx =0;
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedidoExpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePedidoExporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePedidoExpor = new DetallePedidoExporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Pedido Exportacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Pedido Exportacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pedido Exportacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallePedidoExporModel detallepedidoexporModel=new DetallePedidoExporModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePedidoExporModel.DetallePedidoExporFocusTraversalPolicy detallepedidoexporFocusTraversalPolicy = detallepedidoexporModel.new DetallePedidoExporFocusTraversalPolicy(this);
			
			//detallepedidoexporFocusTraversalPolicy.setdetallepedidoexporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallepedidoexporModel);
			
			
			this.jContentPaneDetalleDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePedidoExpor = new GridBagLayout();	
			this.jContentPaneDetalleDetallePedidoExpor.setLayout(gridaBagLayoutDetalleDetallePedidoExpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedidoExpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePedidoExpor.add(jTtoolBarDetalleDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePedidoExpor=   new JScrollPane(jContentPaneDetalleDetallePedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedidoExpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoExpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoExpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePedidoExpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedidoExpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoExpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoExpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	        
			this.jContentPaneDetalleDetallePedidoExpor.add(jPanelCamposDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);
			
			
			
			
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
						&& detallepedidoexporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallepedidoexporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePedidoExpor= new GridBagConstraints();
						this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
						this.jContentPaneDetalleDetallePedidoExpor.add(this.jTabbedPaneRelacionesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePedidoExpor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePedidoExpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
					this.gridBagConstraintsDetallePedidoExpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePedidoExpor.add(jPanelCamposOcultosDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);
				
					this.jPanelCamposOcultosDetallePedidoExpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	        this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePedidoExpor.add(this.jPanelAccionesFormularioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);							
			
			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
	        this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePedidoExpor.add(this.jPanelAccionesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePedidoExpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePedidoExpor=   new JScrollPane(this.jPanelCamposDetallePedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedidoExpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoExpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoExpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePedidoExpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			
			
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
			
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePedidoExpor;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePedidoExpor;
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
