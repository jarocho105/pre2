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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.ProductoEstadisticaConstantesFunciones;

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
public class ProductoEstadisticaDetalleFormJInternalFrame extends ProductoEstadisticaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoEstadistica;
	
	protected JMenuBar jmenuBarDetalleProductoEstadistica;
	
	protected JMenu jmenuDetalleProductoEstadistica;
	protected JMenu jmenuDetalleArchivoProductoEstadistica;
	protected JMenu jmenuDetalleAccionesProductoEstadistica;
	protected JMenu jmenuDetalleDatosProductoEstadistica;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoEstadistica;	
	protected GridBagConstraints gridBagConstraintsProductoEstadistica;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoEstadisticaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoEstadistica;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductoEstadisticaSessionBean productoestadisticaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public ProductoEstadisticaLogic productoestadisticaLogic;
	
	public JScrollPane jScrollPanelDatosProductoEstadistica;
	public JScrollPane jScrollPanelDatosEdicionProductoEstadistica;
	public JScrollPane jScrollPanelDatosGeneralProductoEstadistica;
	
	protected JPanel jPanelCamposProductoEstadistica;    
	protected JPanel jPanelCamposOcultosProductoEstadistica;    	
	protected JPanel jPanelAccionesProductoEstadistica;
	protected JPanel jPanelAccionesFormularioProductoEstadistica;
    
	
	
	protected Integer iXPanelCamposProductoEstadistica=0;
	protected Integer iYPanelCamposProductoEstadistica=0;
	
	protected Integer iXPanelCamposOcultosProductoEstadistica=0;
	protected Integer iYPanelCamposOcultosProductoEstadistica=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoEstadistica;
	public JButton jButtonModificarProductoEstadistica;
	public JButton jButtonActualizarProductoEstadistica;
    public JButton jButtonEliminarProductoEstadistica;
	public JButton jButtonCancelarProductoEstadistica;
    public JButton jButtonGuardarCambiosProductoEstadistica;
	public JButton jButtonGuardarCambiosTablaProductoEstadistica;
	protected JButton jButtonCerrarProductoEstadistica;
	
	
	protected JButton jButtonProcesarInformacionProductoEstadistica;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoEstadistica;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoEstadistica;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoEstadistica;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoEstadistica;
	protected JButton jButtonModificarToolBarProductoEstadistica;
	protected JButton jButtonActualizarToolBarProductoEstadistica;
    protected JButton jButtonEliminarToolBarProductoEstadistica;
	protected JButton jButtonCancelarToolBarProductoEstadistica;
    protected JButton jButtonGuardarCambiosToolBarProductoEstadistica;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoEstadistica;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoEstadistica;
	protected JButton jButtonCerrarToolBarProductoEstadistica;
	
	protected JButton jButtonProcesarInformacionToolBarProductoEstadistica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoEstadistica;
	protected JMenuItem jMenuItemModificarProductoEstadistica;
	protected JMenuItem jMenuItemActualizarProductoEstadistica;
    protected JMenuItem jMenuItemEliminarProductoEstadistica;
	protected JMenuItem jMenuItemCancelarProductoEstadistica;
    protected JMenuItem jMenuItemGuardarCambiosProductoEstadistica;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoEstadistica;
	protected JMenuItem jMenuItemCerrarProductoEstadistica;
	protected JMenuItem jMenuItemDetalleCerrarProductoEstadistica;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoEstadistica;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoEstadistica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoEstadistica;
	protected JMenuItem jMenuItemMostrarOcultarProductoEstadistica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoEstadistica;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoEstadistica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoEstadistica;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoEstadistica;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoEstadistica;
	public JLabel jLabelIdProductoEstadistica;
	public JLabel jLabelidProductoEstadistica;
	public JButton jButtonidProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelprecio_ultima_compraProductoEstadistica;
	public JLabel jLabelprecio_ultima_compraProductoEstadistica;
	public JTextField jTextFieldprecio_ultima_compraProductoEstadistica;
	public JButton jButtonprecio_ultima_compraProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelprecio_ultima_ventaProductoEstadistica;
	public JLabel jLabelprecio_ultima_ventaProductoEstadistica;
	public JTextField jTextFieldprecio_ultima_ventaProductoEstadistica;
	public JButton jButtonprecio_ultima_ventaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelprecio_ultima_cotizacionProductoEstadistica;
	public JLabel jLabelprecio_ultima_cotizacionProductoEstadistica;
	public JTextField jTextFieldprecio_ultima_cotizacionProductoEstadistica;
	public JButton jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelprecio_ultima_proformaProductoEstadistica;
	public JLabel jLabelprecio_ultima_proformaProductoEstadistica;
	public JTextField jTextFieldprecio_ultima_proformaProductoEstadistica;
	public JButton jButtonprecio_ultima_proformaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleProductoEstadistica;
	public JLabel jLabelcantidad_disponibleProductoEstadistica;
	public JTextField jTextFieldcantidad_disponibleProductoEstadistica;
	public JButton jButtoncantidad_disponibleProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_reservadaProductoEstadistica;
	public JLabel jLabelcantidad_reservadaProductoEstadistica;
	public JTextField jTextFieldcantidad_reservadaProductoEstadistica;
	public JButton jButtoncantidad_reservadaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_demandaProductoEstadistica;
	public JLabel jLabelcantidad_demandaProductoEstadistica;
	public JTextField jTextFieldcantidad_demandaProductoEstadistica;
	public JButton jButtoncantidad_demandaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_maximoProductoEstadistica;
	public JLabel jLabelcantidad_maximoProductoEstadistica;
	public JTextField jTextFieldcantidad_maximoProductoEstadistica;
	public JButton jButtoncantidad_maximoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_minimoProductoEstadistica;
	public JLabel jLabelcantidad_minimoProductoEstadistica;
	public JTextField jTextFieldcantidad_minimoProductoEstadistica;
	public JButton jButtoncantidad_minimoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_fisicaProductoEstadistica;
	public JLabel jLabelcantidad_fisicaProductoEstadistica;
	public JTextField jTextFieldcantidad_fisicaProductoEstadistica;
	public JButton jButtoncantidad_fisicaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_orden_compraProductoEstadistica;
	public JLabel jLabelcantidad_orden_compraProductoEstadistica;
	public JTextField jTextFieldcantidad_orden_compraProductoEstadistica;
	public JButton jButtoncantidad_orden_compraProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pedidaProductoEstadistica;
	public JLabel jLabelcantidad_pedidaProductoEstadistica;
	public JTextField jTextFieldcantidad_pedidaProductoEstadistica;
	public JButton jButtoncantidad_pedidaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_requisicionProductoEstadistica;
	public JLabel jLabelcantidad_requisicionProductoEstadistica;
	public JTextField jTextFieldcantidad_requisicionProductoEstadistica;
	public JButton jButtoncantidad_requisicionProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_ingresoProductoEstadistica;
	public JLabel jLabelfecha_ultima_ingresoProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_ingresoProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_ingresoProductoEstadistica;
	public JButton jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_egresoProductoEstadistica;
	public JLabel jLabelfecha_ultima_egresoProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_egresoProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_egresoProductoEstadistica;
	public JButton jButtonfecha_ultima_egresoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_produccionProductoEstadistica;
	public JLabel jLabelfecha_ultima_produccionProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_produccionProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_produccionProductoEstadistica;
	public JButton jButtonfecha_ultima_produccionProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_compraProductoEstadistica;
	public JLabel jLabelfecha_ultima_compraProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_compraProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_compraProductoEstadistica;
	public JButton jButtonfecha_ultima_compraProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_ventaProductoEstadistica;
	public JLabel jLabelfecha_ultima_ventaProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_ventaProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_ventaProductoEstadistica;
	public JButton jButtonfecha_ultima_ventaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_devolucionProductoEstadistica;
	public JLabel jLabelfecha_ultima_devolucionProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_devolucionProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_devolucionProductoEstadistica;
	public JButton jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_orden_compraProductoEstadistica;
	public JLabel jLabelfecha_ultima_orden_compraProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_orden_compraProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_orden_compraProductoEstadistica;
	public JButton jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_pedidoProductoEstadistica;
	public JLabel jLabelfecha_ultima_pedidoProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_pedidoProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_pedidoProductoEstadistica;
	public JButton jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_requisicionProductoEstadistica;
	public JLabel jLabelfecha_ultima_requisicionProductoEstadistica;
	//public JFormattedTextField jDateChooserfecha_ultima_requisicionProductoEstadistica;

	public JDateChooser jDateChooserfecha_ultima_requisicionProductoEstadistica;
	public JButton jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ingresoProductoEstadistica;
	public JLabel jLabeltotal_ingresoProductoEstadistica;
	public JTextField jTextFieldtotal_ingresoProductoEstadistica;
	public JButton jButtontotal_ingresoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_egresoProductoEstadistica;
	public JLabel jLabeltotal_egresoProductoEstadistica;
	public JTextField jTextFieldtotal_egresoProductoEstadistica;
	public JButton jButtontotal_egresoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_compraProductoEstadistica;
	public JLabel jLabeltotal_compraProductoEstadistica;
	public JTextField jTextFieldtotal_compraProductoEstadistica;
	public JButton jButtontotal_compraProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ventaProductoEstadistica;
	public JLabel jLabeltotal_ventaProductoEstadistica;
	public JTextField jTextFieldtotal_ventaProductoEstadistica;
	public JButton jButtontotal_ventaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_producidoProductoEstadistica;
	public JLabel jLabeltotal_producidoProductoEstadistica;
	public JTextField jTextFieldtotal_producidoProductoEstadistica;
	public JButton jButtontotal_producidoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_devueltoProductoEstadistica;
	public JLabel jLabeltotal_devueltoProductoEstadistica;
	public JTextField jTextFieldtotal_devueltoProductoEstadistica;
	public JButton jButtontotal_devueltoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_ultimoProductoEstadistica;
	public JLabel jLabelcosto_ultimoProductoEstadistica;
	public JTextField jTextFieldcosto_ultimoProductoEstadistica;
	public JButton jButtoncosto_ultimoProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoEstadistica;
	public JLabel jLabelcosto_totalProductoEstadistica;
	public JTextField jTextFieldcosto_totalProductoEstadistica;
	public JButton jButtoncosto_totalProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_produccionProductoEstadistica;
	public JLabel jLabelcosto_produccionProductoEstadistica;
	public JTextField jTextFieldcosto_produccionProductoEstadistica;
	public JButton jButtoncosto_produccionProductoEstadisticaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoEstadistica;
	public JLabel jLabelid_empresaProductoEstadistica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoEstadistica;
	public JButton jButtonid_empresaProductoEstadistica= new JButtonMe();
	public JButton jButtonid_empresaProductoEstadisticaUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoEstadistica;
	public JLabel jLabelid_sucursalProductoEstadistica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoEstadistica;
	public JButton jButtonid_sucursalProductoEstadistica= new JButtonMe();
	public JButton jButtonid_sucursalProductoEstadisticaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoEstadistica;
	public JLabel jLabelid_bodegaProductoEstadistica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoEstadistica;
	public JButton jButtonid_bodegaProductoEstadistica= new JButtonMe();
	public JButton jButtonid_bodegaProductoEstadisticaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoEstadisticaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoEstadistica;
	public JLabel jLabelid_productoProductoEstadistica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoEstadistica;
	public JButton jButtonid_productoProductoEstadistica= new JButtonMe();
	public JButton jButtonid_productoProductoEstadisticaUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoEstadisticaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoEstadistica;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoEstadisticaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoEstadistica=new JPanel();
				this.jPanelAccionesFormularioProductoEstadistica=new JPanel();
				this.jmenuBarDetalleProductoEstadistica=new JMenuBar();
				this.jTtoolBarDetalleProductoEstadistica=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEstadisticaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoEstadisticaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEstadisticaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEstadisticaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEstadisticaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoEstadistica() {
		return this.jButtonActualizarToolBarProductoEstadistica;
	}
	
	public JButton getjButtonEliminarToolBarProductoEstadistica() {
		return this.jButtonEliminarToolBarProductoEstadistica;
	}
	
	public JButton getjButtonCancelarToolBarProductoEstadistica() {
		return this.jButtonCancelarToolBarProductoEstadistica;
	}		
	
	public JButton getjButtonProcesarInformacionProductoEstadistica() {
		return this.jButtonProcesarInformacionProductoEstadistica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoEstadistica)	{
		this.jButtonProcesarInformacionProductoEstadistica = jButtonProcesarInformacionProductoEstadistica;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoEstadistica() {
		return this.jComboBoxTiposAccionesProductoEstadistica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoEstadistica(
			JComboBox jComboBoxTiposRelacionesProductoEstadistica) {
		this.jComboBoxTiposRelacionesProductoEstadistica = jComboBoxTiposRelacionesProductoEstadistica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoEstadistica(
			JComboBox jComboBoxTiposAccionesProductoEstadistica) {
		this.jComboBoxTiposAccionesProductoEstadistica = jComboBoxTiposAccionesProductoEstadistica;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoEstadistica() {
		return this.jComboBoxTiposAccionesFormularioProductoEstadistica;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoEstadistica(
			JComboBox jComboBoxTiposAccionesFormularioProductoEstadistica) {
		this.jComboBoxTiposAccionesFormularioProductoEstadistica = jComboBoxTiposAccionesFormularioProductoEstadistica;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoestadisticaSessionBean=new ProductoEstadisticaSessionBean();
		
		this.productoestadisticaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoestadisticaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoestadisticaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoEstadisticaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoEstadisticaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoEstadisticaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estadistica MANTENIMIENTO"));
		
		
		if(iWidth > 3550) {
			iWidth=3550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoEstadisticaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoEstadistica= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoEstadistica=new JButtonMe();
				this.jButtonModificarToolBarProductoEstadistica=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoEstadistica,this.jTtoolBarDetalleProductoEstadistica,
							"actualizar","actualizar","Actualizar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoEstadistica,this.jTtoolBarDetalleProductoEstadistica,
							"eliminar","eliminar","Eliminar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoEstadistica,this.jTtoolBarDetalleProductoEstadistica,
							"cancelar","cancelar","Cancelar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoEstadistica,this.jTtoolBarDetalleProductoEstadistica,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoEstadistica=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoEstadistica=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoEstadistica=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoEstadistica=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoEstadistica=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoEstadistica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoEstadistica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoEstadistica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoEstadistica= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoEstadistica.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoEstadistica,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoEstadistica= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoEstadistica.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoEstadistica,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoEstadistica= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoEstadistica.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoEstadistica,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoEstadistica= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoEstadistica.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoEstadistica,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoEstadistica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoEstadistica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoEstadistica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoEstadistica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoEstadistica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoEstadistica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoEstadistica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoEstadistica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoEstadistica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoEstadistica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoEstadistica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoEstadistica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoEstadistica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoEstadistica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoEstadistica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoEstadistica.add(this.jMenuItemDetalleCerrarProductoEstadistica);
		
		this.jmenuDetalleAccionesProductoEstadistica.add(this.jMenuItemActualizarProductoEstadistica);
		this.jmenuDetalleAccionesProductoEstadistica.add(this.jMenuItemEliminarProductoEstadistica);
		this.jmenuDetalleAccionesProductoEstadistica.add(this.jMenuItemCancelarProductoEstadistica);		
		
		//this.jmenuDetalleDatosProductoEstadistica.add(this.jMenuItemDetalleAbrirOrderByProductoEstadistica);				
		this.jmenuDetalleDatosProductoEstadistica.add(this.jMenuItemDetalleMostarOcultarProductoEstadistica);				
				
		//this.jmenuDetalleAccionesProductoEstadistica.add(this.jMenuItemGuardarCambiosProductoEstadistica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoEstadistica.add(this.jmenuDetalleArchivoProductoEstadistica);		
		this.jmenuBarDetalleProductoEstadistica.add(this.jmenuDetalleAccionesProductoEstadistica);		
		this.jmenuBarDetalleProductoEstadistica.add(this.jmenuDetalleDatosProductoEstadistica);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoEstadistica);				
	}
	
	
	public void inicializarElementosCamposProductoEstadistica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoEstadistica = new JLabelMe();
		jLabelIdProductoEstadistica.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoEstadistica = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoEstadistica= new GridBagLayout();

		this.jPanelidProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);

		jLabelidProductoEstadistica = new JLabel();
		jLabelidProductoEstadistica.setText("Id");

		jLabelidProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelprecio_ultima_compraProductoEstadistica = new JLabelMe();
		this.jLabelprecio_ultima_compraProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMACOMPRA+" : *");
		this.jLabelprecio_ultima_compraProductoEstadistica.setToolTipText("Precio Ultima Compra");
		this.jLabelprecio_ultima_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprecio_ultima_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprecio_ultima_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_ultima_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_ultima_compraProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_ultima_compraProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMACOMPRA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelprecio_ultima_compraProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldprecio_ultima_compraProductoEstadistica= new JTextFieldMe();
		jTextFieldprecio_ultima_compraProductoEstadistica.setEnabled(false);
		jTextFieldprecio_ultima_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultima_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultima_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_ultima_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_ultima_compraProductoEstadistica.setText("0.0");

		this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda.setText("U");
		this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_ultima_compraProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_ultima_compraProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_ultima_compraProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_ultima_compraProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelprecio_ultima_ventaProductoEstadistica = new JLabelMe();
		this.jLabelprecio_ultima_ventaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMAVENTA+" : *");
		this.jLabelprecio_ultima_ventaProductoEstadistica.setToolTipText("Precio Ultima Venta");
		this.jLabelprecio_ultima_ventaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelprecio_ultima_ventaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelprecio_ultima_ventaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_ultima_ventaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_ultima_ventaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_ultima_ventaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMAVENTA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelprecio_ultima_ventaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldprecio_ultima_ventaProductoEstadistica= new JTextFieldMe();
		jTextFieldprecio_ultima_ventaProductoEstadistica.setEnabled(false);
		jTextFieldprecio_ultima_ventaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultima_ventaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultima_ventaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_ultima_ventaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_ultima_ventaProductoEstadistica.setText("0.0");

		this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda.setText("U");
		this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_ultima_ventaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_ultima_ventaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_ultima_ventaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_ultima_ventaProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelprecio_ultima_cotizacionProductoEstadistica = new JLabelMe();
		this.jLabelprecio_ultima_cotizacionProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMACOTIZACION+" : *");
		this.jLabelprecio_ultima_cotizacionProductoEstadistica.setToolTipText("Precio Ultima Cotizacion");
		this.jLabelprecio_ultima_cotizacionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprecio_ultima_cotizacionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprecio_ultima_cotizacionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_ultima_cotizacionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_ultima_cotizacionProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_ultima_cotizacionProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMACOTIZACION);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelprecio_ultima_cotizacionProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldprecio_ultima_cotizacionProductoEstadistica= new JTextFieldMe();
		jTextFieldprecio_ultima_cotizacionProductoEstadistica.setEnabled(false);
		jTextFieldprecio_ultima_cotizacionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultima_cotizacionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultima_cotizacionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_ultima_cotizacionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_ultima_cotizacionProductoEstadistica.setText("0.0");

		this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda.setText("U");
		this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_ultima_cotizacionProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_ultima_cotizacionProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_ultima_cotizacionProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelprecio_ultima_proformaProductoEstadistica = new JLabelMe();
		this.jLabelprecio_ultima_proformaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMAPROFORMA+" : *");
		this.jLabelprecio_ultima_proformaProductoEstadistica.setToolTipText("Precio Ultima Proforma");
		this.jLabelprecio_ultima_proformaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprecio_ultima_proformaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprecio_ultima_proformaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_ultima_proformaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_ultima_proformaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_ultima_proformaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMAPROFORMA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelprecio_ultima_proformaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldprecio_ultima_proformaProductoEstadistica= new JTextFieldMe();
		jTextFieldprecio_ultima_proformaProductoEstadistica.setEnabled(false);
		jTextFieldprecio_ultima_proformaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultima_proformaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultima_proformaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_ultima_proformaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_ultima_proformaProductoEstadistica.setText("0.0");

		this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda.setText("U");
		this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_ultima_proformaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_ultima_proformaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_ultima_proformaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_ultima_proformaProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_disponibleProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleProductoEstadistica.setToolTipText("Cantidad Disponible");
		this.jLabelcantidad_disponibleProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_disponibleProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_disponibleProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_disponibleProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_disponibleProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleProductoEstadistica.setText("0");

		this.jButtoncantidad_disponibleProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_disponibleProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_reservadaProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_reservadaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADRESERVADA+" : *");
		this.jLabelcantidad_reservadaProductoEstadistica.setToolTipText("Cantidad Reservada");
		this.jLabelcantidad_reservadaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_reservadaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_reservadaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_reservadaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_reservadaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_reservadaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADRESERVADA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_reservadaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_reservadaProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_reservadaProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_reservadaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_reservadaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_reservadaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_reservadaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_reservadaProductoEstadistica.setText("0.0");

		this.jButtoncantidad_reservadaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_reservadaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_reservadaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_reservadaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_reservadaProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_reservadaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_reservadaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_reservadaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_reservadaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_reservadaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_reservadaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_reservadaProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_demandaProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_demandaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADDEMANDA+" : *");
		this.jLabelcantidad_demandaProductoEstadistica.setToolTipText("Cantidad Demanda");
		this.jLabelcantidad_demandaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_demandaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_demandaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_demandaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_demandaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_demandaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADDEMANDA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_demandaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_demandaProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_demandaProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_demandaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_demandaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_demandaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_demandaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_demandaProductoEstadistica.setText("0.0");

		this.jButtoncantidad_demandaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_demandaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_demandaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_demandaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_demandaProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_demandaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_demandaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_demandaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_demandaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_demandaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_demandaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_demandaProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_maximoProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_maximoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADMAXIMO+" : *");
		this.jLabelcantidad_maximoProductoEstadistica.setToolTipText("Cantidad Maximo");
		this.jLabelcantidad_maximoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_maximoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_maximoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_maximoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_maximoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_maximoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADMAXIMO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_maximoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_maximoProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_maximoProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_maximoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_maximoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_maximoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_maximoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_maximoProductoEstadistica.setText("0");

		this.jButtoncantidad_maximoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_maximoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_maximoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_maximoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_maximoProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_maximoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_maximoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_maximoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_maximoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_maximoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_maximoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_maximoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_minimoProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_minimoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADMINIMO+" : *");
		this.jLabelcantidad_minimoProductoEstadistica.setToolTipText("Cantidad Minimo");
		this.jLabelcantidad_minimoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_minimoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_minimoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_minimoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_minimoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_minimoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADMINIMO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_minimoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_minimoProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_minimoProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_minimoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_minimoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_minimoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_minimoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_minimoProductoEstadistica.setText("0");

		this.jButtoncantidad_minimoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_minimoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_minimoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_minimoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_minimoProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_minimoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_minimoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_minimoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_minimoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_minimoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_minimoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_minimoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_fisicaProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_fisicaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADFISICA+" : *");
		this.jLabelcantidad_fisicaProductoEstadistica.setToolTipText("Cantidad Fisica");
		this.jLabelcantidad_fisicaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_fisicaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_fisicaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_fisicaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADFISICA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_fisicaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_fisicaProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_fisicaProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_fisicaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_fisicaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_fisicaProductoEstadistica.setText("0.0");

		this.jButtoncantidad_fisicaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_fisicaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_fisicaProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_fisicaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_fisicaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_fisicaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_fisicaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_fisicaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_fisicaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_fisicaProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_orden_compraProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_orden_compraProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADORDENCOMPRA+" : *");
		this.jLabelcantidad_orden_compraProductoEstadistica.setToolTipText("Cantidad Orden Compra");
		this.jLabelcantidad_orden_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcantidad_orden_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcantidad_orden_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_orden_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_orden_compraProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_orden_compraProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADORDENCOMPRA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_orden_compraProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_orden_compraProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_orden_compraProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_orden_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_orden_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_orden_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_orden_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_orden_compraProductoEstadistica.setText("0.0");

		this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_orden_compraProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_orden_compraProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_orden_compraProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_orden_compraProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pedidaProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_pedidaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADPEDIDA+" : *");
		this.jLabelcantidad_pedidaProductoEstadistica.setToolTipText("Cantidad Pedida");
		this.jLabelcantidad_pedidaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pedidaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pedidaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pedidaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pedidaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pedidaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADPEDIDA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_pedidaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_pedidaProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_pedidaProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_pedidaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pedidaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pedidaProductoEstadistica.setText("0.0");

		this.jButtoncantidad_pedidaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_pedidaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pedidaProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_pedidaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pedidaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pedidaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pedidaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pedidaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pedidaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pedidaProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_requisicionProductoEstadistica = new JLabelMe();
		this.jLabelcantidad_requisicionProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADREQUISICION+" : *");
		this.jLabelcantidad_requisicionProductoEstadistica.setToolTipText("Cantidad Requisicion");
		this.jLabelcantidad_requisicionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcantidad_requisicionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcantidad_requisicionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_requisicionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_requisicionProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_requisicionProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADREQUISICION);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcantidad_requisicionProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcantidad_requisicionProductoEstadistica= new JTextFieldMe();
		jTextFieldcantidad_requisicionProductoEstadistica.setEnabled(false);
		jTextFieldcantidad_requisicionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_requisicionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_requisicionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_requisicionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_requisicionProductoEstadistica.setText("0.0");

		this.jButtoncantidad_requisicionProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncantidad_requisicionProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_requisicionProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_requisicionProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_requisicionProductoEstadisticaBusqueda.setText("U");
		this.jButtoncantidad_requisicionProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_requisicionProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_requisicionProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_requisicionProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_requisicionProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_requisicionProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_requisicionProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_ingresoProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_ingresoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAINGRESO+" : *");
		this.jLabelfecha_ultima_ingresoProductoEstadistica.setToolTipText("Fecha Ultima Ingreso");
		this.jLabelfecha_ultima_ingresoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_ingresoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_ingresoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_ingresoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_ingresoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_ingresoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAINGRESO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_ingresoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_ingresoProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_ingresoProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_ingresoProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_ingresoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ingresoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ingresoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_ingresoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_ingresoProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_ingresoProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_ingresoProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_ingresoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_ingresoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_ingresoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_egresoProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_egresoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAEGRESO+" : *");
		this.jLabelfecha_ultima_egresoProductoEstadistica.setToolTipText("Fecha Ultima Egreso");
		this.jLabelfecha_ultima_egresoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_egresoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_egresoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_egresoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_egresoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_egresoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAEGRESO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_egresoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_egresoProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_egresoProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_egresoProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_egresoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_egresoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_egresoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_egresoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_egresoProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_egresoProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_egresoProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_egresoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_egresoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_egresoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_egresoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_produccionProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_produccionProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAPRODUCCION+" : *");
		this.jLabelfecha_ultima_produccionProductoEstadistica.setToolTipText("Fecha Ultima Produccion");
		this.jLabelfecha_ultima_produccionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_produccionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_produccionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_produccionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_produccionProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_produccionProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAPRODUCCION);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_produccionProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_produccionProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_produccionProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_produccionProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_produccionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_produccionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_produccionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_produccionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_produccionProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_produccionProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_produccionProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_produccionProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_produccionProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_produccionProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_produccionProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_compraProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_compraProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMACOMPRA+" : *");
		this.jLabelfecha_ultima_compraProductoEstadistica.setToolTipText("Fecha Ultima Compra");
		this.jLabelfecha_ultima_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_compraProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_compraProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMACOMPRA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_compraProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_compraProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_compraProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_compraProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_compraProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_compraProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_compraProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_compraProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_compraProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_compraProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_compraProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_ventaProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_ventaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAVENTA+" : *");
		this.jLabelfecha_ultima_ventaProductoEstadistica.setToolTipText("Fecha Ultima Venta");
		this.jLabelfecha_ultima_ventaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_ventaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_ventaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_ventaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_ventaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_ventaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAVENTA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_ventaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_ventaProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_ventaProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_ventaProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_ventaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ventaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ventaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_ventaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_ventaProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_ventaProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_ventaProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_ventaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_ventaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_ventaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_ventaProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_devolucionProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_devolucionProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMADEVOLUCION+" : *");
		this.jLabelfecha_ultima_devolucionProductoEstadistica.setToolTipText("Fecha Ultima Devolucion");
		this.jLabelfecha_ultima_devolucionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_devolucionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_devolucionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_devolucionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_devolucionProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_devolucionProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMADEVOLUCION);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_devolucionProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_devolucionProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_devolucionProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_devolucionProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_devolucionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_devolucionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_devolucionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_devolucionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_devolucionProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_devolucionProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_devolucionProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_devolucionProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_devolucionProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_devolucionProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_orden_compraProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_orden_compraProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAORDENCOMPRA+" : *");
		this.jLabelfecha_ultima_orden_compraProductoEstadistica.setToolTipText("Fecha Ultima Orden Compra");
		this.jLabelfecha_ultima_orden_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_orden_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_orden_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_orden_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_orden_compraProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_orden_compraProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAORDENCOMPRA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_orden_compraProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_orden_compraProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_orden_compraProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_orden_compraProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_orden_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_orden_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_orden_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_orden_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_orden_compraProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_orden_compraProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_orden_compraProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_orden_compraProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_orden_compraProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_orden_compraProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_pedidoProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_pedidoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAPEDIDO+" : *");
		this.jLabelfecha_ultima_pedidoProductoEstadistica.setToolTipText("Fecha Ultima Pedido");
		this.jLabelfecha_ultima_pedidoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_pedidoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_pedidoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_pedidoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_pedidoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_pedidoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAPEDIDO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_pedidoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_pedidoProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_pedidoProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_pedidoProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_pedidoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_pedidoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_pedidoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_pedidoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_pedidoProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_pedidoProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_pedidoProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_pedidoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_pedidoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_pedidoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_requisicionProductoEstadistica = new JLabelMe();
		this.jLabelfecha_ultima_requisicionProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAREQUISICION+" : *");
		this.jLabelfecha_ultima_requisicionProductoEstadistica.setToolTipText("Fecha Ultima Requisicion");
		this.jLabelfecha_ultima_requisicionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_requisicionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_requisicionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_requisicionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_requisicionProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_requisicionProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAREQUISICION);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelfecha_ultima_requisicionProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		//jFormattedTextFieldfecha_ultima_requisicionProductoEstadistica= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_requisicionProductoEstadistica= new JDateChooser();
		jDateChooserfecha_ultima_requisicionProductoEstadistica.setEnabled(false);
		jDateChooserfecha_ultima_requisicionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_requisicionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_requisicionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_requisicionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_requisicionProductoEstadistica.setDate(new Date());
		jDateChooserfecha_ultima_requisicionProductoEstadistica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_requisicionProductoEstadistica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda.setText("U");
		this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_requisicionProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_requisicionProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_requisicionProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ingresoProductoEstadistica = new JLabelMe();
		this.jLabeltotal_ingresoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_TOTALINGRESO+" : *");
		this.jLabeltotal_ingresoProductoEstadistica.setToolTipText("Total Ingreso");
		this.jLabeltotal_ingresoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ingresoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ingresoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ingresoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ingresoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ingresoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_TOTALINGRESO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPaneltotal_ingresoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldtotal_ingresoProductoEstadistica= new JTextFieldMe();
		jTextFieldtotal_ingresoProductoEstadistica.setEnabled(false);
		jTextFieldtotal_ingresoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingresoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingresoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ingresoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ingresoProductoEstadistica.setText("0.0");

		this.jButtontotal_ingresoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtontotal_ingresoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingresoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingresoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ingresoProductoEstadisticaBusqueda.setText("U");
		this.jButtontotal_ingresoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ingresoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ingresoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ingresoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ingresoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ingresoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ingresoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_egresoProductoEstadistica = new JLabelMe();
		this.jLabeltotal_egresoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_TOTALEGRESO+" : *");
		this.jLabeltotal_egresoProductoEstadistica.setToolTipText("Total Egreso");
		this.jLabeltotal_egresoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_egresoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_egresoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_egresoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_egresoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_egresoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_TOTALEGRESO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPaneltotal_egresoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldtotal_egresoProductoEstadistica= new JTextFieldMe();
		jTextFieldtotal_egresoProductoEstadistica.setEnabled(false);
		jTextFieldtotal_egresoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_egresoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_egresoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_egresoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_egresoProductoEstadistica.setText("0.0");

		this.jButtontotal_egresoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtontotal_egresoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_egresoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_egresoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_egresoProductoEstadisticaBusqueda.setText("U");
		this.jButtontotal_egresoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_egresoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_egresoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_egresoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_egresoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_egresoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_egresoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_compraProductoEstadistica = new JLabelMe();
		this.jLabeltotal_compraProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_TOTALCOMPRA+" : *");
		this.jLabeltotal_compraProductoEstadistica.setToolTipText("Total Compra");
		this.jLabeltotal_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_compraProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_compraProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_TOTALCOMPRA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPaneltotal_compraProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldtotal_compraProductoEstadistica= new JTextFieldMe();
		jTextFieldtotal_compraProductoEstadistica.setEnabled(false);
		jTextFieldtotal_compraProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_compraProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_compraProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_compraProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_compraProductoEstadistica.setText("0.0");

		this.jButtontotal_compraProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtontotal_compraProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_compraProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_compraProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_compraProductoEstadisticaBusqueda.setText("U");
		this.jButtontotal_compraProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_compraProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_compraProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_compraProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_compraProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_compraProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_compraProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ventaProductoEstadistica = new JLabelMe();
		this.jLabeltotal_ventaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_TOTALVENTA+" : *");
		this.jLabeltotal_ventaProductoEstadistica.setToolTipText("Total Venta");
		this.jLabeltotal_ventaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ventaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ventaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ventaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ventaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ventaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_TOTALVENTA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPaneltotal_ventaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldtotal_ventaProductoEstadistica= new JTextFieldMe();
		jTextFieldtotal_ventaProductoEstadistica.setEnabled(false);
		jTextFieldtotal_ventaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ventaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ventaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ventaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ventaProductoEstadistica.setText("0.0");

		this.jButtontotal_ventaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtontotal_ventaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ventaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ventaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ventaProductoEstadisticaBusqueda.setText("U");
		this.jButtontotal_ventaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ventaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ventaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ventaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ventaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ventaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ventaProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_producidoProductoEstadistica = new JLabelMe();
		this.jLabeltotal_producidoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_TOTALPRODUCIDO+" : *");
		this.jLabeltotal_producidoProductoEstadistica.setToolTipText("Total Producido");
		this.jLabeltotal_producidoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_producidoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_producidoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_producidoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_producidoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_producidoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_TOTALPRODUCIDO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPaneltotal_producidoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldtotal_producidoProductoEstadistica= new JTextFieldMe();
		jTextFieldtotal_producidoProductoEstadistica.setEnabled(false);
		jTextFieldtotal_producidoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_producidoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_producidoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_producidoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_producidoProductoEstadistica.setText("0.0");

		this.jButtontotal_producidoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtontotal_producidoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_producidoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_producidoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_producidoProductoEstadisticaBusqueda.setText("U");
		this.jButtontotal_producidoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_producidoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_producidoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_producidoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_producidoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_producidoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_producidoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_devueltoProductoEstadistica = new JLabelMe();
		this.jLabeltotal_devueltoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_TOTALDEVUELTO+" : *");
		this.jLabeltotal_devueltoProductoEstadistica.setToolTipText("Total Devuelto");
		this.jLabeltotal_devueltoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_devueltoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_devueltoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_devueltoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_devueltoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_devueltoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_TOTALDEVUELTO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPaneltotal_devueltoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldtotal_devueltoProductoEstadistica= new JTextFieldMe();
		jTextFieldtotal_devueltoProductoEstadistica.setEnabled(false);
		jTextFieldtotal_devueltoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_devueltoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_devueltoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_devueltoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_devueltoProductoEstadistica.setText("0.0");

		this.jButtontotal_devueltoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtontotal_devueltoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_devueltoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_devueltoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_devueltoProductoEstadisticaBusqueda.setText("U");
		this.jButtontotal_devueltoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_devueltoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_devueltoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_devueltoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_devueltoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_devueltoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_devueltoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_ultimoProductoEstadistica = new JLabelMe();
		this.jLabelcosto_ultimoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_COSTOULTIMO+" : *");
		this.jLabelcosto_ultimoProductoEstadistica.setToolTipText("Costo Ultimo");
		this.jLabelcosto_ultimoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ultimoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ultimoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_ultimoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_ultimoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_ultimoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_COSTOULTIMO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcosto_ultimoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcosto_ultimoProductoEstadistica= new JTextFieldMe();
		jTextFieldcosto_ultimoProductoEstadistica.setEnabled(false);
		jTextFieldcosto_ultimoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_ultimoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_ultimoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_ultimoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_ultimoProductoEstadistica.setText("0.0");

		this.jButtoncosto_ultimoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncosto_ultimoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ultimoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ultimoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_ultimoProductoEstadisticaBusqueda.setText("U");
		this.jButtoncosto_ultimoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_ultimoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_ultimoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_ultimoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_ultimoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_ultimoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_ultimoProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoEstadistica = new JLabelMe();
		this.jLabelcosto_totalProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoEstadistica.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcosto_totalProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcosto_totalProductoEstadistica= new JTextFieldMe();
		jTextFieldcosto_totalProductoEstadistica.setEnabled(false);
		jTextFieldcosto_totalProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoEstadistica.setText("0.0");

		this.jButtoncosto_totalProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoEstadisticaBusqueda.setText("U");
		this.jButtoncosto_totalProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoEstadisticaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_produccionProductoEstadistica = new JLabelMe();
		this.jLabelcosto_produccionProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_COSTOPRODUCCION+" : *");
		this.jLabelcosto_produccionProductoEstadistica.setToolTipText("Costo Produccion");
		this.jLabelcosto_produccionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcosto_produccionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcosto_produccionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_produccionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_produccionProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_produccionProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_COSTOPRODUCCION);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelcosto_produccionProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jTextFieldcosto_produccionProductoEstadistica= new JTextFieldMe();
		jTextFieldcosto_produccionProductoEstadistica.setEnabled(false);
		jTextFieldcosto_produccionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_produccionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_produccionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_produccionProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_produccionProductoEstadistica.setText("0.0");

		this.jButtoncosto_produccionProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtoncosto_produccionProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_produccionProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_produccionProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_produccionProductoEstadisticaBusqueda.setText("U");
		this.jButtoncosto_produccionProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_produccionProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_produccionProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_produccionProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_produccionProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_produccionProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_produccionProductoEstadisticaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoEstadistica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoEstadistica = new JLabelMe();
		this.jLabelid_empresaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoEstadistica.setToolTipText("Empresa");
		this.jLabelid_empresaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelid_empresaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jComboBoxid_empresaProductoEstadistica= new JComboBoxMe();
		jComboBoxid_empresaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoEstadistica.setEnabled(false);

		this.jButtonid_empresaProductoEstadistica= new JButtonMe();
		this.jButtonid_empresaProductoEstadistica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoEstadistica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoEstadistica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoEstadistica.setText("Buscar");
		this.jButtonid_empresaProductoEstadistica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoEstadistica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoEstadistica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoEstadistica"));

		this.jButtonid_empresaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoEstadisticaBusqueda.setText("U");
		this.jButtonid_empresaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoEstadisticaBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoEstadisticaUpdate= new JButtonMe();
		this.jButtonid_empresaProductoEstadisticaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoEstadisticaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoEstadisticaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoEstadisticaUpdate.setText("U");
		this.jButtonid_empresaProductoEstadisticaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoEstadisticaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoEstadisticaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoEstadisticaUpdate"));



					
		this.jLabelid_sucursalProductoEstadistica = new JLabelMe();
		this.jLabelid_sucursalProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoEstadistica.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelid_sucursalProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jComboBoxid_sucursalProductoEstadistica= new JComboBoxMe();
		jComboBoxid_sucursalProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoEstadistica.setEnabled(false);

		this.jButtonid_sucursalProductoEstadistica= new JButtonMe();
		this.jButtonid_sucursalProductoEstadistica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoEstadistica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoEstadistica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoEstadistica.setText("Buscar");
		this.jButtonid_sucursalProductoEstadistica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoEstadistica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoEstadistica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoEstadistica"));

		this.jButtonid_sucursalProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoEstadisticaBusqueda.setText("U");
		this.jButtonid_sucursalProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoEstadisticaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoEstadisticaUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoEstadisticaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoEstadisticaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoEstadisticaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoEstadisticaUpdate.setText("U");
		this.jButtonid_sucursalProductoEstadisticaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoEstadisticaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoEstadisticaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoEstadisticaUpdate"));



					
		this.jLabelid_bodegaProductoEstadistica = new JLabelMe();
		this.jLabelid_bodegaProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoEstadistica.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelid_bodegaProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jComboBoxid_bodegaProductoEstadistica= new JComboBoxMe();
		jComboBoxid_bodegaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoEstadistica= new JButtonMe();
		this.jButtonid_bodegaProductoEstadistica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoEstadistica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoEstadistica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoEstadistica.setText("Buscar");
		this.jButtonid_bodegaProductoEstadistica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoEstadistica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoEstadistica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoEstadistica"));

		this.jButtonid_bodegaProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoEstadisticaBusqueda.setText("U");
		this.jButtonid_bodegaProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoEstadisticaBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoEstadisticaUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoEstadisticaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoEstadisticaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoEstadisticaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoEstadisticaUpdate.setText("U");
		this.jButtonid_bodegaProductoEstadisticaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoEstadisticaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoEstadisticaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoEstadisticaUpdate"));



					
		this.jLabelid_productoProductoEstadistica = new JLabelMe();
		this.jLabelid_productoProductoEstadistica.setText(""+ProductoEstadisticaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoEstadistica.setToolTipText("Producto");
		this.jLabelid_productoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoEstadistica.setToolTipText(ProductoEstadisticaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoEstadistica = new GridBagLayout();
		this.jPanelid_productoProductoEstadistica.setLayout(this.gridaBagLayoutProductoEstadistica);


		jComboBoxid_productoProductoEstadistica= new JComboBoxMe();
		jComboBoxid_productoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoEstadistica= new JButtonMe();
		this.jButtonid_productoProductoEstadistica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoEstadistica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoEstadistica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoEstadistica.setText("Buscar");
		this.jButtonid_productoProductoEstadistica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoEstadistica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoEstadistica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoEstadistica"));

		this.jButtonid_productoProductoEstadisticaBusqueda= new JButtonMe();
		this.jButtonid_productoProductoEstadisticaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoEstadisticaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoEstadisticaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoEstadisticaBusqueda.setText("U");
		this.jButtonid_productoProductoEstadisticaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoEstadisticaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoEstadisticaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoEstadisticaBusqueda"));

		if(this.productoestadisticaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoEstadisticaBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoEstadisticaUpdate= new JButtonMe();
		this.jButtonid_productoProductoEstadisticaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoEstadisticaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoEstadisticaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoEstadisticaUpdate.setText("U");
		this.jButtonid_productoProductoEstadisticaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoEstadisticaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoEstadisticaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoEstadistica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoEstadistica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoEstadisticaUpdate"));



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
		//this.jInternalFrameDetalleProductoEstadistica = new ProductoEstadisticaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estadistica DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoEstadistica= new GridBagLayout();
		

		
		String sToolTipProductoEstadistica="";
		sToolTipProductoEstadistica=ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoEstadistica+="(Inventario.ProductoEstadistica)";
		}
		
		if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoEstadistica+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoEstadistica = new JButtonMe();
		this.jButtonModificarProductoEstadistica = new JButtonMe();
        this.jButtonActualizarProductoEstadistica = new JButtonMe();
        this.jButtonEliminarProductoEstadistica = new JButtonMe();
        this.jButtonCancelarProductoEstadistica = new JButtonMe();
        this.jButtonGuardarCambiosProductoEstadistica = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoEstadistica = new JButtonMe();
		this.jButtonCerrarProductoEstadistica = new JButtonMe();
		
		this.jScrollPanelDatosProductoEstadistica = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoEstadistica = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoEstadistica = new JScrollPane();
				
		
		
		this.jPanelCamposProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estadistica";
		
		if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadisticas" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoEstadistica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoEstadistica.setName("jPanelCamposProductoEstadistica"); 

		this.jPanelCamposOcultosProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoEstadistica.setName("jPanelCamposOcultosProductoEstadistica"); 

        this.jPanelAccionesProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoEstadistica.setToolTipText("Acciones");
        this.jPanelAccionesProductoEstadistica.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoEstadistica.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoEstadistica.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoEstadistica.setText("Nuevo");
		this.jButtonModificarProductoEstadistica.setText("Editar");
        this.jButtonActualizarProductoEstadistica.setText("Actualizar");
        this.jButtonEliminarProductoEstadistica.setText("Eliminar");
        this.jButtonCancelarProductoEstadistica.setText("Cancelar");
        this.jButtonGuardarCambiosProductoEstadistica.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoEstadistica.setText("Guardar");
		this.jButtonCerrarProductoEstadistica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoEstadistica,"nuevo_button","Nuevo",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoEstadistica,"modificar_button","Editar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoEstadistica,"actualizar_button","Actualizar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoEstadistica,"eliminar_button","Eliminar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoEstadistica,"cancelar_button","Cancelar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoEstadistica,"guardarcambios_button","Guardar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoEstadistica,"guardarcambiostabla_button","Guardar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoEstadistica,"cerrar_button","Salir",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoEstadistica.setToolTipText("Nuevo"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoEstadistica.setToolTipText("Editar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoEstadistica.setToolTipText("Actualizar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoEstadistica.setToolTipText("Eliminar)"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoEstadistica.setToolTipText("Cancelar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoEstadistica.setToolTipText("Guardar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoEstadistica.setToolTipText("Guardar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoEstadistica.setToolTipText("Salir"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoEstadistica";
		inputMap = this.jButtonNuevoProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoEstadistica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoEstadistica"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoEstadistica";
		inputMap = this.jButtonActualizarProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoEstadistica"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoEstadistica";
		inputMap = this.jButtonEliminarProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoEstadistica"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoEstadistica";
		inputMap = this.jButtonCancelarProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoEstadistica"));
		
		//CERRAR		
		sMapKey = "CerrarProductoEstadistica";
		inputMap = this.jButtonCerrarProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoEstadistica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoEstadistica";
		inputMap = this.jButtonGuardarCambiosTablaProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoEstadistica"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoEstadistica = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoEstadistica.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoEstadistica.setToolTipText("Nuevo ProductoEstadistica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoEstadistica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoEstadistica.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoEstadistica.setToolTipText("Sin Cerrar Ventana ProductoEstadistica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoEstadistica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoEstadistica.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoEstadistica.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoEstadistica.setText("Accion");
		this.jComboBoxTiposAccionesProductoEstadistica.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoEstadistica.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoEstadistica.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoEstadistica = new JLabelMe();
		
		this.jLabelAccionesProductoEstadistica.setText("Acciones");		
		this.jLabelAccionesProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoEstadistica();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoEstadistica();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoEstadistica=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoEstadistica,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoEstadistica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoEstadistica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoEstadistica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoEstadistica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoEstadistica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoEstadistica.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoEstadistica = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoEstadistica = new GridBagLayout();
		
		this.jPanelCamposProductoEstadistica.setLayout(gridaBagLayoutCamposProductoEstadistica);
		this.jPanelCamposOcultosProductoEstadistica.setLayout(gridaBagLayoutCamposOcultosProductoEstadistica);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoEstadistica.add(jLabelIdProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoEstadistica.add(jLabelidProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoEstadistica.add(jLabelid_empresaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoEstadistica.add(jButtonid_empresaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 3;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoEstadistica.add(jButtonid_empresaProductoEstadisticaUpdate, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoEstadistica.add(jComboBoxid_empresaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoEstadistica.add(jLabelid_sucursalProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoEstadistica.add(jButtonid_sucursalProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 3;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoEstadistica.add(jButtonid_sucursalProductoEstadisticaUpdate, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoEstadistica.add(jComboBoxid_sucursalProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoEstadistica.add(jLabelid_bodegaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoEstadistica.add(jButtonid_bodegaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 3;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoEstadistica.add(jButtonid_bodegaProductoEstadisticaUpdate, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoEstadistica.add(jComboBoxid_bodegaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoEstadistica.add(jLabelid_productoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 2;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoEstadistica.add(jButtonid_productoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 3;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoEstadistica.add(jButtonid_productoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 4;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoEstadistica.add(jButtonid_productoProductoEstadisticaUpdate, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoEstadistica.add(jComboBoxid_productoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_ultima_compraProductoEstadistica.add(jLabelprecio_ultima_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_ultima_compraProductoEstadistica.add(jButtonprecio_ultima_compraProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_ultima_compraProductoEstadistica.add(jTextFieldprecio_ultima_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_ultima_ventaProductoEstadistica.add(jLabelprecio_ultima_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_ultima_ventaProductoEstadistica.add(jButtonprecio_ultima_ventaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_ultima_ventaProductoEstadistica.add(jTextFieldprecio_ultima_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_ultima_cotizacionProductoEstadistica.add(jLabelprecio_ultima_cotizacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_ultima_cotizacionProductoEstadistica.add(jButtonprecio_ultima_cotizacionProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_ultima_cotizacionProductoEstadistica.add(jTextFieldprecio_ultima_cotizacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_ultima_proformaProductoEstadistica.add(jLabelprecio_ultima_proformaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_ultima_proformaProductoEstadistica.add(jButtonprecio_ultima_proformaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_ultima_proformaProductoEstadistica.add(jTextFieldprecio_ultima_proformaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleProductoEstadistica.add(jLabelcantidad_disponibleProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleProductoEstadistica.add(jButtoncantidad_disponibleProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleProductoEstadistica.add(jTextFieldcantidad_disponibleProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_reservadaProductoEstadistica.add(jLabelcantidad_reservadaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_reservadaProductoEstadistica.add(jButtoncantidad_reservadaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_reservadaProductoEstadistica.add(jTextFieldcantidad_reservadaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_demandaProductoEstadistica.add(jLabelcantidad_demandaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_demandaProductoEstadistica.add(jButtoncantidad_demandaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_demandaProductoEstadistica.add(jTextFieldcantidad_demandaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_maximoProductoEstadistica.add(jLabelcantidad_maximoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_maximoProductoEstadistica.add(jButtoncantidad_maximoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_maximoProductoEstadistica.add(jTextFieldcantidad_maximoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_minimoProductoEstadistica.add(jLabelcantidad_minimoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_minimoProductoEstadistica.add(jButtoncantidad_minimoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_minimoProductoEstadistica.add(jTextFieldcantidad_minimoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_fisicaProductoEstadistica.add(jLabelcantidad_fisicaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_fisicaProductoEstadistica.add(jButtoncantidad_fisicaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_fisicaProductoEstadistica.add(jTextFieldcantidad_fisicaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_orden_compraProductoEstadistica.add(jLabelcantidad_orden_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_orden_compraProductoEstadistica.add(jButtoncantidad_orden_compraProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_orden_compraProductoEstadistica.add(jTextFieldcantidad_orden_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pedidaProductoEstadistica.add(jLabelcantidad_pedidaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pedidaProductoEstadistica.add(jButtoncantidad_pedidaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pedidaProductoEstadistica.add(jTextFieldcantidad_pedidaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_requisicionProductoEstadistica.add(jLabelcantidad_requisicionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_requisicionProductoEstadistica.add(jButtoncantidad_requisicionProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_requisicionProductoEstadistica.add(jTextFieldcantidad_requisicionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_ingresoProductoEstadistica.add(jLabelfecha_ultima_ingresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_ingresoProductoEstadistica.add(jButtonfecha_ultima_ingresoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_ingresoProductoEstadistica.add(jDateChooserfecha_ultima_ingresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_egresoProductoEstadistica.add(jLabelfecha_ultima_egresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_egresoProductoEstadistica.add(jButtonfecha_ultima_egresoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_egresoProductoEstadistica.add(jDateChooserfecha_ultima_egresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_produccionProductoEstadistica.add(jLabelfecha_ultima_produccionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_produccionProductoEstadistica.add(jButtonfecha_ultima_produccionProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_produccionProductoEstadistica.add(jDateChooserfecha_ultima_produccionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_compraProductoEstadistica.add(jLabelfecha_ultima_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_compraProductoEstadistica.add(jButtonfecha_ultima_compraProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_compraProductoEstadistica.add(jDateChooserfecha_ultima_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_ventaProductoEstadistica.add(jLabelfecha_ultima_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_ventaProductoEstadistica.add(jButtonfecha_ultima_ventaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_ventaProductoEstadistica.add(jDateChooserfecha_ultima_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_devolucionProductoEstadistica.add(jLabelfecha_ultima_devolucionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_devolucionProductoEstadistica.add(jButtonfecha_ultima_devolucionProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_devolucionProductoEstadistica.add(jDateChooserfecha_ultima_devolucionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_orden_compraProductoEstadistica.add(jLabelfecha_ultima_orden_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_orden_compraProductoEstadistica.add(jButtonfecha_ultima_orden_compraProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_orden_compraProductoEstadistica.add(jDateChooserfecha_ultima_orden_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_pedidoProductoEstadistica.add(jLabelfecha_ultima_pedidoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_pedidoProductoEstadistica.add(jButtonfecha_ultima_pedidoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_pedidoProductoEstadistica.add(jDateChooserfecha_ultima_pedidoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_requisicionProductoEstadistica.add(jLabelfecha_ultima_requisicionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_requisicionProductoEstadistica.add(jButtonfecha_ultima_requisicionProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_requisicionProductoEstadistica.add(jDateChooserfecha_ultima_requisicionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ingresoProductoEstadistica.add(jLabeltotal_ingresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ingresoProductoEstadistica.add(jButtontotal_ingresoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ingresoProductoEstadistica.add(jTextFieldtotal_ingresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_egresoProductoEstadistica.add(jLabeltotal_egresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_egresoProductoEstadistica.add(jButtontotal_egresoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_egresoProductoEstadistica.add(jTextFieldtotal_egresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_compraProductoEstadistica.add(jLabeltotal_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_compraProductoEstadistica.add(jButtontotal_compraProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_compraProductoEstadistica.add(jTextFieldtotal_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ventaProductoEstadistica.add(jLabeltotal_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ventaProductoEstadistica.add(jButtontotal_ventaProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ventaProductoEstadistica.add(jTextFieldtotal_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_producidoProductoEstadistica.add(jLabeltotal_producidoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_producidoProductoEstadistica.add(jButtontotal_producidoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_producidoProductoEstadistica.add(jTextFieldtotal_producidoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_devueltoProductoEstadistica.add(jLabeltotal_devueltoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_devueltoProductoEstadistica.add(jButtontotal_devueltoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_devueltoProductoEstadistica.add(jTextFieldtotal_devueltoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_ultimoProductoEstadistica.add(jLabelcosto_ultimoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_ultimoProductoEstadistica.add(jButtoncosto_ultimoProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_ultimoProductoEstadistica.add(jTextFieldcosto_ultimoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoEstadistica.add(jLabelcosto_totalProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoEstadistica.add(jButtoncosto_totalProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoEstadistica.add(jTextFieldcosto_totalProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 0;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_produccionProductoEstadistica.add(jLabelcosto_produccionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 2;
		this.gridBagConstraintsProductoEstadistica.ipadx = 0;
		this.gridBagConstraintsProductoEstadistica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_produccionProductoEstadistica.add(jButtoncosto_produccionProductoEstadisticaBusqueda, this.gridBagConstraintsProductoEstadistica);
	}

	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEstadistica.gridy = 0;
	this.gridBagConstraintsProductoEstadistica.gridx = 1;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_produccionProductoEstadistica.add(jTextFieldcosto_produccionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelidProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelid_bodegaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelid_productoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelprecio_ultima_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelprecio_ultima_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelprecio_ultima_cotizacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelprecio_ultima_proformaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_disponibleProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_reservadaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_demandaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_maximoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_minimoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_fisicaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_orden_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_pedidaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcantidad_requisicionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_ingresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_egresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_produccionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_devolucionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_orden_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_pedidoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelfecha_ultima_requisicionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPaneltotal_ingresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPaneltotal_egresoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPaneltotal_compraProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPaneltotal_ventaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPaneltotal_producidoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPaneltotal_devueltoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcosto_ultimoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcosto_totalProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEstadistica.add(this.jPanelcosto_produccionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposProductoEstadistica % 2==0) {
		iXPanelCamposProductoEstadistica=0;
		iYPanelCamposProductoEstadistica++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposOcultosProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposOcultosProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoEstadistica.add(this.jPanelid_empresaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposOcultosProductoEstadistica % 2==0) {
		iXPanelCamposOcultosProductoEstadistica=0;
		iYPanelCamposOcultosProductoEstadistica++;
	}
	this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEstadistica.gridy = iYPanelCamposOcultosProductoEstadistica;
	this.gridBagConstraintsProductoEstadistica.gridx = iXPanelCamposOcultosProductoEstadistica++;
	this.gridBagConstraintsProductoEstadistica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEstadistica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoEstadistica.add(this.jPanelid_sucursalProductoEstadistica, this.gridBagConstraintsProductoEstadistica);



	if(iXPanelCamposOcultosProductoEstadistica % 2==0) {
		iXPanelCamposOcultosProductoEstadistica=0;
		iYPanelCamposOcultosProductoEstadistica++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoEstadistica= new GridBagLayout();
		this.jPanelAccionesProductoEstadistica.setLayout(gridaBagLayoutAccionesProductoEstadistica);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoEstadistica= new GridBagLayout();
		this.jPanelAccionesFormularioProductoEstadistica.setLayout(gridaBagLayoutAccionesFormularioProductoEstadistica);
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoEstadistica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoEstadistica.add(this.jComboBoxTiposAccionesFormularioProductoEstadistica, this.gridBagConstraintsProductoEstadistica);

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoEstadistica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoEstadistica.add(this.jCheckBoxPostAccionNuevoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoestadisticaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoEstadistica.add(this.jCheckBoxPostAccionSinCerrarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoestadisticaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoEstadistica.add(this.jCheckBoxPostAccionSinMensajeProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoEstadistica.add(this.jButtonModificarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);							

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoEstadistica.add(this.jButtonEliminarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
			
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = 0;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoEstadistica.add(this.jButtonActualizarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = 0;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoEstadistica.add(this.jButtonGuardarCambiosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);	
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = 0;		
		this.gridBagConstraintsProductoEstadistica.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoEstadistica.add(this.jButtonCancelarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoEstadistica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoEstadistica);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();						
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoEstadistica.gridx = 0;		
			//this.gridBagConstraintsProductoEstadistica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoEstadistica.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoEstadistica.gridx =0;
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoEstadistica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoEstadisticaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoEstadistica = new ProductoEstadisticaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estadistica DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estadistica DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estadistica Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoEstadisticaModel productoestadisticaModel=new ProductoEstadisticaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoEstadisticaModel.ProductoEstadisticaFocusTraversalPolicy productoestadisticaFocusTraversalPolicy = productoestadisticaModel.new ProductoEstadisticaFocusTraversalPolicy(this);
			
			//productoestadisticaFocusTraversalPolicy.setproductoestadisticaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoestadisticaModel);
			
			
			this.jContentPaneDetalleProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoEstadistica = new GridBagLayout();	
			this.jContentPaneDetalleProductoEstadistica.setLayout(gridaBagLayoutDetalleProductoEstadistica);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoEstadistica = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
				this.gridBagConstraintsProductoEstadistica.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoEstadistica.gridx = 0;
					
				
				this.jContentPaneDetalleProductoEstadistica.add(jTtoolBarDetalleProductoEstadistica, gridBagConstraintsProductoEstadistica);								
				
}
			
			this.jScrollPanelDatosEdicionProductoEstadistica=   new JScrollPane(jContentPaneDetalleProductoEstadistica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoEstadistica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoEstadistica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoEstadistica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoEstadistica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoEstadistica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoEstadistica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoEstadistica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoEstadistica.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoEstadistica.gridx = 0;
	        
			this.jContentPaneDetalleProductoEstadistica.add(jPanelCamposProductoEstadistica, gridBagConstraintsProductoEstadistica);
			
			
			
			
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
						&& productoestadisticaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoestadisticaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoEstadistica= new GridBagConstraints();
						this.gridBagConstraintsProductoEstadistica.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoEstadistica.gridx = 0;
						this.jContentPaneDetalleProductoEstadistica.add(this.jTabbedPaneRelacionesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoEstadistica.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoEstadistica.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
					this.gridBagConstraintsProductoEstadistica.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoEstadistica.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoEstadistica.gridx = 0;
					
				
					this.jContentPaneDetalleProductoEstadistica.add(jPanelCamposOcultosProductoEstadistica, gridBagConstraintsProductoEstadistica);
				
					this.jPanelCamposOcultosProductoEstadistica.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoEstadistica.gridx = 0;
	        this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoEstadistica.add(this.jPanelAccionesFormularioProductoEstadistica, this.gridBagConstraintsProductoEstadistica);							
			
			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
	        this.gridBagConstraintsProductoEstadistica.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoEstadistica.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoEstadistica.add(this.jPanelAccionesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoEstadistica);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoEstadistica=   new JScrollPane(this.jPanelCamposProductoEstadistica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoEstadistica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoEstadistica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoEstadistica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoEstadistica.gridx = 0;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoEstadistica.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoEstadistica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoEstadistica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			
			
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
			
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoEstadistica;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoEstadistica;
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
