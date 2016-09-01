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
import com.bydan.erp.inventario.util.DetallePedidoCompraConstantesFunciones;

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
public class DetallePedidoCompraDetalleFormJInternalFrame extends DetallePedidoCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePedidoCompra;
	
	protected JMenuBar jmenuBarDetalleDetallePedidoCompra;
	
	protected JMenu jmenuDetalleDetallePedidoCompra;
	protected JMenu jmenuDetalleArchivoDetallePedidoCompra;
	protected JMenu jmenuDetalleAccionesDetallePedidoCompra;
	protected JMenu jmenuDetalleDatosDetallePedidoCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedidoCompra;	
	protected GridBagConstraints gridBagConstraintsDetallePedidoCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePedidoCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePedidoCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidocompra="";

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

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetallePedidoCompraSessionBean detallepedidocompraSessionBean;
	
	
	
	
	public PedidoCompraSessionBean pedidocompraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public DetallePedidoCompraLogic detallepedidocompraLogic;
	
	public JScrollPane jScrollPanelDatosDetallePedidoCompra;
	public JScrollPane jScrollPanelDatosEdicionDetallePedidoCompra;
	public JScrollPane jScrollPanelDatosGeneralDetallePedidoCompra;
	
	protected JPanel jPanelCamposDetallePedidoCompra;    
	protected JPanel jPanelCamposOcultosDetallePedidoCompra;    	
	protected JPanel jPanelAccionesDetallePedidoCompra;
	protected JPanel jPanelAccionesFormularioDetallePedidoCompra;
    
	
	
	protected Integer iXPanelCamposDetallePedidoCompra=0;
	protected Integer iYPanelCamposDetallePedidoCompra=0;
	
	protected Integer iXPanelCamposOcultosDetallePedidoCompra=0;
	protected Integer iYPanelCamposOcultosDetallePedidoCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePedidoCompra;
	public JButton jButtonModificarDetallePedidoCompra;
	public JButton jButtonActualizarDetallePedidoCompra;
    public JButton jButtonEliminarDetallePedidoCompra;
	public JButton jButtonCancelarDetallePedidoCompra;
    public JButton jButtonGuardarCambiosDetallePedidoCompra;
	public JButton jButtonGuardarCambiosTablaDetallePedidoCompra;
	protected JButton jButtonCerrarDetallePedidoCompra;
	
	
	protected JButton jButtonProcesarInformacionDetallePedidoCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePedidoCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePedidoCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePedidoCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedidoCompra;
	protected JButton jButtonModificarToolBarDetallePedidoCompra;
	protected JButton jButtonActualizarToolBarDetallePedidoCompra;
    protected JButton jButtonEliminarToolBarDetallePedidoCompra;
	protected JButton jButtonCancelarToolBarDetallePedidoCompra;
    protected JButton jButtonGuardarCambiosToolBarDetallePedidoCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePedidoCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedidoCompra;
	protected JButton jButtonCerrarToolBarDetallePedidoCompra;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePedidoCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedidoCompra;
	protected JMenuItem jMenuItemModificarDetallePedidoCompra;
	protected JMenuItem jMenuItemActualizarDetallePedidoCompra;
    protected JMenuItem jMenuItemEliminarDetallePedidoCompra;
	protected JMenuItem jMenuItemCancelarDetallePedidoCompra;
    protected JMenuItem jMenuItemGuardarCambiosDetallePedidoCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedidoCompra;
	protected JMenuItem jMenuItemCerrarDetallePedidoCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedidoCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedidoCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePedidoCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedidoCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedidoCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedidoCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedidoCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePedidoCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePedidoCompra;
	public JLabel jLabelIdDetallePedidoCompra;
	public JLabel jLabelidDetallePedidoCompra;
	public JButton jButtonidDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pedidoDetallePedidoCompra;
	public JLabel jLabelcantidad_pedidoDetallePedidoCompra;
	public JTextField jTextFieldcantidad_pedidoDetallePedidoCompra;
	public JButton jButtoncantidad_pedidoDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioDetallePedidoCompra;
	public JLabel jLabelcosto_unitarioDetallePedidoCompra;
	public JTextField jTextFieldcosto_unitarioDetallePedidoCompra;
	public JButton jButtoncosto_unitarioDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalDetallePedidoCompra;
	public JLabel jLabelcosto_totalDetallePedidoCompra;
	public JTextField jTextFieldcosto_totalDetallePedidoCompra;
	public JButton jButtoncosto_totalDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetallePedidoCompra;
	public JLabel jLabeldescripcionDetallePedidoCompra;
	public JTextArea jTextAreadescripcionDetallePedidoCompra;
	public JScrollPane jscrollPanedescripcionDetallePedidoCompra;
	public JButton jButtondescripcionDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_entregadaDetallePedidoCompra;
	public JLabel jLabelcantidad_entregadaDetallePedidoCompra;
	public JTextField jTextFieldcantidad_entregadaDetallePedidoCompra;
	public JButton jButtoncantidad_entregadaDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pendienteDetallePedidoCompra;
	public JLabel jLabelcantidad_pendienteDetallePedidoCompra;
	public JTextField jTextFieldcantidad_pendienteDetallePedidoCompra;
	public JButton jButtoncantidad_pendienteDetallePedidoCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedido_compraDetallePedidoCompra;
	public JLabel jLabelid_pedido_compraDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_compraDetallePedidoCompra;
	public JButton jButtonid_pedido_compraDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_pedido_compraDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_pedido_compraDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetallePedidoCompra;
	public JLabel jLabelid_empresaDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePedidoCompra;
	public JButton jButtonid_empresaDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallePedidoCompra;
	public JLabel jLabelid_sucursalDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallePedidoCompra;
	public JButton jButtonid_sucursalDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetallePedidoCompra;
	public JLabel jLabelid_ejercicioDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetallePedidoCompra;
	public JButton jButtonid_ejercicioDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetallePedidoCompra;
	public JLabel jLabelid_periodoDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetallePedidoCompra;
	public JButton jButtonid_periodoDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_periodoDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetallePedidoCompra;
	public JLabel jLabelid_anioDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetallePedidoCompra;
	public JButton jButtonid_anioDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_anioDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_anioDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetallePedidoCompra;
	public JLabel jLabelid_mesDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetallePedidoCompra;
	public JButton jButtonid_mesDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_mesDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_mesDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetallePedidoCompra;
	public JLabel jLabelid_bodegaDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetallePedidoCompra;
	public JButton jButtonid_bodegaDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetallePedidoCompra;
	public JLabel jLabelid_productoDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetallePedidoCompra;
	public JButton jButtonid_productoDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetallePedidoCompra;
	public JLabel jLabelid_unidadDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetallePedidoCompra;
	public JButton jButtonid_unidadDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetallePedidoCompra;
	public JLabel jLabelid_centro_costoDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetallePedidoCompra;
	public JButton jButtonid_centro_costoDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_centro_costoDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetallePedidoCompraBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetallePedidoCompraArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePedidoCompra;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePedidoCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePedidoCompra=new JPanel();
				this.jPanelAccionesFormularioDetallePedidoCompra=new JPanel();
				this.jmenuBarDetalleDetallePedidoCompra=new JMenuBar();
				this.jTtoolBarDetalleDetallePedidoCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePedidoCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePedidoCompra() {
		return this.jButtonActualizarToolBarDetallePedidoCompra;
	}
	
	public JButton getjButtonEliminarToolBarDetallePedidoCompra() {
		return this.jButtonEliminarToolBarDetallePedidoCompra;
	}
	
	public JButton getjButtonCancelarToolBarDetallePedidoCompra() {
		return this.jButtonCancelarToolBarDetallePedidoCompra;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePedidoCompra() {
		return this.jButtonProcesarInformacionDetallePedidoCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedidoCompra)	{
		this.jButtonProcesarInformacionDetallePedidoCompra = jButtonProcesarInformacionDetallePedidoCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedidoCompra() {
		return this.jComboBoxTiposAccionesDetallePedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedidoCompra(
			JComboBox jComboBoxTiposRelacionesDetallePedidoCompra) {
		this.jComboBoxTiposRelacionesDetallePedidoCompra = jComboBoxTiposRelacionesDetallePedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedidoCompra(
			JComboBox jComboBoxTiposAccionesDetallePedidoCompra) {
		this.jComboBoxTiposAccionesDetallePedidoCompra = jComboBoxTiposAccionesDetallePedidoCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePedidoCompra() {
		return this.jComboBoxTiposAccionesFormularioDetallePedidoCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePedidoCompra(
			JComboBox jComboBoxTiposAccionesFormularioDetallePedidoCompra) {
		this.jComboBoxTiposAccionesFormularioDetallePedidoCompra = jComboBoxTiposAccionesFormularioDetallePedidoCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallepedidocompraSessionBean=new DetallePedidoCompraSessionBean();
		
		this.detallepedidocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidocompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePedidoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePedidoCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePedidoCompra=new JButtonMe();
				this.jButtonModificarToolBarDetallePedidoCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePedidoCompra,this.jTtoolBarDetalleDetallePedidoCompra,
							"actualizar","actualizar","Actualizar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePedidoCompra,this.jTtoolBarDetalleDetallePedidoCompra,
							"eliminar","eliminar","Eliminar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePedidoCompra,this.jTtoolBarDetalleDetallePedidoCompra,
							"cancelar","cancelar","Cancelar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePedidoCompra,this.jTtoolBarDetalleDetallePedidoCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePedidoCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePedidoCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePedidoCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePedidoCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePedidoCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedidoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedidoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedidoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePedidoCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePedidoCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePedidoCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePedidoCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePedidoCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePedidoCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePedidoCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePedidoCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePedidoCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePedidoCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePedidoCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePedidoCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePedidoCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedidoCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedidoCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePedidoCompra.add(this.jMenuItemDetalleCerrarDetallePedidoCompra);
		
		this.jmenuDetalleAccionesDetallePedidoCompra.add(this.jMenuItemActualizarDetallePedidoCompra);
		this.jmenuDetalleAccionesDetallePedidoCompra.add(this.jMenuItemEliminarDetallePedidoCompra);
		this.jmenuDetalleAccionesDetallePedidoCompra.add(this.jMenuItemCancelarDetallePedidoCompra);		
		
		//this.jmenuDetalleDatosDetallePedidoCompra.add(this.jMenuItemDetalleAbrirOrderByDetallePedidoCompra);				
		this.jmenuDetalleDatosDetallePedidoCompra.add(this.jMenuItemDetalleMostarOcultarDetallePedidoCompra);				
				
		//this.jmenuDetalleAccionesDetallePedidoCompra.add(this.jMenuItemGuardarCambiosDetallePedidoCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePedidoCompra.add(this.jmenuDetalleArchivoDetallePedidoCompra);		
		this.jmenuBarDetalleDetallePedidoCompra.add(this.jmenuDetalleAccionesDetallePedidoCompra);		
		this.jmenuBarDetalleDetallePedidoCompra.add(this.jmenuDetalleDatosDetallePedidoCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePedidoCompra);				
	}
	
	
	public void inicializarElementosCamposDetallePedidoCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePedidoCompra = new JLabelMe();
		jLabelIdDetallePedidoCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePedidoCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePedidoCompra= new GridBagLayout();

		this.jPanelidDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);

		jLabelidDetallePedidoCompra = new JLabel();
		jLabelidDetallePedidoCompra.setText("Id");

		jLabelidDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidad_pedidoDetallePedidoCompra = new JLabelMe();
		this.jLabelcantidad_pedidoDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_CANTIDADPEDIDO+" : *");
		this.jLabelcantidad_pedidoDetallePedidoCompra.setToolTipText("Cantidad Pedido");
		this.jLabelcantidad_pedidoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pedidoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pedidoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pedidoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pedidoDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pedidoDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_CANTIDADPEDIDO);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelcantidad_pedidoDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jTextFieldcantidad_pedidoDetallePedidoCompra= new JTextFieldMe();
		jTextFieldcantidad_pedidoDetallePedidoCompra.setEnabled(false);
		jTextFieldcantidad_pedidoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pedidoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pedidoDetallePedidoCompra.setText("0");

		this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda.setText("U");
		this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pedidoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pedidoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pedidoDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pedidoDetallePedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioDetallePedidoCompra = new JLabelMe();
		this.jLabelcosto_unitarioDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioDetallePedidoCompra.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelcosto_unitarioDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jTextFieldcosto_unitarioDetallePedidoCompra= new JTextFieldMe();
		jTextFieldcosto_unitarioDetallePedidoCompra.setEnabled(false);
		jTextFieldcosto_unitarioDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioDetallePedidoCompra.setText("0.0");

		jTextFieldcosto_unitarioDetallePedidoCompra.setEnabled(false);
		this.jButtoncosto_unitarioDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioDetallePedidoCompraBusqueda.setText("U");
		this.jButtoncosto_unitarioDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioDetallePedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalDetallePedidoCompra = new JLabelMe();
		this.jLabelcosto_totalDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalDetallePedidoCompra.setToolTipText("Costo Total");
		this.jLabelcosto_totalDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelcosto_totalDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jTextFieldcosto_totalDetallePedidoCompra= new JTextFieldMe();
		jTextFieldcosto_totalDetallePedidoCompra.setEnabled(false);
		jTextFieldcosto_totalDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalDetallePedidoCompra.setText("0.0");

		jTextFieldcosto_totalDetallePedidoCompra.setEnabled(false);
		this.jButtoncosto_totalDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtoncosto_totalDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalDetallePedidoCompraBusqueda.setText("U");
		this.jButtoncosto_totalDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalDetallePedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetallePedidoCompra = new JLabelMe();
		this.jLabeldescripcionDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetallePedidoCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPaneldescripcionDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jTextAreadescripcionDetallePedidoCompra= new JTextAreaMe();
		jTextAreadescripcionDetallePedidoCompra.setEnabled(false);
		jTextAreadescripcionDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePedidoCompra.setLineWrap(true);
		jTextAreadescripcionDetallePedidoCompra.setWrapStyleWord(true);
		jTextAreadescripcionDetallePedidoCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetallePedidoCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetallePedidoCompra = new JScrollPane(jTextAreadescripcionDetallePedidoCompra);
		jscrollPanedescripcionDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtondescripcionDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetallePedidoCompraBusqueda.setText("U");
		this.jButtondescripcionDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetallePedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_entregadaDetallePedidoCompra = new JLabelMe();
		this.jLabelcantidad_entregadaDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_CANTIDADENTREGADA+" : *");
		this.jLabelcantidad_entregadaDetallePedidoCompra.setToolTipText("Cantidad Entregada");
		this.jLabelcantidad_entregadaDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_entregadaDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_entregadaDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_entregadaDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_entregadaDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_entregadaDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_CANTIDADENTREGADA);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelcantidad_entregadaDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jTextFieldcantidad_entregadaDetallePedidoCompra= new JTextFieldMe();
		jTextFieldcantidad_entregadaDetallePedidoCompra.setEnabled(false);
		jTextFieldcantidad_entregadaDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_entregadaDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_entregadaDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_entregadaDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_entregadaDetallePedidoCompra.setText("0");

		jTextFieldcantidad_entregadaDetallePedidoCompra.setEnabled(false);
		this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda.setText("U");
		this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_entregadaDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_entregadaDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_entregadaDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_entregadaDetallePedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pendienteDetallePedidoCompra = new JLabelMe();
		this.jLabelcantidad_pendienteDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_CANTIDADPENDIENTE+" : *");
		this.jLabelcantidad_pendienteDetallePedidoCompra.setToolTipText("Cantidad Pendiente");
		this.jLabelcantidad_pendienteDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendienteDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendienteDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pendienteDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pendienteDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pendienteDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_CANTIDADPENDIENTE);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelcantidad_pendienteDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jTextFieldcantidad_pendienteDetallePedidoCompra= new JTextFieldMe();
		jTextFieldcantidad_pendienteDetallePedidoCompra.setEnabled(false);
		jTextFieldcantidad_pendienteDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendienteDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendienteDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pendienteDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pendienteDetallePedidoCompra.setText("0");

		jTextFieldcantidad_pendienteDetallePedidoCompra.setEnabled(false);
		this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda.setText("U");
		this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pendienteDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pendienteDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pendienteDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pendienteDetallePedidoCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePedidoCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_pedido_compraDetallePedidoCompra = new JLabelMe();
		this.jLabelid_pedido_compraDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDPEDIDOCOMPRA+" : *");
		this.jLabelid_pedido_compraDetallePedidoCompra.setToolTipText("Pedido Compra");
		this.jLabelid_pedido_compraDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedido_compraDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedido_compraDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_compraDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedido_compraDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedido_compraDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDPEDIDOCOMPRA);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_pedido_compraDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_pedido_compraDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_pedido_compraDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compraDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compraDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_compraDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedido_compraDetallePedidoCompra= new JButtonMe();
		this.jButtonid_pedido_compraDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compraDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compraDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compraDetallePedidoCompra.setText("Buscar");
		this.jButtonid_pedido_compraDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedido_compraDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compraDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedido_compraDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compraDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compraDetallePedidoCompra"));

		this.jButtonid_pedido_compraDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_pedido_compraDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compraDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compraDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_compraDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_pedido_compraDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedido_compraDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compraDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedido_compraDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compraDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compraDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedido_compraDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_pedido_compraDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_pedido_compraDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compraDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compraDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_compraDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_pedido_compraDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedido_compraDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compraDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedido_compraDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compraDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compraDetallePedidoCompraUpdate"));



					
		this.jLabelid_empresaDetallePedidoCompra = new JLabelMe();
		this.jLabelid_empresaDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePedidoCompra.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_empresaDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_empresaDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_empresaDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePedidoCompra.setEnabled(false);

		this.jButtonid_empresaDetallePedidoCompra= new JButtonMe();
		this.jButtonid_empresaDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoCompra.setText("Buscar");
		this.jButtonid_empresaDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoCompra"));

		this.jButtonid_empresaDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_empresaDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_empresaDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoCompraUpdate"));



					
		this.jLabelid_sucursalDetallePedidoCompra = new JLabelMe();
		this.jLabelid_sucursalDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallePedidoCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_sucursalDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_sucursalDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_sucursalDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallePedidoCompra.setEnabled(false);

		this.jButtonid_sucursalDetallePedidoCompra= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoCompra.setText("Buscar");
		this.jButtonid_sucursalDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoCompra"));

		this.jButtonid_sucursalDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_sucursalDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_sucursalDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoCompraUpdate"));



					
		this.jLabelid_ejercicioDetallePedidoCompra = new JLabelMe();
		this.jLabelid_ejercicioDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetallePedidoCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_ejercicioDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_ejercicioDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_ejercicioDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetallePedidoCompra.setEnabled(false);

		this.jButtonid_ejercicioDetallePedidoCompra= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoCompra.setText("Buscar");
		this.jButtonid_ejercicioDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoCompra"));

		this.jButtonid_ejercicioDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_ejercicioDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_ejercicioDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoCompraUpdate"));



					
		this.jLabelid_periodoDetallePedidoCompra = new JLabelMe();
		this.jLabelid_periodoDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetallePedidoCompra.setToolTipText("Periodo");
		this.jLabelid_periodoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_periodoDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_periodoDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_periodoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetallePedidoCompra.setEnabled(false);

		this.jButtonid_periodoDetallePedidoCompra= new JButtonMe();
		this.jButtonid_periodoDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoCompra.setText("Buscar");
		this.jButtonid_periodoDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoCompra"));

		this.jButtonid_periodoDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_periodoDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_periodoDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_periodoDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoCompraUpdate"));



					
		this.jLabelid_anioDetallePedidoCompra = new JLabelMe();
		this.jLabelid_anioDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetallePedidoCompra.setToolTipText("Anio");
		this.jLabelid_anioDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_anioDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_anioDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_anioDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetallePedidoCompra.setEnabled(false);

		this.jButtonid_anioDetallePedidoCompra= new JButtonMe();
		this.jButtonid_anioDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoCompra.setText("Buscar");
		this.jButtonid_anioDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoCompra"));

		this.jButtonid_anioDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_anioDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_anioDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_anioDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_anioDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_anioDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoCompraUpdate"));



					
		this.jLabelid_mesDetallePedidoCompra = new JLabelMe();
		this.jLabelid_mesDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetallePedidoCompra.setToolTipText("Mes");
		this.jLabelid_mesDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_mesDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_mesDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_mesDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetallePedidoCompra.setEnabled(false);

		this.jButtonid_mesDetallePedidoCompra= new JButtonMe();
		this.jButtonid_mesDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoCompra.setText("Buscar");
		this.jButtonid_mesDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoCompra"));

		this.jButtonid_mesDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_mesDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_mesDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_mesDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_mesDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_mesDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoCompraUpdate"));



					
		this.jLabelid_bodegaDetallePedidoCompra = new JLabelMe();
		this.jLabelid_bodegaDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetallePedidoCompra.setToolTipText("Bodega");
		this.jLabelid_bodegaDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_bodegaDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_bodegaDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_bodegaDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetallePedidoCompra= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoCompra.setText("Buscar");
		this.jButtonid_bodegaDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoCompra"));

		this.jButtonid_bodegaDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_bodegaDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_bodegaDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoCompraUpdate"));



					
		this.jLabelid_productoDetallePedidoCompra = new JLabelMe();
		this.jLabelid_productoDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetallePedidoCompra.setToolTipText("Producto");
		this.jLabelid_productoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_productoDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_productoDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_productoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetallePedidoCompra= new JButtonMe();
		this.jButtonid_productoDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoCompra.setText("Buscar");
		this.jButtonid_productoDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoCompra"));

		this.jButtonid_productoDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_productoDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_productoDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_productoDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_productoDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_productoDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoCompraUpdate"));



					
		this.jLabelid_unidadDetallePedidoCompra = new JLabelMe();
		this.jLabelid_unidadDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetallePedidoCompra.setToolTipText("Unidad");
		this.jLabelid_unidadDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_unidadDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_unidadDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_unidadDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetallePedidoCompra= new JButtonMe();
		this.jButtonid_unidadDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoCompra.setText("Buscar");
		this.jButtonid_unidadDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoCompra"));

		this.jButtonid_unidadDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_unidadDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_unidadDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_unidadDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_unidadDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoCompraUpdate"));



					
		this.jLabelid_centro_costoDetallePedidoCompra = new JLabelMe();
		this.jLabelid_centro_costoDetallePedidoCompra.setText(""+DetallePedidoCompraConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetallePedidoCompra.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetallePedidoCompra.setToolTipText(DetallePedidoCompraConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		this.jPanelid_centro_costoDetallePedidoCompra.setLayout(this.gridaBagLayoutDetallePedidoCompra);


		jComboBoxid_centro_costoDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_centro_costoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetallePedidoCompra= new JButtonMe();
		this.jButtonid_centro_costoDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetallePedidoCompra.setText("Buscar");
		this.jButtonid_centro_costoDetallePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetallePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetallePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetallePedidoCompra"));

		this.jButtonid_centro_costoDetallePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetallePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetallePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetallePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetallePedidoCompraBusqueda.setText("U");
		this.jButtonid_centro_costoDetallePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetallePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetallePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetallePedidoCompraBusqueda"));

		if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetallePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetallePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetallePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetallePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetallePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetallePedidoCompraUpdate.setText("U");
		this.jButtonid_centro_costoDetallePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetallePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetallePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetallePedidoCompraUpdate"));


		jButtonid_centro_costoDetallePedidoCompraArbol= new JButtonMe();
		jButtonid_centro_costoDetallePedidoCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetallePedidoCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetallePedidoCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetallePedidoCompraArbol.setText("Arbol");
		jButtonid_centro_costoDetallePedidoCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetallePedidoCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetallePedidoCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetallePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetallePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetallePedidoCompraArbol"));



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
		//this.jInternalFrameDetalleDetallePedidoCompra = new DetallePedidoCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Pedido Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedidoCompra= new GridBagLayout();
		

		
		String sToolTipDetallePedidoCompra="";
		sToolTipDetallePedidoCompra=DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedidoCompra+="(Inventario.DetallePedidoCompra)";
		}
		
		if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedidoCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePedidoCompra = new JButtonMe();
		this.jButtonModificarDetallePedidoCompra = new JButtonMe();
        this.jButtonActualizarDetallePedidoCompra = new JButtonMe();
        this.jButtonEliminarDetallePedidoCompra = new JButtonMe();
        this.jButtonCancelarDetallePedidoCompra = new JButtonMe();
        this.jButtonGuardarCambiosDetallePedidoCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePedidoCompra = new JButtonMe();
		this.jButtonCerrarDetallePedidoCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedidoCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePedidoCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePedidoCompra = new JScrollPane();
		//this.jScrollPanelDatosDetallePedidoCompraTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido Compra";
		
		if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetallePedidoCompraTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePedidoCompra.setName("jPanelCamposDetallePedidoCompra"); 

		this.jPanelCamposOcultosDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePedidoCompra.setName("jPanelCamposOcultosDetallePedidoCompra"); 

        this.jPanelAccionesDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedidoCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePedidoCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePedidoCompra.setText("Nuevo");
		this.jButtonModificarDetallePedidoCompra.setText("Editar");
        this.jButtonActualizarDetallePedidoCompra.setText("Actualizar");
        this.jButtonEliminarDetallePedidoCompra.setText("Eliminar");
        this.jButtonCancelarDetallePedidoCompra.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePedidoCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePedidoCompra.setText("Guardar");
		this.jButtonCerrarDetallePedidoCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedidoCompra,"nuevo_button","Nuevo",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePedidoCompra,"modificar_button","Editar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePedidoCompra,"actualizar_button","Actualizar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePedidoCompra,"eliminar_button","Eliminar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePedidoCompra,"cancelar_button","Cancelar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePedidoCompra,"guardarcambios_button","Guardar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedidoCompra,"guardarcambiostabla_button","Guardar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedidoCompra,"cerrar_button","Salir",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePedidoCompra.setToolTipText("Nuevo"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePedidoCompra.setToolTipText("Editar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePedidoCompra.setToolTipText("Actualizar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePedidoCompra.setToolTipText("Eliminar)"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePedidoCompra.setToolTipText("Cancelar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePedidoCompra.setToolTipText("Guardar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePedidoCompra.setToolTipText("Guardar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedidoCompra.setToolTipText("Salir"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedidoCompra";
		inputMap = this.jButtonNuevoDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedidoCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePedidoCompra";
		inputMap = this.jButtonActualizarDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePedidoCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePedidoCompra";
		inputMap = this.jButtonEliminarDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePedidoCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePedidoCompra";
		inputMap = this.jButtonCancelarDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePedidoCompra"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePedidoCompra";
		inputMap = this.jButtonCerrarDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedidoCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedidoCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedidoCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePedidoCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePedidoCompra.setToolTipText("Nuevo DetallePedidoCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePedidoCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePedidoCompra.setToolTipText("Sin Cerrar Ventana DetallePedidoCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePedidoCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePedidoCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedidoCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedidoCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePedidoCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePedidoCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePedidoCompra = new JLabelMe();
		
		this.jLabelAccionesDetallePedidoCompra.setText("Acciones");		
		this.jLabelAccionesDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePedidoCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePedidoCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePedidoCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedidoCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePedidoCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePedidoCompra = new GridBagLayout();
		
		this.jPanelCamposDetallePedidoCompra.setLayout(gridaBagLayoutCamposDetallePedidoCompra);
		this.jPanelCamposOcultosDetallePedidoCompra.setLayout(gridaBagLayoutCamposOcultosDetallePedidoCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallePedidoCompra.add(jLabelIdDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallePedidoCompra.add(jLabelidDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pedido_compraDetallePedidoCompra.add(jLabelid_pedido_compraDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_compraDetallePedidoCompra.add(jButtonid_pedido_compraDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_compraDetallePedidoCompra.add(jButtonid_pedido_compraDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pedido_compraDetallePedidoCompra.add(jComboBoxid_pedido_compraDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallePedidoCompra.add(jLabelid_empresaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedidoCompra.add(jButtonid_empresaDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedidoCompra.add(jButtonid_empresaDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallePedidoCompra.add(jComboBoxid_empresaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetallePedidoCompra.add(jLabelid_sucursalDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedidoCompra.add(jButtonid_sucursalDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedidoCompra.add(jButtonid_sucursalDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetallePedidoCompra.add(jComboBoxid_sucursalDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetallePedidoCompra.add(jLabelid_ejercicioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePedidoCompra.add(jButtonid_ejercicioDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePedidoCompra.add(jButtonid_ejercicioDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetallePedidoCompra.add(jComboBoxid_ejercicioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetallePedidoCompra.add(jLabelid_periodoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePedidoCompra.add(jButtonid_periodoDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePedidoCompra.add(jButtonid_periodoDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetallePedidoCompra.add(jComboBoxid_periodoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetallePedidoCompra.add(jLabelid_anioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePedidoCompra.add(jButtonid_anioDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePedidoCompra.add(jButtonid_anioDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetallePedidoCompra.add(jComboBoxid_anioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetallePedidoCompra.add(jLabelid_mesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePedidoCompra.add(jButtonid_mesDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePedidoCompra.add(jButtonid_mesDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetallePedidoCompra.add(jComboBoxid_mesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetallePedidoCompra.add(jLabelid_bodegaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedidoCompra.add(jButtonid_bodegaDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedidoCompra.add(jButtonid_bodegaDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetallePedidoCompra.add(jComboBoxid_bodegaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetallePedidoCompra.add(jLabelid_productoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetallePedidoCompra.add(jButtonid_productoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedidoCompra.add(jButtonid_productoDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 4;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedidoCompra.add(jButtonid_productoDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetallePedidoCompra.add(jComboBoxid_productoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetallePedidoCompra.add(jLabelid_unidadDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedidoCompra.add(jButtonid_unidadDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedidoCompra.add(jButtonid_unidadDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetallePedidoCompra.add(jComboBoxid_unidadDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetallePedidoCompra.add(jLabelid_centro_costoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetallePedidoCompra.add(jButtonid_centro_costoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 3;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetallePedidoCompra.add(jButtonid_centro_costoDetallePedidoCompraArbol, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 4;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetallePedidoCompra.add(jButtonid_centro_costoDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 5;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetallePedidoCompra.add(jButtonid_centro_costoDetallePedidoCompraUpdate, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetallePedidoCompra.add(jComboBoxid_centro_costoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pedidoDetallePedidoCompra.add(jLabelcantidad_pedidoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pedidoDetallePedidoCompra.add(jButtoncantidad_pedidoDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pedidoDetallePedidoCompra.add(jTextFieldcantidad_pedidoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioDetallePedidoCompra.add(jLabelcosto_unitarioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioDetallePedidoCompra.add(jButtoncosto_unitarioDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioDetallePedidoCompra.add(jTextFieldcosto_unitarioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalDetallePedidoCompra.add(jLabelcosto_totalDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalDetallePedidoCompra.add(jButtoncosto_totalDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalDetallePedidoCompra.add(jTextFieldcosto_totalDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetallePedidoCompra.add(jLabeldescripcionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetallePedidoCompra.add(jButtondescripcionDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetallePedidoCompra.add(jscrollPanedescripcionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_entregadaDetallePedidoCompra.add(jLabelcantidad_entregadaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_entregadaDetallePedidoCompra.add(jButtoncantidad_entregadaDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_entregadaDetallePedidoCompra.add(jTextFieldcantidad_entregadaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pendienteDetallePedidoCompra.add(jLabelcantidad_pendienteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pendienteDetallePedidoCompra.add(jButtoncantidad_pendienteDetallePedidoCompraBusqueda, this.gridBagConstraintsDetallePedidoCompra);
	}

	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompra.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pendienteDetallePedidoCompra.add(jTextFieldcantidad_pendienteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelidDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelid_pedido_compraDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelid_bodegaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelid_productoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelid_unidadDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelid_centro_costoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelcantidad_pedidoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelcosto_unitarioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelcosto_totalDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPaneldescripcionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelcantidad_entregadaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompra.add(this.jPanelcantidad_pendienteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposDetallePedidoCompra % 1==0) {
		iXPanelCamposDetallePedidoCompra=0;
		iYPanelCamposDetallePedidoCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposOcultosDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposOcultosDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompra.add(this.jPanelid_empresaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposOcultosDetallePedidoCompra % 1==0) {
		iXPanelCamposOcultosDetallePedidoCompra=0;
		iYPanelCamposOcultosDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposOcultosDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposOcultosDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompra.add(this.jPanelid_sucursalDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposOcultosDetallePedidoCompra % 1==0) {
		iXPanelCamposOcultosDetallePedidoCompra=0;
		iYPanelCamposOcultosDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposOcultosDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposOcultosDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompra.add(this.jPanelid_ejercicioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposOcultosDetallePedidoCompra % 1==0) {
		iXPanelCamposOcultosDetallePedidoCompra=0;
		iYPanelCamposOcultosDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposOcultosDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposOcultosDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompra.add(this.jPanelid_periodoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposOcultosDetallePedidoCompra % 1==0) {
		iXPanelCamposOcultosDetallePedidoCompra=0;
		iYPanelCamposOcultosDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposOcultosDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposOcultosDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompra.add(this.jPanelid_anioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposOcultosDetallePedidoCompra % 1==0) {
		iXPanelCamposOcultosDetallePedidoCompra=0;
		iYPanelCamposOcultosDetallePedidoCompra++;
	}
	this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompra.gridy = iYPanelCamposOcultosDetallePedidoCompra;
	this.gridBagConstraintsDetallePedidoCompra.gridx = iXPanelCamposOcultosDetallePedidoCompra++;
	this.gridBagConstraintsDetallePedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompra.add(this.jPanelid_mesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);



	if(iXPanelCamposOcultosDetallePedidoCompra % 1==0) {
		iXPanelCamposOcultosDetallePedidoCompra=0;
		iYPanelCamposOcultosDetallePedidoCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePedidoCompra= new GridBagLayout();
		this.jPanelAccionesDetallePedidoCompra.setLayout(gridaBagLayoutAccionesDetallePedidoCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePedidoCompra= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePedidoCompra.setLayout(gridaBagLayoutAccionesFormularioDetallePedidoCompra);
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedidoCompra.add(this.jComboBoxTiposAccionesFormularioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedidoCompra.add(this.jCheckBoxPostAccionNuevoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallepedidocompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedidoCompra.add(this.jCheckBoxPostAccionSinCerrarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallepedidocompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedidoCompra.add(this.jCheckBoxPostAccionSinMensajeDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePedidoCompra.add(this.jButtonModificarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);							

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePedidoCompra.add(this.jButtonEliminarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
			
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoCompra.add(this.jButtonActualizarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoCompra.add(this.jButtonGuardarCambiosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);	
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;		
		this.gridBagConstraintsDetallePedidoCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoCompra.add(this.jButtonCancelarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedidoCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoCompra.gridx = 0;		
			//this.gridBagConstraintsDetallePedidoCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedidoCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoCompra.gridx =0;
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedidoCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePedidoCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePedidoCompra = new DetallePedidoCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Pedido Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Pedido Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pedido Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallePedidoCompraModel detallepedidocompraModel=new DetallePedidoCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePedidoCompraModel.DetallePedidoCompraFocusTraversalPolicy detallepedidocompraFocusTraversalPolicy = detallepedidocompraModel.new DetallePedidoCompraFocusTraversalPolicy(this);
			
			//detallepedidocompraFocusTraversalPolicy.setdetallepedidocompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallepedidocompraModel);
			
			
			this.jContentPaneDetalleDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePedidoCompra = new GridBagLayout();	
			this.jContentPaneDetalleDetallePedidoCompra.setLayout(gridaBagLayoutDetalleDetallePedidoCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedidoCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePedidoCompra.add(jTtoolBarDetalleDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePedidoCompra=   new JScrollPane(jContentPaneDetalleDetallePedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePedidoCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	        
			this.jContentPaneDetalleDetallePedidoCompra.add(jPanelCamposDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);
			
			
			
			
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
						&& detallepedidocompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallepedidocompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePedidoCompra= new GridBagConstraints();
						this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
						this.jContentPaneDetalleDetallePedidoCompra.add(this.jTabbedPaneRelacionesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePedidoCompra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePedidoCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
					this.gridBagConstraintsDetallePedidoCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePedidoCompra.add(jPanelCamposOcultosDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);
				
					this.jPanelCamposOcultosDetallePedidoCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	        this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePedidoCompra.add(this.jPanelAccionesFormularioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);							
			
			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
	        this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePedidoCompra.add(this.jPanelAccionesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePedidoCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePedidoCompra=   new JScrollPane(this.jPanelCamposDetallePedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePedidoCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			
			
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
			
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePedidoCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePedidoCompra;
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
