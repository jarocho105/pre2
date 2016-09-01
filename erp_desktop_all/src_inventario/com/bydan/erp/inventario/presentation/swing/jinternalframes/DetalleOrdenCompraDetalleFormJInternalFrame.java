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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.DetalleOrdenCompraConstantesFunciones;

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
public class DetalleOrdenCompraDetalleFormJInternalFrame extends DetalleOrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleDetalleOrdenCompra;
	
	protected JMenuBar jmenuBarDetalleDetalleOrdenCompra;
	
	protected JMenu jmenuDetalleDetalleOrdenCompra;
	protected JMenu jmenuDetalleArchivoDetalleOrdenCompra;
	protected JMenu jmenuDetalleAccionesDetalleOrdenCompra;
	protected JMenu jmenuDetalleDatosDetalleOrdenCompra;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsDetalleOrdenCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleOrdenCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleOrdenCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected EstadoDetalleOrdenCompraBeanSwingJInternalFrame estadodetalleordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleordencompra="";
	
	public DetalleOrdenCompraSessionBean detalleordencompraSessionBean;
	
	
	
	
	public OrdenCompraSessionBean ordencompraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public EstadoDetalleOrdenCompraSessionBean estadodetalleordencompraSessionBean;	
	
	public DetalleOrdenCompraLogic detalleordencompraLogic;
	
	public JScrollPane jScrollPanelDatosDetalleOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionDetalleOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralDetalleOrdenCompra;
	
	protected JPanel jPanelCamposDetalleOrdenCompra;    
	protected JPanel jPanelCamposOcultosDetalleOrdenCompra;    	
	protected JPanel jPanelAccionesDetalleOrdenCompra;
	protected JPanel jPanelAccionesFormularioDetalleOrdenCompra;
    
	
	
	protected Integer iXPanelCamposDetalleOrdenCompra=0;
	protected Integer iYPanelCamposDetalleOrdenCompra=0;
	
	protected Integer iXPanelCamposOcultosDetalleOrdenCompra=0;
	protected Integer iYPanelCamposOcultosDetalleOrdenCompra=0;
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleOrdenCompra;
	protected Integer iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
	protected Integer iYPanelCamposIniciogeneralDetalleOrdenCompra=0;

	protected JPanel jPanelCamposIniciovaloresDetalleOrdenCompra;
	protected Integer iXPanelCamposIniciovaloresDetalleOrdenCompra=0;
	protected Integer iYPanelCamposIniciovaloresDetalleOrdenCompra=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleOrdenCompra;
	public JButton jButtonModificarDetalleOrdenCompra;
	public JButton jButtonActualizarDetalleOrdenCompra;
    public JButton jButtonEliminarDetalleOrdenCompra;
	public JButton jButtonCancelarDetalleOrdenCompra;
    public JButton jButtonGuardarCambiosDetalleOrdenCompra;
	public JButton jButtonGuardarCambiosTablaDetalleOrdenCompra;
	protected JButton jButtonCerrarDetalleOrdenCompra;
	
	/*
	protected JButton jButtonProcesarInformacionDetalleOrdenCompra;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleOrdenCompra;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleOrdenCompra;
	protected JButton jButtonModificarToolBarDetalleOrdenCompra;
	protected JButton jButtonActualizarToolBarDetalleOrdenCompra;
    protected JButton jButtonEliminarToolBarDetalleOrdenCompra;
	protected JButton jButtonCancelarToolBarDetalleOrdenCompra;
    protected JButton jButtonGuardarCambiosToolBarDetalleOrdenCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleOrdenCompra;
	protected JButton jButtonCerrarToolBarDetalleOrdenCompra;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleOrdenCompra;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleOrdenCompra;
	protected JMenuItem jMenuItemModificarDetalleOrdenCompra;
	protected JMenuItem jMenuItemActualizarDetalleOrdenCompra;
    protected JMenuItem jMenuItemEliminarDetalleOrdenCompra;
	protected JMenuItem jMenuItemCancelarDetalleOrdenCompra;
    protected JMenuItem jMenuItemGuardarCambiosDetalleOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleOrdenCompra;
	protected JMenuItem jMenuItemCerrarDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleOrdenCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetalleOrdenCompra;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleOrdenCompra;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleOrdenCompra;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleOrdenCompra;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleOrdenCompra;
	public JLabel jLabelIdDetalleOrdenCompra;
	public JLabel jLabelidDetalleOrdenCompra;
	public JButton jButtonidDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleOrdenCompra;
	public JLabel jLabeldescripcionDetalleOrdenCompra;
	public JTextArea jTextAreadescripcionDetalleOrdenCompra;
	public JScrollPane jscrollPanedescripcionDetalleOrdenCompra;
	public JButton jButtondescripcionDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleOrdenCompra;
	public JLabel jLabelcantidadDetalleOrdenCompra;
	public JTextField jTextFieldcantidadDetalleOrdenCompra;
	public JButton jButtoncantidadDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleOrdenCompra;
	public JLabel jLabeldescuentoDetalleOrdenCompra;
	public JTextField jTextFielddescuentoDetalleOrdenCompra;
	public JButton jButtondescuentoDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioDetalleOrdenCompra;
	public JLabel jLabelcosto_unitarioDetalleOrdenCompra;
	public JTextField jTextFieldcosto_unitarioDetalleOrdenCompra;
	public JButton jButtoncosto_unitarioDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleOrdenCompra;
	public JLabel jLabelivaDetalleOrdenCompra;
	public JTextField jTextFieldivaDetalleOrdenCompra;
	public JButton jButtonivaDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorDetalleOrdenCompra;
	public JLabel jLabeliva_valorDetalleOrdenCompra;
	public JTextField jTextFieldiva_valorDetalleOrdenCompra;
	public JButton jButtoniva_valorDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalDetalleOrdenCompra;
	public JLabel jLabelcosto_totalDetalleOrdenCompra;
	public JTextField jTextFieldcosto_totalDetalleOrdenCompra;
	public JButton jButtoncosto_totalDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneldisponibleDetalleOrdenCompra;
	public JLabel jLabeldisponibleDetalleOrdenCompra;
	public JTextField jTextFielddisponibleDetalleOrdenCompra;
	public JButton jButtondisponibleDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleOrdenCompra;
	public JLabel jLabelnumero_comprobanteDetalleOrdenCompra;
	public JTextField jTextFieldnumero_comprobanteDetalleOrdenCompra;
	public JButton jButtonnumero_comprobanteDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanellote_clienteDetalleOrdenCompra;
	public JLabel jLabellote_clienteDetalleOrdenCompra;
	public JTextField jTextFieldlote_clienteDetalleOrdenCompra;
	public JButton jButtonlote_clienteDetalleOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_compraDetalleOrdenCompra;
	public JLabel jLabelid_orden_compraDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraDetalleOrdenCompra;
	public JButton jButtonid_orden_compraDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_orden_compraDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraDetalleOrdenCompraBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraDetalleOrdenCompraArbol= new JButtonMe();

	public JPanel jPanelid_empresaDetalleOrdenCompra;
	public JLabel jLabelid_empresaDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleOrdenCompra;
	public JButton jButtonid_empresaDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_empresaDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleOrdenCompra;
	public JLabel jLabelid_sucursalDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleOrdenCompra;
	public JButton jButtonid_sucursalDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_sucursalDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleOrdenCompra;
	public JLabel jLabelid_ejercicioDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleOrdenCompra;
	public JButton jButtonid_ejercicioDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleOrdenCompra;
	public JLabel jLabelid_periodoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleOrdenCompra;
	public JButton jButtonid_periodoDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_periodoDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleOrdenCompra;
	public JLabel jLabelid_anioDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleOrdenCompra;
	public JButton jButtonid_anioDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_anioDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleOrdenCompra;
	public JLabel jLabelid_mesDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleOrdenCompra;
	public JButton jButtonid_mesDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_mesDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleOrdenCompra;
	public JLabel jLabelid_bodegaDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleOrdenCompra;
	public JButton jButtonid_bodegaDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_bodegaDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleOrdenCompra;
	public JLabel jLabelid_productoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleOrdenCompra;
	public JButton jButtonid_productoDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_productoDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleOrdenCompra;
	public JLabel jLabelid_unidadDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleOrdenCompra;
	public JButton jButtonid_unidadDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_unidadDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_novedad_productoDetalleOrdenCompra;
	public JLabel jLabelid_novedad_productoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoDetalleOrdenCompra;
	public JButton jButtonid_novedad_productoDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_orden_compraDetalleOrdenCompra;
	public JLabel jLabelid_estado_detalle_orden_compraDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra;
	public JButton jButtonid_estado_detalle_orden_compraDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleOrdenCompra;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleOrdenCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleOrdenCompra=new JPanel();
				this.jPanelAccionesFormularioDetalleOrdenCompra=new JPanel();
				this.jmenuBarDetalleDetalleOrdenCompra=new JMenuBar();
				this.jTtoolBarDetalleDetalleOrdenCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleOrdenCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleOrdenCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleOrdenCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleOrdenCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleOrdenCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	public JButton getjButtonActualizarToolBarDetalleOrdenCompra() {
		return this.jButtonActualizarToolBarDetalleOrdenCompra;
	}
	
	public JButton getjButtonEliminarToolBarDetalleOrdenCompra() {
		return this.jButtonEliminarToolBarDetalleOrdenCompra;
	}
	
	public JButton getjButtonCancelarToolBarDetalleOrdenCompra() {
		return this.jButtonCancelarToolBarDetalleOrdenCompra;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleOrdenCompra() {
		return this.jButtonProcesarInformacionDetalleOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleOrdenCompra)	{
		this.jButtonProcesarInformacionDetalleOrdenCompra = jButtonProcesarInformacionDetalleOrdenCompra;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleOrdenCompra() {
		return this.jComboBoxTiposAccionesDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleOrdenCompra(
			JComboBox jComboBoxTiposRelacionesDetalleOrdenCompra) {
		this.jComboBoxTiposRelacionesDetalleOrdenCompra = jComboBoxTiposRelacionesDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleOrdenCompra(
			JComboBox jComboBoxTiposAccionesDetalleOrdenCompra) {
		this.jComboBoxTiposAccionesDetalleOrdenCompra = jComboBoxTiposAccionesDetalleOrdenCompra;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleOrdenCompra() {
		return this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleOrdenCompra(
			JComboBox jComboBoxTiposAccionesFormularioDetalleOrdenCompra) {
		this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra = jComboBoxTiposAccionesFormularioDetalleOrdenCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
		
		this.detalleordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleordencompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleOrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Orden Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleOrdenCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleOrdenCompra=new JButtonMe();
				this.jButtonModificarToolBarDetalleOrdenCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleOrdenCompra,this.jTtoolBarDetalleDetalleOrdenCompra,
							"actualizar","actualizar","Actualizar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleOrdenCompra,this.jTtoolBarDetalleDetalleOrdenCompra,
							"eliminar","eliminar","Eliminar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleOrdenCompra,this.jTtoolBarDetalleDetalleOrdenCompra,
							"cancelar","cancelar","Cancelar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleOrdenCompra,this.jTtoolBarDetalleDetalleOrdenCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleOrdenCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleOrdenCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleOrdenCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleOrdenCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleOrdenCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleOrdenCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleOrdenCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleOrdenCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleOrdenCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleOrdenCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleOrdenCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleOrdenCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleOrdenCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleOrdenCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleOrdenCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleOrdenCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleOrdenCompra.add(this.jMenuItemDetalleCerrarDetalleOrdenCompra);
		
		this.jmenuDetalleAccionesDetalleOrdenCompra.add(this.jMenuItemActualizarDetalleOrdenCompra);
		this.jmenuDetalleAccionesDetalleOrdenCompra.add(this.jMenuItemEliminarDetalleOrdenCompra);
		this.jmenuDetalleAccionesDetalleOrdenCompra.add(this.jMenuItemCancelarDetalleOrdenCompra);		
		
		//this.jmenuDetalleDatosDetalleOrdenCompra.add(this.jMenuItemDetalleAbrirOrderByDetalleOrdenCompra);				
		this.jmenuDetalleDatosDetalleOrdenCompra.add(this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra);				
				
		//this.jmenuDetalleAccionesDetalleOrdenCompra.add(this.jMenuItemGuardarCambiosDetalleOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleOrdenCompra.add(this.jmenuDetalleArchivoDetalleOrdenCompra);		
		this.jmenuBarDetalleDetalleOrdenCompra.add(this.jmenuDetalleAccionesDetalleOrdenCompra);		
		this.jmenuBarDetalleDetalleOrdenCompra.add(this.jmenuDetalleDatosDetalleOrdenCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleOrdenCompra);				
	}
	*/
	
	public void inicializarElementosCamposDetalleOrdenCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleOrdenCompra = new JLabelMe();
		jLabelIdDetalleOrdenCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleOrdenCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleOrdenCompra= new GridBagLayout();

		this.jPanelidDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);

		jLabelidDetalleOrdenCompra = new JLabel();
		jLabelidDetalleOrdenCompra.setText("Id");

		jLabelidDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDetalleOrdenCompra = new JLabelMe();
		this.jLabeldescripcionDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleOrdenCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPaneldescripcionDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextAreadescripcionDetalleOrdenCompra= new JTextAreaMe();
		jTextAreadescripcionDetalleOrdenCompra.setEnabled(false);
		jTextAreadescripcionDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleOrdenCompra.setLineWrap(true);
		jTextAreadescripcionDetalleOrdenCompra.setWrapStyleWord(true);
		jTextAreadescripcionDetalleOrdenCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleOrdenCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleOrdenCompra = new JScrollPane(jTextAreadescripcionDetalleOrdenCompra);
		jscrollPanedescripcionDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleOrdenCompraBusqueda.setText("U");
		this.jButtondescripcionDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleOrdenCompra = new JLabelMe();
		this.jLabelcantidadDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleOrdenCompra.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelcantidadDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFieldcantidadDetalleOrdenCompra= new JTextFieldMe();
		jTextFieldcantidadDetalleOrdenCompra.setEnabled(false);
		jTextFieldcantidadDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleOrdenCompra.setText("0");

		this.jButtoncantidadDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleOrdenCompraBusqueda.setText("U");
		this.jButtoncantidadDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleOrdenCompra = new JLabelMe();
		this.jLabeldescuentoDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleOrdenCompra.setToolTipText("Descuento");
		this.jLabeldescuentoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPaneldescuentoDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFielddescuentoDetalleOrdenCompra= new JTextFieldMe();
		jTextFielddescuentoDetalleOrdenCompra.setEnabled(false);
		jTextFielddescuentoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleOrdenCompra.setText("0.0");

		this.jButtondescuentoDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleOrdenCompraBusqueda.setText("U");
		this.jButtondescuentoDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioDetalleOrdenCompra = new JLabelMe();
		this.jLabelcosto_unitarioDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioDetalleOrdenCompra.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelcosto_unitarioDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFieldcosto_unitarioDetalleOrdenCompra= new JTextFieldMe();
		jTextFieldcosto_unitarioDetalleOrdenCompra.setEnabled(false);
		jTextFieldcosto_unitarioDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioDetalleOrdenCompra.setText("0.0");

		this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda.setText("U");
		this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleOrdenCompra = new JLabelMe();
		this.jLabelivaDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleOrdenCompra.setToolTipText("Iva");
		this.jLabelivaDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelivaDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFieldivaDetalleOrdenCompra= new JTextFieldMe();
		jTextFieldivaDetalleOrdenCompra.setEnabled(false);
		jTextFieldivaDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleOrdenCompra.setText("0.0");

		this.jButtonivaDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonivaDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonivaDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorDetalleOrdenCompra = new JLabelMe();
		this.jLabeliva_valorDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorDetalleOrdenCompra.setToolTipText("Iva Valor");
		this.jLabeliva_valorDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPaneliva_valorDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFieldiva_valorDetalleOrdenCompra= new JTextFieldMe();
		jTextFieldiva_valorDetalleOrdenCompra.setEnabled(false);
		jTextFieldiva_valorDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorDetalleOrdenCompra.setText("0.0");

		this.jButtoniva_valorDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtoniva_valorDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorDetalleOrdenCompraBusqueda.setText("U");
		this.jButtoniva_valorDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalDetalleOrdenCompra = new JLabelMe();
		this.jLabelcosto_totalDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalDetalleOrdenCompra.setToolTipText("Costo Total");
		this.jLabelcosto_totalDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelcosto_totalDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFieldcosto_totalDetalleOrdenCompra= new JTextFieldMe();
		jTextFieldcosto_totalDetalleOrdenCompra.setEnabled(false);
		jTextFieldcosto_totalDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalDetalleOrdenCompra.setText("0.0");

		this.jButtoncosto_totalDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtoncosto_totalDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalDetalleOrdenCompraBusqueda.setText("U");
		this.jButtoncosto_totalDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeldisponibleDetalleOrdenCompra = new JLabelMe();
		this.jLabeldisponibleDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_DISPONIBLE+" :");
		this.jLabeldisponibleDetalleOrdenCompra.setToolTipText("Disponible");
		this.jLabeldisponibleDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponibleDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponibleDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponibleDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPaneldisponibleDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFielddisponibleDetalleOrdenCompra= new JTextFieldMe();
		jTextFielddisponibleDetalleOrdenCompra.setEnabled(false);
		jTextFielddisponibleDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponibleDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponibleDetalleOrdenCompra.setText("0");

		this.jButtondisponibleDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtondisponibleDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponibleDetalleOrdenCompraBusqueda.setText("U");
		this.jButtondisponibleDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponibleDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponibleDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponibleDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponibleDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponibleDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponibleDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleOrdenCompra = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" :");
		this.jLabelnumero_comprobanteDetalleOrdenCompra.setToolTipText("Nro Comprobante");
		this.jLabelnumero_comprobanteDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFieldnumero_comprobanteDetalleOrdenCompra= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleOrdenCompra.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabellote_clienteDetalleOrdenCompra = new JLabelMe();
		this.jLabellote_clienteDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_LOTECLIENTE+" :");
		this.jLabellote_clienteDetalleOrdenCompra.setToolTipText("Lote Cliente");
		this.jLabellote_clienteDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellote_clienteDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellote_clienteDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellote_clienteDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_LOTECLIENTE);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanellote_clienteDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jTextFieldlote_clienteDetalleOrdenCompra= new JTextFieldMe();

		jTextFieldlote_clienteDetalleOrdenCompra.setEnabled(false);
		jTextFieldlote_clienteDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlote_clienteDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlote_clienteDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonlote_clienteDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlote_clienteDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonlote_clienteDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlote_clienteDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlote_clienteDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlote_clienteDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlote_clienteDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lote_clienteDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlote_clienteDetalleOrdenCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleOrdenCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_orden_compraDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_orden_compraDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDORDENCOMPRA+" : *");
		this.jLabelid_orden_compraDetalleOrdenCompra.setToolTipText("Orden Compra");
		this.jLabelid_orden_compraDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_compraDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_compraDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDORDENCOMPRA);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_orden_compraDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_orden_compraDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_orden_compraDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_compraDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_orden_compraDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_orden_compraDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_compraDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_compraDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraDetalleOrdenCompra"));

		this.jButtonid_orden_compraDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_orden_compraDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_orden_compraDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_compraDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_compraDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_compraDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_orden_compraDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_orden_compraDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_orden_compraDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_compraDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_compraDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraDetalleOrdenCompraUpdate"));


		jButtonid_orden_compraDetalleOrdenCompraArbol= new JButtonMe();
		jButtonid_orden_compraDetalleOrdenCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraDetalleOrdenCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraDetalleOrdenCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraDetalleOrdenCompraArbol.setText("Arbol");
		jButtonid_orden_compraDetalleOrdenCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_orden_compraDetalleOrdenCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraDetalleOrdenCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_orden_compraDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraDetalleOrdenCompraArbol"));



					
		this.jLabelid_empresaDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_empresaDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleOrdenCompra.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_empresaDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_empresaDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_empresaDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleOrdenCompra.setEnabled(false);

		this.jButtonid_empresaDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_empresaDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_empresaDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleOrdenCompra"));

		this.jButtonid_empresaDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_empresaDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_empresaDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleOrdenCompraUpdate"));



					
		this.jLabelid_sucursalDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_sucursalDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleOrdenCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_sucursalDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_sucursalDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_sucursalDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleOrdenCompra.setEnabled(false);

		this.jButtonid_sucursalDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_sucursalDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_sucursalDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleOrdenCompra"));

		this.jButtonid_sucursalDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_sucursalDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_sucursalDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleOrdenCompraUpdate"));



					
		this.jLabelid_ejercicioDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_ejercicioDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleOrdenCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_ejercicioDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_ejercicioDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleOrdenCompra.setEnabled(false);

		this.jButtonid_ejercicioDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_ejercicioDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_ejercicioDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleOrdenCompra"));

		this.jButtonid_ejercicioDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_ejercicioDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleOrdenCompraUpdate"));



					
		this.jLabelid_periodoDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_periodoDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleOrdenCompra.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_periodoDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_periodoDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_periodoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleOrdenCompra.setEnabled(false);

		this.jButtonid_periodoDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_periodoDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_periodoDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleOrdenCompra"));

		this.jButtonid_periodoDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_periodoDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_periodoDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleOrdenCompraUpdate"));



					
		this.jLabelid_anioDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_anioDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleOrdenCompra.setToolTipText("Anio");
		this.jLabelid_anioDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_anioDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_anioDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_anioDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleOrdenCompra.setEnabled(false);

		this.jButtonid_anioDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_anioDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_anioDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleOrdenCompra"));

		this.jButtonid_anioDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_anioDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_anioDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_anioDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleOrdenCompraUpdate"));



					
		this.jLabelid_mesDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_mesDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleOrdenCompra.setToolTipText("Mes");
		this.jLabelid_mesDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_mesDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_mesDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_mesDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleOrdenCompra.setEnabled(false);

		this.jButtonid_mesDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_mesDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_mesDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleOrdenCompra"));

		this.jButtonid_mesDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_mesDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_mesDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_mesDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleOrdenCompraUpdate"));



					
		this.jLabelid_bodegaDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_bodegaDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleOrdenCompra.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_bodegaDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_bodegaDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_bodegaDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_bodegaDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_bodegaDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleOrdenCompra"));

		this.jButtonid_bodegaDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_bodegaDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_bodegaDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleOrdenCompraUpdate"));



					
		this.jLabelid_productoDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_productoDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleOrdenCompra.setToolTipText("Producto");
		this.jLabelid_productoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_productoDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_productoDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_productoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_productoDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_productoDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleOrdenCompra"));

		this.jButtonid_productoDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_productoDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_productoDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_productoDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleOrdenCompraUpdate"));



					
		this.jLabelid_unidadDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_unidadDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleOrdenCompra.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_unidadDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_unidadDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_unidadDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_unidadDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_unidadDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleOrdenCompra"));

		this.jButtonid_unidadDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_unidadDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_unidadDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleOrdenCompraUpdate"));



					
		this.jLabelid_novedad_productoDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_novedad_productoDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDNOVEDADPRODUCTO+" :");
		this.jLabelid_novedad_productoDetalleOrdenCompra.setToolTipText("Novedad");
		this.jLabelid_novedad_productoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_novedad_productoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_novedad_productoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_novedad_productoDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_novedad_productoDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_novedad_productoDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_novedad_productoDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_novedad_productoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_novedad_productoDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_novedad_productoDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_novedad_productoDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_novedad_productoDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_novedad_productoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleOrdenCompra"));

		this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_novedad_productoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_novedad_productoDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_novedad_productoDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_novedad_productoDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_novedad_productoDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_novedad_productoDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_novedad_productoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleOrdenCompraUpdate"));



					
		this.jLabelid_estado_detalle_orden_compraDetalleOrdenCompra = new JLabelMe();
		this.jLabelid_estado_detalle_orden_compraDetalleOrdenCompra.setText(""+DetalleOrdenCompraConstantesFunciones.LABEL_IDESTADODETALLEORDENCOMPRA+" : *");
		this.jLabelid_estado_detalle_orden_compraDetalleOrdenCompra.setToolTipText("Estado");
		this.jLabelid_estado_detalle_orden_compraDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_orden_compraDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_orden_compraDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_orden_compraDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_orden_compraDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_orden_compraDetalleOrdenCompra.setToolTipText(DetalleOrdenCompraConstantesFunciones.LABEL_IDESTADODETALLEORDENCOMPRA);
		this.gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		this.jPanelid_estado_detalle_orden_compraDetalleOrdenCompra.setLayout(this.gridaBagLayoutDetalleOrdenCompra);


		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.setEnabled(false);

		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompra= new JButtonMe();
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompra.setText("Buscar");
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_orden_compraDetalleOrdenCompra"));

		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_orden_compraDetalleOrdenCompraBusqueda"));

		if(this.detalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate.setText("U");
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_orden_compraDetalleOrdenCompraUpdate"));



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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleDetalleOrdenCompra = new DetalleOrdenCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Orden Compra DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleOrdenCompra= new GridBagLayout();
		

		
		String sToolTipDetalleOrdenCompra="";
		sToolTipDetalleOrdenCompra=DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleOrdenCompra+="(Inventario.DetalleOrdenCompra)";
		}
		
		if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleOrdenCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleOrdenCompra = new JButtonMe();
		this.jButtonModificarDetalleOrdenCompra = new JButtonMe();
        this.jButtonActualizarDetalleOrdenCompra = new JButtonMe();
        this.jButtonEliminarDetalleOrdenCompra = new JButtonMe();
        this.jButtonCancelarDetalleOrdenCompra = new JButtonMe();
        this.jButtonGuardarCambiosDetalleOrdenCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarDetalleOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetalleOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleOrdenCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleOrdenCompra = new JScrollPane();
		//this.jScrollPanelDatosDetalleOrdenCompraTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Orden Compra";
		
		if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Orden Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleOrdenCompraTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleOrdenCompra.setName("jPanelCamposDetalleOrdenCompra"); 

		this.jPanelCamposOcultosDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleOrdenCompra.setName("jPanelCamposOcultosDetalleOrdenCompra"); 

        this.jPanelAccionesDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetalleOrdenCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleOrdenCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleOrdenCompra.setName("jPanelCamposFingeneralDetalleOrdenCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleOrdenCompra.setName("jPanelCamposFinvaloresDetalleOrdenCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleOrdenCompra.setText("Nuevo");
		this.jButtonModificarDetalleOrdenCompra.setText("Editar");
        this.jButtonActualizarDetalleOrdenCompra.setText("Actualizar");
        this.jButtonEliminarDetalleOrdenCompra.setText("Eliminar");
        this.jButtonCancelarDetalleOrdenCompra.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleOrdenCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleOrdenCompra.setText("Guardar");
		this.jButtonCerrarDetalleOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleOrdenCompra,"nuevo_button","Nuevo",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleOrdenCompra,"modificar_button","Editar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleOrdenCompra,"actualizar_button","Actualizar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleOrdenCompra,"eliminar_button","Eliminar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleOrdenCompra,"cancelar_button","Cancelar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleOrdenCompra,"guardarcambios_button","Guardar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleOrdenCompra,"guardarcambiostabla_button","Guardar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleOrdenCompra,"cerrar_button","Salir",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleOrdenCompra.setToolTipText("Nuevo"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleOrdenCompra.setToolTipText("Editar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleOrdenCompra.setToolTipText("Actualizar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleOrdenCompra.setToolTipText("Eliminar)"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleOrdenCompra.setToolTipText("Cancelar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleOrdenCompra.setToolTipText("Guardar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleOrdenCompra.setToolTipText("Guardar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleOrdenCompra.setToolTipText("Salir"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleOrdenCompra";
		inputMap = this.jButtonNuevoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleOrdenCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleOrdenCompra";
		inputMap = this.jButtonActualizarDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleOrdenCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleOrdenCompra";
		inputMap = this.jButtonEliminarDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleOrdenCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleOrdenCompra";
		inputMap = this.jButtonCancelarDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleOrdenCompra"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleOrdenCompra";
		inputMap = this.jButtonCerrarDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleOrdenCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleOrdenCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleOrdenCompra.setToolTipText("Nuevo DetalleOrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleOrdenCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleOrdenCompra.setToolTipText("Sin Cerrar Ventana DetalleOrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleOrdenCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleOrdenCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetalleOrdenCompra.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesDetalleOrdenCompra.setText("Acciones");		
		this.jLabelAccionesDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleOrdenCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleOrdenCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleOrdenCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleOrdenCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleOrdenCompra = new GridBagLayout();
		
		this.jPanelCamposDetalleOrdenCompra.setLayout(gridaBagLayoutCamposDetalleOrdenCompra);
		this.jPanelCamposOcultosDetalleOrdenCompra.setLayout(gridaBagLayoutCamposOcultosDetalleOrdenCompra);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleOrdenCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleOrdenCompra.setLayout(gridaBagLayoutCamposIniciogeneralDetalleOrdenCompra);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleOrdenCompra= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleOrdenCompra.setLayout(gridaBagLayoutCamposIniciovaloresDetalleOrdenCompra);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleOrdenCompra.add(jLabelIdDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleOrdenCompra.add(jLabelidDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_compraDetalleOrdenCompra.add(jLabelid_orden_compraDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraDetalleOrdenCompra.add(jButtonid_orden_compraDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraDetalleOrdenCompra.add(jButtonid_orden_compraDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_compraDetalleOrdenCompra.add(jComboBoxid_orden_compraDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleOrdenCompra.add(jLabelid_empresaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleOrdenCompra.add(jButtonid_empresaDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleOrdenCompra.add(jButtonid_empresaDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleOrdenCompra.add(jComboBoxid_empresaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleOrdenCompra.add(jLabelid_sucursalDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleOrdenCompra.add(jButtonid_sucursalDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleOrdenCompra.add(jButtonid_sucursalDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleOrdenCompra.add(jComboBoxid_sucursalDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleOrdenCompra.add(jLabelid_ejercicioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleOrdenCompra.add(jButtonid_ejercicioDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleOrdenCompra.add(jButtonid_ejercicioDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleOrdenCompra.add(jComboBoxid_ejercicioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleOrdenCompra.add(jLabelid_periodoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleOrdenCompra.add(jButtonid_periodoDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleOrdenCompra.add(jButtonid_periodoDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleOrdenCompra.add(jComboBoxid_periodoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleOrdenCompra.add(jLabelid_anioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleOrdenCompra.add(jButtonid_anioDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleOrdenCompra.add(jButtonid_anioDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleOrdenCompra.add(jComboBoxid_anioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleOrdenCompra.add(jLabelid_mesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleOrdenCompra.add(jButtonid_mesDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleOrdenCompra.add(jButtonid_mesDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleOrdenCompra.add(jComboBoxid_mesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleOrdenCompra.add(jLabelid_bodegaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleOrdenCompra.add(jButtonid_bodegaDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleOrdenCompra.add(jButtonid_bodegaDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleOrdenCompra.add(jComboBoxid_bodegaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleOrdenCompra.add(jLabelid_productoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleOrdenCompra.add(jButtonid_productoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleOrdenCompra.add(jButtonid_productoDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 4;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleOrdenCompra.add(jButtonid_productoDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleOrdenCompra.add(jComboBoxid_productoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleOrdenCompra.add(jLabelid_unidadDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleOrdenCompra.add(jButtonid_unidadDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleOrdenCompra.add(jButtonid_unidadDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleOrdenCompra.add(jComboBoxid_unidadDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleOrdenCompra.add(jLabeldescripcionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleOrdenCompra.add(jButtondescripcionDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleOrdenCompra.add(jscrollPanedescripcionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleOrdenCompra.add(jLabelcantidadDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleOrdenCompra.add(jButtoncantidadDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleOrdenCompra.add(jTextFieldcantidadDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleOrdenCompra.add(jLabeldescuentoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleOrdenCompra.add(jButtondescuentoDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleOrdenCompra.add(jTextFielddescuentoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioDetalleOrdenCompra.add(jLabelcosto_unitarioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioDetalleOrdenCompra.add(jButtoncosto_unitarioDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioDetalleOrdenCompra.add(jTextFieldcosto_unitarioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleOrdenCompra.add(jLabelivaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleOrdenCompra.add(jButtonivaDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleOrdenCompra.add(jTextFieldivaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorDetalleOrdenCompra.add(jLabeliva_valorDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorDetalleOrdenCompra.add(jButtoniva_valorDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorDetalleOrdenCompra.add(jTextFieldiva_valorDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalDetalleOrdenCompra.add(jLabelcosto_totalDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalDetalleOrdenCompra.add(jButtoncosto_totalDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalDetalleOrdenCompra.add(jTextFieldcosto_totalDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponibleDetalleOrdenCompra.add(jLabeldisponibleDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponibleDetalleOrdenCompra.add(jButtondisponibleDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponibleDetalleOrdenCompra.add(jTextFielddisponibleDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_novedad_productoDetalleOrdenCompra.add(jLabelid_novedad_productoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleOrdenCompra.add(jButtonid_novedad_productoDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleOrdenCompra.add(jButtonid_novedad_productoDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_novedad_productoDetalleOrdenCompra.add(jComboBoxid_novedad_productoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_detalle_orden_compraDetalleOrdenCompra.add(jLabelid_estado_detalle_orden_compraDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_orden_compraDetalleOrdenCompra.add(jButtonid_estado_detalle_orden_compraDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 3;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_orden_compraDetalleOrdenCompra.add(jButtonid_estado_detalle_orden_compraDetalleOrdenCompraUpdate, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_detalle_orden_compraDetalleOrdenCompra.add(jComboBoxid_estado_detalle_orden_compraDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteDetalleOrdenCompra.add(jLabelnumero_comprobanteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleOrdenCompra.add(jButtonnumero_comprobanteDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteDetalleOrdenCompra.add(jTextFieldnumero_comprobanteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellote_clienteDetalleOrdenCompra.add(jLabellote_clienteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanellote_clienteDetalleOrdenCompra.add(jButtonlote_clienteDetalleOrdenCompraBusqueda, this.gridBagConstraintsDetalleOrdenCompra);
	}

	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellote_clienteDetalleOrdenCompra.add(jTextFieldlote_clienteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPanelid_empresaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 1==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPanelid_sucursalDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 1==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPanelid_ejercicioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 1==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPanelid_periodoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 1==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPanelid_anioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 1==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPanelid_mesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 1==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPaneldescuentoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 2==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPanelnumero_comprobanteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 2==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposOcultosDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposOcultosDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleOrdenCompra.add(this.jPanellote_clienteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposOcultosDetalleOrdenCompra % 2==0) {
		iXPanelCamposOcultosDetalleOrdenCompra=0;
		iYPanelCamposOcultosDetalleOrdenCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciogeneralDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciogeneralDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleOrdenCompra.add(this.jPanelidDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciogeneralDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
		iYPanelCamposIniciogeneralDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciogeneralDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciogeneralDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleOrdenCompra.add(this.jPanelid_orden_compraDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciogeneralDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
		iYPanelCamposIniciogeneralDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciogeneralDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciogeneralDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleOrdenCompra.add(this.jPanelid_bodegaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciogeneralDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
		iYPanelCamposIniciogeneralDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciogeneralDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciogeneralDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleOrdenCompra.add(this.jPanelid_productoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciogeneralDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
		iYPanelCamposIniciogeneralDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciogeneralDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciogeneralDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleOrdenCompra.add(this.jPanelid_unidadDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciogeneralDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
		iYPanelCamposIniciogeneralDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciogeneralDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciogeneralDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleOrdenCompra.add(this.jPaneldescripcionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciogeneralDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
		iYPanelCamposIniciogeneralDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciovaloresDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciovaloresDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleOrdenCompra.add(this.jPanelcantidadDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciovaloresDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleOrdenCompra=0;
		iYPanelCamposIniciovaloresDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciovaloresDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciovaloresDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleOrdenCompra.add(this.jPanelcosto_unitarioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciovaloresDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleOrdenCompra=0;
		iYPanelCamposIniciovaloresDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciovaloresDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciovaloresDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleOrdenCompra.add(this.jPanelivaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciovaloresDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleOrdenCompra=0;
		iYPanelCamposIniciovaloresDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciovaloresDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciovaloresDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleOrdenCompra.add(this.jPaneliva_valorDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciovaloresDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleOrdenCompra=0;
		iYPanelCamposIniciovaloresDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciovaloresDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciovaloresDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleOrdenCompra.add(this.jPanelcosto_totalDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciovaloresDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleOrdenCompra=0;
		iYPanelCamposIniciovaloresDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciovaloresDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciovaloresDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleOrdenCompra.add(this.jPaneldisponibleDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciovaloresDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleOrdenCompra=0;
		iYPanelCamposIniciovaloresDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciogeneralDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciogeneralDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleOrdenCompra.add(this.jPanelid_novedad_productoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciogeneralDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
		iYPanelCamposIniciogeneralDetalleOrdenCompra++;
	}
	this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleOrdenCompra.gridy = iYPanelCamposIniciogeneralDetalleOrdenCompra;
	this.gridBagConstraintsDetalleOrdenCompra.gridx = iXPanelCamposIniciogeneralDetalleOrdenCompra++;
	this.gridBagConstraintsDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleOrdenCompra.add(this.jPanelid_estado_detalle_orden_compraDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);



	if(iXPanelCamposIniciogeneralDetalleOrdenCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
		iYPanelCamposIniciogeneralDetalleOrdenCompra++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleOrdenCompra= new GridBagLayout();
		this.jPanelAccionesDetalleOrdenCompra.setLayout(gridaBagLayoutAccionesDetalleOrdenCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleOrdenCompra= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleOrdenCompra.setLayout(gridaBagLayoutAccionesFormularioDetalleOrdenCompra);
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleOrdenCompra.add(this.jComboBoxTiposAccionesFormularioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleOrdenCompra.add(this.jCheckBoxPostAccionNuevoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleOrdenCompra.add(this.jCheckBoxPostAccionSinCerrarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleOrdenCompra.add(this.jCheckBoxPostAccionSinMensajeDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleOrdenCompra.add(this.jButtonModificarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);							

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleOrdenCompra.add(this.jButtonEliminarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
			
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleOrdenCompra.add(this.jButtonActualizarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleOrdenCompra.add(this.jButtonGuardarCambiosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);	
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleOrdenCompra.add(this.jButtonCancelarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleOrdenCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsDetalleOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleOrdenCompra.ipadx = 100;
				
			*/
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleOrdenCompra.gridx =0;
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleOrdenCompra = new DetalleOrdenCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Orden Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Orden Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Orden Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleOrdenCompraModel detalleordencompraModel=new DetalleOrdenCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleOrdenCompraModel.DetalleOrdenCompraFocusTraversalPolicy detalleordencompraFocusTraversalPolicy = detalleordencompraModel.new DetalleOrdenCompraFocusTraversalPolicy(this);
			
			//detalleordencompraFocusTraversalPolicy.setdetalleordencompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleordencompraModel);
			
			
			this.jContentPaneDetalleDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleOrdenCompra = new GridBagLayout();	
			this.jContentPaneDetalleDetalleOrdenCompra.setLayout(gridaBagLayoutDetalleDetalleOrdenCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleOrdenCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
					
				this.gridBagConstraintsDetalleOrdenCompra.gridwidth=2;
				
				this.jContentPaneDetalleDetalleOrdenCompra.add(jTtoolBarDetalleDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);								
				*/
}
			
			this.jScrollPanelDatosEdicionDetalleOrdenCompra=   new JScrollPane(jContentPaneDetalleDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyRelaciones++;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridwidth = 2;
		this.gridBagConstraintsDetalleOrdenCompra.gridheight = 1;
		iGridyRelaciones = iGridyRelaciones++;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleOrdenCompra.add(jPanelCamposIniciogeneralDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);


		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleOrdenCompra.gridy = 1;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridwidth = 2;
		this.gridBagConstraintsDetalleOrdenCompra.gridheight = 1;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleOrdenCompra.add(jPanelCamposIniciovaloresDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);
			
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
						&& detalleordencompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleordencompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleOrdenCompra= new GridBagConstraints();
						this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
						this.jContentPaneDetalleDetalleOrdenCompra.add(this.jTabbedPaneRelacionesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleOrdenCompra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleOrdenCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
					this.gridBagConstraintsDetalleOrdenCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
					
					this.gridBagConstraintsDetalleOrdenCompra.gridwidth=2;
				
					this.jContentPaneDetalleDetalleOrdenCompra.add(jPanelCamposOcultosDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);
				
					this.jPanelCamposOcultosDetalleOrdenCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	        this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			this.gridBagConstraintsDetalleOrdenCompra.gridwidth=2;
			
			
			this.jContentPaneDetalleDetalleOrdenCompra.add(this.jPanelAccionesFormularioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);							
			
			
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
	        this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
	        
			this.gridBagConstraintsDetalleOrdenCompra.gridwidth=2;
			
			this.jContentPaneDetalleDetalleOrdenCompra.add(this.jPanelAccionesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleOrdenCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleOrdenCompra=   new JScrollPane(this.jPanelCamposDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleOrdenCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			
			
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
			
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleOrdenCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleOrdenCompra;
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
