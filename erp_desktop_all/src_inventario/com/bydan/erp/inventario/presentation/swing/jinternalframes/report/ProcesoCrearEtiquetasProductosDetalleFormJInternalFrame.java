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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.report.ProcesoCrearEtiquetasProductosConstantesFunciones;

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
public class ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame extends ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCrearEtiquetasProductos;
	
	protected JMenuBar jmenuBarDetalleProcesoCrearEtiquetasProductos;
	
	protected JMenu jmenuDetalleProcesoCrearEtiquetasProductos;
	protected JMenu jmenuDetalleArchivoProcesoCrearEtiquetasProductos;
	protected JMenu jmenuDetalleAccionesProcesoCrearEtiquetasProductos;
	protected JMenu jmenuDetalleDatosProcesoCrearEtiquetasProductos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCrearEtiquetasProductos;	
	protected GridBagConstraints gridBagConstraintsProcesoCrearEtiquetasProductos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCrearEtiquetasProductos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ProcesoCrearEtiquetasProductosSessionBean procesocrearetiquetasproductosSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ProcesoCrearEtiquetasProductosLogic procesocrearetiquetasproductosLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCrearEtiquetasProductos;
	public JScrollPane jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos;
	public JScrollPane jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos;
	
	protected JPanel jPanelCamposProcesoCrearEtiquetasProductos;    
	protected JPanel jPanelCamposOcultosProcesoCrearEtiquetasProductos;    	
	protected JPanel jPanelAccionesProcesoCrearEtiquetasProductos;
	protected JPanel jPanelAccionesFormularioProcesoCrearEtiquetasProductos;
    
	
	
	protected Integer iXPanelCamposProcesoCrearEtiquetasProductos=0;
	protected Integer iYPanelCamposProcesoCrearEtiquetasProductos=0;
	
	protected Integer iXPanelCamposOcultosProcesoCrearEtiquetasProductos=0;
	protected Integer iYPanelCamposOcultosProcesoCrearEtiquetasProductos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCrearEtiquetasProductos;
	public JButton jButtonModificarProcesoCrearEtiquetasProductos;
	public JButton jButtonActualizarProcesoCrearEtiquetasProductos;
    public JButton jButtonEliminarProcesoCrearEtiquetasProductos;
	public JButton jButtonCancelarProcesoCrearEtiquetasProductos;
    public JButton jButtonGuardarCambiosProcesoCrearEtiquetasProductos;
	public JButton jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos;
	protected JButton jButtonCerrarProcesoCrearEtiquetasProductos;
	
	
	protected JButton jButtonProcesarInformacionProcesoCrearEtiquetasProductos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCrearEtiquetasProductos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasProductos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasProductos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonModificarToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonActualizarToolBarProcesoCrearEtiquetasProductos;
    protected JButton jButtonEliminarToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonCancelarToolBarProcesoCrearEtiquetasProductos;
    protected JButton jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonCerrarToolBarProcesoCrearEtiquetasProductos;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCrearEtiquetasProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemModificarProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemActualizarProcesoCrearEtiquetasProductos;
    protected JMenuItem jMenuItemEliminarProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemCancelarProcesoCrearEtiquetasProductos;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemCerrarProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCrearEtiquetasProductos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCrearEtiquetasProductos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCrearEtiquetasProductos;
	public JLabel jLabelIdProcesoCrearEtiquetasProductos;
	public JLabel jLabelidProcesoCrearEtiquetasProductos;
	public JButton jButtonidProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoCrearEtiquetasProductos;
	public JLabel jLabelcodigoProcesoCrearEtiquetasProductos;
	public JTextField jTextFieldcodigoProcesoCrearEtiquetasProductos;
	public JButton jButtoncodigoProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombreProcesoCrearEtiquetasProductos;
	public JLabel jLabelnombreProcesoCrearEtiquetasProductos;
	public JTextArea jTextAreanombreProcesoCrearEtiquetasProductos;
	public JScrollPane jscrollPanenombreProcesoCrearEtiquetasProductos;
	public JButton jButtonnombreProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelprecio1ProcesoCrearEtiquetasProductos;
	public JLabel jLabelprecio1ProcesoCrearEtiquetasProductos;
	public JTextField jTextFieldprecio1ProcesoCrearEtiquetasProductos;
	public JButton jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelprecio2ProcesoCrearEtiquetasProductos;
	public JLabel jLabelprecio2ProcesoCrearEtiquetasProductos;
	public JTextField jTextFieldprecio2ProcesoCrearEtiquetasProductos;
	public JButton jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelprecio3ProcesoCrearEtiquetasProductos;
	public JLabel jLabelprecio3ProcesoCrearEtiquetasProductos;
	public JTextField jTextFieldprecio3ProcesoCrearEtiquetasProductos;
	public JButton jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelprecio4ProcesoCrearEtiquetasProductos;
	public JLabel jLabelprecio4ProcesoCrearEtiquetasProductos;
	public JTextField jTextFieldprecio4ProcesoCrearEtiquetasProductos;
	public JButton jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelprecio5ProcesoCrearEtiquetasProductos;
	public JLabel jLabelprecio5ProcesoCrearEtiquetasProductos;
	public JTextField jTextFieldprecio5ProcesoCrearEtiquetasProductos;
	public JButton jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_bodegaProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProcesoCrearEtiquetasProductos;
	public JButton jButtonid_bodegaProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_productoProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProcesoCrearEtiquetasProductos;
	public JButton jButtonid_productoProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_productoProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_empresaProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoCrearEtiquetasProductos;
	public JButton jButtonid_empresaProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_empresaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_sucursalProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoCrearEtiquetasProductos;
	public JButton jButtonid_sucursalProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_lineaProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProcesoCrearEtiquetasProductos;
	public JButton jButtonid_lineaProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_lineaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_linea_grupoProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos;
	public JButton jButtonid_linea_grupoProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_linea_categoriaProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos;
	public JButton jButtonid_linea_categoriaProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_linea_marcaProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos;
	public JButton jButtonid_linea_marcaProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCrearEtiquetasProductos;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCrearEtiquetasProductos=new JPanel();
				this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos=new JPanel();
				this.jmenuBarDetalleProcesoCrearEtiquetasProductos=new JMenuBar();
				this.jTtoolBarDetalleProcesoCrearEtiquetasProductos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCrearEtiquetasProductos() {
		return this.jButtonActualizarToolBarProcesoCrearEtiquetasProductos;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCrearEtiquetasProductos() {
		return this.jButtonEliminarToolBarProcesoCrearEtiquetasProductos;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCrearEtiquetasProductos() {
		return this.jButtonCancelarToolBarProcesoCrearEtiquetasProductos;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCrearEtiquetasProductos() {
		return this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCrearEtiquetasProductos)	{
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos = jButtonProcesarInformacionProcesoCrearEtiquetasProductos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCrearEtiquetasProductos() {
		return this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos = jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposAccionesProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos = jComboBoxTiposAccionesProcesoCrearEtiquetasProductos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos() {
		return this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos = jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
		
		this.procesocrearetiquetasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocrearetiquetasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCrearEtiquetasProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCrearEtiquetasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCrearEtiquetasProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Crear Etiquetas Productos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCrearEtiquetasProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCrearEtiquetasProductos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCrearEtiquetasProductos=new JButtonMe();
				this.jButtonModificarToolBarProcesoCrearEtiquetasProductos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarDetalleProcesoCrearEtiquetasProductos,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarDetalleProcesoCrearEtiquetasProductos,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarDetalleProcesoCrearEtiquetasProductos,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarDetalleProcesoCrearEtiquetasProductos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCrearEtiquetasProductos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCrearEtiquetasProductos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCrearEtiquetasProductos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCrearEtiquetasProductos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCrearEtiquetasProductos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCrearEtiquetasProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCrearEtiquetasProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCrearEtiquetasProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCrearEtiquetasProductos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCrearEtiquetasProductos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCrearEtiquetasProductos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCrearEtiquetasProductos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCrearEtiquetasProductos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCrearEtiquetasProductos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCrearEtiquetasProductos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCrearEtiquetasProductos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCrearEtiquetasProductos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCrearEtiquetasProductos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCrearEtiquetasProductos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCrearEtiquetasProductos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCrearEtiquetasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCrearEtiquetasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCrearEtiquetasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCrearEtiquetasProductos.add(this.jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos);
		
		this.jmenuDetalleAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemActualizarProcesoCrearEtiquetasProductos);
		this.jmenuDetalleAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemEliminarProcesoCrearEtiquetasProductos);
		this.jmenuDetalleAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemCancelarProcesoCrearEtiquetasProductos);		
		
		//this.jmenuDetalleDatosProcesoCrearEtiquetasProductos.add(this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos);				
		this.jmenuDetalleDatosProcesoCrearEtiquetasProductos.add(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos);				
				
		//this.jmenuDetalleAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCrearEtiquetasProductos.add(this.jmenuDetalleArchivoProcesoCrearEtiquetasProductos);		
		this.jmenuBarDetalleProcesoCrearEtiquetasProductos.add(this.jmenuDetalleAccionesProcesoCrearEtiquetasProductos);		
		this.jmenuBarDetalleProcesoCrearEtiquetasProductos.add(this.jmenuDetalleDatosProcesoCrearEtiquetasProductos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCrearEtiquetasProductos);				
	}
	
	
	public void inicializarElementosCamposProcesoCrearEtiquetasProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCrearEtiquetasProductos = new JLabelMe();
		jLabelIdProcesoCrearEtiquetasProductos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCrearEtiquetasProductos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos= new GridBagLayout();

		this.jPanelidProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);

		jLabelidProcesoCrearEtiquetasProductos = new JLabel();
		jLabelidProcesoCrearEtiquetasProductos.setText("Id");

		jLabelidProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelcodigoProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoCrearEtiquetasProductos.setToolTipText("Codigo");
		this.jLabelcodigoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelcodigoProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jTextFieldcodigoProcesoCrearEtiquetasProductos= new JTextFieldMe();

		jTextFieldcodigoProcesoCrearEtiquetasProductos.setEnabled(false);
		jTextFieldcodigoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombreProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelnombreProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProcesoCrearEtiquetasProductos.setToolTipText("Nombre");
		this.jLabelnombreProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelnombreProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jTextAreanombreProcesoCrearEtiquetasProductos= new JTextAreaMe();
		jTextAreanombreProcesoCrearEtiquetasProductos.setEnabled(false);
		jTextAreanombreProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCrearEtiquetasProductos.setLineWrap(true);
		jTextAreanombreProcesoCrearEtiquetasProductos.setWrapStyleWord(true);
		jTextAreanombreProcesoCrearEtiquetasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProcesoCrearEtiquetasProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProcesoCrearEtiquetasProductos = new JScrollPane(jTextAreanombreProcesoCrearEtiquetasProductos);
		jscrollPanenombreProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}


					
		this.jLabelprecio1ProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelprecio1ProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1+" : *");
		this.jLabelprecio1ProcesoCrearEtiquetasProductos.setToolTipText("Precio1");
		this.jLabelprecio1ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio1ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio1ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio1ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio1ProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio1ProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelprecio1ProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jTextFieldprecio1ProcesoCrearEtiquetasProductos= new JTextFieldMe();
		jTextFieldprecio1ProcesoCrearEtiquetasProductos.setEnabled(false);
		jTextFieldprecio1ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio1ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio1ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio1ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio1ProcesoCrearEtiquetasProductos.setText("0.0");

		this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio1ProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio1ProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio1ProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}


					
		this.jLabelprecio2ProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelprecio2ProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2+" : *");
		this.jLabelprecio2ProcesoCrearEtiquetasProductos.setToolTipText("Precio2");
		this.jLabelprecio2ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio2ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio2ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio2ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio2ProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio2ProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelprecio2ProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jTextFieldprecio2ProcesoCrearEtiquetasProductos= new JTextFieldMe();
		jTextFieldprecio2ProcesoCrearEtiquetasProductos.setEnabled(false);
		jTextFieldprecio2ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio2ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio2ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio2ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio2ProcesoCrearEtiquetasProductos.setText("0.0");

		this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio2ProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio2ProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio2ProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}


					
		this.jLabelprecio3ProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelprecio3ProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3+" : *");
		this.jLabelprecio3ProcesoCrearEtiquetasProductos.setToolTipText("Precio3");
		this.jLabelprecio3ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio3ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio3ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio3ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio3ProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio3ProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelprecio3ProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jTextFieldprecio3ProcesoCrearEtiquetasProductos= new JTextFieldMe();
		jTextFieldprecio3ProcesoCrearEtiquetasProductos.setEnabled(false);
		jTextFieldprecio3ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio3ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio3ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio3ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio3ProcesoCrearEtiquetasProductos.setText("0.0");

		this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio3ProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio3ProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio3ProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}


					
		this.jLabelprecio4ProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelprecio4ProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4+" : *");
		this.jLabelprecio4ProcesoCrearEtiquetasProductos.setToolTipText("Precio4");
		this.jLabelprecio4ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio4ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio4ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio4ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio4ProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio4ProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelprecio4ProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jTextFieldprecio4ProcesoCrearEtiquetasProductos= new JTextFieldMe();
		jTextFieldprecio4ProcesoCrearEtiquetasProductos.setEnabled(false);
		jTextFieldprecio4ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio4ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio4ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio4ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio4ProcesoCrearEtiquetasProductos.setText("0.0");

		this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio4ProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio4ProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio4ProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}


					
		this.jLabelprecio5ProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelprecio5ProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5+" : *");
		this.jLabelprecio5ProcesoCrearEtiquetasProductos.setToolTipText("Precio5");
		this.jLabelprecio5ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio5ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio5ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio5ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio5ProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio5ProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelprecio5ProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jTextFieldprecio5ProcesoCrearEtiquetasProductos= new JTextFieldMe();
		jTextFieldprecio5ProcesoCrearEtiquetasProductos.setEnabled(false);
		jTextFieldprecio5ProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio5ProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio5ProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio5ProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio5ProcesoCrearEtiquetasProductos.setText("0.0");

		this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio5ProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio5ProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio5ProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoCrearEtiquetasProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelid_bodegaProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProcesoCrearEtiquetasProductos.setToolTipText("Bodega");
		this.jLabelid_bodegaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelid_bodegaProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jComboBoxid_bodegaProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonid_bodegaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonid_bodegaProcesoCrearEtiquetasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProcesoCrearEtiquetasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCrearEtiquetasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCrearEtiquetasProductos"));

		this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.setText("U");
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCrearEtiquetasProductosUpdate"));



					
		this.jLabelid_productoProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelid_productoProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProcesoCrearEtiquetasProductos.setToolTipText("Producto");
		this.jLabelid_productoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelid_productoProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jComboBoxid_productoProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_productoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonid_productoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonid_productoProcesoCrearEtiquetasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProcesoCrearEtiquetasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCrearEtiquetasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCrearEtiquetasProductos"));

		this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}

		this.jButtonid_productoProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
		this.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.setText("U");
		this.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCrearEtiquetasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCrearEtiquetasProductosUpdate"));



					
		this.jLabelid_empresaProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelid_empresaProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoCrearEtiquetasProductos.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelid_empresaProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jComboBoxid_empresaProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.setEnabled(false);

		this.jButtonid_empresaProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonid_empresaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonid_empresaProcesoCrearEtiquetasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoCrearEtiquetasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCrearEtiquetasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCrearEtiquetasProductos"));

		this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.setText("U");
		this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCrearEtiquetasProductosUpdate"));



					
		this.jLabelid_sucursalProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelid_sucursalProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoCrearEtiquetasProductos.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelid_sucursalProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jComboBoxid_sucursalProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setEnabled(false);

		this.jButtonid_sucursalProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonid_sucursalProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonid_sucursalProcesoCrearEtiquetasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoCrearEtiquetasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCrearEtiquetasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCrearEtiquetasProductos"));

		this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.setText("U");
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCrearEtiquetasProductosUpdate"));



					
		this.jLabelid_lineaProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelid_lineaProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProcesoCrearEtiquetasProductos.setToolTipText("Linea");
		this.jLabelid_lineaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelid_lineaProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jComboBoxid_lineaProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonid_lineaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonid_lineaProcesoCrearEtiquetasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProcesoCrearEtiquetasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCrearEtiquetasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCrearEtiquetasProductos"));

		this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}

		this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
		this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.setText("U");
		this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCrearEtiquetasProductosUpdate"));



					
		this.jLabelid_linea_grupoProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelid_linea_grupoProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProcesoCrearEtiquetasProductos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelid_linea_grupoProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCrearEtiquetasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCrearEtiquetasProductos"));

		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.setText("U");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCrearEtiquetasProductosUpdate"));



					
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasProductos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCrearEtiquetasProductos"));

		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.setText("U");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCrearEtiquetasProductosUpdate"));



					
		this.jLabelid_linea_marcaProcesoCrearEtiquetasProductos = new JLabelMe();
		this.jLabelid_linea_marcaProcesoCrearEtiquetasProductos.setText(""+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProcesoCrearEtiquetasProductos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProcesoCrearEtiquetasProductos.setToolTipText(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		this.jPanelid_linea_marcaProcesoCrearEtiquetasProductos.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasProductos);


		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCrearEtiquetasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCrearEtiquetasProductos"));

		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.setText("U");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCrearEtiquetasProductosBusqueda"));

		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.setText("U");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCrearEtiquetasProductosUpdate"));



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
		//this.jInternalFrameDetalleProcesoCrearEtiquetasProductos = new ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Crear Etiquetas Productos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCrearEtiquetasProductos= new GridBagLayout();
		

		
		String sToolTipProcesoCrearEtiquetasProductos="";
		sToolTipProcesoCrearEtiquetasProductos=ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCrearEtiquetasProductos+="(Inventario.ProcesoCrearEtiquetasProductos)";
		}
		
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCrearEtiquetasProductos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonModificarProcesoCrearEtiquetasProductos = new JButtonMe();
        this.jButtonActualizarProcesoCrearEtiquetasProductos = new JButtonMe();
        this.jButtonEliminarProcesoCrearEtiquetasProductos = new JButtonMe();
        this.jButtonCancelarProcesoCrearEtiquetasProductos = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonCerrarProcesoCrearEtiquetasProductos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Crear Etiquetas Productos";
		
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCrearEtiquetasProductos.setName("jPanelCamposProcesoCrearEtiquetasProductos"); 

		this.jPanelCamposOcultosProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCrearEtiquetasProductos.setName("jPanelCamposOcultosProcesoCrearEtiquetasProductos"); 

        this.jPanelAccionesProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCrearEtiquetasProductos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCrearEtiquetasProductos.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCrearEtiquetasProductos.setText("Nuevo");
		this.jButtonModificarProcesoCrearEtiquetasProductos.setText("Editar");
        this.jButtonActualizarProcesoCrearEtiquetasProductos.setText("Actualizar");
        this.jButtonEliminarProcesoCrearEtiquetasProductos.setText("Eliminar");
        this.jButtonCancelarProcesoCrearEtiquetasProductos.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.setText("Guardar");
		this.jButtonCerrarProcesoCrearEtiquetasProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCrearEtiquetasProductos,"nuevo_button","Nuevo",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCrearEtiquetasProductos,"modificar_button","Editar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCrearEtiquetasProductos,"actualizar_button","Actualizar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCrearEtiquetasProductos,"eliminar_button","Eliminar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCrearEtiquetasProductos,"cancelar_button","Cancelar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCrearEtiquetasProductos,"guardarcambios_button","Guardar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos,"guardarcambiostabla_button","Guardar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCrearEtiquetasProductos,"cerrar_button","Salir",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCrearEtiquetasProductos.setToolTipText("Nuevo"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCrearEtiquetasProductos.setToolTipText("Editar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCrearEtiquetasProductos.setToolTipText("Actualizar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCrearEtiquetasProductos.setToolTipText("Eliminar)"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCrearEtiquetasProductos.setToolTipText("Cancelar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.setToolTipText("Guardar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.setToolTipText("Guardar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCrearEtiquetasProductos.setToolTipText("Salir"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonNuevoProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCrearEtiquetasProductos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonActualizarProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCrearEtiquetasProductos"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonEliminarProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCrearEtiquetasProductos"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonCancelarProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCrearEtiquetasProductos"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonCerrarProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCrearEtiquetasProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCrearEtiquetasProductos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasProductos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasProductos.setToolTipText("Nuevo ProcesoCrearEtiquetasProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasProductos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasProductos.setToolTipText("Sin Cerrar Ventana ProcesoCrearEtiquetasProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasProductos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasProductos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCrearEtiquetasProductos = new JLabelMe();
		
		this.jLabelAccionesProcesoCrearEtiquetasProductos.setText("Acciones");		
		this.jLabelAccionesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCrearEtiquetasProductos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCrearEtiquetasProductos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCrearEtiquetasProductos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCrearEtiquetasProductos = new GridBagLayout();
		
		this.jPanelCamposProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutCamposProcesoCrearEtiquetasProductos);
		this.jPanelCamposOcultosProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutCamposOcultosProcesoCrearEtiquetasProductos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCrearEtiquetasProductos.add(jLabelIdProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCrearEtiquetasProductos.add(jLabelidProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProcesoCrearEtiquetasProductos.add(jLabelid_bodegaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoCrearEtiquetasProductos.add(jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoCrearEtiquetasProductos.add(jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProcesoCrearEtiquetasProductos.add(jComboBoxid_bodegaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProcesoCrearEtiquetasProductos.add(jLabelid_productoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoCrearEtiquetasProductos.add(jButtonid_productoProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoCrearEtiquetasProductos.add(jButtonid_productoProcesoCrearEtiquetasProductosUpdate, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProcesoCrearEtiquetasProductos.add(jComboBoxid_productoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoCrearEtiquetasProductos.add(jLabelid_empresaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoCrearEtiquetasProductos.add(jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoCrearEtiquetasProductos.add(jButtonid_empresaProcesoCrearEtiquetasProductosUpdate, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoCrearEtiquetasProductos.add(jComboBoxid_empresaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoCrearEtiquetasProductos.add(jLabelid_sucursalProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoCrearEtiquetasProductos.add(jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoCrearEtiquetasProductos.add(jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoCrearEtiquetasProductos.add(jComboBoxid_sucursalProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProcesoCrearEtiquetasProductos.add(jLabelid_lineaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoCrearEtiquetasProductos.add(jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoCrearEtiquetasProductos.add(jButtonid_lineaProcesoCrearEtiquetasProductosUpdate, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProcesoCrearEtiquetasProductos.add(jComboBoxid_lineaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProcesoCrearEtiquetasProductos.add(jLabelid_linea_grupoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoCrearEtiquetasProductos.add(jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoCrearEtiquetasProductos.add(jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProcesoCrearEtiquetasProductos.add(jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos.add(jLabelid_linea_categoriaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos.add(jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos.add(jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos.add(jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProcesoCrearEtiquetasProductos.add(jLabelid_linea_marcaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoCrearEtiquetasProductos.add(jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoCrearEtiquetasProductos.add(jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProcesoCrearEtiquetasProductos.add(jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoCrearEtiquetasProductos.add(jLabelcodigoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoCrearEtiquetasProductos.add(jButtoncodigoProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoCrearEtiquetasProductos.add(jTextFieldcodigoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProcesoCrearEtiquetasProductos.add(jLabelnombreProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProcesoCrearEtiquetasProductos.add(jButtonnombreProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProcesoCrearEtiquetasProductos.add(jscrollPanenombreProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio1ProcesoCrearEtiquetasProductos.add(jLabelprecio1ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio1ProcesoCrearEtiquetasProductos.add(jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio1ProcesoCrearEtiquetasProductos.add(jTextFieldprecio1ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio2ProcesoCrearEtiquetasProductos.add(jLabelprecio2ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio2ProcesoCrearEtiquetasProductos.add(jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio2ProcesoCrearEtiquetasProductos.add(jTextFieldprecio2ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio3ProcesoCrearEtiquetasProductos.add(jLabelprecio3ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio3ProcesoCrearEtiquetasProductos.add(jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio3ProcesoCrearEtiquetasProductos.add(jTextFieldprecio3ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio4ProcesoCrearEtiquetasProductos.add(jLabelprecio4ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio4ProcesoCrearEtiquetasProductos.add(jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio4ProcesoCrearEtiquetasProductos.add(jTextFieldprecio4ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio5ProcesoCrearEtiquetasProductos.add(jLabelprecio5ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio5ProcesoCrearEtiquetasProductos.add(jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio5ProcesoCrearEtiquetasProductos.add(jTextFieldprecio5ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelidProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelid_bodegaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelid_productoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelid_lineaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelid_linea_grupoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelid_linea_marcaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelcodigoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelnombreProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelprecio1ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelprecio2ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelprecio3ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelprecio4ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasProductos.add(this.jPanelprecio5ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasProductos=0;
		iYPanelCamposProcesoCrearEtiquetasProductos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposOcultosProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposOcultosProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCrearEtiquetasProductos.add(this.jPanelid_empresaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposOcultosProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposOcultosProcesoCrearEtiquetasProductos=0;
		iYPanelCamposOcultosProcesoCrearEtiquetasProductos++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iYPanelCamposOcultosProcesoCrearEtiquetasProductos;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iXPanelCamposOcultosProcesoCrearEtiquetasProductos++;
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCrearEtiquetasProductos.add(this.jPanelid_sucursalProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);



	if(iXPanelCamposOcultosProcesoCrearEtiquetasProductos % 2==0) {
		iXPanelCamposOcultosProcesoCrearEtiquetasProductos=0;
		iYPanelCamposOcultosProcesoCrearEtiquetasProductos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCrearEtiquetasProductos= new GridBagLayout();
		this.jPanelAccionesProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutAccionesProcesoCrearEtiquetasProductos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCrearEtiquetasProductos= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutAccionesFormularioProcesoCrearEtiquetasProductos);
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCrearEtiquetasProductos.add(this.jButtonModificarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);							

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCrearEtiquetasProductos.add(this.jButtonEliminarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
			
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCrearEtiquetasProductos.add(this.jButtonActualizarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCrearEtiquetasProductos.add(this.jButtonGuardarCambiosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);	
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCrearEtiquetasProductos.add(this.jButtonCancelarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCrearEtiquetasProductos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;		
			//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCrearEtiquetasProductos = new ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Crear Etiquetas Productos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Crear Etiquetas Productos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Crear Etiquetas Productos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCrearEtiquetasProductosModel procesocrearetiquetasproductosModel=new ProcesoCrearEtiquetasProductosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCrearEtiquetasProductosModel.ProcesoCrearEtiquetasProductosFocusTraversalPolicy procesocrearetiquetasproductosFocusTraversalPolicy = procesocrearetiquetasproductosModel.new ProcesoCrearEtiquetasProductosFocusTraversalPolicy(this);
			
			//procesocrearetiquetasproductosFocusTraversalPolicy.setprocesocrearetiquetasproductosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocrearetiquetasproductosModel);
			
			
			this.jContentPaneDetalleProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCrearEtiquetasProductos = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutDetalleProcesoCrearEtiquetasProductos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCrearEtiquetasProductos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
				this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCrearEtiquetasProductos.add(jTtoolBarDetalleProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos=   new JScrollPane(jContentPaneDetalleProcesoCrearEtiquetasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCrearEtiquetasProductos.add(jPanelCamposProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);
			
			
			
			
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
						//&& procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCrearEtiquetasProductos= new GridBagConstraints();
						this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
						this.jContentPaneDetalleProcesoCrearEtiquetasProductos.add(this.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCrearEtiquetasProductos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
					this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCrearEtiquetasProductos.add(jPanelCamposOcultosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);
				
					this.jPanelCamposOcultosProcesoCrearEtiquetasProductos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	        this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCrearEtiquetasProductos.add(this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);							
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCrearEtiquetasProductos.add(this.jPanelAccionesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos=   new JScrollPane(this.jPanelCamposProcesoCrearEtiquetasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			
			
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
			
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos;
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
