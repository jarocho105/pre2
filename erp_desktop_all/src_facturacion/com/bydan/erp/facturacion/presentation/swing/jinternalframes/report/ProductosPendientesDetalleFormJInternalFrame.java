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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.ProductosPendientesConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class ProductosPendientesDetalleFormJInternalFrame extends ProductosPendientesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductosPendientes;
	
	protected JMenuBar jmenuBarDetalleProductosPendientes;
	
	protected JMenu jmenuDetalleProductosPendientes;
	protected JMenu jmenuDetalleArchivoProductosPendientes;
	protected JMenu jmenuDetalleAccionesProductosPendientes;
	protected JMenu jmenuDetalleDatosProductosPendientes;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosPendientes;	
	protected GridBagConstraints gridBagConstraintsProductosPendientes;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosPendientesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductosPendientes;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

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
	
	public ProductosPendientesSessionBean productospendientesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ProductosPendientesLogic productospendientesLogic;
	
	public JScrollPane jScrollPanelDatosProductosPendientes;
	public JScrollPane jScrollPanelDatosEdicionProductosPendientes;
	public JScrollPane jScrollPanelDatosGeneralProductosPendientes;
	
	protected JPanel jPanelCamposProductosPendientes;    
	protected JPanel jPanelCamposOcultosProductosPendientes;    	
	protected JPanel jPanelAccionesProductosPendientes;
	protected JPanel jPanelAccionesFormularioProductosPendientes;
    
	
	
	protected Integer iXPanelCamposProductosPendientes=0;
	protected Integer iYPanelCamposProductosPendientes=0;
	
	protected Integer iXPanelCamposOcultosProductosPendientes=0;
	protected Integer iYPanelCamposOcultosProductosPendientes=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductosPendientes;
	public JButton jButtonModificarProductosPendientes;
	public JButton jButtonActualizarProductosPendientes;
    public JButton jButtonEliminarProductosPendientes;
	public JButton jButtonCancelarProductosPendientes;
    public JButton jButtonGuardarCambiosProductosPendientes;
	public JButton jButtonGuardarCambiosTablaProductosPendientes;
	protected JButton jButtonCerrarProductosPendientes;
	
	
	protected JButton jButtonProcesarInformacionProductosPendientes;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductosPendientes;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductosPendientes;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductosPendientes;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosPendientes;
	protected JButton jButtonModificarToolBarProductosPendientes;
	protected JButton jButtonActualizarToolBarProductosPendientes;
    protected JButton jButtonEliminarToolBarProductosPendientes;
	protected JButton jButtonCancelarToolBarProductosPendientes;
    protected JButton jButtonGuardarCambiosToolBarProductosPendientes;
	protected JButton jButtonGuardarCambiosTablaToolBarProductosPendientes;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosPendientes;
	protected JButton jButtonCerrarToolBarProductosPendientes;
	
	protected JButton jButtonProcesarInformacionToolBarProductosPendientes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosPendientes;
	protected JMenuItem jMenuItemModificarProductosPendientes;
	protected JMenuItem jMenuItemActualizarProductosPendientes;
    protected JMenuItem jMenuItemEliminarProductosPendientes;
	protected JMenuItem jMenuItemCancelarProductosPendientes;
    protected JMenuItem jMenuItemGuardarCambiosProductosPendientes;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosPendientes;
	protected JMenuItem jMenuItemCerrarProductosPendientes;
	protected JMenuItem jMenuItemDetalleCerrarProductosPendientes;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosPendientes;
	
	protected JMenuItem jMenuItemProcesarInformacionProductosPendientes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosPendientes;
	protected JMenuItem jMenuItemMostrarOcultarProductosPendientes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosPendientes;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosPendientes;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductosPendientes;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductosPendientes;
	public JLabel jLabelIdProductosPendientes;
	public JLabel jLabelidProductosPendientes;
	public JButton jButtonidProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeProductosPendientes;
	public JLabel jLabelfecha_emision_desdeProductosPendientes;
	//public JFormattedTextField jDateChooserfecha_emision_desdeProductosPendientes;

	public JDateChooser jDateChooserfecha_emision_desdeProductosPendientes;
	public JButton jButtonfecha_emision_desdeProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaProductosPendientes;
	public JLabel jLabelfecha_emision_hastaProductosPendientes;
	//public JFormattedTextField jDateChooserfecha_emision_hastaProductosPendientes;

	public JDateChooser jDateChooserfecha_emision_hastaProductosPendientes;
	public JButton jButtonfecha_emision_hastaProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_empresaProductosPendientes;
	public JLabel jLabelnombre_empresaProductosPendientes;
	public JTextArea jTextAreanombre_empresaProductosPendientes;
	public JScrollPane jscrollPanenombre_empresaProductosPendientes;
	public JButton jButtonnombre_empresaProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelruc_empresaProductosPendientes;
	public JLabel jLabelruc_empresaProductosPendientes;
	public JTextField jTextFieldruc_empresaProductosPendientes;
	public JButton jButtonruc_empresaProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoProductosPendientes;
	public JLabel jLabelnombre_productoProductosPendientes;
	public JTextArea jTextAreanombre_productoProductosPendientes;
	public JScrollPane jscrollPanenombre_productoProductosPendientes;
	public JButton jButtonnombre_productoProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProductosPendientes;
	public JLabel jLabelnombre_unidadProductosPendientes;
	public JTextField jTextFieldnombre_unidadProductosPendientes;
	public JButton jButtonnombre_unidadProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductosPendientes;
	public JLabel jLabelcantidadProductosPendientes;
	public JTextField jTextFieldcantidadProductosPendientes;
	public JButton jButtoncantidadProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelprecioProductosPendientes;
	public JLabel jLabelprecioProductosPendientes;
	public JTextField jTextFieldprecioProductosPendientes;
	public JButton jButtonprecioProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPaneltotalProductosPendientes;
	public JLabel jLabeltotalProductosPendientes;
	public JTextField jTextFieldtotalProductosPendientes;
	public JButton jButtontotalProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoProductosPendientes;
	public JLabel jLabelcodigo_productoProductosPendientes;
	public JTextField jTextFieldcodigo_productoProductosPendientes;
	public JButton jButtoncodigo_productoProductosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductosPendientes;
	public JLabel jLabelid_empresaProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductosPendientes;
	public JButton jButtonid_empresaProductosPendientes= new JButtonMe();
	public JButton jButtonid_empresaProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductosPendientes;
	public JLabel jLabelid_bodegaProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductosPendientes;
	public JButton jButtonid_bodegaProductosPendientes= new JButtonMe();
	public JButton jButtonid_bodegaProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProductosPendientes;
	public JLabel jLabelid_lineaProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProductosPendientes;
	public JButton jButtonid_lineaProductosPendientes= new JButtonMe();
	public JButton jButtonid_lineaProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_lineaProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProductosPendientes;
	public JLabel jLabelid_linea_grupoProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProductosPendientes;
	public JButton jButtonid_linea_grupoProductosPendientes= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProductosPendientes;
	public JLabel jLabelid_linea_categoriaProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProductosPendientes;
	public JButton jButtonid_linea_categoriaProductosPendientes= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProductosPendientes;
	public JLabel jLabelid_linea_marcaProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProductosPendientes;
	public JButton jButtonid_linea_marcaProductosPendientes= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosPendientesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductosPendientes;
	
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
	
	public ProductosPendientesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductosPendientes=new JPanel();
				this.jPanelAccionesFormularioProductosPendientes=new JPanel();
				this.jmenuBarDetalleProductosPendientes=new JMenuBar();
				this.jTtoolBarDetalleProductosPendientes=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosPendientesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosPendientesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosPendientesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosPendientesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosPendientesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductosPendientes() {
		return this.jButtonActualizarToolBarProductosPendientes;
	}
	
	public JButton getjButtonEliminarToolBarProductosPendientes() {
		return this.jButtonEliminarToolBarProductosPendientes;
	}
	
	public JButton getjButtonCancelarToolBarProductosPendientes() {
		return this.jButtonCancelarToolBarProductosPendientes;
	}		
	
	public JButton getjButtonProcesarInformacionProductosPendientes() {
		return this.jButtonProcesarInformacionProductosPendientes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosPendientes)	{
		this.jButtonProcesarInformacionProductosPendientes = jButtonProcesarInformacionProductosPendientes;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosPendientes() {
		return this.jComboBoxTiposAccionesProductosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosPendientes(
			JComboBox jComboBoxTiposRelacionesProductosPendientes) {
		this.jComboBoxTiposRelacionesProductosPendientes = jComboBoxTiposRelacionesProductosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosPendientes(
			JComboBox jComboBoxTiposAccionesProductosPendientes) {
		this.jComboBoxTiposAccionesProductosPendientes = jComboBoxTiposAccionesProductosPendientes;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductosPendientes() {
		return this.jComboBoxTiposAccionesFormularioProductosPendientes;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductosPendientes(
			JComboBox jComboBoxTiposAccionesFormularioProductosPendientes) {
		this.jComboBoxTiposAccionesFormularioProductosPendientes = jComboBoxTiposAccionesFormularioProductosPendientes;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productospendientesSessionBean=new ProductosPendientesSessionBean();
		
		this.productospendientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productospendientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productospendientesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosPendientesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Pendientes MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosPendientesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductosPendientes= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductosPendientes=new JButtonMe();
				this.jButtonModificarToolBarProductosPendientes=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductosPendientes,this.jTtoolBarDetalleProductosPendientes,
							"actualizar","actualizar","Actualizar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductosPendientes,this.jTtoolBarDetalleProductosPendientes,
							"eliminar","eliminar","Eliminar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductosPendientes,this.jTtoolBarDetalleProductosPendientes,
							"cancelar","cancelar","Cancelar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductosPendientes,this.jTtoolBarDetalleProductosPendientes,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductosPendientes=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductosPendientes=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductosPendientes=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductosPendientes=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductosPendientes=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosPendientes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosPendientes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosPendientes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductosPendientes= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductosPendientes.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductosPendientes,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductosPendientes= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductosPendientes.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductosPendientes,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductosPendientes= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductosPendientes.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductosPendientes,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductosPendientes= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductosPendientes.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductosPendientes,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductosPendientes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosPendientes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosPendientes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosPendientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosPendientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosPendientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductosPendientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductosPendientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductosPendientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosPendientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosPendientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosPendientes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosPendientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosPendientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosPendientes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductosPendientes.add(this.jMenuItemDetalleCerrarProductosPendientes);
		
		this.jmenuDetalleAccionesProductosPendientes.add(this.jMenuItemActualizarProductosPendientes);
		this.jmenuDetalleAccionesProductosPendientes.add(this.jMenuItemEliminarProductosPendientes);
		this.jmenuDetalleAccionesProductosPendientes.add(this.jMenuItemCancelarProductosPendientes);		
		
		//this.jmenuDetalleDatosProductosPendientes.add(this.jMenuItemDetalleAbrirOrderByProductosPendientes);				
		this.jmenuDetalleDatosProductosPendientes.add(this.jMenuItemDetalleMostarOcultarProductosPendientes);				
				
		//this.jmenuDetalleAccionesProductosPendientes.add(this.jMenuItemGuardarCambiosProductosPendientes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductosPendientes.add(this.jmenuDetalleArchivoProductosPendientes);		
		this.jmenuBarDetalleProductosPendientes.add(this.jmenuDetalleAccionesProductosPendientes);		
		this.jmenuBarDetalleProductosPendientes.add(this.jmenuDetalleDatosProductosPendientes);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductosPendientes);				
	}
	
	
	public void inicializarElementosCamposProductosPendientes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductosPendientes = new JLabelMe();
		jLabelIdProductosPendientes.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductosPendientes = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductosPendientes= new GridBagLayout();

		this.jPanelidProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);

		jLabelidProductosPendientes = new JLabel();
		jLabelidProductosPendientes.setText("Id");

		jLabelidProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeProductosPendientes = new JLabelMe();
		this.jLabelfecha_emision_desdeProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeProductosPendientes.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelfecha_emision_desdeProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		//jFormattedTextFieldfecha_emision_desdeProductosPendientes= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeProductosPendientes= new JDateChooser();
		jDateChooserfecha_emision_desdeProductosPendientes.setEnabled(false);
		jDateChooserfecha_emision_desdeProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeProductosPendientes.setDate(new Date());
		jDateChooserfecha_emision_desdeProductosPendientes.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeProductosPendientes.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeProductosPendientesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeProductosPendientesBusqueda.setText("U");
		this.jButtonfecha_emision_desdeProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaProductosPendientes = new JLabelMe();
		this.jLabelfecha_emision_hastaProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaProductosPendientes.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelfecha_emision_hastaProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		//jFormattedTextFieldfecha_emision_hastaProductosPendientes= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaProductosPendientes= new JDateChooser();
		jDateChooserfecha_emision_hastaProductosPendientes.setEnabled(false);
		jDateChooserfecha_emision_hastaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaProductosPendientes.setDate(new Date());
		jDateChooserfecha_emision_hastaProductosPendientes.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaProductosPendientes.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaProductosPendientesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaProductosPendientesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_empresaProductosPendientes = new JLabelMe();
		this.jLabelnombre_empresaProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA+" : *");
		this.jLabelnombre_empresaProductosPendientes.setToolTipText("Nombre Empresa");
		this.jLabelnombre_empresaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_empresaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_empresaProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_empresaProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelnombre_empresaProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jTextAreanombre_empresaProductosPendientes= new JTextAreaMe();
		jTextAreanombre_empresaProductosPendientes.setEnabled(false);
		jTextAreanombre_empresaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaProductosPendientes.setLineWrap(true);
		jTextAreanombre_empresaProductosPendientes.setWrapStyleWord(true);
		jTextAreanombre_empresaProductosPendientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_empresaProductosPendientes.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_empresaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_empresaProductosPendientes = new JScrollPane(jTextAreanombre_empresaProductosPendientes);
		jscrollPanenombre_empresaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_empresaProductosPendientesBusqueda= new JButtonMe();
		this.jButtonnombre_empresaProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_empresaProductosPendientesBusqueda.setText("U");
		this.jButtonnombre_empresaProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_empresaProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_empresaProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_empresaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_empresaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_empresaProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_empresaProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelruc_empresaProductosPendientes = new JLabelMe();
		this.jLabelruc_empresaProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA+" : *");
		this.jLabelruc_empresaProductosPendientes.setToolTipText("Ruc Empresa");
		this.jLabelruc_empresaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_empresaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_empresaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_empresaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_empresaProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_empresaProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelruc_empresaProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jTextFieldruc_empresaProductosPendientes= new JTextFieldMe();

		jTextFieldruc_empresaProductosPendientes.setEnabled(false);
		jTextFieldruc_empresaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_empresaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_empresaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_empresaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_empresaProductosPendientesBusqueda= new JButtonMe();
		this.jButtonruc_empresaProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_empresaProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_empresaProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_empresaProductosPendientesBusqueda.setText("U");
		this.jButtonruc_empresaProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_empresaProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_empresaProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_empresaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_empresaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_empresaProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_empresaProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoProductosPendientes = new JLabelMe();
		this.jLabelnombre_productoProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoProductosPendientes.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelnombre_productoProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jTextAreanombre_productoProductosPendientes= new JTextAreaMe();
		jTextAreanombre_productoProductosPendientes.setEnabled(false);
		jTextAreanombre_productoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosPendientes.setLineWrap(true);
		jTextAreanombre_productoProductosPendientes.setWrapStyleWord(true);
		jTextAreanombre_productoProductosPendientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoProductosPendientes.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoProductosPendientes = new JScrollPane(jTextAreanombre_productoProductosPendientes);
		jscrollPanenombre_productoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoProductosPendientesBusqueda= new JButtonMe();
		this.jButtonnombre_productoProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoProductosPendientesBusqueda.setText("U");
		this.jButtonnombre_productoProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProductosPendientes = new JLabelMe();
		this.jLabelnombre_unidadProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProductosPendientes.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelnombre_unidadProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jTextFieldnombre_unidadProductosPendientes= new JTextFieldMe();

		jTextFieldnombre_unidadProductosPendientes.setEnabled(false);
		jTextFieldnombre_unidadProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProductosPendientesBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProductosPendientesBusqueda.setText("U");
		this.jButtonnombre_unidadProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelcantidadProductosPendientes = new JLabelMe();
		this.jLabelcantidadProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductosPendientes.setToolTipText("Cantad");
		this.jLabelcantidadProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelcantidadProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jTextFieldcantidadProductosPendientes= new JTextFieldMe();
		jTextFieldcantidadProductosPendientes.setEnabled(false);
		jTextFieldcantidadProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductosPendientes.setText("0");

		this.jButtoncantidadProductosPendientesBusqueda= new JButtonMe();
		this.jButtoncantidadProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductosPendientesBusqueda.setText("U");
		this.jButtoncantidadProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelprecioProductosPendientes = new JLabelMe();
		this.jLabelprecioProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioProductosPendientes.setToolTipText("Precio");
		this.jLabelprecioProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelprecioProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jTextFieldprecioProductosPendientes= new JTextFieldMe();
		jTextFieldprecioProductosPendientes.setEnabled(false);
		jTextFieldprecioProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioProductosPendientes.setText("0.0");

		this.jButtonprecioProductosPendientesBusqueda= new JButtonMe();
		this.jButtonprecioProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioProductosPendientesBusqueda.setText("U");
		this.jButtonprecioProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabeltotalProductosPendientes = new JLabelMe();
		this.jLabeltotalProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalProductosPendientes.setToolTipText("Total");
		this.jLabeltotalProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPaneltotalProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jTextFieldtotalProductosPendientes= new JTextFieldMe();
		jTextFieldtotalProductosPendientes.setEnabled(false);
		jTextFieldtotalProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalProductosPendientes.setText("0.0");

		this.jButtontotalProductosPendientesBusqueda= new JButtonMe();
		this.jButtontotalProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalProductosPendientesBusqueda.setText("U");
		this.jButtontotalProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalProductosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoProductosPendientes = new JLabelMe();
		this.jLabelcodigo_productoProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoProductosPendientes.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelcodigo_productoProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jTextFieldcodigo_productoProductosPendientes= new JTextFieldMe();

		jTextFieldcodigo_productoProductosPendientes.setEnabled(false);
		jTextFieldcodigo_productoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoProductosPendientesBusqueda= new JButtonMe();
		this.jButtoncodigo_productoProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoProductosPendientesBusqueda.setText("U");
		this.jButtoncodigo_productoProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoProductosPendientesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductosPendientes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductosPendientes = new JLabelMe();
		this.jLabelid_empresaProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductosPendientes.setToolTipText("Empresa");
		this.jLabelid_empresaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelid_empresaProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jComboBoxid_empresaProductosPendientes= new JComboBoxMe();
		jComboBoxid_empresaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductosPendientes.setEnabled(false);

		this.jButtonid_empresaProductosPendientes= new JButtonMe();
		this.jButtonid_empresaProductosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosPendientes.setText("Buscar");
		this.jButtonid_empresaProductosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosPendientes"));

		this.jButtonid_empresaProductosPendientesBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosPendientesBusqueda.setText("U");
		this.jButtonid_empresaProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosPendientesUpdate= new JButtonMe();
		this.jButtonid_empresaProductosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosPendientesUpdate.setText("U");
		this.jButtonid_empresaProductosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosPendientesUpdate"));



					
		this.jLabelid_bodegaProductosPendientes = new JLabelMe();
		this.jLabelid_bodegaProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductosPendientes.setToolTipText("Bodega");
		this.jLabelid_bodegaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelid_bodegaProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jComboBoxid_bodegaProductosPendientes= new JComboBoxMe();
		jComboBoxid_bodegaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductosPendientes= new JButtonMe();
		this.jButtonid_bodegaProductosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosPendientes.setText("Buscar");
		this.jButtonid_bodegaProductosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosPendientes"));

		this.jButtonid_bodegaProductosPendientesBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosPendientesBusqueda.setText("U");
		this.jButtonid_bodegaProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductosPendientesUpdate= new JButtonMe();
		this.jButtonid_bodegaProductosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosPendientesUpdate.setText("U");
		this.jButtonid_bodegaProductosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosPendientesUpdate"));



					
		this.jLabelid_lineaProductosPendientes = new JLabelMe();
		this.jLabelid_lineaProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProductosPendientes.setToolTipText("Linea");
		this.jLabelid_lineaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelid_lineaProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jComboBoxid_lineaProductosPendientes= new JComboBoxMe();
		jComboBoxid_lineaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProductosPendientes= new JButtonMe();
		this.jButtonid_lineaProductosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosPendientes.setText("Buscar");
		this.jButtonid_lineaProductosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProductosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosPendientes"));

		this.jButtonid_lineaProductosPendientesBusqueda= new JButtonMe();
		this.jButtonid_lineaProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosPendientesBusqueda.setText("U");
		this.jButtonid_lineaProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProductosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_lineaProductosPendientesUpdate= new JButtonMe();
		this.jButtonid_lineaProductosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosPendientesUpdate.setText("U");
		this.jButtonid_lineaProductosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProductosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosPendientesUpdate"));



					
		this.jLabelid_linea_grupoProductosPendientes = new JLabelMe();
		this.jLabelid_linea_grupoProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProductosPendientes.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelid_linea_grupoProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jComboBoxid_linea_grupoProductosPendientes= new JComboBoxMe();
		jComboBoxid_linea_grupoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProductosPendientes= new JButtonMe();
		this.jButtonid_linea_grupoProductosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosPendientes.setText("Buscar");
		this.jButtonid_linea_grupoProductosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProductosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosPendientes"));

		this.jButtonid_linea_grupoProductosPendientesBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosPendientesBusqueda.setText("U");
		this.jButtonid_linea_grupoProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProductosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProductosPendientesUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProductosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosPendientesUpdate.setText("U");
		this.jButtonid_linea_grupoProductosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProductosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosPendientesUpdate"));



					
		this.jLabelid_linea_categoriaProductosPendientes = new JLabelMe();
		this.jLabelid_linea_categoriaProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProductosPendientes.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelid_linea_categoriaProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jComboBoxid_linea_categoriaProductosPendientes= new JComboBoxMe();
		jComboBoxid_linea_categoriaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProductosPendientes= new JButtonMe();
		this.jButtonid_linea_categoriaProductosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosPendientes.setText("Buscar");
		this.jButtonid_linea_categoriaProductosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProductosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosPendientes"));

		this.jButtonid_linea_categoriaProductosPendientesBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosPendientesBusqueda.setText("U");
		this.jButtonid_linea_categoriaProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProductosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProductosPendientesUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProductosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosPendientesUpdate.setText("U");
		this.jButtonid_linea_categoriaProductosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProductosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosPendientesUpdate"));



					
		this.jLabelid_linea_marcaProductosPendientes = new JLabelMe();
		this.jLabelid_linea_marcaProductosPendientes.setText(""+ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProductosPendientes.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProductosPendientes.setToolTipText(ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProductosPendientes = new GridBagLayout();
		this.jPanelid_linea_marcaProductosPendientes.setLayout(this.gridaBagLayoutProductosPendientes);


		jComboBoxid_linea_marcaProductosPendientes= new JComboBoxMe();
		jComboBoxid_linea_marcaProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProductosPendientes= new JButtonMe();
		this.jButtonid_linea_marcaProductosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosPendientes.setText("Buscar");
		this.jButtonid_linea_marcaProductosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProductosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosPendientes"));

		this.jButtonid_linea_marcaProductosPendientesBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProductosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosPendientesBusqueda.setText("U");
		this.jButtonid_linea_marcaProductosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProductosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosPendientesBusqueda"));

		if(this.productospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProductosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProductosPendientesUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProductosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosPendientesUpdate.setText("U");
		this.jButtonid_linea_marcaProductosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProductosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosPendientesUpdate"));



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
		//this.jInternalFrameDetalleProductosPendientes = new ProductosPendientesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos Pendientes DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosPendientes= new GridBagLayout();
		

		
		String sToolTipProductosPendientes="";
		sToolTipProductosPendientes=ProductosPendientesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosPendientes+="(Facturacion.ProductosPendientes)";
		}
		
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosPendientes+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductosPendientes = new JButtonMe();
		this.jButtonModificarProductosPendientes = new JButtonMe();
        this.jButtonActualizarProductosPendientes = new JButtonMe();
        this.jButtonEliminarProductosPendientes = new JButtonMe();
        this.jButtonCancelarProductosPendientes = new JButtonMe();
        this.jButtonGuardarCambiosProductosPendientes = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductosPendientes = new JButtonMe();
		this.jButtonCerrarProductosPendientes = new JButtonMe();
		
		this.jScrollPanelDatosProductosPendientes = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductosPendientes = new JScrollPane();
		this.jScrollPanelDatosGeneralProductosPendientes = new JScrollPane();
				
		
		
		this.jPanelCamposProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Pendientes";
		
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Pendienteses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosPendientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductosPendientes.setName("jPanelCamposProductosPendientes"); 

		this.jPanelCamposOcultosProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductosPendientes.setName("jPanelCamposOcultosProductosPendientes"); 

        this.jPanelAccionesProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosPendientes.setToolTipText("Acciones");
        this.jPanelAccionesProductosPendientes.setName("Acciones"); 

		this.jPanelAccionesFormularioProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductosPendientes.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductosPendientes.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductosPendientes.setText("Nuevo");
		this.jButtonModificarProductosPendientes.setText("Editar");
        this.jButtonActualizarProductosPendientes.setText("Actualizar");
        this.jButtonEliminarProductosPendientes.setText("Eliminar");
        this.jButtonCancelarProductosPendientes.setText("Cancelar");
        this.jButtonGuardarCambiosProductosPendientes.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductosPendientes.setText("Guardar");
		this.jButtonCerrarProductosPendientes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosPendientes,"nuevo_button","Nuevo",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductosPendientes,"modificar_button","Editar",this.productospendientesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductosPendientes,"actualizar_button","Actualizar",this.productospendientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductosPendientes,"eliminar_button","Eliminar",this.productospendientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductosPendientes,"cancelar_button","Cancelar",this.productospendientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductosPendientes,"guardarcambios_button","Guardar",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosPendientes,"guardarcambiostabla_button","Guardar",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosPendientes,"cerrar_button","Salir",this.productospendientesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductosPendientes.setToolTipText("Nuevo"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductosPendientes.setToolTipText("Editar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductosPendientes.setToolTipText("Actualizar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductosPendientes.setToolTipText("Eliminar)"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductosPendientes.setToolTipText("Cancelar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductosPendientes.setToolTipText("Guardar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductosPendientes.setToolTipText("Guardar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosPendientes.setToolTipText("Salir"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosPendientes";
		inputMap = this.jButtonNuevoProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosPendientes"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductosPendientes";
		inputMap = this.jButtonActualizarProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductosPendientes"));
		
		//ELIMINAR
		sMapKey = "EliminarProductosPendientes";
		inputMap = this.jButtonEliminarProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductosPendientes"));
		
		//CANCELAR	
		sMapKey = "CancelarProductosPendientes";
		inputMap = this.jButtonCancelarProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductosPendientes"));
		
		//CERRAR		
		sMapKey = "CerrarProductosPendientes";
		inputMap = this.jButtonCerrarProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosPendientes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosPendientes";
		inputMap = this.jButtonGuardarCambiosTablaProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosPendientes"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductosPendientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductosPendientes.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductosPendientes.setToolTipText("Nuevo ProductosPendientes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductosPendientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductosPendientes.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductosPendientes.setToolTipText("Sin Cerrar Ventana ProductosPendientes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductosPendientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductosPendientes.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductosPendientes.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosPendientes.setText("Accion");
		this.jComboBoxTiposAccionesProductosPendientes.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductosPendientes.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductosPendientes.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductosPendientes = new JLabelMe();
		
		this.jLabelAccionesProductosPendientes.setText("Acciones");		
		this.jLabelAccionesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductosPendientes();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductosPendientes();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductosPendientes=new JTabbedPane();
		this.jTabbedPaneRelacionesProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductosPendientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosPendientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosPendientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductosPendientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosPendientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosPendientes.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductosPendientes = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductosPendientes = new GridBagLayout();
		
		this.jPanelCamposProductosPendientes.setLayout(gridaBagLayoutCamposProductosPendientes);
		this.jPanelCamposOcultosProductosPendientes.setLayout(gridaBagLayoutCamposOcultosProductosPendientes);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductosPendientes.add(jLabelIdProductosPendientes, this.gridBagConstraintsProductosPendientes);



	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductosPendientes.add(jLabelidProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductosPendientes.add(jLabelid_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosPendientes.add(jButtonid_empresaProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 3;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosPendientes.add(jButtonid_empresaProductosPendientesUpdate, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductosPendientes.add(jComboBoxid_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductosPendientes.add(jLabelid_bodegaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosPendientes.add(jButtonid_bodegaProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 3;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosPendientes.add(jButtonid_bodegaProductosPendientesUpdate, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductosPendientes.add(jComboBoxid_bodegaProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProductosPendientes.add(jLabelid_lineaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosPendientes.add(jButtonid_lineaProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 3;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosPendientes.add(jButtonid_lineaProductosPendientesUpdate, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProductosPendientes.add(jComboBoxid_lineaProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProductosPendientes.add(jLabelid_linea_grupoProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosPendientes.add(jButtonid_linea_grupoProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 3;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosPendientes.add(jButtonid_linea_grupoProductosPendientesUpdate, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProductosPendientes.add(jComboBoxid_linea_grupoProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProductosPendientes.add(jLabelid_linea_categoriaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosPendientes.add(jButtonid_linea_categoriaProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 3;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosPendientes.add(jButtonid_linea_categoriaProductosPendientesUpdate, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProductosPendientes.add(jComboBoxid_linea_categoriaProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProductosPendientes.add(jLabelid_linea_marcaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosPendientes.add(jButtonid_linea_marcaProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 3;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosPendientes.add(jButtonid_linea_marcaProductosPendientesUpdate, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProductosPendientes.add(jComboBoxid_linea_marcaProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeProductosPendientes.add(jLabelfecha_emision_desdeProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeProductosPendientes.add(jButtonfecha_emision_desdeProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeProductosPendientes.add(jDateChooserfecha_emision_desdeProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaProductosPendientes.add(jLabelfecha_emision_hastaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaProductosPendientes.add(jButtonfecha_emision_hastaProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaProductosPendientes.add(jDateChooserfecha_emision_hastaProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_empresaProductosPendientes.add(jLabelnombre_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_empresaProductosPendientes.add(jButtonnombre_empresaProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_empresaProductosPendientes.add(jscrollPanenombre_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_empresaProductosPendientes.add(jLabelruc_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_empresaProductosPendientes.add(jButtonruc_empresaProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_empresaProductosPendientes.add(jTextFieldruc_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoProductosPendientes.add(jLabelnombre_productoProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoProductosPendientes.add(jButtonnombre_productoProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoProductosPendientes.add(jscrollPanenombre_productoProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProductosPendientes.add(jLabelnombre_unidadProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProductosPendientes.add(jButtonnombre_unidadProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProductosPendientes.add(jTextFieldnombre_unidadProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductosPendientes.add(jLabelcantidadProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductosPendientes.add(jButtoncantidadProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductosPendientes.add(jTextFieldcantidadProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioProductosPendientes.add(jLabelprecioProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioProductosPendientes.add(jButtonprecioProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioProductosPendientes.add(jTextFieldprecioProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalProductosPendientes.add(jLabeltotalProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalProductosPendientes.add(jButtontotalProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalProductosPendientes.add(jTextFieldtotalProductosPendientes, this.gridBagConstraintsProductosPendientes);


	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 0;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoProductosPendientes.add(jLabelcodigo_productoProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 2;
		this.gridBagConstraintsProductosPendientes.ipadx = 0;
		this.gridBagConstraintsProductosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoProductosPendientes.add(jButtoncodigo_productoProductosPendientesBusqueda, this.gridBagConstraintsProductosPendientes);
	}

	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosPendientes.gridy = 0;
	this.gridBagConstraintsProductosPendientes.gridx = 1;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoProductosPendientes.add(jTextFieldcodigo_productoProductosPendientes, this.gridBagConstraintsProductosPendientes);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelidProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelid_bodegaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelid_lineaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelid_linea_grupoProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelid_linea_categoriaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelid_linea_marcaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelfecha_emision_desdeProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelfecha_emision_hastaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelnombre_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelruc_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelnombre_productoProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelnombre_unidadProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelcantidadProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelprecioProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPaneltotalProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosPendientes.add(this.jPanelcodigo_productoProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposProductosPendientes % 2==0) {
		iXPanelCamposProductosPendientes=0;
		iYPanelCamposProductosPendientes++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosPendientes.gridy = iYPanelCamposOcultosProductosPendientes;
	this.gridBagConstraintsProductosPendientes.gridx = iXPanelCamposOcultosProductosPendientes++;
	this.gridBagConstraintsProductosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosPendientes.add(this.jPanelid_empresaProductosPendientes, this.gridBagConstraintsProductosPendientes);



	if(iXPanelCamposOcultosProductosPendientes % 2==0) {
		iXPanelCamposOcultosProductosPendientes=0;
		iYPanelCamposOcultosProductosPendientes++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductosPendientes= new GridBagLayout();
		this.jPanelAccionesProductosPendientes.setLayout(gridaBagLayoutAccionesProductosPendientes);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductosPendientes= new GridBagLayout();
		this.jPanelAccionesFormularioProductosPendientes.setLayout(gridaBagLayoutAccionesFormularioProductosPendientes);
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductosPendientes.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductosPendientes.add(this.jComboBoxTiposAccionesFormularioProductosPendientes, this.gridBagConstraintsProductosPendientes);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductosPendientes.add(this.jButtonModificarProductosPendientes, this.gridBagConstraintsProductosPendientes);							

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductosPendientes.add(this.jButtonEliminarProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
			
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = 0;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosPendientes.add(this.jButtonActualizarProductosPendientes, this.gridBagConstraintsProductosPendientes);


		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = 0;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosPendientes.add(this.jButtonGuardarCambiosProductosPendientes, this.gridBagConstraintsProductosPendientes);	
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = 0;		
		this.gridBagConstraintsProductosPendientes.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductosPendientes.add(this.jButtonCancelarProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosPendientes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosPendientes);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();						
			this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosPendientes.gridx = 0;		
			//this.gridBagConstraintsProductosPendientes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosPendientes.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosPendientes.gridx =0;
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosPendientes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosPendientes, this.gridBagConstraintsProductosPendientes);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductosPendientes = new ProductosPendientesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos Pendientes DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos Pendientes DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Pendientes Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosPendientesModel productospendientesModel=new ProductosPendientesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosPendientesModel.ProductosPendientesFocusTraversalPolicy productospendientesFocusTraversalPolicy = productospendientesModel.new ProductosPendientesFocusTraversalPolicy(this);
			
			//productospendientesFocusTraversalPolicy.setproductospendientesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productospendientesModel);
			
			
			this.jContentPaneDetalleProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductosPendientes = new GridBagLayout();	
			this.jContentPaneDetalleProductosPendientes.setLayout(gridaBagLayoutDetalleProductosPendientes);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosPendientes = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
				this.gridBagConstraintsProductosPendientes.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductosPendientes.gridx = 0;
					
				
				this.jContentPaneDetalleProductosPendientes.add(jTtoolBarDetalleProductosPendientes, gridBagConstraintsProductosPendientes);								
				
}
			
			this.jScrollPanelDatosEdicionProductosPendientes=   new JScrollPane(jContentPaneDetalleProductosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosPendientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosPendientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosPendientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductosPendientes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosPendientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosPendientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosPendientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductosPendientes.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductosPendientes.gridx = 0;
	        
			this.jContentPaneDetalleProductosPendientes.add(jPanelCamposProductosPendientes, gridBagConstraintsProductosPendientes);
			
			
			
			
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
						//&& productospendientesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productospendientesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductosPendientes= new GridBagConstraints();
						this.gridBagConstraintsProductosPendientes.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductosPendientes.gridx = 0;
						this.jContentPaneDetalleProductosPendientes.add(this.jTabbedPaneRelacionesProductosPendientes, this.gridBagConstraintsProductosPendientes);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductosPendientes.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductosPendientes.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
					this.gridBagConstraintsProductosPendientes.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductosPendientes.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductosPendientes.gridx = 0;
					
				
					this.jContentPaneDetalleProductosPendientes.add(jPanelCamposOcultosProductosPendientes, gridBagConstraintsProductosPendientes);
				
					this.jPanelCamposOcultosProductosPendientes.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductosPendientes.gridx = 0;
	        this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductosPendientes.add(this.jPanelAccionesFormularioProductosPendientes, this.gridBagConstraintsProductosPendientes);							
			
			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
	        this.gridBagConstraintsProductosPendientes.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductosPendientes.gridx = 0;
	        
			
			this.jContentPaneDetalleProductosPendientes.add(this.jPanelAccionesProductosPendientes, this.gridBagConstraintsProductosPendientes);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductosPendientes);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductosPendientes=   new JScrollPane(this.jPanelCamposProductosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosPendientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosPendientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosPendientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductosPendientes.gridx = 0;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductosPendientes.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductosPendientes, this.gridBagConstraintsProductosPendientes);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosPendientes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductosPendientes, this.gridBagConstraintsProductosPendientes);			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosPendientes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductosPendientes, this.gridBagConstraintsProductosPendientes);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosPendientes, this.gridBagConstraintsProductosPendientes);
			
			
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
			
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosPendientes, this.gridBagConstraintsProductosPendientes);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductosPendientes;//jContentPane;
		
		return jScrollPanelDatosEdicionProductosPendientes;
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
