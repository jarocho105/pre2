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
import com.bydan.erp.inventario.util.DetalleCodigoBarraProductoConstantesFunciones;

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
public class DetalleCodigoBarraProductoDetalleFormJInternalFrame extends DetalleCodigoBarraProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleCodigoBarraProducto;
	
	protected JMenuBar jmenuBarDetalleDetalleCodigoBarraProducto;
	
	protected JMenu jmenuDetalleDetalleCodigoBarraProducto;
	protected JMenu jmenuDetalleArchivoDetalleCodigoBarraProducto;
	protected JMenu jmenuDetalleAccionesDetalleCodigoBarraProducto;
	protected JMenu jmenuDetalleDatosDetalleCodigoBarraProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCodigoBarraProducto;	
	protected GridBagConstraints gridBagConstraintsDetalleCodigoBarraProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleCodigoBarraProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleCodigoBarraProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public DetalleCodigoBarraProductoSessionBean detallecodigobarraproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public DetalleCodigoBarraProductoLogic detallecodigobarraproductoLogic;
	
	public JScrollPane jScrollPanelDatosDetalleCodigoBarraProducto;
	public JScrollPane jScrollPanelDatosEdicionDetalleCodigoBarraProducto;
	public JScrollPane jScrollPanelDatosGeneralDetalleCodigoBarraProducto;
	
	protected JPanel jPanelCamposDetalleCodigoBarraProducto;    
	protected JPanel jPanelCamposOcultosDetalleCodigoBarraProducto;    	
	protected JPanel jPanelAccionesDetalleCodigoBarraProducto;
	protected JPanel jPanelAccionesFormularioDetalleCodigoBarraProducto;
    
	
	
	protected Integer iXPanelCamposDetalleCodigoBarraProducto=0;
	protected Integer iYPanelCamposDetalleCodigoBarraProducto=0;
	
	protected Integer iXPanelCamposOcultosDetalleCodigoBarraProducto=0;
	protected Integer iYPanelCamposOcultosDetalleCodigoBarraProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleCodigoBarraProducto;
	public JButton jButtonModificarDetalleCodigoBarraProducto;
	public JButton jButtonActualizarDetalleCodigoBarraProducto;
    public JButton jButtonEliminarDetalleCodigoBarraProducto;
	public JButton jButtonCancelarDetalleCodigoBarraProducto;
    public JButton jButtonGuardarCambiosDetalleCodigoBarraProducto;
	public JButton jButtonGuardarCambiosTablaDetalleCodigoBarraProducto;
	protected JButton jButtonCerrarDetalleCodigoBarraProducto;
	
	
	protected JButton jButtonProcesarInformacionDetalleCodigoBarraProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleCodigoBarraProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleCodigoBarraProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleCodigoBarraProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonModificarToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonActualizarToolBarDetalleCodigoBarraProducto;
    protected JButton jButtonEliminarToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonCancelarToolBarDetalleCodigoBarraProducto;
    protected JButton jButtonGuardarCambiosToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonCerrarToolBarDetalleCodigoBarraProducto;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleCodigoBarraProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemModificarDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemActualizarDetalleCodigoBarraProducto;
    protected JMenuItem jMenuItemEliminarDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemCancelarDetalleCodigoBarraProducto;
    protected JMenuItem jMenuItemGuardarCambiosDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemCerrarDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCodigoBarraProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCodigoBarraProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCodigoBarraProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleCodigoBarraProducto;
	public JLabel jLabelIdDetalleCodigoBarraProducto;
	public JLabel jLabelidDetalleCodigoBarraProducto;
	public JButton jButtonidDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelcontrolDetalleCodigoBarraProducto;
	public JLabel jLabelcontrolDetalleCodigoBarraProducto;
	public JTextField jTextFieldcontrolDetalleCodigoBarraProducto;
	public JButton jButtoncontrolDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelmedicionDetalleCodigoBarraProducto;
	public JLabel jLabelmedicionDetalleCodigoBarraProducto;
	public JTextField jTextFieldmedicionDetalleCodigoBarraProducto;
	public JButton jButtonmedicionDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_anteriorDetalleCodigoBarraProducto;
	public JLabel jLabelvalor_anteriorDetalleCodigoBarraProducto;
	public JTextField jTextFieldvalor_anteriorDetalleCodigoBarraProducto;
	public JButton jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelfechaDetalleCodigoBarraProducto;
	public JLabel jLabelfechaDetalleCodigoBarraProducto;
	//public JFormattedTextField jDateChooserfechaDetalleCodigoBarraProducto;

	public JDateChooser jDateChooserfechaDetalleCodigoBarraProducto;
	public JButton jButtonfechaDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelobservacionDetalleCodigoBarraProducto;
	public JLabel jLabelobservacionDetalleCodigoBarraProducto;
	public JTextArea jTextAreaobservacionDetalleCodigoBarraProducto;
	public JScrollPane jscrollPaneobservacionDetalleCodigoBarraProducto;
	public JButton jButtonobservacionDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleCodigoBarraProducto;
	public JLabel jLabelid_empresaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleCodigoBarraProducto;
	public JButton jButtonid_empresaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_empresaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleCodigoBarraProducto;
	public JLabel jLabelid_sucursalDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleCodigoBarraProducto;
	public JButton jButtonid_sucursalDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_sucursalDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleCodigoBarraProducto;
	public JLabel jLabelid_bodegaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleCodigoBarraProducto;
	public JButton jButtonid_bodegaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_bodegaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleCodigoBarraProducto;
	public JLabel jLabelid_productoDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleCodigoBarraProducto;
	public JButton jButtonid_productoDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_productoDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleCodigoBarraProducto;
	public JLabel jLabelid_unidadDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleCodigoBarraProducto;
	public JButton jButtonid_unidadDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_unidadDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaDetalleCodigoBarraProducto;
	public JLabel jLabelid_lineaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaDetalleCodigoBarraProducto;
	public JButton jButtonid_lineaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_lineaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaDetalleCodigoBarraProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoDetalleCodigoBarraProducto;
	public JLabel jLabelid_linea_grupoDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoDetalleCodigoBarraProducto;
	public JButton jButtonid_linea_grupoDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoDetalleCodigoBarraProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaDetalleCodigoBarraProducto;
	public JLabel jLabelid_linea_categoriaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaDetalleCodigoBarraProducto;
	public JButton jButtonid_linea_categoriaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_marcaDetalleCodigoBarraProducto;
	public JLabel jLabelid_linea_marcaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaDetalleCodigoBarraProducto;
	public JButton jButtonid_linea_marcaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaDetalleCodigoBarraProductoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleCodigoBarraProducto;
	
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
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleCodigoBarraProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleCodigoBarraProducto=new JPanel();
				this.jPanelAccionesFormularioDetalleCodigoBarraProducto=new JPanel();
				this.jmenuBarDetalleDetalleCodigoBarraProducto=new JMenuBar();
				this.jTtoolBarDetalleDetalleCodigoBarraProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCodigoBarraProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleCodigoBarraProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCodigoBarraProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCodigoBarraProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCodigoBarraProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleCodigoBarraProducto() {
		return this.jButtonActualizarToolBarDetalleCodigoBarraProducto;
	}
	
	public JButton getjButtonEliminarToolBarDetalleCodigoBarraProducto() {
		return this.jButtonEliminarToolBarDetalleCodigoBarraProducto;
	}
	
	public JButton getjButtonCancelarToolBarDetalleCodigoBarraProducto() {
		return this.jButtonCancelarToolBarDetalleCodigoBarraProducto;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleCodigoBarraProducto() {
		return this.jButtonProcesarInformacionDetalleCodigoBarraProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCodigoBarraProducto)	{
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto = jButtonProcesarInformacionDetalleCodigoBarraProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCodigoBarraProducto() {
		return this.jComboBoxTiposAccionesDetalleCodigoBarraProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposRelacionesDetalleCodigoBarraProducto) {
		this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto = jComboBoxTiposRelacionesDetalleCodigoBarraProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposAccionesDetalleCodigoBarraProducto) {
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto = jComboBoxTiposAccionesDetalleCodigoBarraProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto() {
		return this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto) {
		this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto = jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallecodigobarraproductoSessionBean=new DetalleCodigoBarraProductoSessionBean();
		
		this.detallecodigobarraproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecodigobarraproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleCodigoBarraProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleCodigoBarraProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleCodigoBarraProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Codigo Barra Producto MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleCodigoBarraProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleCodigoBarraProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleCodigoBarraProducto=new JButtonMe();
				this.jButtonModificarToolBarDetalleCodigoBarraProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleDetalleCodigoBarraProducto,
							"actualizar","actualizar","Actualizar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleDetalleCodigoBarraProducto,
							"eliminar","eliminar","Eliminar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleDetalleCodigoBarraProducto,
							"cancelar","cancelar","Cancelar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleDetalleCodigoBarraProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleCodigoBarraProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleCodigoBarraProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleCodigoBarraProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleCodigoBarraProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleCodigoBarraProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCodigoBarraProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCodigoBarraProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCodigoBarraProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleCodigoBarraProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleCodigoBarraProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleCodigoBarraProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleCodigoBarraProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleCodigoBarraProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleCodigoBarraProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleCodigoBarraProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleCodigoBarraProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleCodigoBarraProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleCodigoBarraProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleCodigoBarraProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleCodigoBarraProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCodigoBarraProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCodigoBarraProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCodigoBarraProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleCodigoBarraProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleCodigoBarraProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleCodigoBarraProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleCodigoBarraProducto.add(this.jMenuItemDetalleCerrarDetalleCodigoBarraProducto);
		
		this.jmenuDetalleAccionesDetalleCodigoBarraProducto.add(this.jMenuItemActualizarDetalleCodigoBarraProducto);
		this.jmenuDetalleAccionesDetalleCodigoBarraProducto.add(this.jMenuItemEliminarDetalleCodigoBarraProducto);
		this.jmenuDetalleAccionesDetalleCodigoBarraProducto.add(this.jMenuItemCancelarDetalleCodigoBarraProducto);		
		
		//this.jmenuDetalleDatosDetalleCodigoBarraProducto.add(this.jMenuItemDetalleAbrirOrderByDetalleCodigoBarraProducto);				
		this.jmenuDetalleDatosDetalleCodigoBarraProducto.add(this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto);				
				
		//this.jmenuDetalleAccionesDetalleCodigoBarraProducto.add(this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleCodigoBarraProducto.add(this.jmenuDetalleArchivoDetalleCodigoBarraProducto);		
		this.jmenuBarDetalleDetalleCodigoBarraProducto.add(this.jmenuDetalleAccionesDetalleCodigoBarraProducto);		
		this.jmenuBarDetalleDetalleCodigoBarraProducto.add(this.jmenuDetalleDatosDetalleCodigoBarraProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleCodigoBarraProducto);				
	}
	
	
	public void inicializarElementosCamposDetalleCodigoBarraProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleCodigoBarraProducto = new JLabelMe();
		jLabelIdDetalleCodigoBarraProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleCodigoBarraProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleCodigoBarraProducto= new GridBagLayout();

		this.jPanelidDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);

		jLabelidDetalleCodigoBarraProducto = new JLabel();
		jLabelidDetalleCodigoBarraProducto.setText("Id");

		jLabelidDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcontrolDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelcontrolDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_CONTROL+" : *");
		this.jLabelcontrolDetalleCodigoBarraProducto.setToolTipText("Control");
		this.jLabelcontrolDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontrolDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontrolDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcontrolDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcontrolDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcontrolDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_CONTROL);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelcontrolDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jTextFieldcontrolDetalleCodigoBarraProducto= new JTextFieldMe();

		jTextFieldcontrolDetalleCodigoBarraProducto.setEnabled(false);
		jTextFieldcontrolDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcontrolDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcontrolDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcontrolDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncontrolDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtoncontrolDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontrolDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontrolDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncontrolDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtoncontrolDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncontrolDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncontrolDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcontrolDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcontrolDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"controlDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncontrolDetalleCodigoBarraProductoBusqueda.setVisible(false);		}


					
		this.jLabelmedicionDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelmedicionDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_MEDICION+" : *");
		this.jLabelmedicionDetalleCodigoBarraProducto.setToolTipText("Medicion");
		this.jLabelmedicionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmedicionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmedicionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmedicionDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmedicionDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmedicionDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_MEDICION);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelmedicionDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jTextFieldmedicionDetalleCodigoBarraProducto= new JTextFieldMe();

		jTextFieldmedicionDetalleCodigoBarraProducto.setEnabled(false);
		jTextFieldmedicionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmedicionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmedicionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmedicionDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonmedicionDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonmedicionDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmedicionDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmedicionDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmedicionDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonmedicionDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmedicionDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmedicionDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmedicionDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmedicionDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"medicionDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmedicionDetalleCodigoBarraProductoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_anteriorDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelvalor_anteriorDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_VALORANTERIOR+" : *");
		this.jLabelvalor_anteriorDetalleCodigoBarraProducto.setToolTipText("Valor Anterior");
		this.jLabelvalor_anteriorDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_anteriorDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_anteriorDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_anteriorDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_anteriorDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_anteriorDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_VALORANTERIOR);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelvalor_anteriorDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jTextFieldvalor_anteriorDetalleCodigoBarraProducto= new JTextFieldMe();
		jTextFieldvalor_anteriorDetalleCodigoBarraProducto.setEnabled(false);
		jTextFieldvalor_anteriorDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_anteriorDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_anteriorDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_anteriorDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_anteriorDetalleCodigoBarraProducto.setText("0.0");

		this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_anteriorDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_anteriorDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_anteriorDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda.setVisible(false);		}


					
		this.jLabelfechaDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelfechaDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDetalleCodigoBarraProducto.setToolTipText("Fecha");
		this.jLabelfechaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelfechaDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		//jFormattedTextFieldfechaDetalleCodigoBarraProducto= new JFormattedTextFieldMe();

		jDateChooserfechaDetalleCodigoBarraProducto= new JDateChooser();
		jDateChooserfechaDetalleCodigoBarraProducto.setEnabled(false);
		jDateChooserfechaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDetalleCodigoBarraProducto.setDate(new Date());
		jDateChooserfechaDetalleCodigoBarraProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDetalleCodigoBarraProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonfechaDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonfechaDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDetalleCodigoBarraProductoBusqueda.setVisible(false);		}


					
		this.jLabelobservacionDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelobservacionDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionDetalleCodigoBarraProducto.setToolTipText("Observacion");
		this.jLabelobservacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelobservacionDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jTextAreaobservacionDetalleCodigoBarraProducto= new JTextAreaMe();
		jTextAreaobservacionDetalleCodigoBarraProducto.setEnabled(false);
		jTextAreaobservacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionDetalleCodigoBarraProducto.setLineWrap(true);
		jTextAreaobservacionDetalleCodigoBarraProducto.setWrapStyleWord(true);
		jTextAreaobservacionDetalleCodigoBarraProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionDetalleCodigoBarraProducto.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionDetalleCodigoBarraProducto = new JScrollPane(jTextAreaobservacionDetalleCodigoBarraProducto);
		jscrollPaneobservacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonobservacionDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonobservacionDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionDetalleCodigoBarraProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleCodigoBarraProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_empresaDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleCodigoBarraProducto.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_empresaDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_empresaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_empresaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleCodigoBarraProducto.setEnabled(false);

		this.jButtonid_empresaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_empresaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_empresaDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleCodigoBarraProducto"));

		this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_empresaDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleCodigoBarraProductoUpdate"));



					
		this.jLabelid_sucursalDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_sucursalDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleCodigoBarraProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_sucursalDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_sucursalDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_sucursalDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleCodigoBarraProducto.setEnabled(false);

		this.jButtonid_sucursalDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_sucursalDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_sucursalDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleCodigoBarraProducto"));

		this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_sucursalDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleCodigoBarraProductoUpdate"));



					
		this.jLabelid_bodegaDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_bodegaDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleCodigoBarraProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_bodegaDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_bodegaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_bodegaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_bodegaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_bodegaDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleCodigoBarraProducto"));

		this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_bodegaDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleCodigoBarraProductoUpdate"));



					
		this.jLabelid_productoDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_productoDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleCodigoBarraProducto.setToolTipText("Producto");
		this.jLabelid_productoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_productoDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_productoDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_productoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_productoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_productoDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleCodigoBarraProducto"));

		this.jButtonid_productoDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_productoDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_productoDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_productoDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleCodigoBarraProductoUpdate"));



					
		this.jLabelid_unidadDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_unidadDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleCodigoBarraProducto.setToolTipText("Unad");
		this.jLabelid_unidadDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_unidadDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_unidadDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_unidadDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_unidadDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_unidadDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleCodigoBarraProducto"));

		this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_unidadDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleCodigoBarraProductoUpdate"));



					
		this.jLabelid_lineaDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_lineaDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaDetalleCodigoBarraProducto.setToolTipText("Linea");
		this.jLabelid_lineaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_lineaDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_lineaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_lineaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_lineaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_lineaDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDetalleCodigoBarraProducto"));

		this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_lineaDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_lineaDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_lineaDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDetalleCodigoBarraProductoUpdate"));


		jButtonid_lineaDetalleCodigoBarraProductoArbol= new JButtonMe();
		jButtonid_lineaDetalleCodigoBarraProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaDetalleCodigoBarraProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaDetalleCodigoBarraProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaDetalleCodigoBarraProductoArbol.setText("Arbol");
		jButtonid_lineaDetalleCodigoBarraProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaDetalleCodigoBarraProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDetalleCodigoBarraProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDetalleCodigoBarraProductoArbol"));



					
		this.jLabelid_linea_grupoDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_linea_grupoDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoDetalleCodigoBarraProducto.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_linea_grupoDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_linea_grupoDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_linea_grupoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_linea_grupoDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDetalleCodigoBarraProducto"));

		this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDetalleCodigoBarraProductoUpdate"));


		jButtonid_linea_grupoDetalleCodigoBarraProductoArbol= new JButtonMe();
		jButtonid_linea_grupoDetalleCodigoBarraProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoDetalleCodigoBarraProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoDetalleCodigoBarraProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoDetalleCodigoBarraProductoArbol.setText("Arbol");
		jButtonid_linea_grupoDetalleCodigoBarraProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoDetalleCodigoBarraProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDetalleCodigoBarraProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDetalleCodigoBarraProductoArbol"));



					
		this.jLabelid_linea_categoriaDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_linea_categoriaDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaDetalleCodigoBarraProducto.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_linea_categoriaDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_linea_categoriaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_linea_categoriaDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDetalleCodigoBarraProducto"));

		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDetalleCodigoBarraProductoUpdate"));


		jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol= new JButtonMe();
		jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol.setText("Arbol");
		jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDetalleCodigoBarraProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDetalleCodigoBarraProductoArbol"));



					
		this.jLabelid_linea_marcaDetalleCodigoBarraProducto = new JLabelMe();
		this.jLabelid_linea_marcaDetalleCodigoBarraProducto.setText(""+DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaDetalleCodigoBarraProducto.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaDetalleCodigoBarraProducto.setToolTipText(DetalleCodigoBarraProductoConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		this.jPanelid_linea_marcaDetalleCodigoBarraProducto.setLayout(this.gridaBagLayoutDetalleCodigoBarraProducto);


		jComboBoxid_linea_marcaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonid_linea_marcaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonid_linea_marcaDetalleCodigoBarraProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaDetalleCodigoBarraProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDetalleCodigoBarraProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDetalleCodigoBarraProducto"));

		this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda.setText("U");
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDetalleCodigoBarraProductoBusqueda"));

		if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate= new JButtonMe();
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate.setText("U");
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDetalleCodigoBarraProductoUpdate"));


		jButtonid_linea_marcaDetalleCodigoBarraProductoArbol= new JButtonMe();
		jButtonid_linea_marcaDetalleCodigoBarraProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaDetalleCodigoBarraProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaDetalleCodigoBarraProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaDetalleCodigoBarraProductoArbol.setText("Arbol");
		jButtonid_linea_marcaDetalleCodigoBarraProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_marcaDetalleCodigoBarraProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDetalleCodigoBarraProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDetalleCodigoBarraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDetalleCodigoBarraProductoArbol"));



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
		//this.jInternalFrameDetalleDetalleCodigoBarraProducto = new DetalleCodigoBarraProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Codigo Barra Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleCodigoBarraProducto= new GridBagLayout();
		

		
		String sToolTipDetalleCodigoBarraProducto="";
		sToolTipDetalleCodigoBarraProducto=DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCodigoBarraProducto+="(Inventario.DetalleCodigoBarraProducto)";
		}
		
		if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCodigoBarraProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonModificarDetalleCodigoBarraProducto = new JButtonMe();
        this.jButtonActualizarDetalleCodigoBarraProducto = new JButtonMe();
        this.jButtonEliminarDetalleCodigoBarraProducto = new JButtonMe();
        this.jButtonCancelarDetalleCodigoBarraProducto = new JButtonMe();
        this.jButtonGuardarCambiosDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonCerrarDetalleCodigoBarraProducto = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCodigoBarraProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Codigo Barra Producto";
		
		if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Codigo Barra Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCodigoBarraProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleCodigoBarraProducto.setName("jPanelCamposDetalleCodigoBarraProducto"); 

		this.jPanelCamposOcultosDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleCodigoBarraProducto.setName("jPanelCamposOcultosDetalleCodigoBarraProducto"); 

        this.jPanelAccionesDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCodigoBarraProducto.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCodigoBarraProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleCodigoBarraProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleCodigoBarraProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleCodigoBarraProducto.setText("Nuevo");
		this.jButtonModificarDetalleCodigoBarraProducto.setText("Editar");
        this.jButtonActualizarDetalleCodigoBarraProducto.setText("Actualizar");
        this.jButtonEliminarDetalleCodigoBarraProducto.setText("Eliminar");
        this.jButtonCancelarDetalleCodigoBarraProducto.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleCodigoBarraProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto.setText("Guardar");
		this.jButtonCerrarDetalleCodigoBarraProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCodigoBarraProducto,"nuevo_button","Nuevo",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleCodigoBarraProducto,"modificar_button","Editar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleCodigoBarraProducto,"actualizar_button","Actualizar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleCodigoBarraProducto,"eliminar_button","Eliminar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleCodigoBarraProducto,"cancelar_button","Cancelar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleCodigoBarraProducto,"guardarcambios_button","Guardar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto,"guardarcambiostabla_button","Guardar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCodigoBarraProducto,"cerrar_button","Salir",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleCodigoBarraProducto.setToolTipText("Nuevo"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleCodigoBarraProducto.setToolTipText("Editar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleCodigoBarraProducto.setToolTipText("Actualizar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleCodigoBarraProducto.setToolTipText("Eliminar)"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleCodigoBarraProducto.setToolTipText("Cancelar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleCodigoBarraProducto.setToolTipText("Guardar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto.setToolTipText("Guardar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCodigoBarraProducto.setToolTipText("Salir"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCodigoBarraProducto";
		inputMap = this.jButtonNuevoDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCodigoBarraProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCodigoBarraProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleCodigoBarraProducto";
		inputMap = this.jButtonActualizarDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleCodigoBarraProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleCodigoBarraProducto";
		inputMap = this.jButtonEliminarDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleCodigoBarraProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleCodigoBarraProducto";
		inputMap = this.jButtonCancelarDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleCodigoBarraProducto"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleCodigoBarraProducto";
		inputMap = this.jButtonCerrarDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCodigoBarraProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCodigoBarraProducto";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCodigoBarraProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleCodigoBarraProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleCodigoBarraProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleCodigoBarraProducto.setToolTipText("Nuevo DetalleCodigoBarraProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleCodigoBarraProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleCodigoBarraProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleCodigoBarraProducto.setToolTipText("Sin Cerrar Ventana DetalleCodigoBarraProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleCodigoBarraProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleCodigoBarraProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleCodigoBarraProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleCodigoBarraProducto = new JLabelMe();
		
		this.jLabelAccionesDetalleCodigoBarraProducto.setText("Acciones");		
		this.jLabelAccionesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleCodigoBarraProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleCodigoBarraProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleCodigoBarraProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleCodigoBarraProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleCodigoBarraProducto = new GridBagLayout();
		
		this.jPanelCamposDetalleCodigoBarraProducto.setLayout(gridaBagLayoutCamposDetalleCodigoBarraProducto);
		this.jPanelCamposOcultosDetalleCodigoBarraProducto.setLayout(gridaBagLayoutCamposOcultosDetalleCodigoBarraProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleCodigoBarraProducto.add(jLabelIdDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleCodigoBarraProducto.add(jLabelidDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleCodigoBarraProducto.add(jLabelid_empresaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleCodigoBarraProducto.add(jButtonid_empresaDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleCodigoBarraProducto.add(jButtonid_empresaDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleCodigoBarraProducto.add(jComboBoxid_empresaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleCodigoBarraProducto.add(jLabelid_sucursalDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleCodigoBarraProducto.add(jButtonid_sucursalDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleCodigoBarraProducto.add(jButtonid_sucursalDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleCodigoBarraProducto.add(jComboBoxid_sucursalDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleCodigoBarraProducto.add(jLabelid_bodegaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleCodigoBarraProducto.add(jButtonid_bodegaDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleCodigoBarraProducto.add(jButtonid_bodegaDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleCodigoBarraProducto.add(jComboBoxid_bodegaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleCodigoBarraProducto.add(jLabelid_productoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleCodigoBarraProducto.add(jButtonid_productoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleCodigoBarraProducto.add(jButtonid_productoDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 4;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleCodigoBarraProducto.add(jButtonid_productoDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleCodigoBarraProducto.add(jComboBoxid_productoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleCodigoBarraProducto.add(jLabelid_unidadDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleCodigoBarraProducto.add(jButtonid_unidadDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleCodigoBarraProducto.add(jButtonid_unidadDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleCodigoBarraProducto.add(jComboBoxid_unidadDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaDetalleCodigoBarraProducto.add(jLabelid_lineaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDetalleCodigoBarraProducto.add(jButtonid_lineaDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDetalleCodigoBarraProducto.add(jButtonid_lineaDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaDetalleCodigoBarraProducto.add(jComboBoxid_lineaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoDetalleCodigoBarraProducto.add(jLabelid_linea_grupoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoDetalleCodigoBarraProducto.add(jButtonid_linea_grupoDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoDetalleCodigoBarraProducto.add(jButtonid_linea_grupoDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoDetalleCodigoBarraProducto.add(jComboBoxid_linea_grupoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaDetalleCodigoBarraProducto.add(jLabelid_linea_categoriaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaDetalleCodigoBarraProducto.add(jButtonid_linea_categoriaDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaDetalleCodigoBarraProducto.add(jButtonid_linea_categoriaDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaDetalleCodigoBarraProducto.add(jComboBoxid_linea_categoriaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaDetalleCodigoBarraProducto.add(jLabelid_linea_marcaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaDetalleCodigoBarraProducto.add(jButtonid_linea_marcaDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 3;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaDetalleCodigoBarraProducto.add(jButtonid_linea_marcaDetalleCodigoBarraProductoUpdate, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaDetalleCodigoBarraProducto.add(jComboBoxid_linea_marcaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcontrolDetalleCodigoBarraProducto.add(jLabelcontrolDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcontrolDetalleCodigoBarraProducto.add(jButtoncontrolDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcontrolDetalleCodigoBarraProducto.add(jTextFieldcontrolDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmedicionDetalleCodigoBarraProducto.add(jLabelmedicionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelmedicionDetalleCodigoBarraProducto.add(jButtonmedicionDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmedicionDetalleCodigoBarraProducto.add(jTextFieldmedicionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_anteriorDetalleCodigoBarraProducto.add(jLabelvalor_anteriorDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_anteriorDetalleCodigoBarraProducto.add(jButtonvalor_anteriorDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_anteriorDetalleCodigoBarraProducto.add(jTextFieldvalor_anteriorDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDetalleCodigoBarraProducto.add(jLabelfechaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDetalleCodigoBarraProducto.add(jButtonfechaDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDetalleCodigoBarraProducto.add(jDateChooserfechaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionDetalleCodigoBarraProducto.add(jLabelobservacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 2;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionDetalleCodigoBarraProducto.add(jButtonobservacionDetalleCodigoBarraProductoBusqueda, this.gridBagConstraintsDetalleCodigoBarraProducto);
	}

	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionDetalleCodigoBarraProducto.add(jscrollPaneobservacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelidDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelid_bodegaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelid_productoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelid_unidadDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelid_lineaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelid_linea_grupoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelid_linea_categoriaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelid_linea_marcaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelcontrolDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelmedicionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelvalor_anteriorDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelfechaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCodigoBarraProducto.add(this.jPanelobservacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposDetalleCodigoBarraProducto=0;
		iYPanelCamposDetalleCodigoBarraProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposOcultosDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposOcultosDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCodigoBarraProducto.add(this.jPanelid_empresaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposOcultosDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposOcultosDetalleCodigoBarraProducto=0;
		iYPanelCamposOcultosDetalleCodigoBarraProducto++;
	}
	this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iYPanelCamposOcultosDetalleCodigoBarraProducto;
	this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iXPanelCamposOcultosDetalleCodigoBarraProducto++;
	this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCodigoBarraProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCodigoBarraProducto.add(this.jPanelid_sucursalDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);



	if(iXPanelCamposOcultosDetalleCodigoBarraProducto % 2==0) {
		iXPanelCamposOcultosDetalleCodigoBarraProducto=0;
		iYPanelCamposOcultosDetalleCodigoBarraProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleCodigoBarraProducto= new GridBagLayout();
		this.jPanelAccionesDetalleCodigoBarraProducto.setLayout(gridaBagLayoutAccionesDetalleCodigoBarraProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleCodigoBarraProducto= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleCodigoBarraProducto.setLayout(gridaBagLayoutAccionesFormularioDetalleCodigoBarraProducto);
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCodigoBarraProducto.add(this.jComboBoxTiposAccionesFormularioDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCodigoBarraProducto.add(this.jCheckBoxPostAccionNuevoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallecodigobarraproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCodigoBarraProducto.add(this.jCheckBoxPostAccionSinCerrarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallecodigobarraproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCodigoBarraProducto.add(this.jCheckBoxPostAccionSinMensajeDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleCodigoBarraProducto.add(this.jButtonModificarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);							

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleCodigoBarraProducto.add(this.jButtonEliminarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
			
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCodigoBarraProducto.add(this.jButtonActualizarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCodigoBarraProducto.add(this.jButtonGuardarCambiosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);	
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleCodigoBarraProducto.add(this.jButtonCancelarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCodigoBarraProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;		
			//this.gridBagConstraintsDetalleCodigoBarraProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCodigoBarraProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleCodigoBarraProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleCodigoBarraProducto = new DetalleCodigoBarraProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Codigo Barra Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Codigo Barra Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Codigo Barra Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleCodigoBarraProductoModel detallecodigobarraproductoModel=new DetalleCodigoBarraProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleCodigoBarraProductoModel.DetalleCodigoBarraProductoFocusTraversalPolicy detallecodigobarraproductoFocusTraversalPolicy = detallecodigobarraproductoModel.new DetalleCodigoBarraProductoFocusTraversalPolicy(this);
			
			//detallecodigobarraproductoFocusTraversalPolicy.setdetallecodigobarraproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallecodigobarraproductoModel);
			
			
			this.jContentPaneDetalleDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleCodigoBarraProducto = new GridBagLayout();	
			this.jContentPaneDetalleDetalleCodigoBarraProducto.setLayout(gridaBagLayoutDetalleDetalleCodigoBarraProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCodigoBarraProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
				this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleCodigoBarraProducto.add(jTtoolBarDetalleDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto=   new JScrollPane(jContentPaneDetalleDetalleCodigoBarraProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	        
			this.jContentPaneDetalleDetalleCodigoBarraProducto.add(jPanelCamposDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);
			
			
			
			
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
						&& detallecodigobarraproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallecodigobarraproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleCodigoBarraProducto= new GridBagConstraints();
						this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
						this.jContentPaneDetalleDetalleCodigoBarraProducto.add(this.jTabbedPaneRelacionesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleCodigoBarraProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleCodigoBarraProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
					this.gridBagConstraintsDetalleCodigoBarraProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleCodigoBarraProducto.add(jPanelCamposOcultosDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);
				
					this.jPanelCamposOcultosDetalleCodigoBarraProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	        this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleCodigoBarraProducto.add(this.jPanelAccionesFormularioDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);							
			
			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
	        this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleCodigoBarraProducto.add(this.jPanelAccionesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleCodigoBarraProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto=   new JScrollPane(this.jPanelCamposDetalleCodigoBarraProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleCodigoBarraProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			
			
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
			
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleCodigoBarraProducto;
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
