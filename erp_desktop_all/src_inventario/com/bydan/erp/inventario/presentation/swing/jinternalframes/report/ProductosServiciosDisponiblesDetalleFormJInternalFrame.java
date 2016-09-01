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
import com.bydan.erp.inventario.util.report.ProductosServiciosDisponiblesConstantesFunciones;

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
public class ProductosServiciosDisponiblesDetalleFormJInternalFrame extends ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductosServiciosDisponibles;
	
	protected JMenuBar jmenuBarDetalleProductosServiciosDisponibles;
	
	protected JMenu jmenuDetalleProductosServiciosDisponibles;
	protected JMenu jmenuDetalleArchivoProductosServiciosDisponibles;
	protected JMenu jmenuDetalleAccionesProductosServiciosDisponibles;
	protected JMenu jmenuDetalleDatosProductosServiciosDisponibles;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosServiciosDisponibles;	
	protected GridBagConstraints gridBagConstraintsProductosServiciosDisponibles;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductosServiciosDisponibles;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

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
	
	public ProductosServiciosDisponiblesSessionBean productosserviciosdisponiblesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;	
	
	public ProductosServiciosDisponiblesLogic productosserviciosdisponiblesLogic;
	
	public JScrollPane jScrollPanelDatosProductosServiciosDisponibles;
	public JScrollPane jScrollPanelDatosEdicionProductosServiciosDisponibles;
	public JScrollPane jScrollPanelDatosGeneralProductosServiciosDisponibles;
	
	protected JPanel jPanelCamposProductosServiciosDisponibles;    
	protected JPanel jPanelCamposOcultosProductosServiciosDisponibles;    	
	protected JPanel jPanelAccionesProductosServiciosDisponibles;
	protected JPanel jPanelAccionesFormularioProductosServiciosDisponibles;
    
	
	
	protected Integer iXPanelCamposProductosServiciosDisponibles=0;
	protected Integer iYPanelCamposProductosServiciosDisponibles=0;
	
	protected Integer iXPanelCamposOcultosProductosServiciosDisponibles=0;
	protected Integer iYPanelCamposOcultosProductosServiciosDisponibles=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductosServiciosDisponibles;
	public JButton jButtonModificarProductosServiciosDisponibles;
	public JButton jButtonActualizarProductosServiciosDisponibles;
    public JButton jButtonEliminarProductosServiciosDisponibles;
	public JButton jButtonCancelarProductosServiciosDisponibles;
    public JButton jButtonGuardarCambiosProductosServiciosDisponibles;
	public JButton jButtonGuardarCambiosTablaProductosServiciosDisponibles;
	protected JButton jButtonCerrarProductosServiciosDisponibles;
	
	
	protected JButton jButtonProcesarInformacionProductosServiciosDisponibles;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductosServiciosDisponibles;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductosServiciosDisponibles;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductosServiciosDisponibles;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosServiciosDisponibles;
	protected JButton jButtonModificarToolBarProductosServiciosDisponibles;
	protected JButton jButtonActualizarToolBarProductosServiciosDisponibles;
    protected JButton jButtonEliminarToolBarProductosServiciosDisponibles;
	protected JButton jButtonCancelarToolBarProductosServiciosDisponibles;
    protected JButton jButtonGuardarCambiosToolBarProductosServiciosDisponibles;
	protected JButton jButtonGuardarCambiosTablaToolBarProductosServiciosDisponibles;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosServiciosDisponibles;
	protected JButton jButtonCerrarToolBarProductosServiciosDisponibles;
	
	protected JButton jButtonProcesarInformacionToolBarProductosServiciosDisponibles;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosServiciosDisponibles;
	protected JMenuItem jMenuItemModificarProductosServiciosDisponibles;
	protected JMenuItem jMenuItemActualizarProductosServiciosDisponibles;
    protected JMenuItem jMenuItemEliminarProductosServiciosDisponibles;
	protected JMenuItem jMenuItemCancelarProductosServiciosDisponibles;
    protected JMenuItem jMenuItemGuardarCambiosProductosServiciosDisponibles;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosServiciosDisponibles;
	protected JMenuItem jMenuItemCerrarProductosServiciosDisponibles;
	protected JMenuItem jMenuItemDetalleCerrarProductosServiciosDisponibles;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosServiciosDisponibles;
	
	protected JMenuItem jMenuItemProcesarInformacionProductosServiciosDisponibles;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles;
	protected JMenuItem jMenuItemMostrarOcultarProductosServiciosDisponibles;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosServiciosDisponibles;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosServiciosDisponibles;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductosServiciosDisponibles;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductosServiciosDisponibles;
	public JLabel jLabelIdProductosServiciosDisponibles;
	public JLabel jLabelidProductosServiciosDisponibles;
	public JButton jButtonidProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalProductosServiciosDisponibles;
	public JLabel jLabelnombre_sucursalProductosServiciosDisponibles;
	public JTextArea jTextAreanombre_sucursalProductosServiciosDisponibles;
	public JScrollPane jscrollPanenombre_sucursalProductosServiciosDisponibles;
	public JButton jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaProductosServiciosDisponibles;
	public JLabel jLabelnombre_lineaProductosServiciosDisponibles;
	public JTextArea jTextAreanombre_lineaProductosServiciosDisponibles;
	public JScrollPane jscrollPanenombre_lineaProductosServiciosDisponibles;
	public JButton jButtonnombre_lineaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoProductosServiciosDisponibles;
	public JLabel jLabelnombre_linea_grupoProductosServiciosDisponibles;
	public JTextArea jTextAreanombre_linea_grupoProductosServiciosDisponibles;
	public JScrollPane jscrollPanenombre_linea_grupoProductosServiciosDisponibles;
	public JButton jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaProductosServiciosDisponibles;
	public JLabel jLabelnombre_linea_categoriaProductosServiciosDisponibles;
	public JTextArea jTextAreanombre_linea_categoriaProductosServiciosDisponibles;
	public JScrollPane jscrollPanenombre_linea_categoriaProductosServiciosDisponibles;
	public JButton jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaProductosServiciosDisponibles;
	public JLabel jLabelnombre_linea_marcaProductosServiciosDisponibles;
	public JTextArea jTextAreanombre_linea_marcaProductosServiciosDisponibles;
	public JScrollPane jscrollPanenombre_linea_marcaProductosServiciosDisponibles;
	public JButton jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProductosServiciosDisponibles;
	public JLabel jLabelcodigoProductosServiciosDisponibles;
	public JTextField jTextFieldcodigoProductosServiciosDisponibles;
	public JButton jButtoncodigoProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombreProductosServiciosDisponibles;
	public JLabel jLabelnombreProductosServiciosDisponibles;
	public JTextArea jTextAreanombreProductosServiciosDisponibles;
	public JScrollPane jscrollPanenombreProductosServiciosDisponibles;
	public JButton jButtonnombreProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles;
	public JLabel jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles;
	public JTextArea jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles;
	public JScrollPane jscrollPanenombre_tipo_producto_servicioProductosServiciosDisponibles;
	public JButton jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaProductosServiciosDisponibles;
	public JLabel jLabelnombre_bodegaProductosServiciosDisponibles;
	public JTextArea jTextAreanombre_bodegaProductosServiciosDisponibles;
	public JScrollPane jscrollPanenombre_bodegaProductosServiciosDisponibles;
	public JButton jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProductosServiciosDisponibles;
	public JLabel jLabelnombre_unidadProductosServiciosDisponibles;
	public JTextField jTextFieldnombre_unidadProductosServiciosDisponibles;
	public JButton jButtonnombre_unidadProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleProductosServiciosDisponibles;
	public JLabel jLabelcantidad_disponibleProductosServiciosDisponibles;
	public JTextField jTextFieldcantidad_disponibleProductosServiciosDisponibles;
	public JButton jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_maximoProductosServiciosDisponibles;
	public JLabel jLabelcantidad_maximoProductosServiciosDisponibles;
	public JTextField jTextFieldcantidad_maximoProductosServiciosDisponibles;
	public JButton jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_minimoProductosServiciosDisponibles;
	public JLabel jLabelcantidad_minimoProductosServiciosDisponibles;
	public JTextField jTextFieldcantidad_minimoProductosServiciosDisponibles;
	public JButton jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelprecio_compraProductosServiciosDisponibles;
	public JLabel jLabelprecio_compraProductosServiciosDisponibles;
	public JTextField jTextFieldprecio_compraProductosServiciosDisponibles;
	public JButton jButtonprecio_compraProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelprecio_ventaProductosServiciosDisponibles;
	public JLabel jLabelprecio_ventaProductosServiciosDisponibles;
	public JTextField jTextFieldprecio_ventaProductosServiciosDisponibles;
	public JButton jButtonprecio_ventaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcosto_ultimoProductosServiciosDisponibles;
	public JLabel jLabelcosto_ultimoProductosServiciosDisponibles;
	public JTextField jTextFieldcosto_ultimoProductosServiciosDisponibles;
	public JButton jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductosServiciosDisponibles;
	public JLabel jLabelid_empresaProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductosServiciosDisponibles;
	public JButton jButtonid_empresaProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_empresaProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductosServiciosDisponibles;
	public JLabel jLabelid_sucursalProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductosServiciosDisponibles;
	public JButton jButtonid_sucursalProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_sucursalProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductosServiciosDisponibles;
	public JLabel jLabelid_bodegaProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductosServiciosDisponibles;
	public JButton jButtonid_bodegaProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_bodegaProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProductosServiciosDisponibles;
	public JLabel jLabelid_lineaProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProductosServiciosDisponibles;
	public JButton jButtonid_lineaProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_lineaProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_lineaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProductosServiciosDisponibles;
	public JLabel jLabelid_linea_grupoProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProductosServiciosDisponibles;
	public JButton jButtonid_linea_grupoProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProductosServiciosDisponibles;
	public JLabel jLabelid_linea_categoriaProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProductosServiciosDisponibles;
	public JButton jButtonid_linea_categoriaProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProductosServiciosDisponibles;
	public JLabel jLabelid_linea_marcaProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProductosServiciosDisponibles;
	public JButton jButtonid_linea_marcaProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicioProductosServiciosDisponibles;
	public JLabel jLabelid_tipo_producto_servicioProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles;
	public JButton jButtonid_tipo_producto_servicioProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductosServiciosDisponibles;
	
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
	public int iHeightFormulario=740;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductosServiciosDisponiblesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductosServiciosDisponibles=new JPanel();
				this.jPanelAccionesFormularioProductosServiciosDisponibles=new JPanel();
				this.jmenuBarDetalleProductosServiciosDisponibles=new JMenuBar();
				this.jTtoolBarDetalleProductosServiciosDisponibles=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosDisponiblesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosServiciosDisponiblesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosDisponiblesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosDisponiblesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosDisponiblesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductosServiciosDisponibles() {
		return this.jButtonActualizarToolBarProductosServiciosDisponibles;
	}
	
	public JButton getjButtonEliminarToolBarProductosServiciosDisponibles() {
		return this.jButtonEliminarToolBarProductosServiciosDisponibles;
	}
	
	public JButton getjButtonCancelarToolBarProductosServiciosDisponibles() {
		return this.jButtonCancelarToolBarProductosServiciosDisponibles;
	}		
	
	public JButton getjButtonProcesarInformacionProductosServiciosDisponibles() {
		return this.jButtonProcesarInformacionProductosServiciosDisponibles;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosServiciosDisponibles)	{
		this.jButtonProcesarInformacionProductosServiciosDisponibles = jButtonProcesarInformacionProductosServiciosDisponibles;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosServiciosDisponibles() {
		return this.jComboBoxTiposAccionesProductosServiciosDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosServiciosDisponibles(
			JComboBox jComboBoxTiposRelacionesProductosServiciosDisponibles) {
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles = jComboBoxTiposRelacionesProductosServiciosDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosServiciosDisponibles(
			JComboBox jComboBoxTiposAccionesProductosServiciosDisponibles) {
		this.jComboBoxTiposAccionesProductosServiciosDisponibles = jComboBoxTiposAccionesProductosServiciosDisponibles;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductosServiciosDisponibles() {
		return this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductosServiciosDisponibles(
			JComboBox jComboBoxTiposAccionesFormularioProductosServiciosDisponibles) {
		this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles = jComboBoxTiposAccionesFormularioProductosServiciosDisponibles;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
		
		this.productosserviciosdisponiblesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciosdisponiblesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosServiciosDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosServiciosDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosServiciosDisponiblesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Servicios Disponibles MANTENIMIENTO"));
		
		
		if(iWidth > 2450) {
			iWidth=2450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosServiciosDisponiblesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductosServiciosDisponibles= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductosServiciosDisponibles=new JButtonMe();
				this.jButtonModificarToolBarProductosServiciosDisponibles=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductosServiciosDisponibles,this.jTtoolBarDetalleProductosServiciosDisponibles,
							"actualizar","actualizar","Actualizar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductosServiciosDisponibles,this.jTtoolBarDetalleProductosServiciosDisponibles,
							"eliminar","eliminar","Eliminar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductosServiciosDisponibles,this.jTtoolBarDetalleProductosServiciosDisponibles,
							"cancelar","cancelar","Cancelar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductosServiciosDisponibles,this.jTtoolBarDetalleProductosServiciosDisponibles,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductosServiciosDisponibles=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductosServiciosDisponibles=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductosServiciosDisponibles=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductosServiciosDisponibles=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductosServiciosDisponibles=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosServiciosDisponibles= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosServiciosDisponibles.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosServiciosDisponibles,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductosServiciosDisponibles= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductosServiciosDisponibles.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductosServiciosDisponibles,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductosServiciosDisponibles= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductosServiciosDisponibles.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductosServiciosDisponibles,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductosServiciosDisponibles= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductosServiciosDisponibles.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductosServiciosDisponibles,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductosServiciosDisponibles= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductosServiciosDisponibles.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductosServiciosDisponibles,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductosServiciosDisponibles= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosServiciosDisponibles.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosServiciosDisponibles,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosServiciosDisponibles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosServiciosDisponibles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosServiciosDisponibles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductosServiciosDisponibles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductosServiciosDisponibles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductosServiciosDisponibles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosServiciosDisponibles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosServiciosDisponibles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosServiciosDisponibles,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductosServiciosDisponibles.add(this.jMenuItemDetalleCerrarProductosServiciosDisponibles);
		
		this.jmenuDetalleAccionesProductosServiciosDisponibles.add(this.jMenuItemActualizarProductosServiciosDisponibles);
		this.jmenuDetalleAccionesProductosServiciosDisponibles.add(this.jMenuItemEliminarProductosServiciosDisponibles);
		this.jmenuDetalleAccionesProductosServiciosDisponibles.add(this.jMenuItemCancelarProductosServiciosDisponibles);		
		
		//this.jmenuDetalleDatosProductosServiciosDisponibles.add(this.jMenuItemDetalleAbrirOrderByProductosServiciosDisponibles);				
		this.jmenuDetalleDatosProductosServiciosDisponibles.add(this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles);				
				
		//this.jmenuDetalleAccionesProductosServiciosDisponibles.add(this.jMenuItemGuardarCambiosProductosServiciosDisponibles);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductosServiciosDisponibles.add(this.jmenuDetalleArchivoProductosServiciosDisponibles);		
		this.jmenuBarDetalleProductosServiciosDisponibles.add(this.jmenuDetalleAccionesProductosServiciosDisponibles);		
		this.jmenuBarDetalleProductosServiciosDisponibles.add(this.jmenuDetalleDatosProductosServiciosDisponibles);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductosServiciosDisponibles);				
	}
	
	
	public void inicializarElementosCamposProductosServiciosDisponibles() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductosServiciosDisponibles = new JLabelMe();
		jLabelIdProductosServiciosDisponibles.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductosServiciosDisponibles = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductosServiciosDisponibles= new GridBagLayout();

		this.jPanelidProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);

		jLabelidProductosServiciosDisponibles = new JLabel();
		jLabelidProductosServiciosDisponibles.setText("Id");

		jLabelidProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_sucursalProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombre_sucursalProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalProductosServiciosDisponibles.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombre_sucursalProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextAreanombre_sucursalProductosServiciosDisponibles= new JTextAreaMe();
		jTextAreanombre_sucursalProductosServiciosDisponibles.setEnabled(false);
		jTextAreanombre_sucursalProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosDisponibles.setLineWrap(true);
		jTextAreanombre_sucursalProductosServiciosDisponibles.setWrapStyleWord(true);
		jTextAreanombre_sucursalProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalProductosServiciosDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalProductosServiciosDisponibles = new JScrollPane(jTextAreanombre_sucursalProductosServiciosDisponibles);
		jscrollPanenombre_sucursalProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombre_lineaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaProductosServiciosDisponibles.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombre_lineaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextAreanombre_lineaProductosServiciosDisponibles= new JTextAreaMe();
		jTextAreanombre_lineaProductosServiciosDisponibles.setEnabled(false);
		jTextAreanombre_lineaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosDisponibles.setLineWrap(true);
		jTextAreanombre_lineaProductosServiciosDisponibles.setWrapStyleWord(true);
		jTextAreanombre_lineaProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaProductosServiciosDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaProductosServiciosDisponibles = new JScrollPane(jTextAreanombre_lineaProductosServiciosDisponibles);
		jscrollPanenombre_lineaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_lineaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_lineaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombre_linea_grupoProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoProductosServiciosDisponibles.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombre_linea_grupoProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextAreanombre_linea_grupoProductosServiciosDisponibles= new JTextAreaMe();
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.setEnabled(false);
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.setLineWrap(true);
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoProductosServiciosDisponibles = new JScrollPane(jTextAreanombre_linea_grupoProductosServiciosDisponibles);
		jscrollPanenombre_linea_grupoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_grupoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_grupoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombre_linea_categoriaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaProductosServiciosDisponibles.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombre_linea_categoriaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextAreanombre_linea_categoriaProductosServiciosDisponibles= new JTextAreaMe();
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setEnabled(false);
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setLineWrap(true);
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaProductosServiciosDisponibles = new JScrollPane(jTextAreanombre_linea_categoriaProductosServiciosDisponibles);
		jscrollPanenombre_linea_categoriaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_categoriaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_categoriaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombre_linea_marcaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaProductosServiciosDisponibles.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombre_linea_marcaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextAreanombre_linea_marcaProductosServiciosDisponibles= new JTextAreaMe();
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.setEnabled(false);
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.setLineWrap(true);
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaProductosServiciosDisponibles = new JScrollPane(jTextAreanombre_linea_marcaProductosServiciosDisponibles);
		jscrollPanenombre_linea_marcaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_marcaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_marcaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoProductosServiciosDisponibles = new JLabelMe();
		this.jLabelcodigoProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProductosServiciosDisponibles.setToolTipText("Codigo");
		this.jLabelcodigoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelcodigoProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextFieldcodigoProductosServiciosDisponibles= new JTextFieldMe();

		jTextFieldcodigoProductosServiciosDisponibles.setEnabled(false);
		jTextFieldcodigoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtoncodigoProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtoncodigoProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombreProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombreProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProductosServiciosDisponibles.setToolTipText("Nombre");
		this.jLabelnombreProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombreProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextAreanombreProductosServiciosDisponibles= new JTextAreaMe();
		jTextAreanombreProductosServiciosDisponibles.setEnabled(false);
		jTextAreanombreProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosDisponibles.setLineWrap(true);
		jTextAreanombreProductosServiciosDisponibles.setWrapStyleWord(true);
		jTextAreanombreProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProductosServiciosDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProductosServiciosDisponibles = new JScrollPane(jTextAreanombreProductosServiciosDisponibles);
		jscrollPanenombreProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombreProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombreProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombreProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO+" : *");
		this.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles.setToolTipText("Nombre Tipo Producto Servicio");
		this.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles= new JTextAreaMe();
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setEnabled(false);
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setLineWrap(true);
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setWrapStyleWord(true);
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_producto_servicioProductosServiciosDisponibles = new JScrollPane(jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles);
		jscrollPanenombre_tipo_producto_servicioProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_producto_servicioProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_producto_servicioProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombre_bodegaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaProductosServiciosDisponibles.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombre_bodegaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextAreanombre_bodegaProductosServiciosDisponibles= new JTextAreaMe();
		jTextAreanombre_bodegaProductosServiciosDisponibles.setEnabled(false);
		jTextAreanombre_bodegaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosDisponibles.setLineWrap(true);
		jTextAreanombre_bodegaProductosServiciosDisponibles.setWrapStyleWord(true);
		jTextAreanombre_bodegaProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaProductosServiciosDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaProductosServiciosDisponibles = new JScrollPane(jTextAreanombre_bodegaProductosServiciosDisponibles);
		jscrollPanenombre_bodegaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_bodegaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_bodegaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProductosServiciosDisponibles = new JLabelMe();
		this.jLabelnombre_unidadProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProductosServiciosDisponibles.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelnombre_unidadProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextFieldnombre_unidadProductosServiciosDisponibles= new JTextFieldMe();

		jTextFieldnombre_unidadProductosServiciosDisponibles.setEnabled(false);
		jTextFieldnombre_unidadProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleProductosServiciosDisponibles = new JLabelMe();
		this.jLabelcantidad_disponibleProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleProductosServiciosDisponibles.setToolTipText("Cantad Disponible");
		this.jLabelcantidad_disponibleProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelcantidad_disponibleProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextFieldcantidad_disponibleProductosServiciosDisponibles= new JTextFieldMe();
		jTextFieldcantidad_disponibleProductosServiciosDisponibles.setEnabled(false);
		jTextFieldcantidad_disponibleProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleProductosServiciosDisponibles.setText("0");

		this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_maximoProductosServiciosDisponibles = new JLabelMe();
		this.jLabelcantidad_maximoProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO+" : *");
		this.jLabelcantidad_maximoProductosServiciosDisponibles.setToolTipText("Cantad Maximo");
		this.jLabelcantidad_maximoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_maximoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_maximoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_maximoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_maximoProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_maximoProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelcantidad_maximoProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextFieldcantidad_maximoProductosServiciosDisponibles= new JTextFieldMe();
		jTextFieldcantidad_maximoProductosServiciosDisponibles.setEnabled(false);
		jTextFieldcantidad_maximoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_maximoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_maximoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_maximoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_maximoProductosServiciosDisponibles.setText("0");

		this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_maximoProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_maximoProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_maximoProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_minimoProductosServiciosDisponibles = new JLabelMe();
		this.jLabelcantidad_minimoProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO+" : *");
		this.jLabelcantidad_minimoProductosServiciosDisponibles.setToolTipText("Cantad Minimo");
		this.jLabelcantidad_minimoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_minimoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_minimoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_minimoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_minimoProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_minimoProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelcantidad_minimoProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextFieldcantidad_minimoProductosServiciosDisponibles= new JTextFieldMe();
		jTextFieldcantidad_minimoProductosServiciosDisponibles.setEnabled(false);
		jTextFieldcantidad_minimoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_minimoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_minimoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_minimoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_minimoProductosServiciosDisponibles.setText("0");

		this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_minimoProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_minimoProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_minimoProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelprecio_compraProductosServiciosDisponibles = new JLabelMe();
		this.jLabelprecio_compraProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA+" : *");
		this.jLabelprecio_compraProductosServiciosDisponibles.setToolTipText("Precio Compra");
		this.jLabelprecio_compraProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_compraProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_compraProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_compraProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_compraProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_compraProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelprecio_compraProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextFieldprecio_compraProductosServiciosDisponibles= new JTextFieldMe();
		jTextFieldprecio_compraProductosServiciosDisponibles.setEnabled(false);
		jTextFieldprecio_compraProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_compraProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_compraProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_compraProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_compraProductosServiciosDisponibles.setText("0.0");

		this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_compraProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_compraProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_compraProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelprecio_ventaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelprecio_ventaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA+" : *");
		this.jLabelprecio_ventaProductosServiciosDisponibles.setToolTipText("Precio Venta");
		this.jLabelprecio_ventaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_ventaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_ventaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_ventaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_ventaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_ventaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelprecio_ventaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextFieldprecio_ventaProductosServiciosDisponibles= new JTextFieldMe();
		jTextFieldprecio_ventaProductosServiciosDisponibles.setEnabled(false);
		jTextFieldprecio_ventaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ventaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ventaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_ventaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_ventaProductosServiciosDisponibles.setText("0.0");

		this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_ventaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_ventaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_ventaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcosto_ultimoProductosServiciosDisponibles = new JLabelMe();
		this.jLabelcosto_ultimoProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO+" : *");
		this.jLabelcosto_ultimoProductosServiciosDisponibles.setToolTipText("Costo Ultimo");
		this.jLabelcosto_ultimoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ultimoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ultimoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_ultimoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_ultimoProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_ultimoProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelcosto_ultimoProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jTextFieldcosto_ultimoProductosServiciosDisponibles= new JTextFieldMe();
		jTextFieldcosto_ultimoProductosServiciosDisponibles.setEnabled(false);
		jTextFieldcosto_ultimoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_ultimoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_ultimoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_ultimoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_ultimoProductosServiciosDisponibles.setText("0.0");

		this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_ultimoProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_ultimoProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_ultimoProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductosServiciosDisponibles() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelid_empresaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductosServiciosDisponibles.setToolTipText("Empresa");
		this.jLabelid_empresaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelid_empresaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jComboBoxid_empresaProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_empresaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductosServiciosDisponibles.setEnabled(false);

		this.jButtonid_empresaProductosServiciosDisponibles= new JButtonMe();
		this.jButtonid_empresaProductosServiciosDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosDisponibles.setText("Buscar");
		this.jButtonid_empresaProductosServiciosDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductosServiciosDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosDisponibles"));

		this.jButtonid_empresaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonid_empresaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosServiciosDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosServiciosDisponiblesUpdate= new JButtonMe();
		this.jButtonid_empresaProductosServiciosDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosServiciosDisponiblesUpdate.setText("U");
		this.jButtonid_empresaProductosServiciosDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosServiciosDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosDisponiblesUpdate"));



					
		this.jLabelid_sucursalProductosServiciosDisponibles = new JLabelMe();
		this.jLabelid_sucursalProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductosServiciosDisponibles.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelid_sucursalProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jComboBoxid_sucursalProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_sucursalProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductosServiciosDisponibles.setEnabled(false);

		this.jButtonid_sucursalProductosServiciosDisponibles= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosDisponibles.setText("Buscar");
		this.jButtonid_sucursalProductosServiciosDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductosServiciosDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosDisponibles"));

		this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductosServiciosDisponiblesUpdate= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosServiciosDisponiblesUpdate.setText("U");
		this.jButtonid_sucursalProductosServiciosDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductosServiciosDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosDisponiblesUpdate"));



					
		this.jLabelid_bodegaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelid_bodegaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductosServiciosDisponibles.setToolTipText("Bodega");
		this.jLabelid_bodegaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelid_bodegaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jComboBoxid_bodegaProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_bodegaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductosServiciosDisponibles= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosDisponibles.setText("Buscar");
		this.jButtonid_bodegaProductosServiciosDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductosServiciosDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosDisponibles"));

		this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductosServiciosDisponiblesUpdate= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosServiciosDisponiblesUpdate.setText("U");
		this.jButtonid_bodegaProductosServiciosDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductosServiciosDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosDisponiblesUpdate"));



					
		this.jLabelid_lineaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelid_lineaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProductosServiciosDisponibles.setToolTipText("Linea");
		this.jLabelid_lineaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelid_lineaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jComboBoxid_lineaProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_lineaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProductosServiciosDisponibles= new JButtonMe();
		this.jButtonid_lineaProductosServiciosDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosDisponibles.setText("Buscar");
		this.jButtonid_lineaProductosServiciosDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProductosServiciosDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosDisponibles"));

		this.jButtonid_lineaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_lineaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonid_lineaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProductosServiciosDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_lineaProductosServiciosDisponiblesUpdate= new JButtonMe();
		this.jButtonid_lineaProductosServiciosDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosServiciosDisponiblesUpdate.setText("U");
		this.jButtonid_lineaProductosServiciosDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProductosServiciosDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosDisponiblesUpdate"));



					
		this.jLabelid_linea_grupoProductosServiciosDisponibles = new JLabelMe();
		this.jLabelid_linea_grupoProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProductosServiciosDisponibles.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelid_linea_grupoProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jComboBoxid_linea_grupoProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_linea_grupoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProductosServiciosDisponibles= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosDisponibles.setText("Buscar");
		this.jButtonid_linea_grupoProductosServiciosDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProductosServiciosDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosDisponibles"));

		this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.setText("U");
		this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosDisponiblesUpdate"));



					
		this.jLabelid_linea_categoriaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelid_linea_categoriaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProductosServiciosDisponibles.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelid_linea_categoriaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jComboBoxid_linea_categoriaProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProductosServiciosDisponibles= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosDisponibles.setText("Buscar");
		this.jButtonid_linea_categoriaProductosServiciosDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProductosServiciosDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosDisponibles"));

		this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.setText("U");
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosDisponiblesUpdate"));



					
		this.jLabelid_linea_marcaProductosServiciosDisponibles = new JLabelMe();
		this.jLabelid_linea_marcaProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProductosServiciosDisponibles.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelid_linea_marcaProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jComboBoxid_linea_marcaProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_linea_marcaProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProductosServiciosDisponibles= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosDisponibles.setText("Buscar");
		this.jButtonid_linea_marcaProductosServiciosDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProductosServiciosDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosDisponibles"));

		this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.setText("U");
		this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosDisponiblesUpdate"));



					
		this.jLabelid_tipo_producto_servicioProductosServiciosDisponibles = new JLabelMe();
		this.jLabelid_tipo_producto_servicioProductosServiciosDisponibles.setText(""+ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO+" : *");
		this.jLabelid_tipo_producto_servicioProductosServiciosDisponibles.setToolTipText("Tipo Producto Servicio");
		this.jLabelid_tipo_producto_servicioProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicioProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicioProductosServiciosDisponibles.setToolTipText(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		this.jPanelid_tipo_producto_servicioProductosServiciosDisponibles.setLayout(this.gridaBagLayoutProductosServiciosDisponibles);


		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicioProductosServiciosDisponibles= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponibles.setText("Buscar");
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosDisponibles"));

		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosDisponiblesBusqueda"));

		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.setText("U");
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosDisponiblesUpdate"));



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
		//this.jInternalFrameDetalleProductosServiciosDisponibles = new ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos Servicios Disponibles DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosServiciosDisponibles= new GridBagLayout();
		

		
		String sToolTipProductosServiciosDisponibles="";
		sToolTipProductosServiciosDisponibles=ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosServiciosDisponibles+="(Inventario.ProductosServiciosDisponibles)";
		}
		
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosServiciosDisponibles+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductosServiciosDisponibles = new JButtonMe();
		this.jButtonModificarProductosServiciosDisponibles = new JButtonMe();
        this.jButtonActualizarProductosServiciosDisponibles = new JButtonMe();
        this.jButtonEliminarProductosServiciosDisponibles = new JButtonMe();
        this.jButtonCancelarProductosServiciosDisponibles = new JButtonMe();
        this.jButtonGuardarCambiosProductosServiciosDisponibles = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles = new JButtonMe();
		this.jButtonCerrarProductosServiciosDisponibles = new JButtonMe();
		
		this.jScrollPanelDatosProductosServiciosDisponibles = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductosServiciosDisponibles = new JScrollPane();
		this.jScrollPanelDatosGeneralProductosServiciosDisponibles = new JScrollPane();
				
		
		
		this.jPanelCamposProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Servicios Disponibles";
		
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Disponibleses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductosServiciosDisponibles.setName("jPanelCamposProductosServiciosDisponibles"); 

		this.jPanelCamposOcultosProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductosServiciosDisponibles.setName("jPanelCamposOcultosProductosServiciosDisponibles"); 

        this.jPanelAccionesProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosServiciosDisponibles.setToolTipText("Acciones");
        this.jPanelAccionesProductosServiciosDisponibles.setName("Acciones"); 

		this.jPanelAccionesFormularioProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductosServiciosDisponibles.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductosServiciosDisponibles.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductosServiciosDisponibles.setText("Nuevo");
		this.jButtonModificarProductosServiciosDisponibles.setText("Editar");
        this.jButtonActualizarProductosServiciosDisponibles.setText("Actualizar");
        this.jButtonEliminarProductosServiciosDisponibles.setText("Eliminar");
        this.jButtonCancelarProductosServiciosDisponibles.setText("Cancelar");
        this.jButtonGuardarCambiosProductosServiciosDisponibles.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.setText("Guardar");
		this.jButtonCerrarProductosServiciosDisponibles.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosServiciosDisponibles,"nuevo_button","Nuevo",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductosServiciosDisponibles,"modificar_button","Editar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductosServiciosDisponibles,"actualizar_button","Actualizar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductosServiciosDisponibles,"eliminar_button","Eliminar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductosServiciosDisponibles,"cancelar_button","Cancelar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductosServiciosDisponibles,"guardarcambios_button","Guardar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosServiciosDisponibles,"guardarcambiostabla_button","Guardar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosServiciosDisponibles,"cerrar_button","Salir",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductosServiciosDisponibles.setToolTipText("Nuevo"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductosServiciosDisponibles.setToolTipText("Editar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductosServiciosDisponibles.setToolTipText("Actualizar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductosServiciosDisponibles.setToolTipText("Eliminar)"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductosServiciosDisponibles.setToolTipText("Cancelar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductosServiciosDisponibles.setToolTipText("Guardar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.setToolTipText("Guardar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosServiciosDisponibles.setToolTipText("Salir"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosServiciosDisponibles";
		inputMap = this.jButtonNuevoProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosServiciosDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosServiciosDisponibles"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductosServiciosDisponibles";
		inputMap = this.jButtonActualizarProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductosServiciosDisponibles"));
		
		//ELIMINAR
		sMapKey = "EliminarProductosServiciosDisponibles";
		inputMap = this.jButtonEliminarProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductosServiciosDisponibles"));
		
		//CANCELAR	
		sMapKey = "CancelarProductosServiciosDisponibles";
		inputMap = this.jButtonCancelarProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductosServiciosDisponibles"));
		
		//CERRAR		
		sMapKey = "CerrarProductosServiciosDisponibles";
		inputMap = this.jButtonCerrarProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosServiciosDisponibles"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosServiciosDisponibles";
		inputMap = this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosServiciosDisponibles"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductosServiciosDisponibles = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductosServiciosDisponibles.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductosServiciosDisponibles.setToolTipText("Nuevo ProductosServiciosDisponibles");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductosServiciosDisponibles = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductosServiciosDisponibles.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductosServiciosDisponibles.setToolTipText("Sin Cerrar Ventana ProductosServiciosDisponibles");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductosServiciosDisponibles = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductosServiciosDisponibles.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductosServiciosDisponibles.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosServiciosDisponibles.setText("Accion");
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductosServiciosDisponibles = new JLabelMe();
		
		this.jLabelAccionesProductosServiciosDisponibles.setText("Acciones");		
		this.jLabelAccionesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductosServiciosDisponibles();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductosServiciosDisponibles();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductosServiciosDisponibles=new JTabbedPane();
		this.jTabbedPaneRelacionesProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductosServiciosDisponibles = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductosServiciosDisponibles = new GridBagLayout();
		
		this.jPanelCamposProductosServiciosDisponibles.setLayout(gridaBagLayoutCamposProductosServiciosDisponibles);
		this.jPanelCamposOcultosProductosServiciosDisponibles.setLayout(gridaBagLayoutCamposOcultosProductosServiciosDisponibles);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductosServiciosDisponibles.add(jLabelIdProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductosServiciosDisponibles.add(jLabelidProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductosServiciosDisponibles.add(jLabelid_empresaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosServiciosDisponibles.add(jButtonid_empresaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 3;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosServiciosDisponibles.add(jButtonid_empresaProductosServiciosDisponiblesUpdate, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductosServiciosDisponibles.add(jComboBoxid_empresaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductosServiciosDisponibles.add(jLabelid_sucursalProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosServiciosDisponibles.add(jButtonid_sucursalProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 3;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosServiciosDisponibles.add(jButtonid_sucursalProductosServiciosDisponiblesUpdate, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductosServiciosDisponibles.add(jComboBoxid_sucursalProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductosServiciosDisponibles.add(jLabelid_bodegaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosServiciosDisponibles.add(jButtonid_bodegaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 3;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosServiciosDisponibles.add(jButtonid_bodegaProductosServiciosDisponiblesUpdate, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductosServiciosDisponibles.add(jComboBoxid_bodegaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProductosServiciosDisponibles.add(jLabelid_lineaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosServiciosDisponibles.add(jButtonid_lineaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 3;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosServiciosDisponibles.add(jButtonid_lineaProductosServiciosDisponiblesUpdate, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProductosServiciosDisponibles.add(jComboBoxid_lineaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProductosServiciosDisponibles.add(jLabelid_linea_grupoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosServiciosDisponibles.add(jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 3;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosServiciosDisponibles.add(jButtonid_linea_grupoProductosServiciosDisponiblesUpdate, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProductosServiciosDisponibles.add(jComboBoxid_linea_grupoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProductosServiciosDisponibles.add(jLabelid_linea_categoriaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosServiciosDisponibles.add(jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 3;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosServiciosDisponibles.add(jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProductosServiciosDisponibles.add(jComboBoxid_linea_categoriaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProductosServiciosDisponibles.add(jLabelid_linea_marcaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosServiciosDisponibles.add(jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 3;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosServiciosDisponibles.add(jButtonid_linea_marcaProductosServiciosDisponiblesUpdate, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProductosServiciosDisponibles.add(jComboBoxid_linea_marcaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicioProductosServiciosDisponibles.add(jLabelid_tipo_producto_servicioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioProductosServiciosDisponibles.add(jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 3;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioProductosServiciosDisponibles.add(jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicioProductosServiciosDisponibles.add(jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalProductosServiciosDisponibles.add(jLabelnombre_sucursalProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalProductosServiciosDisponibles.add(jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalProductosServiciosDisponibles.add(jscrollPanenombre_sucursalProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaProductosServiciosDisponibles.add(jLabelnombre_lineaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaProductosServiciosDisponibles.add(jButtonnombre_lineaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaProductosServiciosDisponibles.add(jscrollPanenombre_lineaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoProductosServiciosDisponibles.add(jLabelnombre_linea_grupoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoProductosServiciosDisponibles.add(jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoProductosServiciosDisponibles.add(jscrollPanenombre_linea_grupoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaProductosServiciosDisponibles.add(jLabelnombre_linea_categoriaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaProductosServiciosDisponibles.add(jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaProductosServiciosDisponibles.add(jscrollPanenombre_linea_categoriaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaProductosServiciosDisponibles.add(jLabelnombre_linea_marcaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaProductosServiciosDisponibles.add(jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaProductosServiciosDisponibles.add(jscrollPanenombre_linea_marcaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProductosServiciosDisponibles.add(jLabelcodigoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProductosServiciosDisponibles.add(jButtoncodigoProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProductosServiciosDisponibles.add(jTextFieldcodigoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProductosServiciosDisponibles.add(jLabelnombreProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProductosServiciosDisponibles.add(jButtonnombreProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProductosServiciosDisponibles.add(jscrollPanenombreProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles.add(jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles.add(jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles.add(jscrollPanenombre_tipo_producto_servicioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaProductosServiciosDisponibles.add(jLabelnombre_bodegaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaProductosServiciosDisponibles.add(jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaProductosServiciosDisponibles.add(jscrollPanenombre_bodegaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProductosServiciosDisponibles.add(jLabelnombre_unidadProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProductosServiciosDisponibles.add(jButtonnombre_unidadProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProductosServiciosDisponibles.add(jTextFieldnombre_unidadProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleProductosServiciosDisponibles.add(jLabelcantidad_disponibleProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleProductosServiciosDisponibles.add(jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleProductosServiciosDisponibles.add(jTextFieldcantidad_disponibleProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_maximoProductosServiciosDisponibles.add(jLabelcantidad_maximoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_maximoProductosServiciosDisponibles.add(jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_maximoProductosServiciosDisponibles.add(jTextFieldcantidad_maximoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_minimoProductosServiciosDisponibles.add(jLabelcantidad_minimoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_minimoProductosServiciosDisponibles.add(jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_minimoProductosServiciosDisponibles.add(jTextFieldcantidad_minimoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_compraProductosServiciosDisponibles.add(jLabelprecio_compraProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_compraProductosServiciosDisponibles.add(jButtonprecio_compraProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_compraProductosServiciosDisponibles.add(jTextFieldprecio_compraProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_ventaProductosServiciosDisponibles.add(jLabelprecio_ventaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_ventaProductosServiciosDisponibles.add(jButtonprecio_ventaProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_ventaProductosServiciosDisponibles.add(jTextFieldprecio_ventaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_ultimoProductosServiciosDisponibles.add(jLabelcosto_ultimoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 2;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_ultimoProductosServiciosDisponibles.add(jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda, this.gridBagConstraintsProductosServiciosDisponibles);
	}

	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_ultimoProductosServiciosDisponibles.add(jTextFieldcosto_ultimoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelidProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelid_bodegaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelid_lineaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelid_linea_grupoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelid_linea_categoriaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelid_linea_marcaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelid_tipo_producto_servicioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombre_sucursalProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombre_lineaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombre_linea_grupoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombre_linea_categoriaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombre_linea_marcaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelcodigoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombreProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombre_bodegaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelnombre_unidadProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelcantidad_disponibleProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelcantidad_maximoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelcantidad_minimoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelprecio_compraProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelprecio_ventaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosDisponibles.add(this.jPanelcosto_ultimoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposProductosServiciosDisponibles % 3==0) {
		iXPanelCamposProductosServiciosDisponibles=0;
		iYPanelCamposProductosServiciosDisponibles++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposOcultosProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposOcultosProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosServiciosDisponibles.add(this.jPanelid_empresaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposOcultosProductosServiciosDisponibles % 3==0) {
		iXPanelCamposOcultosProductosServiciosDisponibles=0;
		iYPanelCamposOcultosProductosServiciosDisponibles++;
	}
	this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosDisponibles.gridy = iYPanelCamposOcultosProductosServiciosDisponibles;
	this.gridBagConstraintsProductosServiciosDisponibles.gridx = iXPanelCamposOcultosProductosServiciosDisponibles++;
	this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosServiciosDisponibles.add(this.jPanelid_sucursalProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);



	if(iXPanelCamposOcultosProductosServiciosDisponibles % 3==0) {
		iXPanelCamposOcultosProductosServiciosDisponibles=0;
		iYPanelCamposOcultosProductosServiciosDisponibles++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductosServiciosDisponibles= new GridBagLayout();
		this.jPanelAccionesProductosServiciosDisponibles.setLayout(gridaBagLayoutAccionesProductosServiciosDisponibles);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductosServiciosDisponibles= new GridBagLayout();
		this.jPanelAccionesFormularioProductosServiciosDisponibles.setLayout(gridaBagLayoutAccionesFormularioProductosServiciosDisponibles);
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductosServiciosDisponibles.add(this.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductosServiciosDisponibles.add(this.jButtonModificarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);							

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductosServiciosDisponibles.add(this.jButtonEliminarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
			
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosDisponibles.add(this.jButtonActualizarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosDisponibles.add(this.jButtonGuardarCambiosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);	
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosDisponibles.add(this.jButtonCancelarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosServiciosDisponibles);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();						
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;		
			//this.gridBagConstraintsProductosServiciosDisponibles.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx =0;
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosServiciosDisponibles.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductosServiciosDisponibles = new ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos Servicios Disponibles DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos Servicios Disponibles DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Servicios Disponibles Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosServiciosDisponiblesModel productosserviciosdisponiblesModel=new ProductosServiciosDisponiblesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosServiciosDisponiblesModel.ProductosServiciosDisponiblesFocusTraversalPolicy productosserviciosdisponiblesFocusTraversalPolicy = productosserviciosdisponiblesModel.new ProductosServiciosDisponiblesFocusTraversalPolicy(this);
			
			//productosserviciosdisponiblesFocusTraversalPolicy.setproductosserviciosdisponiblesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productosserviciosdisponiblesModel);
			
			
			this.jContentPaneDetalleProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductosServiciosDisponibles = new GridBagLayout();	
			this.jContentPaneDetalleProductosServiciosDisponibles.setLayout(gridaBagLayoutDetalleProductosServiciosDisponibles);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosServiciosDisponibles = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
					
				
				this.jContentPaneDetalleProductosServiciosDisponibles.add(jTtoolBarDetalleProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);								
				
}
			
			this.jScrollPanelDatosEdicionProductosServiciosDisponibles=   new JScrollPane(jContentPaneDetalleProductosServiciosDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductosServiciosDisponibles=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	        
			this.jContentPaneDetalleProductosServiciosDisponibles.add(jPanelCamposProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);
			
			
			
			
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
						//&& productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductosServiciosDisponibles= new GridBagConstraints();
						this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
						this.jContentPaneDetalleProductosServiciosDisponibles.add(this.jTabbedPaneRelacionesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductosServiciosDisponibles.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductosServiciosDisponibles.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
					this.gridBagConstraintsProductosServiciosDisponibles.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
					
				
					this.jContentPaneDetalleProductosServiciosDisponibles.add(jPanelCamposOcultosProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);
				
					this.jPanelCamposOcultosProductosServiciosDisponibles.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	        this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductosServiciosDisponibles.add(this.jPanelAccionesFormularioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);							
			
			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
	        this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
	        
			
			this.jContentPaneDetalleProductosServiciosDisponibles.add(this.jPanelAccionesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductosServiciosDisponibles);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductosServiciosDisponibles=   new JScrollPane(this.jPanelCamposProductosServiciosDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductosServiciosDisponibles.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			
			
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
			
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductosServiciosDisponibles;//jContentPane;
		
		return jScrollPanelDatosEdicionProductosServiciosDisponibles;
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
