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
import com.bydan.erp.inventario.util.report.ProductosServiciosProductosConstantesFunciones;

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
public class ProductosServiciosProductosDetalleFormJInternalFrame extends ProductosServiciosProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductosServiciosProductos;
	
	protected JMenuBar jmenuBarDetalleProductosServiciosProductos;
	
	protected JMenu jmenuDetalleProductosServiciosProductos;
	protected JMenu jmenuDetalleArchivoProductosServiciosProductos;
	protected JMenu jmenuDetalleAccionesProductosServiciosProductos;
	protected JMenu jmenuDetalleDatosProductosServiciosProductos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosServiciosProductos;	
	protected GridBagConstraints gridBagConstraintsProductosServiciosProductos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosServiciosProductosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductosServiciosProductos;		
	
	
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
	
	public ProductosServiciosProductosSessionBean productosserviciosproductosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;	
	
	public ProductosServiciosProductosLogic productosserviciosproductosLogic;
	
	public JScrollPane jScrollPanelDatosProductosServiciosProductos;
	public JScrollPane jScrollPanelDatosEdicionProductosServiciosProductos;
	public JScrollPane jScrollPanelDatosGeneralProductosServiciosProductos;
	
	protected JPanel jPanelCamposProductosServiciosProductos;    
	protected JPanel jPanelCamposOcultosProductosServiciosProductos;    	
	protected JPanel jPanelAccionesProductosServiciosProductos;
	protected JPanel jPanelAccionesFormularioProductosServiciosProductos;
    
	
	
	protected Integer iXPanelCamposProductosServiciosProductos=0;
	protected Integer iYPanelCamposProductosServiciosProductos=0;
	
	protected Integer iXPanelCamposOcultosProductosServiciosProductos=0;
	protected Integer iYPanelCamposOcultosProductosServiciosProductos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductosServiciosProductos;
	public JButton jButtonModificarProductosServiciosProductos;
	public JButton jButtonActualizarProductosServiciosProductos;
    public JButton jButtonEliminarProductosServiciosProductos;
	public JButton jButtonCancelarProductosServiciosProductos;
    public JButton jButtonGuardarCambiosProductosServiciosProductos;
	public JButton jButtonGuardarCambiosTablaProductosServiciosProductos;
	protected JButton jButtonCerrarProductosServiciosProductos;
	
	
	protected JButton jButtonProcesarInformacionProductosServiciosProductos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductosServiciosProductos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductosServiciosProductos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductosServiciosProductos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosServiciosProductos;
	protected JButton jButtonModificarToolBarProductosServiciosProductos;
	protected JButton jButtonActualizarToolBarProductosServiciosProductos;
    protected JButton jButtonEliminarToolBarProductosServiciosProductos;
	protected JButton jButtonCancelarToolBarProductosServiciosProductos;
    protected JButton jButtonGuardarCambiosToolBarProductosServiciosProductos;
	protected JButton jButtonGuardarCambiosTablaToolBarProductosServiciosProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosServiciosProductos;
	protected JButton jButtonCerrarToolBarProductosServiciosProductos;
	
	protected JButton jButtonProcesarInformacionToolBarProductosServiciosProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosServiciosProductos;
	protected JMenuItem jMenuItemModificarProductosServiciosProductos;
	protected JMenuItem jMenuItemActualizarProductosServiciosProductos;
    protected JMenuItem jMenuItemEliminarProductosServiciosProductos;
	protected JMenuItem jMenuItemCancelarProductosServiciosProductos;
    protected JMenuItem jMenuItemGuardarCambiosProductosServiciosProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosServiciosProductos;
	protected JMenuItem jMenuItemCerrarProductosServiciosProductos;
	protected JMenuItem jMenuItemDetalleCerrarProductosServiciosProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosServiciosProductos;
	
	protected JMenuItem jMenuItemProcesarInformacionProductosServiciosProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosServiciosProductos;
	protected JMenuItem jMenuItemMostrarOcultarProductosServiciosProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosServiciosProductos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosServiciosProductos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductosServiciosProductos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductosServiciosProductos;
	public JLabel jLabelIdProductosServiciosProductos;
	public JLabel jLabelidProductosServiciosProductos;
	public JButton jButtonidProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalProductosServiciosProductos;
	public JLabel jLabelnombre_sucursalProductosServiciosProductos;
	public JTextArea jTextAreanombre_sucursalProductosServiciosProductos;
	public JScrollPane jscrollPanenombre_sucursalProductosServiciosProductos;
	public JButton jButtonnombre_sucursalProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaProductosServiciosProductos;
	public JLabel jLabelnombre_lineaProductosServiciosProductos;
	public JTextArea jTextAreanombre_lineaProductosServiciosProductos;
	public JScrollPane jscrollPanenombre_lineaProductosServiciosProductos;
	public JButton jButtonnombre_lineaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoProductosServiciosProductos;
	public JLabel jLabelnombre_linea_grupoProductosServiciosProductos;
	public JTextArea jTextAreanombre_linea_grupoProductosServiciosProductos;
	public JScrollPane jscrollPanenombre_linea_grupoProductosServiciosProductos;
	public JButton jButtonnombre_linea_grupoProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaProductosServiciosProductos;
	public JLabel jLabelnombre_linea_categoriaProductosServiciosProductos;
	public JTextArea jTextAreanombre_linea_categoriaProductosServiciosProductos;
	public JScrollPane jscrollPanenombre_linea_categoriaProductosServiciosProductos;
	public JButton jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaProductosServiciosProductos;
	public JLabel jLabelnombre_linea_marcaProductosServiciosProductos;
	public JTextArea jTextAreanombre_linea_marcaProductosServiciosProductos;
	public JScrollPane jscrollPanenombre_linea_marcaProductosServiciosProductos;
	public JButton jButtonnombre_linea_marcaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProductosServiciosProductos;
	public JLabel jLabelcodigoProductosServiciosProductos;
	public JTextField jTextFieldcodigoProductosServiciosProductos;
	public JButton jButtoncodigoProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombreProductosServiciosProductos;
	public JLabel jLabelnombreProductosServiciosProductos;
	public JTextArea jTextAreanombreProductosServiciosProductos;
	public JScrollPane jscrollPanenombreProductosServiciosProductos;
	public JButton jButtonnombreProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_producto_servicioProductosServiciosProductos;
	public JLabel jLabelnombre_tipo_producto_servicioProductosServiciosProductos;
	public JTextArea jTextAreanombre_tipo_producto_servicioProductosServiciosProductos;
	public JScrollPane jscrollPanenombre_tipo_producto_servicioProductosServiciosProductos;
	public JButton jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaProductosServiciosProductos;
	public JLabel jLabelnombre_bodegaProductosServiciosProductos;
	public JTextArea jTextAreanombre_bodegaProductosServiciosProductos;
	public JScrollPane jscrollPanenombre_bodegaProductosServiciosProductos;
	public JButton jButtonnombre_bodegaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProductosServiciosProductos;
	public JLabel jLabelnombre_unidadProductosServiciosProductos;
	public JTextField jTextFieldnombre_unidadProductosServiciosProductos;
	public JButton jButtonnombre_unidadProductosServiciosProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductosServiciosProductos;
	public JLabel jLabelid_empresaProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductosServiciosProductos;
	public JButton jButtonid_empresaProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_empresaProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductosServiciosProductos;
	public JLabel jLabelid_sucursalProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductosServiciosProductos;
	public JButton jButtonid_sucursalProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_sucursalProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductosServiciosProductos;
	public JLabel jLabelid_bodegaProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductosServiciosProductos;
	public JButton jButtonid_bodegaProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_bodegaProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProductosServiciosProductos;
	public JLabel jLabelid_lineaProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProductosServiciosProductos;
	public JButton jButtonid_lineaProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_lineaProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProductosServiciosProductos;
	public JLabel jLabelid_linea_grupoProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProductosServiciosProductos;
	public JButton jButtonid_linea_grupoProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProductosServiciosProductos;
	public JLabel jLabelid_linea_categoriaProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProductosServiciosProductos;
	public JButton jButtonid_linea_categoriaProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProductosServiciosProductos;
	public JLabel jLabelid_linea_marcaProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProductosServiciosProductos;
	public JButton jButtonid_linea_marcaProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosServiciosProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicioProductosServiciosProductos;
	public JLabel jLabelid_tipo_producto_servicioProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioProductosServiciosProductos;
	public JButton jButtonid_tipo_producto_servicioProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductosServiciosProductos;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductosServiciosProductosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductosServiciosProductos=new JPanel();
				this.jPanelAccionesFormularioProductosServiciosProductos=new JPanel();
				this.jmenuBarDetalleProductosServiciosProductos=new JMenuBar();
				this.jTtoolBarDetalleProductosServiciosProductos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosProductosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosServiciosProductosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosProductosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosProductosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosProductosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductosServiciosProductos() {
		return this.jButtonActualizarToolBarProductosServiciosProductos;
	}
	
	public JButton getjButtonEliminarToolBarProductosServiciosProductos() {
		return this.jButtonEliminarToolBarProductosServiciosProductos;
	}
	
	public JButton getjButtonCancelarToolBarProductosServiciosProductos() {
		return this.jButtonCancelarToolBarProductosServiciosProductos;
	}		
	
	public JButton getjButtonProcesarInformacionProductosServiciosProductos() {
		return this.jButtonProcesarInformacionProductosServiciosProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosServiciosProductos)	{
		this.jButtonProcesarInformacionProductosServiciosProductos = jButtonProcesarInformacionProductosServiciosProductos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosServiciosProductos() {
		return this.jComboBoxTiposAccionesProductosServiciosProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosServiciosProductos(
			JComboBox jComboBoxTiposRelacionesProductosServiciosProductos) {
		this.jComboBoxTiposRelacionesProductosServiciosProductos = jComboBoxTiposRelacionesProductosServiciosProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosServiciosProductos(
			JComboBox jComboBoxTiposAccionesProductosServiciosProductos) {
		this.jComboBoxTiposAccionesProductosServiciosProductos = jComboBoxTiposAccionesProductosServiciosProductos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductosServiciosProductos() {
		return this.jComboBoxTiposAccionesFormularioProductosServiciosProductos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductosServiciosProductos(
			JComboBox jComboBoxTiposAccionesFormularioProductosServiciosProductos) {
		this.jComboBoxTiposAccionesFormularioProductosServiciosProductos = jComboBoxTiposAccionesFormularioProductosServiciosProductos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
		
		this.productosserviciosproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciosproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosserviciosproductosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosServiciosProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosServiciosProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosServiciosProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Servicios Productos MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosServiciosProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductosServiciosProductos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductosServiciosProductos=new JButtonMe();
				this.jButtonModificarToolBarProductosServiciosProductos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductosServiciosProductos,this.jTtoolBarDetalleProductosServiciosProductos,
							"actualizar","actualizar","Actualizar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductosServiciosProductos,this.jTtoolBarDetalleProductosServiciosProductos,
							"eliminar","eliminar","Eliminar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductosServiciosProductos,this.jTtoolBarDetalleProductosServiciosProductos,
							"cancelar","cancelar","Cancelar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductosServiciosProductos,this.jTtoolBarDetalleProductosServiciosProductos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductosServiciosProductos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductosServiciosProductos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductosServiciosProductos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductosServiciosProductos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductosServiciosProductos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosServiciosProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosServiciosProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosServiciosProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductosServiciosProductos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductosServiciosProductos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductosServiciosProductos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductosServiciosProductos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductosServiciosProductos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductosServiciosProductos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductosServiciosProductos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductosServiciosProductos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductosServiciosProductos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductosServiciosProductos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductosServiciosProductos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductosServiciosProductos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductosServiciosProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosServiciosProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosServiciosProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosServiciosProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosServiciosProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosServiciosProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductosServiciosProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductosServiciosProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductosServiciosProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosServiciosProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosServiciosProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosServiciosProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosServiciosProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosServiciosProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosServiciosProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductosServiciosProductos.add(this.jMenuItemDetalleCerrarProductosServiciosProductos);
		
		this.jmenuDetalleAccionesProductosServiciosProductos.add(this.jMenuItemActualizarProductosServiciosProductos);
		this.jmenuDetalleAccionesProductosServiciosProductos.add(this.jMenuItemEliminarProductosServiciosProductos);
		this.jmenuDetalleAccionesProductosServiciosProductos.add(this.jMenuItemCancelarProductosServiciosProductos);		
		
		//this.jmenuDetalleDatosProductosServiciosProductos.add(this.jMenuItemDetalleAbrirOrderByProductosServiciosProductos);				
		this.jmenuDetalleDatosProductosServiciosProductos.add(this.jMenuItemDetalleMostarOcultarProductosServiciosProductos);				
				
		//this.jmenuDetalleAccionesProductosServiciosProductos.add(this.jMenuItemGuardarCambiosProductosServiciosProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductosServiciosProductos.add(this.jmenuDetalleArchivoProductosServiciosProductos);		
		this.jmenuBarDetalleProductosServiciosProductos.add(this.jmenuDetalleAccionesProductosServiciosProductos);		
		this.jmenuBarDetalleProductosServiciosProductos.add(this.jmenuDetalleDatosProductosServiciosProductos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductosServiciosProductos);				
	}
	
	
	public void inicializarElementosCamposProductosServiciosProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductosServiciosProductos = new JLabelMe();
		jLabelIdProductosServiciosProductos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductosServiciosProductos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductosServiciosProductos= new GridBagLayout();

		this.jPanelidProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);

		jLabelidProductosServiciosProductos = new JLabel();
		jLabelidProductosServiciosProductos.setText("Id");

		jLabelidProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_sucursalProductosServiciosProductos = new JLabelMe();
		this.jLabelnombre_sucursalProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalProductosServiciosProductos.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombre_sucursalProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextAreanombre_sucursalProductosServiciosProductos= new JTextAreaMe();
		jTextAreanombre_sucursalProductosServiciosProductos.setEnabled(false);
		jTextAreanombre_sucursalProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosProductos.setLineWrap(true);
		jTextAreanombre_sucursalProductosServiciosProductos.setWrapStyleWord(true);
		jTextAreanombre_sucursalProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalProductosServiciosProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalProductosServiciosProductos = new JScrollPane(jTextAreanombre_sucursalProductosServiciosProductos);
		jscrollPanenombre_sucursalProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombre_sucursalProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaProductosServiciosProductos = new JLabelMe();
		this.jLabelnombre_lineaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaProductosServiciosProductos.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombre_lineaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextAreanombre_lineaProductosServiciosProductos= new JTextAreaMe();
		jTextAreanombre_lineaProductosServiciosProductos.setEnabled(false);
		jTextAreanombre_lineaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosServiciosProductos.setLineWrap(true);
		jTextAreanombre_lineaProductosServiciosProductos.setWrapStyleWord(true);
		jTextAreanombre_lineaProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaProductosServiciosProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaProductosServiciosProductos = new JScrollPane(jTextAreanombre_lineaProductosServiciosProductos);
		jscrollPanenombre_lineaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_lineaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombre_lineaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombre_lineaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoProductosServiciosProductos = new JLabelMe();
		this.jLabelnombre_linea_grupoProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoProductosServiciosProductos.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombre_linea_grupoProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextAreanombre_linea_grupoProductosServiciosProductos= new JTextAreaMe();
		jTextAreanombre_linea_grupoProductosServiciosProductos.setEnabled(false);
		jTextAreanombre_linea_grupoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosServiciosProductos.setLineWrap(true);
		jTextAreanombre_linea_grupoProductosServiciosProductos.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoProductosServiciosProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoProductosServiciosProductos = new JScrollPane(jTextAreanombre_linea_grupoProductosServiciosProductos);
		jscrollPanenombre_linea_grupoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaProductosServiciosProductos = new JLabelMe();
		this.jLabelnombre_linea_categoriaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaProductosServiciosProductos.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombre_linea_categoriaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextAreanombre_linea_categoriaProductosServiciosProductos= new JTextAreaMe();
		jTextAreanombre_linea_categoriaProductosServiciosProductos.setEnabled(false);
		jTextAreanombre_linea_categoriaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosServiciosProductos.setLineWrap(true);
		jTextAreanombre_linea_categoriaProductosServiciosProductos.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaProductosServiciosProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaProductosServiciosProductos = new JScrollPane(jTextAreanombre_linea_categoriaProductosServiciosProductos);
		jscrollPanenombre_linea_categoriaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaProductosServiciosProductos = new JLabelMe();
		this.jLabelnombre_linea_marcaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaProductosServiciosProductos.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombre_linea_marcaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextAreanombre_linea_marcaProductosServiciosProductos= new JTextAreaMe();
		jTextAreanombre_linea_marcaProductosServiciosProductos.setEnabled(false);
		jTextAreanombre_linea_marcaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosServiciosProductos.setLineWrap(true);
		jTextAreanombre_linea_marcaProductosServiciosProductos.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaProductosServiciosProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaProductosServiciosProductos = new JScrollPane(jTextAreanombre_linea_marcaProductosServiciosProductos);
		jscrollPanenombre_linea_marcaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoProductosServiciosProductos = new JLabelMe();
		this.jLabelcodigoProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProductosServiciosProductos.setToolTipText("Codigo");
		this.jLabelcodigoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelcodigoProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextFieldcodigoProductosServiciosProductos= new JTextFieldMe();

		jTextFieldcodigoProductosServiciosProductos.setEnabled(false);
		jTextFieldcodigoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtoncodigoProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProductosServiciosProductosBusqueda.setText("U");
		this.jButtoncodigoProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombreProductosServiciosProductos = new JLabelMe();
		this.jLabelnombreProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProductosServiciosProductos.setToolTipText("Nombre");
		this.jLabelnombreProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombreProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextAreanombreProductosServiciosProductos= new JTextAreaMe();
		jTextAreanombreProductosServiciosProductos.setEnabled(false);
		jTextAreanombreProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosProductos.setLineWrap(true);
		jTextAreanombreProductosServiciosProductos.setWrapStyleWord(true);
		jTextAreanombreProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProductosServiciosProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProductosServiciosProductos = new JScrollPane(jTextAreanombreProductosServiciosProductos);
		jscrollPanenombreProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombreProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombreProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_producto_servicioProductosServiciosProductos = new JLabelMe();
		this.jLabelnombre_tipo_producto_servicioProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO+" : *");
		this.jLabelnombre_tipo_producto_servicioProductosServiciosProductos.setToolTipText("Nombre Tipo Producto Servicio");
		this.jLabelnombre_tipo_producto_servicioProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_producto_servicioProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_producto_servicioProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_producto_servicioProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_producto_servicioProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_producto_servicioProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombre_tipo_producto_servicioProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos= new JTextAreaMe();
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setEnabled(false);
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setLineWrap(true);
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setWrapStyleWord(true);
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_producto_servicioProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_producto_servicioProductosServiciosProductos = new JScrollPane(jTextAreanombre_tipo_producto_servicioProductosServiciosProductos);
		jscrollPanenombre_tipo_producto_servicioProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_producto_servicioProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_producto_servicioProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_producto_servicioProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaProductosServiciosProductos = new JLabelMe();
		this.jLabelnombre_bodegaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaProductosServiciosProductos.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombre_bodegaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextAreanombre_bodegaProductosServiciosProductos= new JTextAreaMe();
		jTextAreanombre_bodegaProductosServiciosProductos.setEnabled(false);
		jTextAreanombre_bodegaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosProductos.setLineWrap(true);
		jTextAreanombre_bodegaProductosServiciosProductos.setWrapStyleWord(true);
		jTextAreanombre_bodegaProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaProductosServiciosProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaProductosServiciosProductos = new JScrollPane(jTextAreanombre_bodegaProductosServiciosProductos);
		jscrollPanenombre_bodegaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombre_bodegaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaProductosServiciosProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProductosServiciosProductos = new JLabelMe();
		this.jLabelnombre_unidadProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProductosServiciosProductos.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelnombre_unidadProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jTextFieldnombre_unidadProductosServiciosProductos= new JTextFieldMe();

		jTextFieldnombre_unidadProductosServiciosProductos.setEnabled(false);
		jTextFieldnombre_unidadProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProductosServiciosProductosBusqueda.setText("U");
		this.jButtonnombre_unidadProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProductosServiciosProductosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductosServiciosProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductosServiciosProductos = new JLabelMe();
		this.jLabelid_empresaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductosServiciosProductos.setToolTipText("Empresa");
		this.jLabelid_empresaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelid_empresaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jComboBoxid_empresaProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_empresaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductosServiciosProductos.setEnabled(false);

		this.jButtonid_empresaProductosServiciosProductos= new JButtonMe();
		this.jButtonid_empresaProductosServiciosProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosProductos.setText("Buscar");
		this.jButtonid_empresaProductosServiciosProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductosServiciosProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosProductos"));

		this.jButtonid_empresaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonid_empresaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosServiciosProductosBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosServiciosProductosUpdate= new JButtonMe();
		this.jButtonid_empresaProductosServiciosProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosServiciosProductosUpdate.setText("U");
		this.jButtonid_empresaProductosServiciosProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosServiciosProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosProductosUpdate"));



					
		this.jLabelid_sucursalProductosServiciosProductos = new JLabelMe();
		this.jLabelid_sucursalProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductosServiciosProductos.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelid_sucursalProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jComboBoxid_sucursalProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_sucursalProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductosServiciosProductos.setEnabled(false);

		this.jButtonid_sucursalProductosServiciosProductos= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosProductos.setText("Buscar");
		this.jButtonid_sucursalProductosServiciosProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductosServiciosProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosProductos"));

		this.jButtonid_sucursalProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosServiciosProductosBusqueda.setText("U");
		this.jButtonid_sucursalProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductosServiciosProductosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductosServiciosProductosUpdate= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosServiciosProductosUpdate.setText("U");
		this.jButtonid_sucursalProductosServiciosProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductosServiciosProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosProductosUpdate"));



					
		this.jLabelid_bodegaProductosServiciosProductos = new JLabelMe();
		this.jLabelid_bodegaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductosServiciosProductos.setToolTipText("Bodega");
		this.jLabelid_bodegaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelid_bodegaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jComboBoxid_bodegaProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_bodegaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductosServiciosProductos= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosProductos.setText("Buscar");
		this.jButtonid_bodegaProductosServiciosProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductosServiciosProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosProductos"));

		this.jButtonid_bodegaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonid_bodegaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductosServiciosProductosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductosServiciosProductosUpdate= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosServiciosProductosUpdate.setText("U");
		this.jButtonid_bodegaProductosServiciosProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductosServiciosProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosProductosUpdate"));



					
		this.jLabelid_lineaProductosServiciosProductos = new JLabelMe();
		this.jLabelid_lineaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProductosServiciosProductos.setToolTipText("Linea");
		this.jLabelid_lineaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelid_lineaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jComboBoxid_lineaProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_lineaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProductosServiciosProductos= new JButtonMe();
		this.jButtonid_lineaProductosServiciosProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosProductos.setText("Buscar");
		this.jButtonid_lineaProductosServiciosProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProductosServiciosProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosProductos"));

		this.jButtonid_lineaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonid_lineaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonid_lineaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProductosServiciosProductosBusqueda.setVisible(false);		}

		this.jButtonid_lineaProductosServiciosProductosUpdate= new JButtonMe();
		this.jButtonid_lineaProductosServiciosProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosServiciosProductosUpdate.setText("U");
		this.jButtonid_lineaProductosServiciosProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProductosServiciosProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosProductosUpdate"));



					
		this.jLabelid_linea_grupoProductosServiciosProductos = new JLabelMe();
		this.jLabelid_linea_grupoProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProductosServiciosProductos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelid_linea_grupoProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jComboBoxid_linea_grupoProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProductosServiciosProductos= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosProductos.setText("Buscar");
		this.jButtonid_linea_grupoProductosServiciosProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProductosServiciosProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosProductos"));

		this.jButtonid_linea_grupoProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosServiciosProductosBusqueda.setText("U");
		this.jButtonid_linea_grupoProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProductosServiciosProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProductosServiciosProductosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosServiciosProductosUpdate.setText("U");
		this.jButtonid_linea_grupoProductosServiciosProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProductosServiciosProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosProductosUpdate"));



					
		this.jLabelid_linea_categoriaProductosServiciosProductos = new JLabelMe();
		this.jLabelid_linea_categoriaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProductosServiciosProductos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelid_linea_categoriaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jComboBoxid_linea_categoriaProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProductosServiciosProductos= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosProductos.setText("Buscar");
		this.jButtonid_linea_categoriaProductosServiciosProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProductosServiciosProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosProductos"));

		this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProductosServiciosProductosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosServiciosProductosUpdate.setText("U");
		this.jButtonid_linea_categoriaProductosServiciosProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProductosServiciosProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosProductosUpdate"));



					
		this.jLabelid_linea_marcaProductosServiciosProductos = new JLabelMe();
		this.jLabelid_linea_marcaProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProductosServiciosProductos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelid_linea_marcaProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jComboBoxid_linea_marcaProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProductosServiciosProductos= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosProductos.setText("Buscar");
		this.jButtonid_linea_marcaProductosServiciosProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProductosServiciosProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosProductos"));

		this.jButtonid_linea_marcaProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosServiciosProductosBusqueda.setText("U");
		this.jButtonid_linea_marcaProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProductosServiciosProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProductosServiciosProductosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosServiciosProductosUpdate.setText("U");
		this.jButtonid_linea_marcaProductosServiciosProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProductosServiciosProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosProductosUpdate"));



					
		this.jLabelid_tipo_producto_servicioProductosServiciosProductos = new JLabelMe();
		this.jLabelid_tipo_producto_servicioProductosServiciosProductos.setText(""+ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO+" : *");
		this.jLabelid_tipo_producto_servicioProductosServiciosProductos.setToolTipText("Tipo Producto Servicio");
		this.jLabelid_tipo_producto_servicioProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicioProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicioProductosServiciosProductos.setToolTipText(ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		this.jPanelid_tipo_producto_servicioProductosServiciosProductos.setLayout(this.gridaBagLayoutProductosServiciosProductos);


		jComboBoxid_tipo_producto_servicioProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicioProductosServiciosProductos= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProductosServiciosProductos.setText("Buscar");
		this.jButtonid_tipo_producto_servicioProductosServiciosProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosProductos"));

		this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosProductosBusqueda"));

		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.setText("U");
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductosServiciosProductosUpdate"));



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
		//this.jInternalFrameDetalleProductosServiciosProductos = new ProductosServiciosProductosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos Servicios Productos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosServiciosProductos= new GridBagLayout();
		

		
		String sToolTipProductosServiciosProductos="";
		sToolTipProductosServiciosProductos=ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosServiciosProductos+="(Inventario.ProductosServiciosProductos)";
		}
		
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosServiciosProductos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductosServiciosProductos = new JButtonMe();
		this.jButtonModificarProductosServiciosProductos = new JButtonMe();
        this.jButtonActualizarProductosServiciosProductos = new JButtonMe();
        this.jButtonEliminarProductosServiciosProductos = new JButtonMe();
        this.jButtonCancelarProductosServiciosProductos = new JButtonMe();
        this.jButtonGuardarCambiosProductosServiciosProductos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductosServiciosProductos = new JButtonMe();
		this.jButtonCerrarProductosServiciosProductos = new JButtonMe();
		
		this.jScrollPanelDatosProductosServiciosProductos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductosServiciosProductos = new JScrollPane();
		this.jScrollPanelDatosGeneralProductosServiciosProductos = new JScrollPane();
				
		
		
		this.jPanelCamposProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Servicios Productos";
		
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductosServiciosProductos.setName("jPanelCamposProductosServiciosProductos"); 

		this.jPanelCamposOcultosProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductosServiciosProductos.setName("jPanelCamposOcultosProductosServiciosProductos"); 

        this.jPanelAccionesProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosServiciosProductos.setToolTipText("Acciones");
        this.jPanelAccionesProductosServiciosProductos.setName("Acciones"); 

		this.jPanelAccionesFormularioProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductosServiciosProductos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductosServiciosProductos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductosServiciosProductos.setText("Nuevo");
		this.jButtonModificarProductosServiciosProductos.setText("Editar");
        this.jButtonActualizarProductosServiciosProductos.setText("Actualizar");
        this.jButtonEliminarProductosServiciosProductos.setText("Eliminar");
        this.jButtonCancelarProductosServiciosProductos.setText("Cancelar");
        this.jButtonGuardarCambiosProductosServiciosProductos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.setText("Guardar");
		this.jButtonCerrarProductosServiciosProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosServiciosProductos,"nuevo_button","Nuevo",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductosServiciosProductos,"modificar_button","Editar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductosServiciosProductos,"actualizar_button","Actualizar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductosServiciosProductos,"eliminar_button","Eliminar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductosServiciosProductos,"cancelar_button","Cancelar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductosServiciosProductos,"guardarcambios_button","Guardar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosServiciosProductos,"guardarcambiostabla_button","Guardar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosServiciosProductos,"cerrar_button","Salir",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductosServiciosProductos.setToolTipText("Nuevo"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductosServiciosProductos.setToolTipText("Editar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductosServiciosProductos.setToolTipText("Actualizar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductosServiciosProductos.setToolTipText("Eliminar)"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductosServiciosProductos.setToolTipText("Cancelar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductosServiciosProductos.setToolTipText("Guardar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.setToolTipText("Guardar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosServiciosProductos.setToolTipText("Salir"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosServiciosProductos";
		inputMap = this.jButtonNuevoProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosServiciosProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosServiciosProductos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductosServiciosProductos";
		inputMap = this.jButtonActualizarProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductosServiciosProductos"));
		
		//ELIMINAR
		sMapKey = "EliminarProductosServiciosProductos";
		inputMap = this.jButtonEliminarProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductosServiciosProductos"));
		
		//CANCELAR	
		sMapKey = "CancelarProductosServiciosProductos";
		inputMap = this.jButtonCancelarProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductosServiciosProductos"));
		
		//CERRAR		
		sMapKey = "CerrarProductosServiciosProductos";
		inputMap = this.jButtonCerrarProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosServiciosProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosServiciosProductos";
		inputMap = this.jButtonGuardarCambiosTablaProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosServiciosProductos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductosServiciosProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductosServiciosProductos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductosServiciosProductos.setToolTipText("Nuevo ProductosServiciosProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductosServiciosProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductosServiciosProductos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductosServiciosProductos.setToolTipText("Sin Cerrar Ventana ProductosServiciosProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductosServiciosProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductosServiciosProductos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductosServiciosProductos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosServiciosProductos.setText("Accion");
		this.jComboBoxTiposAccionesProductosServiciosProductos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductosServiciosProductos = new JLabelMe();
		
		this.jLabelAccionesProductosServiciosProductos.setText("Acciones");		
		this.jLabelAccionesProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductosServiciosProductos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductosServiciosProductos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductosServiciosProductos=new JTabbedPane();
		this.jTabbedPaneRelacionesProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductosServiciosProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductosServiciosProductos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductosServiciosProductos = new GridBagLayout();
		
		this.jPanelCamposProductosServiciosProductos.setLayout(gridaBagLayoutCamposProductosServiciosProductos);
		this.jPanelCamposOcultosProductosServiciosProductos.setLayout(gridaBagLayoutCamposOcultosProductosServiciosProductos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductosServiciosProductos.add(jLabelIdProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductosServiciosProductos.add(jLabelidProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductosServiciosProductos.add(jLabelid_empresaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosServiciosProductos.add(jButtonid_empresaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 3;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosServiciosProductos.add(jButtonid_empresaProductosServiciosProductosUpdate, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductosServiciosProductos.add(jComboBoxid_empresaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductosServiciosProductos.add(jLabelid_sucursalProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosServiciosProductos.add(jButtonid_sucursalProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 3;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosServiciosProductos.add(jButtonid_sucursalProductosServiciosProductosUpdate, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductosServiciosProductos.add(jComboBoxid_sucursalProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductosServiciosProductos.add(jLabelid_bodegaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosServiciosProductos.add(jButtonid_bodegaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 3;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosServiciosProductos.add(jButtonid_bodegaProductosServiciosProductosUpdate, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductosServiciosProductos.add(jComboBoxid_bodegaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProductosServiciosProductos.add(jLabelid_lineaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosServiciosProductos.add(jButtonid_lineaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 3;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosServiciosProductos.add(jButtonid_lineaProductosServiciosProductosUpdate, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProductosServiciosProductos.add(jComboBoxid_lineaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProductosServiciosProductos.add(jLabelid_linea_grupoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosServiciosProductos.add(jButtonid_linea_grupoProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 3;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosServiciosProductos.add(jButtonid_linea_grupoProductosServiciosProductosUpdate, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProductosServiciosProductos.add(jComboBoxid_linea_grupoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProductosServiciosProductos.add(jLabelid_linea_categoriaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosServiciosProductos.add(jButtonid_linea_categoriaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 3;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosServiciosProductos.add(jButtonid_linea_categoriaProductosServiciosProductosUpdate, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProductosServiciosProductos.add(jComboBoxid_linea_categoriaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProductosServiciosProductos.add(jLabelid_linea_marcaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosServiciosProductos.add(jButtonid_linea_marcaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 3;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosServiciosProductos.add(jButtonid_linea_marcaProductosServiciosProductosUpdate, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProductosServiciosProductos.add(jComboBoxid_linea_marcaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicioProductosServiciosProductos.add(jLabelid_tipo_producto_servicioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioProductosServiciosProductos.add(jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 3;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioProductosServiciosProductos.add(jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicioProductosServiciosProductos.add(jComboBoxid_tipo_producto_servicioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalProductosServiciosProductos.add(jLabelnombre_sucursalProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalProductosServiciosProductos.add(jButtonnombre_sucursalProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalProductosServiciosProductos.add(jscrollPanenombre_sucursalProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaProductosServiciosProductos.add(jLabelnombre_lineaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaProductosServiciosProductos.add(jButtonnombre_lineaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaProductosServiciosProductos.add(jscrollPanenombre_lineaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoProductosServiciosProductos.add(jLabelnombre_linea_grupoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoProductosServiciosProductos.add(jButtonnombre_linea_grupoProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoProductosServiciosProductos.add(jscrollPanenombre_linea_grupoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaProductosServiciosProductos.add(jLabelnombre_linea_categoriaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaProductosServiciosProductos.add(jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaProductosServiciosProductos.add(jscrollPanenombre_linea_categoriaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaProductosServiciosProductos.add(jLabelnombre_linea_marcaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaProductosServiciosProductos.add(jButtonnombre_linea_marcaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaProductosServiciosProductos.add(jscrollPanenombre_linea_marcaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProductosServiciosProductos.add(jLabelcodigoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProductosServiciosProductos.add(jButtoncodigoProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProductosServiciosProductos.add(jTextFieldcodigoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProductosServiciosProductos.add(jLabelnombreProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProductosServiciosProductos.add(jButtonnombreProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProductosServiciosProductos.add(jscrollPanenombreProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_producto_servicioProductosServiciosProductos.add(jLabelnombre_tipo_producto_servicioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_producto_servicioProductosServiciosProductos.add(jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_producto_servicioProductosServiciosProductos.add(jscrollPanenombre_tipo_producto_servicioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaProductosServiciosProductos.add(jLabelnombre_bodegaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaProductosServiciosProductos.add(jButtonnombre_bodegaProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaProductosServiciosProductos.add(jscrollPanenombre_bodegaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProductosServiciosProductos.add(jLabelnombre_unidadProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 2;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProductosServiciosProductos.add(jButtonnombre_unidadProductosServiciosProductosBusqueda, this.gridBagConstraintsProductosServiciosProductos);
	}

	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
	this.gridBagConstraintsProductosServiciosProductos.gridx = 1;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProductosServiciosProductos.add(jTextFieldnombre_unidadProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelidProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelid_bodegaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelid_lineaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelid_linea_grupoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelid_linea_categoriaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelid_linea_marcaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelid_tipo_producto_servicioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombre_sucursalProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombre_lineaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombre_linea_grupoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombre_linea_categoriaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombre_linea_marcaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelcodigoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombreProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombre_tipo_producto_servicioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombre_bodegaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosProductos.add(this.jPanelnombre_unidadProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposProductosServiciosProductos % 2==0) {
		iXPanelCamposProductosServiciosProductos=0;
		iYPanelCamposProductosServiciosProductos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposOcultosProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposOcultosProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosServiciosProductos.add(this.jPanelid_empresaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposOcultosProductosServiciosProductos % 2==0) {
		iXPanelCamposOcultosProductosServiciosProductos=0;
		iYPanelCamposOcultosProductosServiciosProductos++;
	}
	this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosProductos.gridy = iYPanelCamposOcultosProductosServiciosProductos;
	this.gridBagConstraintsProductosServiciosProductos.gridx = iXPanelCamposOcultosProductosServiciosProductos++;
	this.gridBagConstraintsProductosServiciosProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosServiciosProductos.add(this.jPanelid_sucursalProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);



	if(iXPanelCamposOcultosProductosServiciosProductos % 2==0) {
		iXPanelCamposOcultosProductosServiciosProductos=0;
		iYPanelCamposOcultosProductosServiciosProductos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductosServiciosProductos= new GridBagLayout();
		this.jPanelAccionesProductosServiciosProductos.setLayout(gridaBagLayoutAccionesProductosServiciosProductos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductosServiciosProductos= new GridBagLayout();
		this.jPanelAccionesFormularioProductosServiciosProductos.setLayout(gridaBagLayoutAccionesFormularioProductosServiciosProductos);
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductosServiciosProductos.add(this.jComboBoxTiposAccionesFormularioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductosServiciosProductos.add(this.jButtonModificarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);							

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductosServiciosProductos.add(this.jButtonEliminarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
			
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosProductos.add(this.jButtonActualizarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);


		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosProductos.add(this.jButtonGuardarCambiosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);	
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;		
		this.gridBagConstraintsProductosServiciosProductos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosProductos.add(this.jButtonCancelarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosServiciosProductos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();						
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosProductos.gridx = 0;		
			//this.gridBagConstraintsProductosServiciosProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosServiciosProductos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosProductos.gridx =0;
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosServiciosProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductosServiciosProductos = new ProductosServiciosProductosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos Servicios Productos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos Servicios Productos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Servicios Productos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosServiciosProductosModel productosserviciosproductosModel=new ProductosServiciosProductosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosServiciosProductosModel.ProductosServiciosProductosFocusTraversalPolicy productosserviciosproductosFocusTraversalPolicy = productosserviciosproductosModel.new ProductosServiciosProductosFocusTraversalPolicy(this);
			
			//productosserviciosproductosFocusTraversalPolicy.setproductosserviciosproductosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productosserviciosproductosModel);
			
			
			this.jContentPaneDetalleProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductosServiciosProductos = new GridBagLayout();	
			this.jContentPaneDetalleProductosServiciosProductos.setLayout(gridaBagLayoutDetalleProductosServiciosProductos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosServiciosProductos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
					
				
				this.jContentPaneDetalleProductosServiciosProductos.add(jTtoolBarDetalleProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);								
				
}
			
			this.jScrollPanelDatosEdicionProductosServiciosProductos=   new JScrollPane(jContentPaneDetalleProductosServiciosProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosServiciosProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductosServiciosProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosServiciosProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	        
			this.jContentPaneDetalleProductosServiciosProductos.add(jPanelCamposProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);
			
			
			
			
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
						//&& productosserviciosproductosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductosServiciosProductos= new GridBagConstraints();
						this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
						this.jContentPaneDetalleProductosServiciosProductos.add(this.jTabbedPaneRelacionesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductosServiciosProductos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductosServiciosProductos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
					this.gridBagConstraintsProductosServiciosProductos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
					
				
					this.jContentPaneDetalleProductosServiciosProductos.add(jPanelCamposOcultosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);
				
					this.jPanelCamposOcultosProductosServiciosProductos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	        this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductosServiciosProductos.add(this.jPanelAccionesFormularioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);							
			
			
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
	        this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
	        
			
			this.jContentPaneDetalleProductosServiciosProductos.add(this.jPanelAccionesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductosServiciosProductos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductosServiciosProductos=   new JScrollPane(this.jPanelCamposProductosServiciosProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosServiciosProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductosServiciosProductos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);			
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			
			
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
			
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductosServiciosProductos;//jContentPane;
		
		return jScrollPanelDatosEdicionProductosServiciosProductos;
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
