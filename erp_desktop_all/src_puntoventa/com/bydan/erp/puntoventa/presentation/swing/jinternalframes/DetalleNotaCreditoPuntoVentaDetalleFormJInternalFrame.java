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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.DetalleNotaCreditoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame extends DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleNotaCreditoPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleDetalleNotaCreditoPuntoVenta;
	
	protected JMenu jmenuDetalleDetalleNotaCreditoPuntoVenta;
	protected JMenu jmenuDetalleArchivoDetalleNotaCreditoPuntoVenta;
	protected JMenu jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta;
	protected JMenu jmenuDetalleDatosDetalleNotaCreditoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleNotaCreditoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsDetalleNotaCreditoPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleNotaCreditoPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_notacreditopuntoventa="";

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
	
	public DetalleNotaCreditoPuntoVentaSessionBean detallenotacreditopuntoventaSessionBean;
	
	
	
	
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public DetalleNotaCreditoPuntoVentaLogic detallenotacreditopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleNotaCreditoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta;
	
	protected JPanel jPanelCamposDetalleNotaCreditoPuntoVenta;    
	protected JPanel jPanelCamposOcultosDetalleNotaCreditoPuntoVenta;    	
	protected JPanel jPanelAccionesDetalleNotaCreditoPuntoVenta;
	protected JPanel jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta;
    
	
	
	protected Integer iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
	protected Integer iYPanelCamposDetalleNotaCreditoPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosDetalleNotaCreditoPuntoVenta=0;
	protected Integer iYPanelCamposOcultosDetalleNotaCreditoPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleNotaCreditoPuntoVenta;
	public JButton jButtonModificarDetalleNotaCreditoPuntoVenta;
	public JButton jButtonActualizarDetalleNotaCreditoPuntoVenta;
    public JButton jButtonEliminarDetalleNotaCreditoPuntoVenta;
	public JButton jButtonCancelarDetalleNotaCreditoPuntoVenta;
    public JButton jButtonGuardarCambiosDetalleNotaCreditoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonCerrarDetalleNotaCreditoPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleNotaCreditoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleNotaCreditoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleNotaCreditoPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonModificarToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonActualizarToolBarDetalleNotaCreditoPuntoVenta;
    protected JButton jButtonEliminarToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonCancelarToolBarDetalleNotaCreditoPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonCerrarToolBarDetalleNotaCreditoPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleNotaCreditoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemModificarDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemActualizarDetalleNotaCreditoPuntoVenta;
    protected JMenuItem jMenuItemEliminarDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemCancelarDetalleNotaCreditoPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemCerrarDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleNotaCreditoPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelIdDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelidDetalleNotaCreditoPuntoVenta;
	public JButton jButtonidDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelserieDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelserieDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldserieDetalleNotaCreditoPuntoVenta;
	public JButton jButtonserieDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelcantidadDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldcantidadDetalleNotaCreditoPuntoVenta;
	public JButton jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelprecioDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldprecioDetalleNotaCreditoPuntoVenta;
	public JButton jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleNotaCreditoPuntoVenta;
	public JLabel jLabeldescuentoDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFielddescuentoDetalleNotaCreditoPuntoVenta;
	public JButton jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorDetalleNotaCreditoPuntoVenta;
	public JLabel jLabeldescuento_valorDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta;
	public JButton jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelivaDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldivaDetalleNotaCreditoPuntoVenta;
	public JButton jButtonivaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorDetalleNotaCreditoPuntoVenta;
	public JLabel jLabeliva_valorDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldiva_valorDetalleNotaCreditoPuntoVenta;
	public JButton jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneliceDetalleNotaCreditoPuntoVenta;
	public JLabel jLabeliceDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldiceDetalleNotaCreditoPuntoVenta;
	public JButton jButtoniceDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelice_valorDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelice_valorDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldice_valorDetalleNotaCreditoPuntoVenta;
	public JButton jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelsub_totalDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldsub_totalDetalleNotaCreditoPuntoVenta;
	public JButton jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetalleNotaCreditoPuntoVenta;
	public JLabel jLabeltotalDetalleNotaCreditoPuntoVenta;
	public JTextField jTextFieldtotalDetalleNotaCreditoPuntoVenta;
	public JButton jButtontotalDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleNotaCreditoPuntoVenta;
	public JLabel jLabeldescripcionDetalleNotaCreditoPuntoVenta;
	public JTextArea jTextAreadescripcionDetalleNotaCreditoPuntoVenta;
	public JScrollPane jscrollPanedescripcionDetalleNotaCreditoPuntoVenta;
	public JButton jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_empresaDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_empresaDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_sucursalDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_sucursalDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_bodegaDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_bodegaDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_productoDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_productoDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_unidadDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_unidadDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleNotaCreditoPuntoVenta;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleNotaCreditoPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta=new JPanel();
				this.jmenuBarDetalleDetalleNotaCreditoPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleDetalleNotaCreditoPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleNotaCreditoPuntoVenta() {
		return this.jButtonActualizarToolBarDetalleNotaCreditoPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarDetalleNotaCreditoPuntoVenta() {
		return this.jButtonEliminarToolBarDetalleNotaCreditoPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarDetalleNotaCreditoPuntoVenta() {
		return this.jButtonCancelarToolBarDetalleNotaCreditoPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleNotaCreditoPuntoVenta() {
		return this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta)	{
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta = jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta = jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta = jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta = jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallenotacreditopuntoventaSessionBean=new DetalleNotaCreditoPuntoVentaSessionBean();
		
		this.detallenotacreditopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallenotacreditopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleNotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleNotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleNotaCreditoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleNotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleNotaCreditoPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleNotaCreditoPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarDetalleNotaCreditoPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleDetalleNotaCreditoPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleDetalleNotaCreditoPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleDetalleNotaCreditoPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleDetalleNotaCreditoPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleNotaCreditoPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleNotaCreditoPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleNotaCreditoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleNotaCreditoPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleNotaCreditoPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleNotaCreditoPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleNotaCreditoPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleNotaCreditoPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleNotaCreditoPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleNotaCreditoPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleNotaCreditoPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleNotaCreditoPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleNotaCreditoPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleNotaCreditoPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleNotaCreditoPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleNotaCreditoPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleNotaCreditoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleNotaCreditoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleNotaCreditoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleNotaCreditoPuntoVenta.add(this.jMenuItemDetalleCerrarDetalleNotaCreditoPuntoVenta);
		
		this.jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemActualizarDetalleNotaCreditoPuntoVenta);
		this.jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemEliminarDetalleNotaCreditoPuntoVenta);
		this.jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemCancelarDetalleNotaCreditoPuntoVenta);		
		
		//this.jmenuDetalleDatosDetalleNotaCreditoPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByDetalleNotaCreditoPuntoVenta);				
		this.jmenuDetalleDatosDetalleNotaCreditoPuntoVenta.add(this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta);				
				
		//this.jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleNotaCreditoPuntoVenta.add(this.jmenuDetalleArchivoDetalleNotaCreditoPuntoVenta);		
		this.jmenuBarDetalleDetalleNotaCreditoPuntoVenta.add(this.jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta);		
		this.jmenuBarDetalleDetalleNotaCreditoPuntoVenta.add(this.jmenuDetalleDatosDetalleNotaCreditoPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleNotaCreditoPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposDetalleNotaCreditoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleNotaCreditoPuntoVenta = new JLabelMe();
		jLabelIdDetalleNotaCreditoPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleNotaCreditoPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta= new GridBagLayout();

		this.jPanelidDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);

		jLabelidDetalleNotaCreditoPuntoVenta = new JLabel();
		jLabelidDetalleNotaCreditoPuntoVenta.setText("Id");

		jLabelidDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelserieDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelserieDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_SERIE+" :");
		this.jLabelserieDetalleNotaCreditoPuntoVenta.setToolTipText("Serie");
		this.jLabelserieDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelserieDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldserieDetalleNotaCreditoPuntoVenta= new JTextFieldMe();

		jTextFieldserieDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldserieDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelcantidadDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleNotaCreditoPuntoVenta.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelcantidadDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldcantidadDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldcantidadDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldcantidadDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleNotaCreditoPuntoVenta.setText("0");

		this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelprecioDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetalleNotaCreditoPuntoVenta.setToolTipText("Precio");
		this.jLabelprecioDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelprecioDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldprecioDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldprecioDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldprecioDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeldescuentoDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleNotaCreditoPuntoVenta.setToolTipText("Descuento %");
		this.jLabeldescuentoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneldescuentoDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFielddescuentoDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFielddescuentoDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFielddescuentoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeldescuento_valorDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorDetalleNotaCreditoPuntoVenta.setToolTipText("Descuento");
		this.jLabeldescuento_valorDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneldescuento_valorDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelivaDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleNotaCreditoPuntoVenta.setToolTipText("Iva %");
		this.jLabelivaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelivaDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldivaDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldivaDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldivaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeliva_valorDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorDetalleNotaCreditoPuntoVenta.setToolTipText("Iva");
		this.jLabeliva_valorDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneliva_valorDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldiva_valorDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldiva_valorDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldiva_valorDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeliceDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeliceDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetalleNotaCreditoPuntoVenta.setToolTipText("Ice %");
		this.jLabeliceDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneliceDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldiceDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldiceDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldiceDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelice_valorDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelice_valorDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorDetalleNotaCreditoPuntoVenta.setToolTipText("Ice");
		this.jLabelice_valorDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelice_valorDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldice_valorDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldice_valorDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldice_valorDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelsub_totalDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalDetalleNotaCreditoPuntoVenta.setToolTipText("Sub Total");
		this.jLabelsub_totalDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelsub_totalDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldsub_totalDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldsub_totalDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldsub_totalDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeltotalDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetalleNotaCreditoPuntoVenta.setToolTipText("Total");
		this.jLabeltotalDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneltotalDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextFieldtotalDetalleNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldtotalDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldtotalDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetalleNotaCreditoPuntoVenta.setText("0.0");

		this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeldescripcionDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleNotaCreditoPuntoVenta.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneldescripcionDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jTextAreadescripcionDetalleNotaCreditoPuntoVenta= new JTextAreaMe();
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.setEnabled(false);
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.setLineWrap(true);
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.setWrapStyleWord(true);
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleNotaCreditoPuntoVenta = new JScrollPane(jTextAreadescripcionDetalleNotaCreditoPuntoVenta);
		jscrollPanedescripcionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleNotaCreditoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDNOTACREDITOPUNTOVENTA+" : *");
		this.jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setToolTipText("Nota Credito");
		this.jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDNOTACREDITOPUNTOVENTA);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaDetalleNotaCreditoPuntoVenta"));

		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_empresaDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_empresaDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleNotaCreditoPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.setEnabled(false);

		this.jButtonid_empresaDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_empresaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_empresaDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleNotaCreditoPuntoVenta"));

		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_sucursalDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleNotaCreditoPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleNotaCreditoPuntoVenta"));

		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_bodegaDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_bodegaDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleNotaCreditoPuntoVenta.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_bodegaDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleNotaCreditoPuntoVenta"));

		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_productoDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_productoDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleNotaCreditoPuntoVenta.setToolTipText("Producto");
		this.jLabelid_productoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_productoDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jComboBoxid_productoDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_productoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_productoDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleNotaCreditoPuntoVenta"));

		this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_unidadDetalleNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_unidadDetalleNotaCreditoPuntoVenta.setText(""+DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleNotaCreditoPuntoVenta.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleNotaCreditoPuntoVenta.setToolTipText(DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_unidadDetalleNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutDetalleNotaCreditoPuntoVenta);


		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_unidadDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_unidadDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleNotaCreditoPuntoVenta"));

		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleNotaCreditoPuntoVentaBusqueda"));

		if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleNotaCreditoPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleDetalleNotaCreditoPuntoVenta = new DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Nota Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		

		
		String sToolTipDetalleNotaCreditoPuntoVenta="";
		sToolTipDetalleNotaCreditoPuntoVenta=DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleNotaCreditoPuntoVenta+="(PuntoVenta.DetalleNotaCreditoPuntoVenta)";
		}
		
		if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleNotaCreditoPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonModificarDetalleNotaCreditoPuntoVenta = new JButtonMe();
        this.jButtonActualizarDetalleNotaCreditoPuntoVenta = new JButtonMe();
        this.jButtonEliminarDetalleNotaCreditoPuntoVenta = new JButtonMe();
        this.jButtonCancelarDetalleNotaCreditoPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCerrarDetalleNotaCreditoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Nota Credito";
		
		if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleNotaCreditoPuntoVenta.setName("jPanelCamposDetalleNotaCreditoPuntoVenta"); 

		this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta.setName("jPanelCamposOcultosDetalleNotaCreditoPuntoVenta"); 

        this.jPanelAccionesDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleNotaCreditoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesDetalleNotaCreditoPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleNotaCreditoPuntoVenta.setText("Nuevo");
		this.jButtonModificarDetalleNotaCreditoPuntoVenta.setText("Editar");
        this.jButtonActualizarDetalleNotaCreditoPuntoVenta.setText("Actualizar");
        this.jButtonEliminarDetalleNotaCreditoPuntoVenta.setText("Eliminar");
        this.jButtonCancelarDetalleNotaCreditoPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleNotaCreditoPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.setText("Guardar");
		this.jButtonCerrarDetalleNotaCreditoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleNotaCreditoPuntoVenta,"nuevo_button","Nuevo",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleNotaCreditoPuntoVenta,"modificar_button","Editar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleNotaCreditoPuntoVenta,"actualizar_button","Actualizar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleNotaCreditoPuntoVenta,"eliminar_button","Eliminar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleNotaCreditoPuntoVenta,"cancelar_button","Cancelar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleNotaCreditoPuntoVenta,"guardarcambios_button","Guardar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta,"guardarcambiostabla_button","Guardar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleNotaCreditoPuntoVenta,"cerrar_button","Salir",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleNotaCreditoPuntoVenta.setToolTipText("Nuevo"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleNotaCreditoPuntoVenta.setToolTipText("Editar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleNotaCreditoPuntoVenta.setToolTipText("Actualizar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleNotaCreditoPuntoVenta.setToolTipText("Eliminar)"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleNotaCreditoPuntoVenta.setToolTipText("Cancelar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleNotaCreditoPuntoVenta.setToolTipText("Guardar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.setToolTipText("Guardar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleNotaCreditoPuntoVenta.setToolTipText("Salir"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonNuevoDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleNotaCreditoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonActualizarDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleNotaCreditoPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonEliminarDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleNotaCreditoPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonCancelarDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleNotaCreditoPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonCerrarDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleNotaCreditoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleNotaCreditoPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleNotaCreditoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleNotaCreditoPuntoVenta.setToolTipText("Nuevo DetalleNotaCreditoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleNotaCreditoPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleNotaCreditoPuntoVenta.setToolTipText("Sin Cerrar Ventana DetalleNotaCreditoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleNotaCreditoPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleNotaCreditoPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleNotaCreditoPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleNotaCreditoPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleNotaCreditoPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutCamposDetalleNotaCreditoPuntoVenta);
		this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutCamposOcultosDetalleNotaCreditoPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleNotaCreditoPuntoVenta.add(jLabelIdDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleNotaCreditoPuntoVenta.add(jLabelidDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.add(jLabelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.add(jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.add(jButtonid_factura_punto_ventaDetalleNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta.add(jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleNotaCreditoPuntoVenta.add(jLabelid_empresaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleNotaCreditoPuntoVenta.add(jButtonid_empresaDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleNotaCreditoPuntoVenta.add(jButtonid_empresaDetalleNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleNotaCreditoPuntoVenta.add(jComboBoxid_empresaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleNotaCreditoPuntoVenta.add(jLabelid_sucursalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleNotaCreditoPuntoVenta.add(jButtonid_sucursalDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleNotaCreditoPuntoVenta.add(jButtonid_sucursalDetalleNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleNotaCreditoPuntoVenta.add(jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleNotaCreditoPuntoVenta.add(jLabelid_bodegaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleNotaCreditoPuntoVenta.add(jButtonid_bodegaDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleNotaCreditoPuntoVenta.add(jButtonid_bodegaDetalleNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleNotaCreditoPuntoVenta.add(jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleNotaCreditoPuntoVenta.add(jLabelid_productoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleNotaCreditoPuntoVenta.add(jButtonid_productoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleNotaCreditoPuntoVenta.add(jButtonid_productoDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 4;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleNotaCreditoPuntoVenta.add(jButtonid_productoDetalleNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleNotaCreditoPuntoVenta.add(jComboBoxid_productoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleNotaCreditoPuntoVenta.add(jLabelid_unidadDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleNotaCreditoPuntoVenta.add(jButtonid_unidadDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleNotaCreditoPuntoVenta.add(jButtonid_unidadDetalleNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleNotaCreditoPuntoVenta.add(jComboBoxid_unidadDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieDetalleNotaCreditoPuntoVenta.add(jLabelserieDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieDetalleNotaCreditoPuntoVenta.add(jButtonserieDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieDetalleNotaCreditoPuntoVenta.add(jTextFieldserieDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleNotaCreditoPuntoVenta.add(jLabelcantidadDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleNotaCreditoPuntoVenta.add(jButtoncantidadDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleNotaCreditoPuntoVenta.add(jTextFieldcantidadDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetalleNotaCreditoPuntoVenta.add(jLabelprecioDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetalleNotaCreditoPuntoVenta.add(jButtonprecioDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetalleNotaCreditoPuntoVenta.add(jTextFieldprecioDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleNotaCreditoPuntoVenta.add(jLabeldescuentoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleNotaCreditoPuntoVenta.add(jButtondescuentoDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleNotaCreditoPuntoVenta.add(jTextFielddescuentoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorDetalleNotaCreditoPuntoVenta.add(jLabeldescuento_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorDetalleNotaCreditoPuntoVenta.add(jButtondescuento_valorDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorDetalleNotaCreditoPuntoVenta.add(jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleNotaCreditoPuntoVenta.add(jLabelivaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleNotaCreditoPuntoVenta.add(jButtonivaDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleNotaCreditoPuntoVenta.add(jTextFieldivaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorDetalleNotaCreditoPuntoVenta.add(jLabeliva_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorDetalleNotaCreditoPuntoVenta.add(jButtoniva_valorDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorDetalleNotaCreditoPuntoVenta.add(jTextFieldiva_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetalleNotaCreditoPuntoVenta.add(jLabeliceDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetalleNotaCreditoPuntoVenta.add(jButtoniceDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetalleNotaCreditoPuntoVenta.add(jTextFieldiceDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorDetalleNotaCreditoPuntoVenta.add(jLabelice_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorDetalleNotaCreditoPuntoVenta.add(jButtonice_valorDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorDetalleNotaCreditoPuntoVenta.add(jTextFieldice_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalDetalleNotaCreditoPuntoVenta.add(jLabelsub_totalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalDetalleNotaCreditoPuntoVenta.add(jButtonsub_totalDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalDetalleNotaCreditoPuntoVenta.add(jTextFieldsub_totalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetalleNotaCreditoPuntoVenta.add(jLabeltotalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetalleNotaCreditoPuntoVenta.add(jButtontotalDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetalleNotaCreditoPuntoVenta.add(jTextFieldtotalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleNotaCreditoPuntoVenta.add(jLabeldescripcionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleNotaCreditoPuntoVenta.add(jButtondescripcionDetalleNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleNotaCreditoPuntoVenta.add(jscrollPanedescripcionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelidDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelid_factura_punto_ventaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelid_bodegaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelid_productoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelid_unidadDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelserieDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelcantidadDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelprecioDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPaneldescuentoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPaneldescuento_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelivaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPaneliva_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPaneliceDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelice_valorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPanelsub_totalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPaneltotalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleNotaCreditoPuntoVenta.add(this.jPaneldescripcionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposDetalleNotaCreditoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposOcultosDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposOcultosDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta.add(this.jPanelid_empresaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposOcultosDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposOcultosDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposOcultosDetalleNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iYPanelCamposOcultosDetalleNotaCreditoPuntoVenta;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iXPanelCamposOcultosDetalleNotaCreditoPuntoVenta++;
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta.add(this.jPanelid_sucursalDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);



	if(iXPanelCamposOcultosDetalleNotaCreditoPuntoVenta % 1==0) {
		iXPanelCamposOcultosDetalleNotaCreditoPuntoVenta=0;
		iYPanelCamposOcultosDetalleNotaCreditoPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutAccionesDetalleNotaCreditoPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioDetalleNotaCreditoPuntoVenta);
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta.add(this.jCheckBoxPostAccionNuevoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallenotacreditopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallenotacreditopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta.add(this.jButtonModificarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);							

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta.add(this.jButtonEliminarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
			
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta.add(this.jButtonActualizarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta.add(this.jButtonGuardarCambiosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);	
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta.add(this.jButtonCancelarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleNotaCreditoPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleNotaCreditoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleNotaCreditoPuntoVenta = new DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Nota Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Nota Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Nota Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleNotaCreditoPuntoVentaModel detallenotacreditopuntoventaModel=new DetalleNotaCreditoPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleNotaCreditoPuntoVentaModel.DetalleNotaCreditoPuntoVentaFocusTraversalPolicy detallenotacreditopuntoventaFocusTraversalPolicy = detallenotacreditopuntoventaModel.new DetalleNotaCreditoPuntoVentaFocusTraversalPolicy(this);
			
			//detallenotacreditopuntoventaFocusTraversalPolicy.setdetallenotacreditopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallenotacreditopuntoventaModel);
			
			
			this.jContentPaneDetalleDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleNotaCreditoPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutDetalleDetalleNotaCreditoPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleNotaCreditoPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleNotaCreditoPuntoVenta.add(jTtoolBarDetalleDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta=   new JScrollPane(jContentPaneDetalleDetalleNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleDetalleNotaCreditoPuntoVenta.add(jPanelCamposDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			
			
			
			
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
						&& detallenotacreditopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallenotacreditopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleNotaCreditoPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
						this.jContentPaneDetalleDetalleNotaCreditoPuntoVenta.add(this.jTabbedPaneRelacionesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleNotaCreditoPuntoVenta.add(jPanelCamposOcultosDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);
				
					this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	        this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleNotaCreditoPuntoVenta.add(this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);							
			
			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleNotaCreditoPuntoVenta.add(this.jPanelAccionesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta=   new JScrollPane(this.jPanelCamposDetalleNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			
			
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
			
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta;
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
