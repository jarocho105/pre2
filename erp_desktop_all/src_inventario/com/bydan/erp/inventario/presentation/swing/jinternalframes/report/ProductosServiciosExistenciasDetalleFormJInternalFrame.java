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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ProductosServiciosExistenciasConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ProductosServiciosExistenciasDetalleFormJInternalFrame extends ProductosServiciosExistenciasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductosServiciosExistencias;
	
	protected JMenuBar jmenuBarDetalleProductosServiciosExistencias;
	
	protected JMenu jmenuDetalleProductosServiciosExistencias;
	protected JMenu jmenuDetalleArchivoProductosServiciosExistencias;
	protected JMenu jmenuDetalleAccionesProductosServiciosExistencias;
	protected JMenu jmenuDetalleDatosProductosServiciosExistencias;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosServiciosExistencias;	
	protected GridBagConstraints gridBagConstraintsProductosServiciosExistencias;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosServiciosExistenciasBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductosServiciosExistencias;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicio="";
	
	public ProductosServiciosExistenciasSessionBean productosserviciosexistenciasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;	
	
	public ProductosServiciosExistenciasLogic productosserviciosexistenciasLogic;
	
	public JScrollPane jScrollPanelDatosProductosServiciosExistencias;
	public JScrollPane jScrollPanelDatosEdicionProductosServiciosExistencias;
	public JScrollPane jScrollPanelDatosGeneralProductosServiciosExistencias;
	
	protected JPanel jPanelCamposProductosServiciosExistencias;    
	protected JPanel jPanelCamposOcultosProductosServiciosExistencias;    	
	protected JPanel jPanelAccionesProductosServiciosExistencias;
	protected JPanel jPanelAccionesFormularioProductosServiciosExistencias;
    
	
	
	protected Integer iXPanelCamposProductosServiciosExistencias=0;
	protected Integer iYPanelCamposProductosServiciosExistencias=0;
	
	protected Integer iXPanelCamposOcultosProductosServiciosExistencias=0;
	protected Integer iYPanelCamposOcultosProductosServiciosExistencias=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductosServiciosExistencias;
	public JButton jButtonModificarProductosServiciosExistencias;
	public JButton jButtonActualizarProductosServiciosExistencias;
    public JButton jButtonEliminarProductosServiciosExistencias;
	public JButton jButtonCancelarProductosServiciosExistencias;
    public JButton jButtonGuardarCambiosProductosServiciosExistencias;
	public JButton jButtonGuardarCambiosTablaProductosServiciosExistencias;
	protected JButton jButtonCerrarProductosServiciosExistencias;
	
	
	protected JButton jButtonProcesarInformacionProductosServiciosExistencias;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductosServiciosExistencias;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductosServiciosExistencias;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductosServiciosExistencias;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosServiciosExistencias;
	protected JButton jButtonModificarToolBarProductosServiciosExistencias;
	protected JButton jButtonActualizarToolBarProductosServiciosExistencias;
    protected JButton jButtonEliminarToolBarProductosServiciosExistencias;
	protected JButton jButtonCancelarToolBarProductosServiciosExistencias;
    protected JButton jButtonGuardarCambiosToolBarProductosServiciosExistencias;
	protected JButton jButtonGuardarCambiosTablaToolBarProductosServiciosExistencias;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosServiciosExistencias;
	protected JButton jButtonCerrarToolBarProductosServiciosExistencias;
	
	protected JButton jButtonProcesarInformacionToolBarProductosServiciosExistencias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosServiciosExistencias;
	protected JMenuItem jMenuItemModificarProductosServiciosExistencias;
	protected JMenuItem jMenuItemActualizarProductosServiciosExistencias;
    protected JMenuItem jMenuItemEliminarProductosServiciosExistencias;
	protected JMenuItem jMenuItemCancelarProductosServiciosExistencias;
    protected JMenuItem jMenuItemGuardarCambiosProductosServiciosExistencias;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosServiciosExistencias;
	protected JMenuItem jMenuItemCerrarProductosServiciosExistencias;
	protected JMenuItem jMenuItemDetalleCerrarProductosServiciosExistencias;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosServiciosExistencias;
	
	protected JMenuItem jMenuItemProcesarInformacionProductosServiciosExistencias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosServiciosExistencias;
	protected JMenuItem jMenuItemMostrarOcultarProductosServiciosExistencias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosServiciosExistencias;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosServiciosExistencias;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductosServiciosExistencias;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductosServiciosExistencias;
	public JLabel jLabelIdProductosServiciosExistencias;
	public JLabel jLabelidProductosServiciosExistencias;
	public JButton jButtonidProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalProductosServiciosExistencias;
	public JLabel jLabelnombre_sucursalProductosServiciosExistencias;
	public JTextArea jTextAreanombre_sucursalProductosServiciosExistencias;
	public JScrollPane jscrollPanenombre_sucursalProductosServiciosExistencias;
	public JButton jButtonnombre_sucursalProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaProductosServiciosExistencias;
	public JLabel jLabelnombre_lineaProductosServiciosExistencias;
	public JTextArea jTextAreanombre_lineaProductosServiciosExistencias;
	public JScrollPane jscrollPanenombre_lineaProductosServiciosExistencias;
	public JButton jButtonnombre_lineaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoProductosServiciosExistencias;
	public JLabel jLabelnombre_linea_grupoProductosServiciosExistencias;
	public JTextArea jTextAreanombre_linea_grupoProductosServiciosExistencias;
	public JScrollPane jscrollPanenombre_linea_grupoProductosServiciosExistencias;
	public JButton jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaProductosServiciosExistencias;
	public JLabel jLabelnombre_linea_categoriaProductosServiciosExistencias;
	public JTextArea jTextAreanombre_linea_categoriaProductosServiciosExistencias;
	public JScrollPane jscrollPanenombre_linea_categoriaProductosServiciosExistencias;
	public JButton jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaProductosServiciosExistencias;
	public JLabel jLabelnombre_linea_marcaProductosServiciosExistencias;
	public JTextArea jTextAreanombre_linea_marcaProductosServiciosExistencias;
	public JScrollPane jscrollPanenombre_linea_marcaProductosServiciosExistencias;
	public JButton jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProductosServiciosExistencias;
	public JLabel jLabelcodigoProductosServiciosExistencias;
	public JTextField jTextFieldcodigoProductosServiciosExistencias;
	public JButton jButtoncodigoProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombreProductosServiciosExistencias;
	public JLabel jLabelnombreProductosServiciosExistencias;
	public JTextArea jTextAreanombreProductosServiciosExistencias;
	public JScrollPane jscrollPanenombreProductosServiciosExistencias;
	public JButton jButtonnombreProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_producto_servicioProductosServiciosExistencias;
	public JLabel jLabelnombre_tipo_producto_servicioProductosServiciosExistencias;
	public JTextArea jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias;
	public JScrollPane jscrollPanenombre_tipo_producto_servicioProductosServiciosExistencias;
	public JButton jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaProductosServiciosExistencias;
	public JLabel jLabelnombre_bodegaProductosServiciosExistencias;
	public JTextArea jTextAreanombre_bodegaProductosServiciosExistencias;
	public JScrollPane jscrollPanenombre_bodegaProductosServiciosExistencias;
	public JButton jButtonnombre_bodegaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProductosServiciosExistencias;
	public JLabel jLabelnombre_unidadProductosServiciosExistencias;
	public JTextField jTextFieldnombre_unidadProductosServiciosExistencias;
	public JButton jButtonnombre_unidadProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleProductosServiciosExistencias;
	public JLabel jLabelcantidad_disponibleProductosServiciosExistencias;
	public JTextField jTextFieldcantidad_disponibleProductosServiciosExistencias;
	public JButton jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_reservadaProductosServiciosExistencias;
	public JLabel jLabelcantidad_reservadaProductosServiciosExistencias;
	public JTextField jTextFieldcantidad_reservadaProductosServiciosExistencias;
	public JButton jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pedidaProductosServiciosExistencias;
	public JLabel jLabelcantidad_pedidaProductosServiciosExistencias;
	public JTextField jTextFieldcantidad_pedidaProductosServiciosExistencias;
	public JButton jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_egresoProductosServiciosExistencias;
	public JLabel jLabeltotal_egresoProductosServiciosExistencias;
	public JTextField jTextFieldtotal_egresoProductosServiciosExistencias;
	public JButton jButtontotal_egresoProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_compraProductosServiciosExistencias;
	public JLabel jLabeltotal_compraProductosServiciosExistencias;
	public JTextField jTextFieldtotal_compraProductosServiciosExistencias;
	public JButton jButtontotal_compraProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_devueltoProductosServiciosExistencias;
	public JLabel jLabeltotal_devueltoProductosServiciosExistencias;
	public JTextField jTextFieldtotal_devueltoProductosServiciosExistencias;
	public JButton jButtontotal_devueltoProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductosServiciosExistencias;
	public JLabel jLabelid_empresaProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductosServiciosExistencias;
	public JButton jButtonid_empresaProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_empresaProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductosServiciosExistencias;
	public JLabel jLabelid_sucursalProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductosServiciosExistencias;
	public JButton jButtonid_sucursalProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_sucursalProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductosServiciosExistencias;
	public JLabel jLabelid_bodegaProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductosServiciosExistencias;
	public JButton jButtonid_bodegaProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_bodegaProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductosServiciosExistencias;
	public JLabel jLabelid_productoProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductosServiciosExistencias;
	public JButton jButtonid_productoProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_productoProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_productoProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProductosServiciosExistencias;
	public JLabel jLabelid_lineaProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProductosServiciosExistencias;
	public JButton jButtonid_lineaProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_lineaProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_lineaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProductosServiciosExistencias;
	public JLabel jLabelid_linea_grupoProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProductosServiciosExistencias;
	public JButton jButtonid_linea_grupoProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProductosServiciosExistencias;
	public JLabel jLabelid_linea_categoriaProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProductosServiciosExistencias;
	public JButton jButtonid_linea_categoriaProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProductosServiciosExistencias;
	public JLabel jLabelid_linea_marcaProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProductosServiciosExistencias;
	public JButton jButtonid_linea_marcaProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosServiciosExistenciasBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicioProductosServiciosExistencias;
	public JLabel jLabelid_tipo_producto_servicioProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioProductosServiciosExistencias;
	public JButton jButtonid_tipo_producto_servicioProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductosServiciosExistencias;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=755;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductosServiciosExistenciasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductosServiciosExistencias=new JPanel();
				this.jPanelAccionesFormularioProductosServiciosExistencias=new JPanel();
				this.jmenuBarDetalleProductosServiciosExistencias=new JMenuBar();
				this.jTtoolBarDetalleProductosServiciosExistencias=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosExistenciasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosServiciosExistenciasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosExistenciasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosExistenciasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosExistenciasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductosServiciosExistencias() {
		return this.jButtonActualizarToolBarProductosServiciosExistencias;
	}
	
	public JButton getjButtonEliminarToolBarProductosServiciosExistencias() {
		return this.jButtonEliminarToolBarProductosServiciosExistencias;
	}
	
	public JButton getjButtonCancelarToolBarProductosServiciosExistencias() {
		return this.jButtonCancelarToolBarProductosServiciosExistencias;
	}		
	
	public JButton getjButtonProcesarInformacionProductosServiciosExistencias() {
		return this.jButtonProcesarInformacionProductosServiciosExistencias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosServiciosExistencias)	{
		this.jButtonProcesarInformacionProductosServiciosExistencias = jButtonProcesarInformacionProductosServiciosExistencias;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosServiciosExistencias() {
		return this.jComboBoxTiposAccionesProductosServiciosExistencias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosServiciosExistencias(
			JComboBox jComboBoxTiposRelacionesProductosServiciosExistencias) {
		this.jComboBoxTiposRelacionesProductosServiciosExistencias = jComboBoxTiposRelacionesProductosServiciosExistencias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosServiciosExistencias(
			JComboBox jComboBoxTiposAccionesProductosServiciosExistencias) {
		this.jComboBoxTiposAccionesProductosServiciosExistencias = jComboBoxTiposAccionesProductosServiciosExistencias;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductosServiciosExistencias() {
		return this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductosServiciosExistencias(
			JComboBox jComboBoxTiposAccionesFormularioProductosServiciosExistencias) {
		this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias = jComboBoxTiposAccionesFormularioProductosServiciosExistencias;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosserviciosexistenciasSessionBean=new ProductosServiciosExistenciasSessionBean();
		
		this.productosserviciosexistenciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciosexistenciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosServiciosExistenciasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosServiciosExistenciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosServiciosExistenciasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Servicios Existencias MANTENIMIENTO"));
		
		
		if(iWidth > 2550) {
			iWidth=2550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosServiciosExistenciasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductosServiciosExistencias= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductosServiciosExistencias=new JButtonMe();
				this.jButtonModificarToolBarProductosServiciosExistencias=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductosServiciosExistencias,this.jTtoolBarDetalleProductosServiciosExistencias,
							"actualizar","actualizar","Actualizar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductosServiciosExistencias,this.jTtoolBarDetalleProductosServiciosExistencias,
							"eliminar","eliminar","Eliminar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductosServiciosExistencias,this.jTtoolBarDetalleProductosServiciosExistencias,
							"cancelar","cancelar","Cancelar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductosServiciosExistencias,this.jTtoolBarDetalleProductosServiciosExistencias,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductosServiciosExistencias=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductosServiciosExistencias=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductosServiciosExistencias=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductosServiciosExistencias=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductosServiciosExistencias=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosServiciosExistencias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosServiciosExistencias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosServiciosExistencias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductosServiciosExistencias= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductosServiciosExistencias.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductosServiciosExistencias,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductosServiciosExistencias= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductosServiciosExistencias.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductosServiciosExistencias,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductosServiciosExistencias= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductosServiciosExistencias.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductosServiciosExistencias,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductosServiciosExistencias= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductosServiciosExistencias.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductosServiciosExistencias,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductosServiciosExistencias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosServiciosExistencias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosServiciosExistencias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosServiciosExistencias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosServiciosExistencias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosServiciosExistencias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductosServiciosExistencias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductosServiciosExistencias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductosServiciosExistencias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosServiciosExistencias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosServiciosExistencias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosServiciosExistencias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductosServiciosExistencias.add(this.jMenuItemDetalleCerrarProductosServiciosExistencias);
		
		this.jmenuDetalleAccionesProductosServiciosExistencias.add(this.jMenuItemActualizarProductosServiciosExistencias);
		this.jmenuDetalleAccionesProductosServiciosExistencias.add(this.jMenuItemEliminarProductosServiciosExistencias);
		this.jmenuDetalleAccionesProductosServiciosExistencias.add(this.jMenuItemCancelarProductosServiciosExistencias);		
		
		//this.jmenuDetalleDatosProductosServiciosExistencias.add(this.jMenuItemDetalleAbrirOrderByProductosServiciosExistencias);				
		this.jmenuDetalleDatosProductosServiciosExistencias.add(this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias);				
				
		//this.jmenuDetalleAccionesProductosServiciosExistencias.add(this.jMenuItemGuardarCambiosProductosServiciosExistencias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductosServiciosExistencias.add(this.jmenuDetalleArchivoProductosServiciosExistencias);		
		this.jmenuBarDetalleProductosServiciosExistencias.add(this.jmenuDetalleAccionesProductosServiciosExistencias);		
		this.jmenuBarDetalleProductosServiciosExistencias.add(this.jmenuDetalleDatosProductosServiciosExistencias);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductosServiciosExistencias);				
	}
	
	
	public void inicializarElementosCamposProductosServiciosExistencias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductosServiciosExistencias = new JLabelMe();
		jLabelIdProductosServiciosExistencias.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductosServiciosExistencias = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductosServiciosExistencias= new GridBagLayout();

		this.jPanelidProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);

		jLabelidProductosServiciosExistencias = new JLabel();
		jLabelidProductosServiciosExistencias.setText("Id");

		jLabelidProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_sucursalProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombre_sucursalProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalProductosServiciosExistencias.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombre_sucursalProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextAreanombre_sucursalProductosServiciosExistencias= new JTextAreaMe();
		jTextAreanombre_sucursalProductosServiciosExistencias.setEnabled(false);
		jTextAreanombre_sucursalProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosExistencias.setLineWrap(true);
		jTextAreanombre_sucursalProductosServiciosExistencias.setWrapStyleWord(true);
		jTextAreanombre_sucursalProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalProductosServiciosExistencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalProductosServiciosExistencias = new JScrollPane(jTextAreanombre_sucursalProductosServiciosExistencias);
		jscrollPanenombre_sucursalProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombre_lineaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaProductosServiciosExistencias.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombre_lineaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextAreanombre_lineaProductosServiciosExistencias= new JTextAreaMe();
		jTextAreanombre_lineaProductosServiciosExistencias.setEnabled(false);
		jTextAreanombre_lineaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosExistencias.setLineWrap(true);
		jTextAreanombre_lineaProductosServiciosExistencias.setWrapStyleWord(true);
		jTextAreanombre_lineaProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaProductosServiciosExistencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaProductosServiciosExistencias = new JScrollPane(jTextAreanombre_lineaProductosServiciosExistencias);
		jscrollPanenombre_lineaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_lineaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_lineaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombre_linea_grupoProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoProductosServiciosExistencias.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombre_linea_grupoProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextAreanombre_linea_grupoProductosServiciosExistencias= new JTextAreaMe();
		jTextAreanombre_linea_grupoProductosServiciosExistencias.setEnabled(false);
		jTextAreanombre_linea_grupoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosExistencias.setLineWrap(true);
		jTextAreanombre_linea_grupoProductosServiciosExistencias.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoProductosServiciosExistencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoProductosServiciosExistencias = new JScrollPane(jTextAreanombre_linea_grupoProductosServiciosExistencias);
		jscrollPanenombre_linea_grupoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_grupoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_grupoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombre_linea_categoriaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaProductosServiciosExistencias.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombre_linea_categoriaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextAreanombre_linea_categoriaProductosServiciosExistencias= new JTextAreaMe();
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.setEnabled(false);
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.setLineWrap(true);
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaProductosServiciosExistencias = new JScrollPane(jTextAreanombre_linea_categoriaProductosServiciosExistencias);
		jscrollPanenombre_linea_categoriaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_categoriaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_categoriaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombre_linea_marcaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaProductosServiciosExistencias.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombre_linea_marcaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextAreanombre_linea_marcaProductosServiciosExistencias= new JTextAreaMe();
		jTextAreanombre_linea_marcaProductosServiciosExistencias.setEnabled(false);
		jTextAreanombre_linea_marcaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosExistencias.setLineWrap(true);
		jTextAreanombre_linea_marcaProductosServiciosExistencias.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaProductosServiciosExistencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaProductosServiciosExistencias = new JScrollPane(jTextAreanombre_linea_marcaProductosServiciosExistencias);
		jscrollPanenombre_linea_marcaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_marcaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_marcaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelcodigoProductosServiciosExistencias = new JLabelMe();
		this.jLabelcodigoProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProductosServiciosExistencias.setToolTipText("Codigo");
		this.jLabelcodigoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelcodigoProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextFieldcodigoProductosServiciosExistencias= new JTextFieldMe();

		jTextFieldcodigoProductosServiciosExistencias.setEnabled(false);
		jTextFieldcodigoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtoncodigoProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtoncodigoProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelnombreProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombreProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProductosServiciosExistencias.setToolTipText("Nombre");
		this.jLabelnombreProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombreProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextAreanombreProductosServiciosExistencias= new JTextAreaMe();
		jTextAreanombreProductosServiciosExistencias.setEnabled(false);
		jTextAreanombreProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosExistencias.setLineWrap(true);
		jTextAreanombreProductosServiciosExistencias.setWrapStyleWord(true);
		jTextAreanombreProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProductosServiciosExistencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProductosServiciosExistencias = new JScrollPane(jTextAreanombreProductosServiciosExistencias);
		jscrollPanenombreProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombreProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombreProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombreProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_producto_servicioProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombre_tipo_producto_servicioProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO+" : *");
		this.jLabelnombre_tipo_producto_servicioProductosServiciosExistencias.setToolTipText("Nombre Tipo Producto Servicio");
		this.jLabelnombre_tipo_producto_servicioProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_producto_servicioProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_producto_servicioProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_producto_servicioProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_producto_servicioProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_producto_servicioProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombre_tipo_producto_servicioProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias= new JTextAreaMe();
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.setEnabled(false);
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.setLineWrap(true);
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.setWrapStyleWord(true);
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_producto_servicioProductosServiciosExistencias = new JScrollPane(jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias);
		jscrollPanenombre_tipo_producto_servicioProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_producto_servicioProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_producto_servicioProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombre_bodegaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaProductosServiciosExistencias.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombre_bodegaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextAreanombre_bodegaProductosServiciosExistencias= new JTextAreaMe();
		jTextAreanombre_bodegaProductosServiciosExistencias.setEnabled(false);
		jTextAreanombre_bodegaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosExistencias.setLineWrap(true);
		jTextAreanombre_bodegaProductosServiciosExistencias.setWrapStyleWord(true);
		jTextAreanombre_bodegaProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaProductosServiciosExistencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaProductosServiciosExistencias = new JScrollPane(jTextAreanombre_bodegaProductosServiciosExistencias);
		jscrollPanenombre_bodegaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_bodegaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_bodegaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProductosServiciosExistencias = new JLabelMe();
		this.jLabelnombre_unidadProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProductosServiciosExistencias.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelnombre_unidadProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextFieldnombre_unidadProductosServiciosExistencias= new JTextFieldMe();

		jTextFieldnombre_unidadProductosServiciosExistencias.setEnabled(false);
		jTextFieldnombre_unidadProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleProductosServiciosExistencias = new JLabelMe();
		this.jLabelcantidad_disponibleProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleProductosServiciosExistencias.setToolTipText("Cantad Disponible");
		this.jLabelcantidad_disponibleProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelcantidad_disponibleProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextFieldcantidad_disponibleProductosServiciosExistencias= new JTextFieldMe();
		jTextFieldcantidad_disponibleProductosServiciosExistencias.setEnabled(false);
		jTextFieldcantidad_disponibleProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleProductosServiciosExistencias.setText("0");

		this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_reservadaProductosServiciosExistencias = new JLabelMe();
		this.jLabelcantidad_reservadaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADRESERVADA+" : *");
		this.jLabelcantidad_reservadaProductosServiciosExistencias.setToolTipText("Cantad Reservada");
		this.jLabelcantidad_reservadaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_reservadaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_reservadaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_reservadaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_reservadaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_reservadaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADRESERVADA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelcantidad_reservadaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextFieldcantidad_reservadaProductosServiciosExistencias= new JTextFieldMe();
		jTextFieldcantidad_reservadaProductosServiciosExistencias.setEnabled(false);
		jTextFieldcantidad_reservadaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_reservadaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_reservadaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_reservadaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_reservadaProductosServiciosExistencias.setText("0.0");

		this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_reservadaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_reservadaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_reservadaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pedidaProductosServiciosExistencias = new JLabelMe();
		this.jLabelcantidad_pedidaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADPEDIDA+" : *");
		this.jLabelcantidad_pedidaProductosServiciosExistencias.setToolTipText("Cantad Peda");
		this.jLabelcantidad_pedidaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_pedidaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_pedidaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pedidaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pedidaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pedidaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADPEDIDA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelcantidad_pedidaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextFieldcantidad_pedidaProductosServiciosExistencias= new JTextFieldMe();
		jTextFieldcantidad_pedidaProductosServiciosExistencias.setEnabled(false);
		jTextFieldcantidad_pedidaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pedidaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pedidaProductosServiciosExistencias.setText("0.0");

		this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pedidaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pedidaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pedidaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_egresoProductosServiciosExistencias = new JLabelMe();
		this.jLabeltotal_egresoProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALEGRESO+" : *");
		this.jLabeltotal_egresoProductosServiciosExistencias.setToolTipText("Total Egreso");
		this.jLabeltotal_egresoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_egresoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_egresoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_egresoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_egresoProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_egresoProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALEGRESO);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPaneltotal_egresoProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextFieldtotal_egresoProductosServiciosExistencias= new JTextFieldMe();
		jTextFieldtotal_egresoProductosServiciosExistencias.setEnabled(false);
		jTextFieldtotal_egresoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_egresoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_egresoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_egresoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_egresoProductosServiciosExistencias.setText("0.0");

		this.jButtontotal_egresoProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtontotal_egresoProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_egresoProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_egresoProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_egresoProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtontotal_egresoProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_egresoProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_egresoProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_egresoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_egresoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_egresoProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_egresoProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_compraProductosServiciosExistencias = new JLabelMe();
		this.jLabeltotal_compraProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALCOMPRA+" : *");
		this.jLabeltotal_compraProductosServiciosExistencias.setToolTipText("Total Compra");
		this.jLabeltotal_compraProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_compraProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_compraProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_compraProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_compraProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_compraProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALCOMPRA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPaneltotal_compraProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextFieldtotal_compraProductosServiciosExistencias= new JTextFieldMe();
		jTextFieldtotal_compraProductosServiciosExistencias.setEnabled(false);
		jTextFieldtotal_compraProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_compraProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_compraProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_compraProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_compraProductosServiciosExistencias.setText("0.0");

		this.jButtontotal_compraProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtontotal_compraProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_compraProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_compraProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_compraProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtontotal_compraProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_compraProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_compraProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_compraProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_compraProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_compraProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_compraProductosServiciosExistenciasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_devueltoProductosServiciosExistencias = new JLabelMe();
		this.jLabeltotal_devueltoProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALDEVUELTO+" : *");
		this.jLabeltotal_devueltoProductosServiciosExistencias.setToolTipText("Total Devuelto");
		this.jLabeltotal_devueltoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_devueltoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_devueltoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_devueltoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_devueltoProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_devueltoProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALDEVUELTO);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPaneltotal_devueltoProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jTextFieldtotal_devueltoProductosServiciosExistencias= new JTextFieldMe();
		jTextFieldtotal_devueltoProductosServiciosExistencias.setEnabled(false);
		jTextFieldtotal_devueltoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_devueltoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_devueltoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_devueltoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_devueltoProductosServiciosExistencias.setText("0.0");

		this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_devueltoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_devueltoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_devueltoProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_devueltoProductosServiciosExistenciasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductosServiciosExistencias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_empresaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductosServiciosExistencias.setToolTipText("Empresa");
		this.jLabelid_empresaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_empresaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_empresaProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_empresaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductosServiciosExistencias.setEnabled(false);

		this.jButtonid_empresaProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_empresaProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_empresaProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosExistencias"));

		this.jButtonid_empresaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_empresaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_empresaProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_empresaProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosExistenciasUpdate"));



					
		this.jLabelid_sucursalProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_sucursalProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductosServiciosExistencias.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_sucursalProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_sucursalProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_sucursalProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductosServiciosExistencias.setEnabled(false);

		this.jButtonid_sucursalProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_sucursalProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosExistencias"));

		this.jButtonid_sucursalProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_sucursalProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_sucursalProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosExistenciasUpdate"));



					
		this.jLabelid_bodegaProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_bodegaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductosServiciosExistencias.setToolTipText("Bodega");
		this.jLabelid_bodegaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_bodegaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_bodegaProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_bodegaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_bodegaProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosExistencias"));

		this.jButtonid_bodegaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_bodegaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_bodegaProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosExistenciasUpdate"));



					
		this.jLabelid_productoProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_productoProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductosServiciosExistencias.setToolTipText("Producto");
		this.jLabelid_productoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_productoProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_productoProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_productoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_productoProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_productoProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosServiciosExistencias"));

		this.jButtonid_productoProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_productoProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_productoProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_productoProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_productoProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_productoProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosServiciosExistenciasUpdate"));



					
		this.jLabelid_lineaProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_lineaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProductosServiciosExistencias.setToolTipText("Linea");
		this.jLabelid_lineaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_lineaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_lineaProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_lineaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_lineaProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_lineaProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosExistencias"));

		this.jButtonid_lineaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_lineaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_lineaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_lineaProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_lineaProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_lineaProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosExistenciasUpdate"));



					
		this.jLabelid_linea_grupoProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_linea_grupoProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProductosServiciosExistencias.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_linea_grupoProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_linea_grupoProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_linea_grupoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_linea_grupoProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosExistencias"));

		this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_linea_grupoProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosExistenciasUpdate"));



					
		this.jLabelid_linea_categoriaProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_linea_categoriaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProductosServiciosExistencias.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_linea_categoriaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_linea_categoriaProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_linea_categoriaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_linea_categoriaProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosExistencias"));

		this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_linea_categoriaProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosExistenciasUpdate"));



					
		this.jLabelid_linea_marcaProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_linea_marcaProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProductosServiciosExistencias.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_linea_marcaProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_linea_marcaProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_linea_marcaProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_linea_marcaProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosExistencias"));

		this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_linea_marcaProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosExistenciasUpdate"));



					
		this.jLabelid_tipo_producto_servicioProductosServiciosExistencias = new JLabelMe();
		this.jLabelid_tipo_producto_servicioProductosServiciosExistencias.setText(""+ProductosServiciosExistenciasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO+" : *");
		this.jLabelid_tipo_producto_servicioProductosServiciosExistencias.setToolTipText("Tipo Producto Servicio");
		this.jLabelid_tipo_producto_servicioProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicioProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicioProductosServiciosExistencias.setToolTipText(ProductosServiciosExistenciasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		this.jPanelid_tipo_producto_servicioProductosServiciosExistencias.setLayout(this.gridaBagLayoutProductosServiciosExistencias);


		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicioProductosServiciosExistencias= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosExistencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosExistencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosExistencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosExistencias.setText("Buscar");
		this.jButtonid_tipo_producto_servicioProductosServiciosExistencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosExistencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosExistencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosExistencias"));

		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosExistenciasBusqueda"));

		if(this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate.setText("U");
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosExistencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosExistenciasUpdate"));



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
		//this.jInternalFrameDetalleProductosServiciosExistencias = new ProductosServiciosExistenciasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos Servicios Existencias DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosServiciosExistencias= new GridBagLayout();
		

		
		String sToolTipProductosServiciosExistencias="";
		sToolTipProductosServiciosExistencias=ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosServiciosExistencias+="(Inventario.ProductosServiciosExistencias)";
		}
		
		if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosServiciosExistencias+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductosServiciosExistencias = new JButtonMe();
		this.jButtonModificarProductosServiciosExistencias = new JButtonMe();
        this.jButtonActualizarProductosServiciosExistencias = new JButtonMe();
        this.jButtonEliminarProductosServiciosExistencias = new JButtonMe();
        this.jButtonCancelarProductosServiciosExistencias = new JButtonMe();
        this.jButtonGuardarCambiosProductosServiciosExistencias = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductosServiciosExistencias = new JButtonMe();
		this.jButtonCerrarProductosServiciosExistencias = new JButtonMe();
		
		this.jScrollPanelDatosProductosServiciosExistencias = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductosServiciosExistencias = new JScrollPane();
		this.jScrollPanelDatosGeneralProductosServiciosExistencias = new JScrollPane();
				
		
		
		this.jPanelCamposProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Servicios Existencias";
		
		if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Existenciases" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductosServiciosExistencias.setName("jPanelCamposProductosServiciosExistencias"); 

		this.jPanelCamposOcultosProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductosServiciosExistencias.setName("jPanelCamposOcultosProductosServiciosExistencias"); 

        this.jPanelAccionesProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosServiciosExistencias.setToolTipText("Acciones");
        this.jPanelAccionesProductosServiciosExistencias.setName("Acciones"); 

		this.jPanelAccionesFormularioProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductosServiciosExistencias.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductosServiciosExistencias.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductosServiciosExistencias.setText("Nuevo");
		this.jButtonModificarProductosServiciosExistencias.setText("Editar");
        this.jButtonActualizarProductosServiciosExistencias.setText("Actualizar");
        this.jButtonEliminarProductosServiciosExistencias.setText("Eliminar");
        this.jButtonCancelarProductosServiciosExistencias.setText("Cancelar");
        this.jButtonGuardarCambiosProductosServiciosExistencias.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductosServiciosExistencias.setText("Guardar");
		this.jButtonCerrarProductosServiciosExistencias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosServiciosExistencias,"nuevo_button","Nuevo",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductosServiciosExistencias,"modificar_button","Editar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductosServiciosExistencias,"actualizar_button","Actualizar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductosServiciosExistencias,"eliminar_button","Eliminar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductosServiciosExistencias,"cancelar_button","Cancelar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductosServiciosExistencias,"guardarcambios_button","Guardar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosServiciosExistencias,"guardarcambiostabla_button","Guardar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosServiciosExistencias,"cerrar_button","Salir",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductosServiciosExistencias.setToolTipText("Nuevo"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductosServiciosExistencias.setToolTipText("Editar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductosServiciosExistencias.setToolTipText("Actualizar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductosServiciosExistencias.setToolTipText("Eliminar)"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductosServiciosExistencias.setToolTipText("Cancelar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductosServiciosExistencias.setToolTipText("Guardar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductosServiciosExistencias.setToolTipText("Guardar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosServiciosExistencias.setToolTipText("Salir"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosServiciosExistencias";
		inputMap = this.jButtonNuevoProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosServiciosExistencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosServiciosExistencias"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductosServiciosExistencias";
		inputMap = this.jButtonActualizarProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductosServiciosExistencias"));
		
		//ELIMINAR
		sMapKey = "EliminarProductosServiciosExistencias";
		inputMap = this.jButtonEliminarProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductosServiciosExistencias"));
		
		//CANCELAR	
		sMapKey = "CancelarProductosServiciosExistencias";
		inputMap = this.jButtonCancelarProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductosServiciosExistencias"));
		
		//CERRAR		
		sMapKey = "CerrarProductosServiciosExistencias";
		inputMap = this.jButtonCerrarProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosServiciosExistencias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosServiciosExistencias";
		inputMap = this.jButtonGuardarCambiosTablaProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosServiciosExistencias"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductosServiciosExistencias = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductosServiciosExistencias.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductosServiciosExistencias.setToolTipText("Nuevo ProductosServiciosExistencias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductosServiciosExistencias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductosServiciosExistencias.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductosServiciosExistencias.setToolTipText("Sin Cerrar Ventana ProductosServiciosExistencias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductosServiciosExistencias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductosServiciosExistencias.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductosServiciosExistencias.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosServiciosExistencias.setText("Accion");
		this.jComboBoxTiposAccionesProductosServiciosExistencias.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductosServiciosExistencias = new JLabelMe();
		
		this.jLabelAccionesProductosServiciosExistencias.setText("Acciones");		
		this.jLabelAccionesProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductosServiciosExistencias();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductosServiciosExistencias();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductosServiciosExistencias=new JTabbedPane();
		this.jTabbedPaneRelacionesProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductosServiciosExistencias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosExistencias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosExistencias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductosServiciosExistencias = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductosServiciosExistencias = new GridBagLayout();
		
		this.jPanelCamposProductosServiciosExistencias.setLayout(gridaBagLayoutCamposProductosServiciosExistencias);
		this.jPanelCamposOcultosProductosServiciosExistencias.setLayout(gridaBagLayoutCamposOcultosProductosServiciosExistencias);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductosServiciosExistencias.add(jLabelIdProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductosServiciosExistencias.add(jLabelidProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductosServiciosExistencias.add(jLabelid_empresaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosServiciosExistencias.add(jButtonid_empresaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosServiciosExistencias.add(jButtonid_empresaProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductosServiciosExistencias.add(jComboBoxid_empresaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductosServiciosExistencias.add(jLabelid_sucursalProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosServiciosExistencias.add(jButtonid_sucursalProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosServiciosExistencias.add(jButtonid_sucursalProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductosServiciosExistencias.add(jComboBoxid_sucursalProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductosServiciosExistencias.add(jLabelid_bodegaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosServiciosExistencias.add(jButtonid_bodegaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosServiciosExistencias.add(jButtonid_bodegaProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductosServiciosExistencias.add(jComboBoxid_bodegaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductosServiciosExistencias.add(jLabelid_productoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductosServiciosExistencias.add(jButtonid_productoProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductosServiciosExistencias.add(jButtonid_productoProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductosServiciosExistencias.add(jComboBoxid_productoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProductosServiciosExistencias.add(jLabelid_lineaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosServiciosExistencias.add(jButtonid_lineaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosServiciosExistencias.add(jButtonid_lineaProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProductosServiciosExistencias.add(jComboBoxid_lineaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProductosServiciosExistencias.add(jLabelid_linea_grupoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosServiciosExistencias.add(jButtonid_linea_grupoProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosServiciosExistencias.add(jButtonid_linea_grupoProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProductosServiciosExistencias.add(jComboBoxid_linea_grupoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProductosServiciosExistencias.add(jLabelid_linea_categoriaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosServiciosExistencias.add(jButtonid_linea_categoriaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosServiciosExistencias.add(jButtonid_linea_categoriaProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProductosServiciosExistencias.add(jComboBoxid_linea_categoriaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProductosServiciosExistencias.add(jLabelid_linea_marcaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosServiciosExistencias.add(jButtonid_linea_marcaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosServiciosExistencias.add(jButtonid_linea_marcaProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProductosServiciosExistencias.add(jComboBoxid_linea_marcaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicioProductosServiciosExistencias.add(jLabelid_tipo_producto_servicioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioProductosServiciosExistencias.add(jButtonid_tipo_producto_servicioProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 3;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioProductosServiciosExistencias.add(jButtonid_tipo_producto_servicioProductosServiciosExistenciasUpdate, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicioProductosServiciosExistencias.add(jComboBoxid_tipo_producto_servicioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalProductosServiciosExistencias.add(jLabelnombre_sucursalProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalProductosServiciosExistencias.add(jButtonnombre_sucursalProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalProductosServiciosExistencias.add(jscrollPanenombre_sucursalProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaProductosServiciosExistencias.add(jLabelnombre_lineaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaProductosServiciosExistencias.add(jButtonnombre_lineaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaProductosServiciosExistencias.add(jscrollPanenombre_lineaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoProductosServiciosExistencias.add(jLabelnombre_linea_grupoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoProductosServiciosExistencias.add(jButtonnombre_linea_grupoProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoProductosServiciosExistencias.add(jscrollPanenombre_linea_grupoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaProductosServiciosExistencias.add(jLabelnombre_linea_categoriaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaProductosServiciosExistencias.add(jButtonnombre_linea_categoriaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaProductosServiciosExistencias.add(jscrollPanenombre_linea_categoriaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaProductosServiciosExistencias.add(jLabelnombre_linea_marcaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaProductosServiciosExistencias.add(jButtonnombre_linea_marcaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaProductosServiciosExistencias.add(jscrollPanenombre_linea_marcaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProductosServiciosExistencias.add(jLabelcodigoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProductosServiciosExistencias.add(jButtoncodigoProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProductosServiciosExistencias.add(jTextFieldcodigoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProductosServiciosExistencias.add(jLabelnombreProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProductosServiciosExistencias.add(jButtonnombreProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProductosServiciosExistencias.add(jscrollPanenombreProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_producto_servicioProductosServiciosExistencias.add(jLabelnombre_tipo_producto_servicioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_producto_servicioProductosServiciosExistencias.add(jButtonnombre_tipo_producto_servicioProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_producto_servicioProductosServiciosExistencias.add(jscrollPanenombre_tipo_producto_servicioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaProductosServiciosExistencias.add(jLabelnombre_bodegaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaProductosServiciosExistencias.add(jButtonnombre_bodegaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaProductosServiciosExistencias.add(jscrollPanenombre_bodegaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProductosServiciosExistencias.add(jLabelnombre_unidadProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProductosServiciosExistencias.add(jButtonnombre_unidadProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProductosServiciosExistencias.add(jTextFieldnombre_unidadProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleProductosServiciosExistencias.add(jLabelcantidad_disponibleProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleProductosServiciosExistencias.add(jButtoncantidad_disponibleProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleProductosServiciosExistencias.add(jTextFieldcantidad_disponibleProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_reservadaProductosServiciosExistencias.add(jLabelcantidad_reservadaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_reservadaProductosServiciosExistencias.add(jButtoncantidad_reservadaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_reservadaProductosServiciosExistencias.add(jTextFieldcantidad_reservadaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pedidaProductosServiciosExistencias.add(jLabelcantidad_pedidaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pedidaProductosServiciosExistencias.add(jButtoncantidad_pedidaProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pedidaProductosServiciosExistencias.add(jTextFieldcantidad_pedidaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_egresoProductosServiciosExistencias.add(jLabeltotal_egresoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_egresoProductosServiciosExistencias.add(jButtontotal_egresoProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_egresoProductosServiciosExistencias.add(jTextFieldtotal_egresoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_compraProductosServiciosExistencias.add(jLabeltotal_compraProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_compraProductosServiciosExistencias.add(jButtontotal_compraProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_compraProductosServiciosExistencias.add(jTextFieldtotal_compraProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_devueltoProductosServiciosExistencias.add(jLabeltotal_devueltoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 2;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
		this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_devueltoProductosServiciosExistencias.add(jButtontotal_devueltoProductosServiciosExistenciasBusqueda, this.gridBagConstraintsProductosServiciosExistencias);
	}

	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = 1;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_devueltoProductosServiciosExistencias.add(jTextFieldtotal_devueltoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelidProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelid_bodegaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelid_productoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelid_lineaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelid_linea_grupoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelid_linea_categoriaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelid_linea_marcaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelid_tipo_producto_servicioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombre_sucursalProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombre_lineaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombre_linea_grupoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombre_linea_categoriaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombre_linea_marcaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelcodigoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombreProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombre_tipo_producto_servicioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombre_bodegaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelnombre_unidadProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelcantidad_disponibleProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelcantidad_reservadaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPanelcantidad_pedidaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPaneltotal_egresoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPaneltotal_compraProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosExistencias.add(this.jPaneltotal_devueltoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposProductosServiciosExistencias % 3==0) {
		iXPanelCamposProductosServiciosExistencias=0;
		iYPanelCamposProductosServiciosExistencias++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposOcultosProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposOcultosProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosServiciosExistencias.add(this.jPanelid_empresaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposOcultosProductosServiciosExistencias % 3==0) {
		iXPanelCamposOcultosProductosServiciosExistencias=0;
		iYPanelCamposOcultosProductosServiciosExistencias++;
	}
	this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosExistencias.gridy = iYPanelCamposOcultosProductosServiciosExistencias;
	this.gridBagConstraintsProductosServiciosExistencias.gridx = iXPanelCamposOcultosProductosServiciosExistencias++;
	this.gridBagConstraintsProductosServiciosExistencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosExistencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosServiciosExistencias.add(this.jPanelid_sucursalProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);



	if(iXPanelCamposOcultosProductosServiciosExistencias % 3==0) {
		iXPanelCamposOcultosProductosServiciosExistencias=0;
		iYPanelCamposOcultosProductosServiciosExistencias++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductosServiciosExistencias= new GridBagLayout();
		this.jPanelAccionesProductosServiciosExistencias.setLayout(gridaBagLayoutAccionesProductosServiciosExistencias);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductosServiciosExistencias= new GridBagLayout();
		this.jPanelAccionesFormularioProductosServiciosExistencias.setLayout(gridaBagLayoutAccionesFormularioProductosServiciosExistencias);
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductosServiciosExistencias.add(this.jComboBoxTiposAccionesFormularioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductosServiciosExistencias.add(this.jButtonModificarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);							

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductosServiciosExistencias.add(this.jButtonEliminarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
			
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosExistencias.add(this.jButtonActualizarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosExistencias.add(this.jButtonGuardarCambiosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);	
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosExistencias.add(this.jButtonCancelarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosServiciosExistencias);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();						
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;		
			//this.gridBagConstraintsProductosServiciosExistencias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosServiciosExistencias.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosExistencias.gridx =0;
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosServiciosExistencias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosServiciosExistenciasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductosServiciosExistencias = new ProductosServiciosExistenciasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos Servicios Existencias DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos Servicios Existencias DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Servicios Existencias Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosServiciosExistenciasModel productosserviciosexistenciasModel=new ProductosServiciosExistenciasModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosServiciosExistenciasModel.ProductosServiciosExistenciasFocusTraversalPolicy productosserviciosexistenciasFocusTraversalPolicy = productosserviciosexistenciasModel.new ProductosServiciosExistenciasFocusTraversalPolicy(this);
			
			//productosserviciosexistenciasFocusTraversalPolicy.setproductosserviciosexistenciasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productosserviciosexistenciasModel);
			
			
			this.jContentPaneDetalleProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductosServiciosExistencias = new GridBagLayout();	
			this.jContentPaneDetalleProductosServiciosExistencias.setLayout(gridaBagLayoutDetalleProductosServiciosExistencias);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosServiciosExistencias = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
					
				
				this.jContentPaneDetalleProductosServiciosExistencias.add(jTtoolBarDetalleProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);								
				
}
			
			this.jScrollPanelDatosEdicionProductosServiciosExistencias=   new JScrollPane(jContentPaneDetalleProductosServiciosExistencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductosServiciosExistencias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	        
			this.jContentPaneDetalleProductosServiciosExistencias.add(jPanelCamposProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);
			
			
			
			
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
						//&& productosserviciosexistenciasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productosserviciosexistenciasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductosServiciosExistencias= new GridBagConstraints();
						this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
						this.jContentPaneDetalleProductosServiciosExistencias.add(this.jTabbedPaneRelacionesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductosServiciosExistencias.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductosServiciosExistencias.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
					this.gridBagConstraintsProductosServiciosExistencias.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
					
				
					this.jContentPaneDetalleProductosServiciosExistencias.add(jPanelCamposOcultosProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);
				
					this.jPanelCamposOcultosProductosServiciosExistencias.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	        this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductosServiciosExistencias.add(this.jPanelAccionesFormularioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);							
			
			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
	        this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
	        
			
			this.jContentPaneDetalleProductosServiciosExistencias.add(this.jPanelAccionesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductosServiciosExistencias);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductosServiciosExistencias=   new JScrollPane(this.jPanelCamposProductosServiciosExistencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductosServiciosExistencias.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			
			
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
			
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductosServiciosExistencias;//jContentPane;
		
		return jScrollPanelDatosEdicionProductosServiciosExistencias;
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
