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
import com.bydan.erp.inventario.util.report.PedidosComprasConstantesFunciones;

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
public class PedidosComprasDetalleFormJInternalFrame extends PedidosComprasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedidosCompras;
	
	protected JMenuBar jmenuBarDetallePedidosCompras;
	
	protected JMenu jmenuDetallePedidosCompras;
	protected JMenu jmenuDetalleArchivoPedidosCompras;
	protected JMenu jmenuDetalleAccionesPedidosCompras;
	protected JMenu jmenuDetalleDatosPedidosCompras;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidosCompras;	
	protected GridBagConstraints gridBagConstraintsPedidosCompras;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidosComprasBeanSwingJInternalFrameAdditional jInternalFrameDetallePedidosCompras;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

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
	
	public PedidosComprasSessionBean pedidoscomprasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;	
	
	public PedidosComprasLogic pedidoscomprasLogic;
	
	public JScrollPane jScrollPanelDatosPedidosCompras;
	public JScrollPane jScrollPanelDatosEdicionPedidosCompras;
	public JScrollPane jScrollPanelDatosGeneralPedidosCompras;
	
	protected JPanel jPanelCamposPedidosCompras;    
	protected JPanel jPanelCamposOcultosPedidosCompras;    	
	protected JPanel jPanelAccionesPedidosCompras;
	protected JPanel jPanelAccionesFormularioPedidosCompras;
    
	
	
	protected Integer iXPanelCamposPedidosCompras=0;
	protected Integer iYPanelCamposPedidosCompras=0;
	
	protected Integer iXPanelCamposOcultosPedidosCompras=0;
	protected Integer iYPanelCamposOcultosPedidosCompras=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedidosCompras;
	public JButton jButtonModificarPedidosCompras;
	public JButton jButtonActualizarPedidosCompras;
    public JButton jButtonEliminarPedidosCompras;
	public JButton jButtonCancelarPedidosCompras;
    public JButton jButtonGuardarCambiosPedidosCompras;
	public JButton jButtonGuardarCambiosTablaPedidosCompras;
	protected JButton jButtonCerrarPedidosCompras;
	
	
	protected JButton jButtonProcesarInformacionPedidosCompras;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedidosCompras;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedidosCompras;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedidosCompras;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidosCompras;
	protected JButton jButtonModificarToolBarPedidosCompras;
	protected JButton jButtonActualizarToolBarPedidosCompras;
    protected JButton jButtonEliminarToolBarPedidosCompras;
	protected JButton jButtonCancelarToolBarPedidosCompras;
    protected JButton jButtonGuardarCambiosToolBarPedidosCompras;
	protected JButton jButtonGuardarCambiosTablaToolBarPedidosCompras;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidosCompras;
	protected JButton jButtonCerrarToolBarPedidosCompras;
	
	protected JButton jButtonProcesarInformacionToolBarPedidosCompras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidosCompras;
	protected JMenuItem jMenuItemModificarPedidosCompras;
	protected JMenuItem jMenuItemActualizarPedidosCompras;
    protected JMenuItem jMenuItemEliminarPedidosCompras;
	protected JMenuItem jMenuItemCancelarPedidosCompras;
    protected JMenuItem jMenuItemGuardarCambiosPedidosCompras;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidosCompras;
	protected JMenuItem jMenuItemCerrarPedidosCompras;
	protected JMenuItem jMenuItemDetalleCerrarPedidosCompras;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidosCompras;
	
	protected JMenuItem jMenuItemProcesarInformacionPedidosCompras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidosCompras;
	protected JMenuItem jMenuItemMostrarOcultarPedidosCompras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidosCompras;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidosCompras;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedidosCompras;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedidosCompras;
	public JLabel jLabelIdPedidosCompras;
	public JLabel jLabelidPedidosCompras;
	public JButton jButtonidPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdePedidosCompras;
	public JLabel jLabelfecha_emision_desdePedidosCompras;
	//public JFormattedTextField jDateChooserfecha_emision_desdePedidosCompras;

	public JDateChooser jDateChooserfecha_emision_desdePedidosCompras;
	public JButton jButtonfecha_emision_desdePedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaPedidosCompras;
	public JLabel jLabelfecha_emision_hastaPedidosCompras;
	//public JFormattedTextField jDateChooserfecha_emision_hastaPedidosCompras;

	public JDateChooser jDateChooserfecha_emision_hastaPedidosCompras;
	public JButton jButtonfecha_emision_hastaPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialPedidosCompras;
	public JLabel jLabelsecuencialPedidosCompras;
	public JTextField jTextFieldsecuencialPedidosCompras;
	public JButton jButtonsecuencialPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPedidosCompras;
	public JLabel jLabelfecha_emisionPedidosCompras;
	//public JFormattedTextField jDateChooserfecha_emisionPedidosCompras;

	public JDateChooser jDateChooserfecha_emisionPedidosCompras;
	public JButton jButtonfecha_emisionPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaPedidosCompras;
	public JLabel jLabelfecha_entregaPedidosCompras;
	//public JFormattedTextField jDateChooserfecha_entregaPedidosCompras;

	public JDateChooser jDateChooserfecha_entregaPedidosCompras;
	public JButton jButtonfecha_entregaPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoPedidosCompras;
	public JLabel jLabelnombre_productoPedidosCompras;
	public JTextArea jTextAreanombre_productoPedidosCompras;
	public JScrollPane jscrollPanenombre_productoPedidosCompras;
	public JButton jButtonnombre_productoPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadPedidosCompras;
	public JLabel jLabelnombre_unidadPedidosCompras;
	public JTextField jTextFieldnombre_unidadPedidosCompras;
	public JButton jButtonnombre_unidadPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pedidoPedidosCompras;
	public JLabel jLabelcantidad_pedidoPedidosCompras;
	public JTextField jTextFieldcantidad_pedidoPedidosCompras;
	public JButton jButtoncantidad_pedidoPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_entregadaPedidosCompras;
	public JLabel jLabelcantidad_entregadaPedidosCompras;
	public JTextField jTextFieldcantidad_entregadaPedidosCompras;
	public JButton jButtoncantidad_entregadaPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pendientePedidosCompras;
	public JLabel jLabelcantidad_pendientePedidosCompras;
	public JTextField jTextFieldcantidad_pendientePedidosCompras;
	public JButton jButtoncantidad_pendientePedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoPedidosCompras;
	public JLabel jLabelcodigo_productoPedidosCompras;
	public JTextField jTextFieldcodigo_productoPedidosCompras;
	public JButton jButtoncodigo_productoPedidosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedidosCompras;
	public JLabel jLabelid_empresaPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedidosCompras;
	public JButton jButtonid_empresaPedidosCompras= new JButtonMe();
	public JButton jButtonid_empresaPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPedidosCompras;
	public JLabel jLabelid_sucursalPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPedidosCompras;
	public JButton jButtonid_sucursalPedidosCompras= new JButtonMe();
	public JButton jButtonid_sucursalPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_productoPedidosCompras;
	public JLabel jLabelid_productoPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoPedidosCompras;
	public JButton jButtonid_productoPedidosCompras= new JButtonMe();
	public JButton jButtonid_productoPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_productoPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaPedidosCompras;
	public JLabel jLabelid_lineaPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaPedidosCompras;
	public JButton jButtonid_lineaPedidosCompras= new JButtonMe();
	public JButton jButtonid_lineaPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_lineaPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoPedidosCompras;
	public JLabel jLabelid_linea_grupoPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoPedidosCompras;
	public JButton jButtonid_linea_grupoPedidosCompras= new JButtonMe();
	public JButton jButtonid_linea_grupoPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaPedidosCompras;
	public JLabel jLabelid_linea_categoriaPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaPedidosCompras;
	public JButton jButtonid_linea_categoriaPedidosCompras= new JButtonMe();
	public JButton jButtonid_linea_categoriaPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaPedidosCompras;
	public JLabel jLabelid_linea_marcaPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaPedidosCompras;
	public JButton jButtonid_linea_marcaPedidosCompras= new JButtonMe();
	public JButton jButtonid_linea_marcaPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaPedidosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicioPedidosCompras;
	public JLabel jLabelid_tipo_producto_servicioPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioPedidosCompras;
	public JButton jButtonid_tipo_producto_servicioPedidosCompras= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioPedidosComprasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedidosCompras;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidosComprasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedidosCompras=new JPanel();
				this.jPanelAccionesFormularioPedidosCompras=new JPanel();
				this.jmenuBarDetallePedidosCompras=new JMenuBar();
				this.jTtoolBarDetallePedidosCompras=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosComprasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidosComprasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosComprasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosComprasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosComprasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPedidosCompras() {
		return this.jButtonActualizarToolBarPedidosCompras;
	}
	
	public JButton getjButtonEliminarToolBarPedidosCompras() {
		return this.jButtonEliminarToolBarPedidosCompras;
	}
	
	public JButton getjButtonCancelarToolBarPedidosCompras() {
		return this.jButtonCancelarToolBarPedidosCompras;
	}		
	
	public JButton getjButtonProcesarInformacionPedidosCompras() {
		return this.jButtonProcesarInformacionPedidosCompras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidosCompras)	{
		this.jButtonProcesarInformacionPedidosCompras = jButtonProcesarInformacionPedidosCompras;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidosCompras() {
		return this.jComboBoxTiposAccionesPedidosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidosCompras(
			JComboBox jComboBoxTiposRelacionesPedidosCompras) {
		this.jComboBoxTiposRelacionesPedidosCompras = jComboBoxTiposRelacionesPedidosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidosCompras(
			JComboBox jComboBoxTiposAccionesPedidosCompras) {
		this.jComboBoxTiposAccionesPedidosCompras = jComboBoxTiposAccionesPedidosCompras;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedidosCompras() {
		return this.jComboBoxTiposAccionesFormularioPedidosCompras;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedidosCompras(
			JComboBox jComboBoxTiposAccionesFormularioPedidosCompras) {
		this.jComboBoxTiposAccionesFormularioPedidosCompras = jComboBoxTiposAccionesFormularioPedidosCompras;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
		
		this.pedidoscomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoscomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidoscomprasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidosComprasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidosComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidosComprasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedidos Compras MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidosComprasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidosCompras= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedidosCompras=new JButtonMe();
				this.jButtonModificarToolBarPedidosCompras=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedidosCompras,this.jTtoolBarDetallePedidosCompras,
							"actualizar","actualizar","Actualizar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedidosCompras,this.jTtoolBarDetallePedidosCompras,
							"eliminar","eliminar","Eliminar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedidosCompras,this.jTtoolBarDetallePedidosCompras,
							"cancelar","cancelar","Cancelar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedidosCompras,this.jTtoolBarDetallePedidosCompras,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedidosCompras=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedidosCompras=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedidosCompras=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedidosCompras=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedidosCompras=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidosCompras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidosCompras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidosCompras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedidosCompras= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedidosCompras.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedidosCompras,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedidosCompras= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedidosCompras.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedidosCompras,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedidosCompras= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedidosCompras.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedidosCompras,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedidosCompras= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedidosCompras.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedidosCompras,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedidosCompras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidosCompras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidosCompras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidosCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidosCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidosCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedidosCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedidosCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedidosCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidosCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidosCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidosCompras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidosCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidosCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidosCompras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedidosCompras.add(this.jMenuItemDetalleCerrarPedidosCompras);
		
		this.jmenuDetalleAccionesPedidosCompras.add(this.jMenuItemActualizarPedidosCompras);
		this.jmenuDetalleAccionesPedidosCompras.add(this.jMenuItemEliminarPedidosCompras);
		this.jmenuDetalleAccionesPedidosCompras.add(this.jMenuItemCancelarPedidosCompras);		
		
		//this.jmenuDetalleDatosPedidosCompras.add(this.jMenuItemDetalleAbrirOrderByPedidosCompras);				
		this.jmenuDetalleDatosPedidosCompras.add(this.jMenuItemDetalleMostarOcultarPedidosCompras);				
				
		//this.jmenuDetalleAccionesPedidosCompras.add(this.jMenuItemGuardarCambiosPedidosCompras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedidosCompras.add(this.jmenuDetalleArchivoPedidosCompras);		
		this.jmenuBarDetallePedidosCompras.add(this.jmenuDetalleAccionesPedidosCompras);		
		this.jmenuBarDetallePedidosCompras.add(this.jmenuDetalleDatosPedidosCompras);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePedidosCompras);				
	}
	
	
	public void inicializarElementosCamposPedidosCompras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedidosCompras = new JLabelMe();
		jLabelIdPedidosCompras.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedidosCompras = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedidosCompras= new GridBagLayout();

		this.jPanelidPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);

		jLabelidPedidosCompras = new JLabel();
		jLabelidPedidosCompras.setText("Id");

		jLabelidPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdePedidosCompras = new JLabelMe();
		this.jLabelfecha_emision_desdePedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdePedidosCompras.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdePedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdePedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdePedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdePedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdePedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdePedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelfecha_emision_desdePedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		//jFormattedTextFieldfecha_emision_desdePedidosCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdePedidosCompras= new JDateChooser();
		jDateChooserfecha_emision_desdePedidosCompras.setEnabled(false);
		jDateChooserfecha_emision_desdePedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdePedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdePedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdePedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdePedidosCompras.setDate(new Date());
		jDateChooserfecha_emision_desdePedidosCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdePedidosCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdePedidosComprasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdePedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdePedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdePedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdePedidosComprasBusqueda.setText("U");
		this.jButtonfecha_emision_desdePedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdePedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdePedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdePedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdePedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdePedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdePedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaPedidosCompras = new JLabelMe();
		this.jLabelfecha_emision_hastaPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaPedidosCompras.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelfecha_emision_hastaPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		//jFormattedTextFieldfecha_emision_hastaPedidosCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaPedidosCompras= new JDateChooser();
		jDateChooserfecha_emision_hastaPedidosCompras.setEnabled(false);
		jDateChooserfecha_emision_hastaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaPedidosCompras.setDate(new Date());
		jDateChooserfecha_emision_hastaPedidosCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaPedidosCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaPedidosComprasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaPedidosComprasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaPedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialPedidosCompras = new JLabelMe();
		this.jLabelsecuencialPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialPedidosCompras.setToolTipText("Secuencial");
		this.jLabelsecuencialPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelsecuencialPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jTextFieldsecuencialPedidosCompras= new JTextFieldMe();

		jTextFieldsecuencialPedidosCompras.setEnabled(false);
		jTextFieldsecuencialPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialPedidosComprasBusqueda= new JButtonMe();
		this.jButtonsecuencialPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialPedidosComprasBusqueda.setText("U");
		this.jButtonsecuencialPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialPedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPedidosCompras = new JLabelMe();
		this.jLabelfecha_emisionPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPedidosCompras.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelfecha_emisionPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		//jFormattedTextFieldfecha_emisionPedidosCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPedidosCompras= new JDateChooser();
		jDateChooserfecha_emisionPedidosCompras.setEnabled(false);
		jDateChooserfecha_emisionPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPedidosCompras.setDate(new Date());
		jDateChooserfecha_emisionPedidosCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPedidosCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPedidosComprasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPedidosComprasBusqueda.setText("U");
		this.jButtonfecha_emisionPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaPedidosCompras = new JLabelMe();
		this.jLabelfecha_entregaPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaPedidosCompras.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelfecha_entregaPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		//jFormattedTextFieldfecha_entregaPedidosCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaPedidosCompras= new JDateChooser();
		jDateChooserfecha_entregaPedidosCompras.setEnabled(false);
		jDateChooserfecha_entregaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaPedidosCompras.setDate(new Date());
		jDateChooserfecha_entregaPedidosCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaPedidosCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaPedidosComprasBusqueda= new JButtonMe();
		this.jButtonfecha_entregaPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaPedidosComprasBusqueda.setText("U");
		this.jButtonfecha_entregaPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaPedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoPedidosCompras = new JLabelMe();
		this.jLabelnombre_productoPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoPedidosCompras.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelnombre_productoPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jTextAreanombre_productoPedidosCompras= new JTextAreaMe();
		jTextAreanombre_productoPedidosCompras.setEnabled(false);
		jTextAreanombre_productoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoPedidosCompras.setLineWrap(true);
		jTextAreanombre_productoPedidosCompras.setWrapStyleWord(true);
		jTextAreanombre_productoPedidosCompras.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoPedidosCompras.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoPedidosCompras = new JScrollPane(jTextAreanombre_productoPedidosCompras);
		jscrollPanenombre_productoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoPedidosComprasBusqueda= new JButtonMe();
		this.jButtonnombre_productoPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoPedidosComprasBusqueda.setText("U");
		this.jButtonnombre_productoPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoPedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadPedidosCompras = new JLabelMe();
		this.jLabelnombre_unidadPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadPedidosCompras.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelnombre_unidadPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jTextFieldnombre_unidadPedidosCompras= new JTextFieldMe();

		jTextFieldnombre_unidadPedidosCompras.setEnabled(false);
		jTextFieldnombre_unidadPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadPedidosComprasBusqueda= new JButtonMe();
		this.jButtonnombre_unidadPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadPedidosComprasBusqueda.setText("U");
		this.jButtonnombre_unidadPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadPedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pedidoPedidosCompras = new JLabelMe();
		this.jLabelcantidad_pedidoPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO+" : *");
		this.jLabelcantidad_pedidoPedidosCompras.setToolTipText("Cantad Pedo");
		this.jLabelcantidad_pedidoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_pedidoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_pedidoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pedidoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pedidoPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pedidoPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelcantidad_pedidoPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jTextFieldcantidad_pedidoPedidosCompras= new JTextFieldMe();
		jTextFieldcantidad_pedidoPedidosCompras.setEnabled(false);
		jTextFieldcantidad_pedidoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pedidoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pedidoPedidosCompras.setText("0");

		this.jButtoncantidad_pedidoPedidosComprasBusqueda= new JButtonMe();
		this.jButtoncantidad_pedidoPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidoPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidoPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pedidoPedidosComprasBusqueda.setText("U");
		this.jButtoncantidad_pedidoPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pedidoPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pedidoPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pedidoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pedidoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pedidoPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pedidoPedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_entregadaPedidosCompras = new JLabelMe();
		this.jLabelcantidad_entregadaPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA+" : *");
		this.jLabelcantidad_entregadaPedidosCompras.setToolTipText("Cantad Entregada");
		this.jLabelcantidad_entregadaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_entregadaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_entregadaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_entregadaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_entregadaPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_entregadaPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelcantidad_entregadaPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jTextFieldcantidad_entregadaPedidosCompras= new JTextFieldMe();
		jTextFieldcantidad_entregadaPedidosCompras.setEnabled(false);
		jTextFieldcantidad_entregadaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_entregadaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_entregadaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_entregadaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_entregadaPedidosCompras.setText("0");

		this.jButtoncantidad_entregadaPedidosComprasBusqueda= new JButtonMe();
		this.jButtoncantidad_entregadaPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_entregadaPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_entregadaPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_entregadaPedidosComprasBusqueda.setText("U");
		this.jButtoncantidad_entregadaPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_entregadaPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_entregadaPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_entregadaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_entregadaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_entregadaPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_entregadaPedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pendientePedidosCompras = new JLabelMe();
		this.jLabelcantidad_pendientePedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE+" : *");
		this.jLabelcantidad_pendientePedidosCompras.setToolTipText("Cantad Pendiente");
		this.jLabelcantidad_pendientePedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendientePedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendientePedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pendientePedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pendientePedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pendientePedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelcantidad_pendientePedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jTextFieldcantidad_pendientePedidosCompras= new JTextFieldMe();
		jTextFieldcantidad_pendientePedidosCompras.setEnabled(false);
		jTextFieldcantidad_pendientePedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendientePedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendientePedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pendientePedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pendientePedidosCompras.setText("0");

		this.jButtoncantidad_pendientePedidosComprasBusqueda= new JButtonMe();
		this.jButtoncantidad_pendientePedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendientePedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendientePedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pendientePedidosComprasBusqueda.setText("U");
		this.jButtoncantidad_pendientePedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pendientePedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pendientePedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pendientePedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pendientePedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pendientePedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pendientePedidosComprasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoPedidosCompras = new JLabelMe();
		this.jLabelcodigo_productoPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoPedidosCompras.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelcodigo_productoPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jTextFieldcodigo_productoPedidosCompras= new JTextFieldMe();

		jTextFieldcodigo_productoPedidosCompras.setEnabled(false);
		jTextFieldcodigo_productoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoPedidosComprasBusqueda= new JButtonMe();
		this.jButtoncodigo_productoPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoPedidosComprasBusqueda.setText("U");
		this.jButtoncodigo_productoPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoPedidosComprasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedidosCompras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedidosCompras = new JLabelMe();
		this.jLabelid_empresaPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedidosCompras.setToolTipText("Empresa");
		this.jLabelid_empresaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelid_empresaPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jComboBoxid_empresaPedidosCompras= new JComboBoxMe();
		jComboBoxid_empresaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedidosCompras.setEnabled(false);

		this.jButtonid_empresaPedidosCompras= new JButtonMe();
		this.jButtonid_empresaPedidosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidosCompras.setText("Buscar");
		this.jButtonid_empresaPedidosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedidosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidosCompras"));

		this.jButtonid_empresaPedidosComprasBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidosComprasBusqueda.setText("U");
		this.jButtonid_empresaPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidosComprasBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidosComprasUpdate= new JButtonMe();
		this.jButtonid_empresaPedidosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidosComprasUpdate.setText("U");
		this.jButtonid_empresaPedidosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidosComprasUpdate"));



					
		this.jLabelid_sucursalPedidosCompras = new JLabelMe();
		this.jLabelid_sucursalPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPedidosCompras.setToolTipText("Sucursal");
		this.jLabelid_sucursalPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelid_sucursalPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jComboBoxid_sucursalPedidosCompras= new JComboBoxMe();
		jComboBoxid_sucursalPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPedidosCompras.setEnabled(false);

		this.jButtonid_sucursalPedidosCompras= new JButtonMe();
		this.jButtonid_sucursalPedidosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidosCompras.setText("Buscar");
		this.jButtonid_sucursalPedidosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPedidosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidosCompras"));

		this.jButtonid_sucursalPedidosComprasBusqueda= new JButtonMe();
		this.jButtonid_sucursalPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidosComprasBusqueda.setText("U");
		this.jButtonid_sucursalPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPedidosComprasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPedidosComprasUpdate= new JButtonMe();
		this.jButtonid_sucursalPedidosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidosComprasUpdate.setText("U");
		this.jButtonid_sucursalPedidosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPedidosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidosComprasUpdate"));



					
		this.jLabelid_productoPedidosCompras = new JLabelMe();
		this.jLabelid_productoPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoPedidosCompras.setToolTipText("Producto");
		this.jLabelid_productoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelid_productoPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jComboBoxid_productoPedidosCompras= new JComboBoxMe();
		jComboBoxid_productoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoPedidosCompras= new JButtonMe();
		this.jButtonid_productoPedidosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPedidosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPedidosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPedidosCompras.setText("Buscar");
		this.jButtonid_productoPedidosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoPedidosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPedidosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPedidosCompras"));

		this.jButtonid_productoPedidosComprasBusqueda= new JButtonMe();
		this.jButtonid_productoPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPedidosComprasBusqueda.setText("U");
		this.jButtonid_productoPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoPedidosComprasBusqueda.setVisible(false);		}

		this.jButtonid_productoPedidosComprasUpdate= new JButtonMe();
		this.jButtonid_productoPedidosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPedidosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPedidosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPedidosComprasUpdate.setText("U");
		this.jButtonid_productoPedidosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoPedidosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPedidosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPedidosComprasUpdate"));



					
		this.jLabelid_lineaPedidosCompras = new JLabelMe();
		this.jLabelid_lineaPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaPedidosCompras.setToolTipText("Linea");
		this.jLabelid_lineaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelid_lineaPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jComboBoxid_lineaPedidosCompras= new JComboBoxMe();
		jComboBoxid_lineaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaPedidosCompras= new JButtonMe();
		this.jButtonid_lineaPedidosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPedidosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPedidosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPedidosCompras.setText("Buscar");
		this.jButtonid_lineaPedidosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaPedidosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPedidosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPedidosCompras"));

		this.jButtonid_lineaPedidosComprasBusqueda= new JButtonMe();
		this.jButtonid_lineaPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPedidosComprasBusqueda.setText("U");
		this.jButtonid_lineaPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaPedidosComprasBusqueda.setVisible(false);		}

		this.jButtonid_lineaPedidosComprasUpdate= new JButtonMe();
		this.jButtonid_lineaPedidosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPedidosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPedidosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPedidosComprasUpdate.setText("U");
		this.jButtonid_lineaPedidosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaPedidosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPedidosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPedidosComprasUpdate"));



					
		this.jLabelid_linea_grupoPedidosCompras = new JLabelMe();
		this.jLabelid_linea_grupoPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoPedidosCompras.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelid_linea_grupoPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jComboBoxid_linea_grupoPedidosCompras= new JComboBoxMe();
		jComboBoxid_linea_grupoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoPedidosCompras= new JButtonMe();
		this.jButtonid_linea_grupoPedidosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPedidosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPedidosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPedidosCompras.setText("Buscar");
		this.jButtonid_linea_grupoPedidosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoPedidosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPedidosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPedidosCompras"));

		this.jButtonid_linea_grupoPedidosComprasBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoPedidosComprasBusqueda.setText("U");
		this.jButtonid_linea_grupoPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoPedidosComprasBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoPedidosComprasUpdate= new JButtonMe();
		this.jButtonid_linea_grupoPedidosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPedidosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPedidosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoPedidosComprasUpdate.setText("U");
		this.jButtonid_linea_grupoPedidosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoPedidosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPedidosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPedidosComprasUpdate"));



					
		this.jLabelid_linea_categoriaPedidosCompras = new JLabelMe();
		this.jLabelid_linea_categoriaPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaPedidosCompras.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelid_linea_categoriaPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jComboBoxid_linea_categoriaPedidosCompras= new JComboBoxMe();
		jComboBoxid_linea_categoriaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaPedidosCompras= new JButtonMe();
		this.jButtonid_linea_categoriaPedidosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPedidosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPedidosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPedidosCompras.setText("Buscar");
		this.jButtonid_linea_categoriaPedidosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaPedidosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPedidosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPedidosCompras"));

		this.jButtonid_linea_categoriaPedidosComprasBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaPedidosComprasBusqueda.setText("U");
		this.jButtonid_linea_categoriaPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaPedidosComprasBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaPedidosComprasUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaPedidosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPedidosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPedidosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaPedidosComprasUpdate.setText("U");
		this.jButtonid_linea_categoriaPedidosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaPedidosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPedidosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPedidosComprasUpdate"));



					
		this.jLabelid_linea_marcaPedidosCompras = new JLabelMe();
		this.jLabelid_linea_marcaPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaPedidosCompras.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelid_linea_marcaPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jComboBoxid_linea_marcaPedidosCompras= new JComboBoxMe();
		jComboBoxid_linea_marcaPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaPedidosCompras= new JButtonMe();
		this.jButtonid_linea_marcaPedidosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPedidosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPedidosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPedidosCompras.setText("Buscar");
		this.jButtonid_linea_marcaPedidosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaPedidosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPedidosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPedidosCompras"));

		this.jButtonid_linea_marcaPedidosComprasBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaPedidosComprasBusqueda.setText("U");
		this.jButtonid_linea_marcaPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaPedidosComprasBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaPedidosComprasUpdate= new JButtonMe();
		this.jButtonid_linea_marcaPedidosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPedidosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPedidosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaPedidosComprasUpdate.setText("U");
		this.jButtonid_linea_marcaPedidosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaPedidosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPedidosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPedidosComprasUpdate"));



					
		this.jLabelid_tipo_producto_servicioPedidosCompras = new JLabelMe();
		this.jLabelid_tipo_producto_servicioPedidosCompras.setText(""+PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO+" : *");
		this.jLabelid_tipo_producto_servicioPedidosCompras.setToolTipText("Tipo Producto Servicio");
		this.jLabelid_tipo_producto_servicioPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicioPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicioPedidosCompras.setToolTipText(PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutPedidosCompras = new GridBagLayout();
		this.jPanelid_tipo_producto_servicioPedidosCompras.setLayout(this.gridaBagLayoutPedidosCompras);


		jComboBoxid_tipo_producto_servicioPedidosCompras= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicioPedidosCompras= new JButtonMe();
		this.jButtonid_tipo_producto_servicioPedidosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioPedidosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioPedidosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioPedidosCompras.setText("Buscar");
		this.jButtonid_tipo_producto_servicioPedidosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicioPedidosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioPedidosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicioPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioPedidosCompras"));

		this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicioPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioPedidosComprasBusqueda"));

		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicioPedidosComprasUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicioPedidosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioPedidosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioPedidosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioPedidosComprasUpdate.setText("U");
		this.jButtonid_tipo_producto_servicioPedidosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicioPedidosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioPedidosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicioPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioPedidosComprasUpdate"));



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
		//this.jInternalFrameDetallePedidosCompras = new PedidosComprasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedidos Compras DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidosCompras= new GridBagLayout();
		

		
		String sToolTipPedidosCompras="";
		sToolTipPedidosCompras=PedidosComprasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidosCompras+="(Inventario.PedidosCompras)";
		}
		
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidosCompras+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedidosCompras = new JButtonMe();
		this.jButtonModificarPedidosCompras = new JButtonMe();
        this.jButtonActualizarPedidosCompras = new JButtonMe();
        this.jButtonEliminarPedidosCompras = new JButtonMe();
        this.jButtonCancelarPedidosCompras = new JButtonMe();
        this.jButtonGuardarCambiosPedidosCompras = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedidosCompras = new JButtonMe();
		this.jButtonCerrarPedidosCompras = new JButtonMe();
		
		this.jScrollPanelDatosPedidosCompras = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedidosCompras = new JScrollPane();
		this.jScrollPanelDatosGeneralPedidosCompras = new JScrollPane();
				
		
		
		this.jPanelCamposPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedidos Compras";
		
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos Comprases" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidosCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPedidosCompras.setName("jPanelCamposPedidosCompras"); 

		this.jPanelCamposOcultosPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedidosCompras.setName("jPanelCamposOcultosPedidosCompras"); 

        this.jPanelAccionesPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidosCompras.setToolTipText("Acciones");
        this.jPanelAccionesPedidosCompras.setName("Acciones"); 

		this.jPanelAccionesFormularioPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedidosCompras.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedidosCompras.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedidosCompras.setText("Nuevo");
		this.jButtonModificarPedidosCompras.setText("Editar");
        this.jButtonActualizarPedidosCompras.setText("Actualizar");
        this.jButtonEliminarPedidosCompras.setText("Eliminar");
        this.jButtonCancelarPedidosCompras.setText("Cancelar");
        this.jButtonGuardarCambiosPedidosCompras.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedidosCompras.setText("Guardar");
		this.jButtonCerrarPedidosCompras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidosCompras,"nuevo_button","Nuevo",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedidosCompras,"modificar_button","Editar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedidosCompras,"actualizar_button","Actualizar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedidosCompras,"eliminar_button","Eliminar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedidosCompras,"cancelar_button","Cancelar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedidosCompras,"guardarcambios_button","Guardar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidosCompras,"guardarcambiostabla_button","Guardar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidosCompras,"cerrar_button","Salir",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedidosCompras.setToolTipText("Nuevo"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedidosCompras.setToolTipText("Editar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedidosCompras.setToolTipText("Actualizar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedidosCompras.setToolTipText("Eliminar)"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedidosCompras.setToolTipText("Cancelar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedidosCompras.setToolTipText("Guardar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedidosCompras.setToolTipText("Guardar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidosCompras.setToolTipText("Salir"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidosCompras";
		inputMap = this.jButtonNuevoPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidosCompras"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedidosCompras";
		inputMap = this.jButtonActualizarPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedidosCompras"));
		
		//ELIMINAR
		sMapKey = "EliminarPedidosCompras";
		inputMap = this.jButtonEliminarPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedidosCompras"));
		
		//CANCELAR	
		sMapKey = "CancelarPedidosCompras";
		inputMap = this.jButtonCancelarPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedidosCompras"));
		
		//CERRAR		
		sMapKey = "CerrarPedidosCompras";
		inputMap = this.jButtonCerrarPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidosCompras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidosCompras";
		inputMap = this.jButtonGuardarCambiosTablaPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidosCompras"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedidosCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedidosCompras.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedidosCompras.setToolTipText("Nuevo PedidosCompras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedidosCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedidosCompras.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedidosCompras.setToolTipText("Sin Cerrar Ventana PedidosCompras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedidosCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedidosCompras.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedidosCompras.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidosCompras.setText("Accion");
		this.jComboBoxTiposAccionesPedidosCompras.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedidosCompras.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedidosCompras.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedidosCompras = new JLabelMe();
		
		this.jLabelAccionesPedidosCompras.setText("Acciones");		
		this.jLabelAccionesPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedidosCompras();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedidosCompras();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedidosCompras=new JTabbedPane();
		this.jTabbedPaneRelacionesPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedidosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedidosCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidosCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidosCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedidosCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidosCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidosCompras.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedidosCompras = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedidosCompras = new GridBagLayout();
		
		this.jPanelCamposPedidosCompras.setLayout(gridaBagLayoutCamposPedidosCompras);
		this.jPanelCamposOcultosPedidosCompras.setLayout(gridaBagLayoutCamposOcultosPedidosCompras);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPedidosCompras.add(jLabelIdPedidosCompras, this.gridBagConstraintsPedidosCompras);



	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPedidosCompras.add(jLabelidPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPedidosCompras.add(jLabelid_empresaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidosCompras.add(jButtonid_empresaPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 3;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidosCompras.add(jButtonid_empresaPedidosComprasUpdate, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPedidosCompras.add(jComboBoxid_empresaPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPedidosCompras.add(jLabelid_sucursalPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidosCompras.add(jButtonid_sucursalPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 3;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidosCompras.add(jButtonid_sucursalPedidosComprasUpdate, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPedidosCompras.add(jComboBoxid_sucursalPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoPedidosCompras.add(jLabelid_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPedidosCompras.add(jButtonid_productoPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 3;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPedidosCompras.add(jButtonid_productoPedidosComprasUpdate, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoPedidosCompras.add(jComboBoxid_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaPedidosCompras.add(jLabelid_lineaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPedidosCompras.add(jButtonid_lineaPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 3;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPedidosCompras.add(jButtonid_lineaPedidosComprasUpdate, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaPedidosCompras.add(jComboBoxid_lineaPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoPedidosCompras.add(jLabelid_linea_grupoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoPedidosCompras.add(jButtonid_linea_grupoPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 3;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoPedidosCompras.add(jButtonid_linea_grupoPedidosComprasUpdate, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoPedidosCompras.add(jComboBoxid_linea_grupoPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaPedidosCompras.add(jLabelid_linea_categoriaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaPedidosCompras.add(jButtonid_linea_categoriaPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 3;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaPedidosCompras.add(jButtonid_linea_categoriaPedidosComprasUpdate, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaPedidosCompras.add(jComboBoxid_linea_categoriaPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaPedidosCompras.add(jLabelid_linea_marcaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaPedidosCompras.add(jButtonid_linea_marcaPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 3;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaPedidosCompras.add(jButtonid_linea_marcaPedidosComprasUpdate, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaPedidosCompras.add(jComboBoxid_linea_marcaPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicioPedidosCompras.add(jLabelid_tipo_producto_servicioPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioPedidosCompras.add(jButtonid_tipo_producto_servicioPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 3;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioPedidosCompras.add(jButtonid_tipo_producto_servicioPedidosComprasUpdate, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicioPedidosCompras.add(jComboBoxid_tipo_producto_servicioPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdePedidosCompras.add(jLabelfecha_emision_desdePedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdePedidosCompras.add(jButtonfecha_emision_desdePedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdePedidosCompras.add(jDateChooserfecha_emision_desdePedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaPedidosCompras.add(jLabelfecha_emision_hastaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaPedidosCompras.add(jButtonfecha_emision_hastaPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaPedidosCompras.add(jDateChooserfecha_emision_hastaPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialPedidosCompras.add(jLabelsecuencialPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialPedidosCompras.add(jButtonsecuencialPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialPedidosCompras.add(jTextFieldsecuencialPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPedidosCompras.add(jLabelfecha_emisionPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPedidosCompras.add(jButtonfecha_emisionPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPedidosCompras.add(jDateChooserfecha_emisionPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaPedidosCompras.add(jLabelfecha_entregaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaPedidosCompras.add(jButtonfecha_entregaPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaPedidosCompras.add(jDateChooserfecha_entregaPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoPedidosCompras.add(jLabelnombre_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoPedidosCompras.add(jButtonnombre_productoPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoPedidosCompras.add(jscrollPanenombre_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadPedidosCompras.add(jLabelnombre_unidadPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadPedidosCompras.add(jButtonnombre_unidadPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadPedidosCompras.add(jTextFieldnombre_unidadPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pedidoPedidosCompras.add(jLabelcantidad_pedidoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pedidoPedidosCompras.add(jButtoncantidad_pedidoPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pedidoPedidosCompras.add(jTextFieldcantidad_pedidoPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_entregadaPedidosCompras.add(jLabelcantidad_entregadaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_entregadaPedidosCompras.add(jButtoncantidad_entregadaPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_entregadaPedidosCompras.add(jTextFieldcantidad_entregadaPedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pendientePedidosCompras.add(jLabelcantidad_pendientePedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pendientePedidosCompras.add(jButtoncantidad_pendientePedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pendientePedidosCompras.add(jTextFieldcantidad_pendientePedidosCompras, this.gridBagConstraintsPedidosCompras);


	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 0;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoPedidosCompras.add(jLabelcodigo_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 2;
		this.gridBagConstraintsPedidosCompras.ipadx = 0;
		this.gridBagConstraintsPedidosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoPedidosCompras.add(jButtoncodigo_productoPedidosComprasBusqueda, this.gridBagConstraintsPedidosCompras);
	}

	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidosCompras.gridy = 0;
	this.gridBagConstraintsPedidosCompras.gridx = 1;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoPedidosCompras.add(jTextFieldcodigo_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelidPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelid_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelid_lineaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelid_linea_grupoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelid_linea_categoriaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelid_linea_marcaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelid_tipo_producto_servicioPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelfecha_emision_desdePedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelfecha_emision_hastaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelsecuencialPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelfecha_emisionPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelfecha_entregaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelnombre_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelnombre_unidadPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelcantidad_pedidoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelcantidad_entregadaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelcantidad_pendientePedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidosCompras.add(this.jPanelcodigo_productoPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposPedidosCompras % 2==0) {
		iXPanelCamposPedidosCompras=0;
		iYPanelCamposPedidosCompras++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposOcultosPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposOcultosPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidosCompras.add(this.jPanelid_empresaPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposOcultosPedidosCompras % 2==0) {
		iXPanelCamposOcultosPedidosCompras=0;
		iYPanelCamposOcultosPedidosCompras++;
	}
	this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidosCompras.gridy = iYPanelCamposOcultosPedidosCompras;
	this.gridBagConstraintsPedidosCompras.gridx = iXPanelCamposOcultosPedidosCompras++;
	this.gridBagConstraintsPedidosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidosCompras.add(this.jPanelid_sucursalPedidosCompras, this.gridBagConstraintsPedidosCompras);



	if(iXPanelCamposOcultosPedidosCompras % 2==0) {
		iXPanelCamposOcultosPedidosCompras=0;
		iYPanelCamposOcultosPedidosCompras++;
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
			
		GridBagLayout gridaBagLayoutAccionesPedidosCompras= new GridBagLayout();
		this.jPanelAccionesPedidosCompras.setLayout(gridaBagLayoutAccionesPedidosCompras);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedidosCompras= new GridBagLayout();
		this.jPanelAccionesFormularioPedidosCompras.setLayout(gridaBagLayoutAccionesFormularioPedidosCompras);
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidosCompras.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidosCompras.add(this.jComboBoxTiposAccionesFormularioPedidosCompras, this.gridBagConstraintsPedidosCompras);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedidosCompras.add(this.jButtonModificarPedidosCompras, this.gridBagConstraintsPedidosCompras);							

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedidosCompras.add(this.jButtonEliminarPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
			
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = 0;		
		this.gridBagConstraintsPedidosCompras.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidosCompras.add(this.jButtonActualizarPedidosCompras, this.gridBagConstraintsPedidosCompras);


		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = 0;		
		this.gridBagConstraintsPedidosCompras.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidosCompras.add(this.jButtonGuardarCambiosPedidosCompras, this.gridBagConstraintsPedidosCompras);	
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = 0;		
		this.gridBagConstraintsPedidosCompras.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedidosCompras.add(this.jButtonCancelarPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidosCompras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidosCompras);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();						
			this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidosCompras.gridx = 0;		
			//this.gridBagConstraintsPedidosCompras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidosCompras.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidosCompras.gridx =0;
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidosCompras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidosCompras, this.gridBagConstraintsPedidosCompras);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidosComprasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedidosCompras = new PedidosComprasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedidos Compras DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedidos Compras DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedidos Compras Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidosComprasModel pedidoscomprasModel=new PedidosComprasModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidosComprasModel.PedidosComprasFocusTraversalPolicy pedidoscomprasFocusTraversalPolicy = pedidoscomprasModel.new PedidosComprasFocusTraversalPolicy(this);
			
			//pedidoscomprasFocusTraversalPolicy.setpedidoscomprasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidoscomprasModel);
			
			
			this.jContentPaneDetallePedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedidosCompras = new GridBagLayout();	
			this.jContentPaneDetallePedidosCompras.setLayout(gridaBagLayoutDetallePedidosCompras);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidosCompras = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
				this.gridBagConstraintsPedidosCompras.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPedidosCompras.gridx = 0;
					
				
				this.jContentPaneDetallePedidosCompras.add(jTtoolBarDetallePedidosCompras, gridBagConstraintsPedidosCompras);								
				
}
			
			this.jScrollPanelDatosEdicionPedidosCompras=   new JScrollPane(jContentPaneDetallePedidosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidosCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidosCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidosCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedidosCompras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidosCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidosCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidosCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPedidosCompras.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedidosCompras.gridx = 0;
	        
			this.jContentPaneDetallePedidosCompras.add(jPanelCamposPedidosCompras, gridBagConstraintsPedidosCompras);
			
			
			
			
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
						//&& pedidoscomprasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedidosCompras= new GridBagConstraints();
						this.gridBagConstraintsPedidosCompras.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedidosCompras.gridx = 0;
						this.jContentPaneDetallePedidosCompras.add(this.jTabbedPaneRelacionesPedidosCompras, this.gridBagConstraintsPedidosCompras);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedidosCompras.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedidosCompras.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
					this.gridBagConstraintsPedidosCompras.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedidosCompras.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedidosCompras.gridx = 0;
					
				
					this.jContentPaneDetallePedidosCompras.add(jPanelCamposOcultosPedidosCompras, gridBagConstraintsPedidosCompras);
				
					this.jPanelCamposOcultosPedidosCompras.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPedidosCompras.gridx = 0;
	        this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePedidosCompras.add(this.jPanelAccionesFormularioPedidosCompras, this.gridBagConstraintsPedidosCompras);							
			
			
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
	        this.gridBagConstraintsPedidosCompras.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPedidosCompras.gridx = 0;
	        
			
			this.jContentPaneDetallePedidosCompras.add(this.jPanelAccionesPedidosCompras, this.gridBagConstraintsPedidosCompras);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedidosCompras);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedidosCompras=   new JScrollPane(this.jPanelCamposPedidosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidosCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidosCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidosCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedidosCompras.gridx = 0;
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedidosCompras.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedidosCompras, this.gridBagConstraintsPedidosCompras);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidosCompras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedidosCompras, this.gridBagConstraintsPedidosCompras);			
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidosCompras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedidosCompras, this.gridBagConstraintsPedidosCompras);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidosCompras, this.gridBagConstraintsPedidosCompras);
			
			
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
			
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidosCompras, this.gridBagConstraintsPedidosCompras);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedidosCompras;//jContentPane;
		
		return jScrollPanelDatosEdicionPedidosCompras;
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
