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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.report.ProductosServiciosPreciosSinRangosConstantesFunciones;

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
public class ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame extends ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductosServiciosPreciosSinRangos;
	
	protected JMenuBar jmenuBarDetalleProductosServiciosPreciosSinRangos;
	
	protected JMenu jmenuDetalleProductosServiciosPreciosSinRangos;
	protected JMenu jmenuDetalleArchivoProductosServiciosPreciosSinRangos;
	protected JMenu jmenuDetalleAccionesProductosServiciosPreciosSinRangos;
	protected JMenu jmenuDetalleDatosProductosServiciosPreciosSinRangos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosServiciosPreciosSinRangos;	
	protected GridBagConstraints gridBagConstraintsProductosServiciosPreciosSinRangos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductosServiciosPreciosSinRangos;		
	
	
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
	
	public ProductosServiciosPreciosSinRangosSessionBean productosserviciospreciossinrangosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ProductosServiciosPreciosSinRangosLogic productosserviciospreciossinrangosLogic;
	
	public JScrollPane jScrollPanelDatosProductosServiciosPreciosSinRangos;
	public JScrollPane jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos;
	public JScrollPane jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos;
	
	protected JPanel jPanelCamposProductosServiciosPreciosSinRangos;    
	protected JPanel jPanelCamposOcultosProductosServiciosPreciosSinRangos;    	
	protected JPanel jPanelAccionesProductosServiciosPreciosSinRangos;
	protected JPanel jPanelAccionesFormularioProductosServiciosPreciosSinRangos;
    
	
	
	protected Integer iXPanelCamposProductosServiciosPreciosSinRangos=0;
	protected Integer iYPanelCamposProductosServiciosPreciosSinRangos=0;
	
	protected Integer iXPanelCamposOcultosProductosServiciosPreciosSinRangos=0;
	protected Integer iYPanelCamposOcultosProductosServiciosPreciosSinRangos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductosServiciosPreciosSinRangos;
	public JButton jButtonModificarProductosServiciosPreciosSinRangos;
	public JButton jButtonActualizarProductosServiciosPreciosSinRangos;
    public JButton jButtonEliminarProductosServiciosPreciosSinRangos;
	public JButton jButtonCancelarProductosServiciosPreciosSinRangos;
    public JButton jButtonGuardarCambiosProductosServiciosPreciosSinRangos;
	public JButton jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos;
	protected JButton jButtonCerrarProductosServiciosPreciosSinRangos;
	
	
	protected JButton jButtonProcesarInformacionProductosServiciosPreciosSinRangos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductosServiciosPreciosSinRangos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductosServiciosPreciosSinRangos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductosServiciosPreciosSinRangos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonModificarToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonActualizarToolBarProductosServiciosPreciosSinRangos;
    protected JButton jButtonEliminarToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonCancelarToolBarProductosServiciosPreciosSinRangos;
    protected JButton jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonGuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonCerrarToolBarProductosServiciosPreciosSinRangos;
	
	protected JButton jButtonProcesarInformacionToolBarProductosServiciosPreciosSinRangos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemModificarProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemActualizarProductosServiciosPreciosSinRangos;
    protected JMenuItem jMenuItemEliminarProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemCancelarProductosServiciosPreciosSinRangos;
    protected JMenuItem jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemCerrarProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos;
	
	protected JMenuItem jMenuItemProcesarInformacionProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosServiciosPreciosSinRangos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosServiciosPreciosSinRangos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductosServiciosPreciosSinRangos;
	public JLabel jLabelIdProductosServiciosPreciosSinRangos;
	public JLabel jLabelidProductosServiciosPreciosSinRangos;
	public JButton jButtonidProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalProductosServiciosPreciosSinRangos;
	public JLabel jLabelnombre_sucursalProductosServiciosPreciosSinRangos;
	public JTextArea jTextAreanombre_sucursalProductosServiciosPreciosSinRangos;
	public JScrollPane jscrollPanenombre_sucursalProductosServiciosPreciosSinRangos;
	public JButton jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProductosServiciosPreciosSinRangos;
	public JLabel jLabelcodigoProductosServiciosPreciosSinRangos;
	public JTextField jTextFieldcodigoProductosServiciosPreciosSinRangos;
	public JButton jButtoncodigoProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelnombreProductosServiciosPreciosSinRangos;
	public JLabel jLabelnombreProductosServiciosPreciosSinRangos;
	public JTextArea jTextAreanombreProductosServiciosPreciosSinRangos;
	public JScrollPane jscrollPanenombreProductosServiciosPreciosSinRangos;
	public JButton jButtonnombreProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaProductosServiciosPreciosSinRangos;
	public JLabel jLabelnombre_bodegaProductosServiciosPreciosSinRangos;
	public JTextArea jTextAreanombre_bodegaProductosServiciosPreciosSinRangos;
	public JScrollPane jscrollPanenombre_bodegaProductosServiciosPreciosSinRangos;
	public JButton jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProductosServiciosPreciosSinRangos;
	public JLabel jLabelnombre_unidadProductosServiciosPreciosSinRangos;
	public JTextField jTextFieldnombre_unidadProductosServiciosPreciosSinRangos;
	public JButton jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos;
	public JLabel jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos;
	public JTextArea jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos;
	public JScrollPane jscrollPanecodigo_tipo_precioProductosServiciosPreciosSinRangos;
	public JButton jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelprecioProductosServiciosPreciosSinRangos;
	public JLabel jLabelprecioProductosServiciosPreciosSinRangos;
	public JTextField jTextFieldprecioProductosServiciosPreciosSinRangos;
	public JButton jButtonprecioProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_empresaProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductosServiciosPreciosSinRangos;
	public JButton jButtonid_empresaProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_empresaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_sucursalProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductosServiciosPreciosSinRangos;
	public JButton jButtonid_sucursalProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_bodegaProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductosServiciosPreciosSinRangos;
	public JButton jButtonid_bodegaProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_lineaProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProductosServiciosPreciosSinRangos;
	public JButton jButtonid_lineaProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_lineaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_linea_grupoProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos;
	public JButton jButtonid_linea_grupoProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_linea_categoriaProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos;
	public JButton jButtonid_linea_categoriaProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_linea_marcaProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos;
	public JButton jButtonid_linea_marcaProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductosServiciosPreciosSinRangos;
	
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
	public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductosServiciosPreciosSinRangos=new JPanel();
				this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos=new JPanel();
				this.jmenuBarDetalleProductosServiciosPreciosSinRangos=new JMenuBar();
				this.jTtoolBarDetalleProductosServiciosPreciosSinRangos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductosServiciosPreciosSinRangos() {
		return this.jButtonActualizarToolBarProductosServiciosPreciosSinRangos;
	}
	
	public JButton getjButtonEliminarToolBarProductosServiciosPreciosSinRangos() {
		return this.jButtonEliminarToolBarProductosServiciosPreciosSinRangos;
	}
	
	public JButton getjButtonCancelarToolBarProductosServiciosPreciosSinRangos() {
		return this.jButtonCancelarToolBarProductosServiciosPreciosSinRangos;
	}		
	
	public JButton getjButtonProcesarInformacionProductosServiciosPreciosSinRangos() {
		return this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosServiciosPreciosSinRangos)	{
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos = jButtonProcesarInformacionProductosServiciosPreciosSinRangos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosServiciosPreciosSinRangos() {
		return this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos = jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposAccionesProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos = jComboBoxTiposAccionesProductosServiciosPreciosSinRangos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos() {
		return this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos = jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
		
		this.productosserviciospreciossinrangosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciospreciossinrangosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosServiciosPreciosSinRangosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosServiciosPreciosSinRangosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosServiciosPreciosSinRangosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Servicios Precios Sin Rangos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosServiciosPreciosSinRangosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductosServiciosPreciosSinRangos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductosServiciosPreciosSinRangos=new JButtonMe();
				this.jButtonModificarToolBarProductosServiciosPreciosSinRangos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarDetalleProductosServiciosPreciosSinRangos,
							"actualizar","actualizar","Actualizar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarDetalleProductosServiciosPreciosSinRangos,
							"eliminar","eliminar","Eliminar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarDetalleProductosServiciosPreciosSinRangos,
							"cancelar","cancelar","Cancelar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarDetalleProductosServiciosPreciosSinRangos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductosServiciosPreciosSinRangos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductosServiciosPreciosSinRangos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductosServiciosPreciosSinRangos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductosServiciosPreciosSinRangos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductosServiciosPreciosSinRangos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosServiciosPreciosSinRangos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosServiciosPreciosSinRangos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosServiciosPreciosSinRangos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductosServiciosPreciosSinRangos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductosServiciosPreciosSinRangos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductosServiciosPreciosSinRangos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductosServiciosPreciosSinRangos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductosServiciosPreciosSinRangos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductosServiciosPreciosSinRangos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductosServiciosPreciosSinRangos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductosServiciosPreciosSinRangos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductosServiciosPreciosSinRangos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductosServiciosPreciosSinRangos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductosServiciosPreciosSinRangos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductosServiciosPreciosSinRangos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosServiciosPreciosSinRangos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosServiciosPreciosSinRangos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosServiciosPreciosSinRangos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductosServiciosPreciosSinRangos.add(this.jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos);
		
		this.jmenuDetalleAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemActualizarProductosServiciosPreciosSinRangos);
		this.jmenuDetalleAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemEliminarProductosServiciosPreciosSinRangos);
		this.jmenuDetalleAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemCancelarProductosServiciosPreciosSinRangos);		
		
		//this.jmenuDetalleDatosProductosServiciosPreciosSinRangos.add(this.jMenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos);				
		this.jmenuDetalleDatosProductosServiciosPreciosSinRangos.add(this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos);				
				
		//this.jmenuDetalleAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductosServiciosPreciosSinRangos.add(this.jmenuDetalleArchivoProductosServiciosPreciosSinRangos);		
		this.jmenuBarDetalleProductosServiciosPreciosSinRangos.add(this.jmenuDetalleAccionesProductosServiciosPreciosSinRangos);		
		this.jmenuBarDetalleProductosServiciosPreciosSinRangos.add(this.jmenuDetalleDatosProductosServiciosPreciosSinRangos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductosServiciosPreciosSinRangos);				
	}
	
	
	public void inicializarElementosCamposProductosServiciosPreciosSinRangos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductosServiciosPreciosSinRangos = new JLabelMe();
		jLabelIdProductosServiciosPreciosSinRangos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductosServiciosPreciosSinRangos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos= new GridBagLayout();

		this.jPanelidProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);

		jLabelidProductosServiciosPreciosSinRangos = new JLabel();
		jLabelidProductosServiciosPreciosSinRangos.setText("Id");

		jLabelidProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_sucursalProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelnombre_sucursalProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalProductosServiciosPreciosSinRangos.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelnombre_sucursalProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos= new JTextAreaMe();
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setEnabled(false);
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setLineWrap(true);
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setWrapStyleWord(true);
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalProductosServiciosPreciosSinRangos = new JScrollPane(jTextAreanombre_sucursalProductosServiciosPreciosSinRangos);
		jscrollPanenombre_sucursalProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelcodigoProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProductosServiciosPreciosSinRangos.setToolTipText("Codigo");
		this.jLabelcodigoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelcodigoProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jTextFieldcodigoProductosServiciosPreciosSinRangos= new JTextFieldMe();

		jTextFieldcodigoProductosServiciosPreciosSinRangos.setEnabled(false);
		jTextFieldcodigoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}


					
		this.jLabelnombreProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelnombreProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProductosServiciosPreciosSinRangos.setToolTipText("Nombre");
		this.jLabelnombreProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelnombreProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jTextAreanombreProductosServiciosPreciosSinRangos= new JTextAreaMe();
		jTextAreanombreProductosServiciosPreciosSinRangos.setEnabled(false);
		jTextAreanombreProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosServiciosPreciosSinRangos.setLineWrap(true);
		jTextAreanombreProductosServiciosPreciosSinRangos.setWrapStyleWord(true);
		jTextAreanombreProductosServiciosPreciosSinRangos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProductosServiciosPreciosSinRangos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProductosServiciosPreciosSinRangos = new JScrollPane(jTextAreanombreProductosServiciosPreciosSinRangos);
		jscrollPanenombreProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelnombre_bodegaProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaProductosServiciosPreciosSinRangos.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelnombre_bodegaProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos= new JTextAreaMe();
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setEnabled(false);
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setLineWrap(true);
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setWrapStyleWord(true);
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaProductosServiciosPreciosSinRangos = new JScrollPane(jTextAreanombre_bodegaProductosServiciosPreciosSinRangos);
		jscrollPanenombre_bodegaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelnombre_unidadProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProductosServiciosPreciosSinRangos.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelnombre_unidadProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jTextFieldnombre_unidadProductosServiciosPreciosSinRangos= new JTextFieldMe();

		jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setEnabled(false);
		jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO+" : *");
		this.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos.setToolTipText("Codigo Tipo Precio");
		this.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos= new JTextAreaMe();
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setEnabled(false);
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setLineWrap(true);
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setWrapStyleWord(true);
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigo_tipo_precioProductosServiciosPreciosSinRangos = new JScrollPane(jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos);
		jscrollPanecodigo_tipo_precioProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_tipo_precioProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_tipo_precioProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}


					
		this.jLabelprecioProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelprecioProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioProductosServiciosPreciosSinRangos.setToolTipText("Precio");
		this.jLabelprecioProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelprecioProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jTextFieldprecioProductosServiciosPreciosSinRangos= new JTextFieldMe();
		jTextFieldprecioProductosServiciosPreciosSinRangos.setEnabled(false);
		jTextFieldprecioProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioProductosServiciosPreciosSinRangos.setText("0.0");

		this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductosServiciosPreciosSinRangos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelid_empresaProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductosServiciosPreciosSinRangos.setToolTipText("Empresa");
		this.jLabelid_empresaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelid_empresaProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jComboBoxid_empresaProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.setEnabled(false);

		this.jButtonid_empresaProductosServiciosPreciosSinRangos= new JButtonMe();
		this.jButtonid_empresaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonid_empresaProductosServiciosPreciosSinRangos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductosServiciosPreciosSinRangos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosPreciosSinRangos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosPreciosSinRangos"));

		this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
		this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.setText("U");
		this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosServiciosPreciosSinRangosUpdate"));



					
		this.jLabelid_sucursalProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelid_sucursalProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductosServiciosPreciosSinRangos.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelid_sucursalProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jComboBoxid_sucursalProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setEnabled(false);

		this.jButtonid_sucursalProductosServiciosPreciosSinRangos= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonid_sucursalProductosServiciosPreciosSinRangos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductosServiciosPreciosSinRangos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosPreciosSinRangos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosPreciosSinRangos"));

		this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.setText("U");
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosServiciosPreciosSinRangosUpdate"));



					
		this.jLabelid_bodegaProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelid_bodegaProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductosServiciosPreciosSinRangos.setToolTipText("Bodega");
		this.jLabelid_bodegaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelid_bodegaProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jComboBoxid_bodegaProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductosServiciosPreciosSinRangos= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonid_bodegaProductosServiciosPreciosSinRangos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductosServiciosPreciosSinRangos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosPreciosSinRangos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosPreciosSinRangos"));

		this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.setText("U");
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosServiciosPreciosSinRangosUpdate"));



					
		this.jLabelid_lineaProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelid_lineaProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProductosServiciosPreciosSinRangos.setToolTipText("Linea");
		this.jLabelid_lineaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelid_lineaProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jComboBoxid_lineaProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProductosServiciosPreciosSinRangos= new JButtonMe();
		this.jButtonid_lineaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonid_lineaProductosServiciosPreciosSinRangos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProductosServiciosPreciosSinRangos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosPreciosSinRangos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosPreciosSinRangos"));

		this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}

		this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
		this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.setText("U");
		this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosServiciosPreciosSinRangosUpdate"));



					
		this.jLabelid_linea_grupoProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelid_linea_grupoProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProductosServiciosPreciosSinRangos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelid_linea_grupoProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangos= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosPreciosSinRangos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosPreciosSinRangos"));

		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.setText("U");
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosServiciosPreciosSinRangosUpdate"));



					
		this.jLabelid_linea_categoriaProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelid_linea_categoriaProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProductosServiciosPreciosSinRangos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangos= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosPreciosSinRangos"));

		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.setText("U");
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosServiciosPreciosSinRangosUpdate"));



					
		this.jLabelid_linea_marcaProductosServiciosPreciosSinRangos = new JLabelMe();
		this.jLabelid_linea_marcaProductosServiciosPreciosSinRangos.setText(""+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProductosServiciosPreciosSinRangos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProductosServiciosPreciosSinRangos.setToolTipText(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		this.jPanelid_linea_marcaProductosServiciosPreciosSinRangos.setLayout(this.gridaBagLayoutProductosServiciosPreciosSinRangos);


		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangos= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosPreciosSinRangos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosPreciosSinRangos"));

		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.setText("U");
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosPreciosSinRangosBusqueda"));

		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.setText("U");
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosServiciosPreciosSinRangosUpdate"));



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
		//this.jInternalFrameDetalleProductosServiciosPreciosSinRangos = new ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos Servicios Precios Sin Rangos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosServiciosPreciosSinRangos= new GridBagLayout();
		

		
		String sToolTipProductosServiciosPreciosSinRangos="";
		sToolTipProductosServiciosPreciosSinRangos=ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosServiciosPreciosSinRangos+="(Inventario.ProductosServiciosPreciosSinRangos)";
		}
		
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosServiciosPreciosSinRangos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonModificarProductosServiciosPreciosSinRangos = new JButtonMe();
        this.jButtonActualizarProductosServiciosPreciosSinRangos = new JButtonMe();
        this.jButtonEliminarProductosServiciosPreciosSinRangos = new JButtonMe();
        this.jButtonCancelarProductosServiciosPreciosSinRangos = new JButtonMe();
        this.jButtonGuardarCambiosProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonCerrarProductosServiciosPreciosSinRangos = new JButtonMe();
		
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos = new JScrollPane();
		this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos = new JScrollPane();
				
		
		
		this.jPanelCamposProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Servicios Precios Sin Rangos";
		
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Precios Sin Rangoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductosServiciosPreciosSinRangos.setName("jPanelCamposProductosServiciosPreciosSinRangos"); 

		this.jPanelCamposOcultosProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductosServiciosPreciosSinRangos.setName("jPanelCamposOcultosProductosServiciosPreciosSinRangos"); 

        this.jPanelAccionesProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosServiciosPreciosSinRangos.setToolTipText("Acciones");
        this.jPanelAccionesProductosServiciosPreciosSinRangos.setName("Acciones"); 

		this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductosServiciosPreciosSinRangos.setText("Nuevo");
		this.jButtonModificarProductosServiciosPreciosSinRangos.setText("Editar");
        this.jButtonActualizarProductosServiciosPreciosSinRangos.setText("Actualizar");
        this.jButtonEliminarProductosServiciosPreciosSinRangos.setText("Eliminar");
        this.jButtonCancelarProductosServiciosPreciosSinRangos.setText("Cancelar");
        this.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.setText("Guardar");
		this.jButtonCerrarProductosServiciosPreciosSinRangos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosServiciosPreciosSinRangos,"nuevo_button","Nuevo",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductosServiciosPreciosSinRangos,"modificar_button","Editar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductosServiciosPreciosSinRangos,"actualizar_button","Actualizar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductosServiciosPreciosSinRangos,"eliminar_button","Eliminar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductosServiciosPreciosSinRangos,"cancelar_button","Cancelar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductosServiciosPreciosSinRangos,"guardarcambios_button","Guardar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos,"guardarcambiostabla_button","Guardar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosServiciosPreciosSinRangos,"cerrar_button","Salir",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductosServiciosPreciosSinRangos.setToolTipText("Nuevo"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductosServiciosPreciosSinRangos.setToolTipText("Editar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductosServiciosPreciosSinRangos.setToolTipText("Actualizar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductosServiciosPreciosSinRangos.setToolTipText("Eliminar)"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductosServiciosPreciosSinRangos.setToolTipText("Cancelar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.setToolTipText("Guardar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.setToolTipText("Guardar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosServiciosPreciosSinRangos.setToolTipText("Salir"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonNuevoProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosServiciosPreciosSinRangos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonActualizarProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductosServiciosPreciosSinRangos"));
		
		//ELIMINAR
		sMapKey = "EliminarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonEliminarProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductosServiciosPreciosSinRangos"));
		
		//CANCELAR	
		sMapKey = "CancelarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonCancelarProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductosServiciosPreciosSinRangos"));
		
		//CERRAR		
		sMapKey = "CerrarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonCerrarProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosServiciosPreciosSinRangos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosServiciosPreciosSinRangos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductosServiciosPreciosSinRangos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductosServiciosPreciosSinRangos.setToolTipText("Nuevo ProductosServiciosPreciosSinRangos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductosServiciosPreciosSinRangos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductosServiciosPreciosSinRangos.setToolTipText("Sin Cerrar Ventana ProductosServiciosPreciosSinRangos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductosServiciosPreciosSinRangos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductosServiciosPreciosSinRangos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setText("Accion");
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductosServiciosPreciosSinRangos = new JLabelMe();
		
		this.jLabelAccionesProductosServiciosPreciosSinRangos.setText("Acciones");		
		this.jLabelAccionesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductosServiciosPreciosSinRangos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductosServiciosPreciosSinRangos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos=new JTabbedPane();
		this.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductosServiciosPreciosSinRangos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductosServiciosPreciosSinRangos = new GridBagLayout();
		
		this.jPanelCamposProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutCamposProductosServiciosPreciosSinRangos);
		this.jPanelCamposOcultosProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutCamposOcultosProductosServiciosPreciosSinRangos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductosServiciosPreciosSinRangos.add(jLabelIdProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductosServiciosPreciosSinRangos.add(jLabelidProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductosServiciosPreciosSinRangos.add(jLabelid_empresaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosServiciosPreciosSinRangos.add(jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 3;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosServiciosPreciosSinRangos.add(jButtonid_empresaProductosServiciosPreciosSinRangosUpdate, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductosServiciosPreciosSinRangos.add(jComboBoxid_empresaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductosServiciosPreciosSinRangos.add(jLabelid_sucursalProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosServiciosPreciosSinRangos.add(jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 3;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosServiciosPreciosSinRangos.add(jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductosServiciosPreciosSinRangos.add(jComboBoxid_sucursalProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductosServiciosPreciosSinRangos.add(jLabelid_bodegaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosServiciosPreciosSinRangos.add(jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 3;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosServiciosPreciosSinRangos.add(jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductosServiciosPreciosSinRangos.add(jComboBoxid_bodegaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProductosServiciosPreciosSinRangos.add(jLabelid_lineaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosServiciosPreciosSinRangos.add(jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 3;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosServiciosPreciosSinRangos.add(jButtonid_lineaProductosServiciosPreciosSinRangosUpdate, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProductosServiciosPreciosSinRangos.add(jComboBoxid_lineaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProductosServiciosPreciosSinRangos.add(jLabelid_linea_grupoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosServiciosPreciosSinRangos.add(jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 3;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosServiciosPreciosSinRangos.add(jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProductosServiciosPreciosSinRangos.add(jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos.add(jLabelid_linea_categoriaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos.add(jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 3;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos.add(jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos.add(jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProductosServiciosPreciosSinRangos.add(jLabelid_linea_marcaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosServiciosPreciosSinRangos.add(jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 3;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosServiciosPreciosSinRangos.add(jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProductosServiciosPreciosSinRangos.add(jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalProductosServiciosPreciosSinRangos.add(jLabelnombre_sucursalProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalProductosServiciosPreciosSinRangos.add(jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalProductosServiciosPreciosSinRangos.add(jscrollPanenombre_sucursalProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProductosServiciosPreciosSinRangos.add(jLabelcodigoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProductosServiciosPreciosSinRangos.add(jButtoncodigoProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProductosServiciosPreciosSinRangos.add(jTextFieldcodigoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProductosServiciosPreciosSinRangos.add(jLabelnombreProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProductosServiciosPreciosSinRangos.add(jButtonnombreProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProductosServiciosPreciosSinRangos.add(jscrollPanenombreProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaProductosServiciosPreciosSinRangos.add(jLabelnombre_bodegaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaProductosServiciosPreciosSinRangos.add(jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaProductosServiciosPreciosSinRangos.add(jscrollPanenombre_bodegaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProductosServiciosPreciosSinRangos.add(jLabelnombre_unidadProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProductosServiciosPreciosSinRangos.add(jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProductosServiciosPreciosSinRangos.add(jTextFieldnombre_unidadProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos.add(jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos.add(jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos.add(jscrollPanecodigo_tipo_precioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioProductosServiciosPreciosSinRangos.add(jLabelprecioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 2;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioProductosServiciosPreciosSinRangos.add(jButtonprecioProductosServiciosPreciosSinRangosBusqueda, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	}

	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioProductosServiciosPreciosSinRangos.add(jTextFieldprecioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelidProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelid_bodegaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelid_lineaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelid_linea_grupoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelid_linea_marcaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelnombre_sucursalProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelcodigoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelnombreProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelnombre_bodegaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelnombre_unidadProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosServiciosPreciosSinRangos.add(this.jPanelprecioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposProductosServiciosPreciosSinRangos=0;
		iYPanelCamposProductosServiciosPreciosSinRangos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposOcultosProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposOcultosProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosServiciosPreciosSinRangos.add(this.jPanelid_empresaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposOcultosProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposOcultosProductosServiciosPreciosSinRangos=0;
		iYPanelCamposOcultosProductosServiciosPreciosSinRangos++;
	}
	this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iYPanelCamposOcultosProductosServiciosPreciosSinRangos;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iXPanelCamposOcultosProductosServiciosPreciosSinRangos++;
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosServiciosPreciosSinRangos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosServiciosPreciosSinRangos.add(this.jPanelid_sucursalProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);



	if(iXPanelCamposOcultosProductosServiciosPreciosSinRangos % 2==0) {
		iXPanelCamposOcultosProductosServiciosPreciosSinRangos=0;
		iYPanelCamposOcultosProductosServiciosPreciosSinRangos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductosServiciosPreciosSinRangos= new GridBagLayout();
		this.jPanelAccionesProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutAccionesProductosServiciosPreciosSinRangos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductosServiciosPreciosSinRangos= new GridBagLayout();
		this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutAccionesFormularioProductosServiciosPreciosSinRangos);
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductosServiciosPreciosSinRangos.add(this.jButtonModificarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);							

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductosServiciosPreciosSinRangos.add(this.jButtonEliminarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
			
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosPreciosSinRangos.add(this.jButtonActualizarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosPreciosSinRangos.add(this.jButtonGuardarCambiosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);	
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductosServiciosPreciosSinRangos.add(this.jButtonCancelarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosServiciosPreciosSinRangos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();						
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;		
			//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductosServiciosPreciosSinRangos = new ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos Servicios Precios Sin Rangos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos Servicios Precios Sin Rangos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Servicios Precios Sin Rangos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosServiciosPreciosSinRangosModel productosserviciospreciossinrangosModel=new ProductosServiciosPreciosSinRangosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosServiciosPreciosSinRangosModel.ProductosServiciosPreciosSinRangosFocusTraversalPolicy productosserviciospreciossinrangosFocusTraversalPolicy = productosserviciospreciossinrangosModel.new ProductosServiciosPreciosSinRangosFocusTraversalPolicy(this);
			
			//productosserviciospreciossinrangosFocusTraversalPolicy.setproductosserviciospreciossinrangosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productosserviciospreciossinrangosModel);
			
			
			this.jContentPaneDetalleProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductosServiciosPreciosSinRangos = new GridBagLayout();	
			this.jContentPaneDetalleProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutDetalleProductosServiciosPreciosSinRangos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosServiciosPreciosSinRangos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
					
				
				this.jContentPaneDetalleProductosServiciosPreciosSinRangos.add(jTtoolBarDetalleProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);								
				
}
			
			this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos=   new JScrollPane(jContentPaneDetalleProductosServiciosPreciosSinRangos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	        
			this.jContentPaneDetalleProductosServiciosPreciosSinRangos.add(jPanelCamposProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);
			
			
			
			
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
						//&& productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductosServiciosPreciosSinRangos= new GridBagConstraints();
						this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
						this.jContentPaneDetalleProductosServiciosPreciosSinRangos.add(this.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductosServiciosPreciosSinRangos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
					this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
					
				
					this.jContentPaneDetalleProductosServiciosPreciosSinRangos.add(jPanelCamposOcultosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);
				
					this.jPanelCamposOcultosProductosServiciosPreciosSinRangos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	        this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductosServiciosPreciosSinRangos.add(this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);							
			
			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
	        this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
	        
			
			this.jContentPaneDetalleProductosServiciosPreciosSinRangos.add(this.jPanelAccionesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos=   new JScrollPane(this.jPanelCamposProductosServiciosPreciosSinRangos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			
			
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
			
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos;//jContentPane;
		
		return jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos;
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
