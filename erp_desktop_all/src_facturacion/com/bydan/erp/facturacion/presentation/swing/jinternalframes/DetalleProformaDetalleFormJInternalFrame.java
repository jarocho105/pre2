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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.DetalleProformaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class DetalleProformaDetalleFormJInternalFrame extends DetalleProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleProforma;
	
	protected JMenuBar jmenuBarDetalleDetalleProforma;
	
	protected JMenu jmenuDetalleDetalleProforma;
	protected JMenu jmenuDetalleArchivoDetalleProforma;
	protected JMenu jmenuDetalleAccionesDetalleProforma;
	protected JMenu jmenuDetalleDatosDetalleProforma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleProforma;	
	protected GridBagConstraints gridBagConstraintsDetalleProforma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleProformaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleProforma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

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

	protected ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_proforma="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EmpaqueBeanSwingJInternalFrame empaqueBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empaque="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EstadoDetalleProformaBeanSwingJInternalFrame estadodetalleproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleproforma="";
	
	public DetalleProformaSessionBean detalleproformaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ProformaSessionBean proformaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EmpaqueSessionBean empaqueSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EstadoDetalleProformaSessionBean estadodetalleproformaSessionBean;	
	
	public DetalleProformaLogic detalleproformaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleProforma;
	public JScrollPane jScrollPanelDatosEdicionDetalleProforma;
	public JScrollPane jScrollPanelDatosGeneralDetalleProforma;
	
	protected JPanel jPanelCamposDetalleProforma;    
	protected JPanel jPanelCamposOcultosDetalleProforma;    	
	protected JPanel jPanelAccionesDetalleProforma;
	protected JPanel jPanelAccionesFormularioDetalleProforma;
    
	
	
	protected Integer iXPanelCamposDetalleProforma=0;
	protected Integer iYPanelCamposDetalleProforma=0;
	
	protected Integer iXPanelCamposOcultosDetalleProforma=0;
	protected Integer iYPanelCamposOcultosDetalleProforma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleProforma;
	public JButton jButtonModificarDetalleProforma;
	public JButton jButtonActualizarDetalleProforma;
    public JButton jButtonEliminarDetalleProforma;
	public JButton jButtonCancelarDetalleProforma;
    public JButton jButtonGuardarCambiosDetalleProforma;
	public JButton jButtonGuardarCambiosTablaDetalleProforma;
	protected JButton jButtonCerrarDetalleProforma;
	
	
	protected JButton jButtonProcesarInformacionDetalleProforma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleProforma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleProforma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleProforma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleProforma;
	protected JButton jButtonModificarToolBarDetalleProforma;
	protected JButton jButtonActualizarToolBarDetalleProforma;
    protected JButton jButtonEliminarToolBarDetalleProforma;
	protected JButton jButtonCancelarToolBarDetalleProforma;
    protected JButton jButtonGuardarCambiosToolBarDetalleProforma;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleProforma;
	protected JButton jButtonCerrarToolBarDetalleProforma;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleProforma;
	protected JMenuItem jMenuItemModificarDetalleProforma;
	protected JMenuItem jMenuItemActualizarDetalleProforma;
    protected JMenuItem jMenuItemEliminarDetalleProforma;
	protected JMenuItem jMenuItemCancelarDetalleProforma;
    protected JMenuItem jMenuItemGuardarCambiosDetalleProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleProforma;
	protected JMenuItem jMenuItemCerrarDetalleProforma;
	protected JMenuItem jMenuItemDetalleCerrarDetalleProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleProforma;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleProforma;
	protected JMenuItem jMenuItemMostrarOcultarDetalleProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleProforma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleProforma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleProforma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleProforma;
	public JLabel jLabelIdDetalleProforma;
	public JLabel jLabelidDetalleProforma;
	public JButton jButtonidDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleProforma;
	public JLabel jLabeldescripcionDetalleProforma;
	public JTextArea jTextAreadescripcionDetalleProforma;
	public JScrollPane jscrollPanedescripcionDetalleProforma;
	public JButton jButtondescripcionDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_envasesDetalleProforma;
	public JLabel jLabelcantidad_envasesDetalleProforma;
	public JTextField jTextFieldcantidad_envasesDetalleProforma;
	public JButton jButtoncantidad_envasesDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleProforma;
	public JLabel jLabelcantidadDetalleProforma;
	public JTextField jTextFieldcantidadDetalleProforma;
	public JButton jButtoncantidadDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetalleProforma;
	public JLabel jLabelprecioDetalleProforma;
	public JTextField jTextFieldprecioDetalleProforma;
	public JButton jButtonprecioDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleProforma;
	public JLabel jLabelivaDetalleProforma;
	public JTextField jTextFieldivaDetalleProforma;
	public JButton jButtonivaDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajeDetalleProforma;
	public JLabel jLabeldescuento_porcentajeDetalleProforma;
	public JTextField jTextFielddescuento_porcentajeDetalleProforma;
	public JButton jButtondescuento_porcentajeDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorDetalleProforma;
	public JLabel jLabeldescuento_valorDetalleProforma;
	public JTextField jTextFielddescuento_valorDetalleProforma;
	public JButton jButtondescuento_valorDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelloteDetalleProforma;
	public JLabel jLabelloteDetalleProforma;
	public JTextField jTextFieldloteDetalleProforma;
	public JButton jButtonloteDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetalleProforma;
	public JLabel jLabeltotalDetalleProforma;
	public JTextField jTextFieldtotalDetalleProforma;
	public JButton jButtontotalDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPaneliceDetalleProforma;
	public JLabel jLabeliceDetalleProforma;
	public JTextField jTextFieldiceDetalleProforma;
	public JButton jButtoniceDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelcostoDetalleProforma;
	public JLabel jLabelcostoDetalleProforma;
	public JTextField jTextFieldcostoDetalleProforma;
	public JButton jButtoncostoDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelutilidadDetalleProforma;
	public JLabel jLabelutilidadDetalleProforma;
	public JTextField jTextFieldutilidadDetalleProforma;
	public JButton jButtonutilidadDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelareaDetalleProforma;
	public JLabel jLabelareaDetalleProforma;
	public JTextArea jTextAreaareaDetalleProforma;
	public JScrollPane jscrollPaneareaDetalleProforma;
	public JButton jButtonareaDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelmedidaDetalleProforma;
	public JLabel jLabelmedidaDetalleProforma;
	public JTextArea jTextAreamedidaDetalleProforma;
	public JScrollPane jscrollPanemedidaDetalleProforma;
	public JButton jButtonmedidaDetalleProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleProforma;
	public JLabel jLabelid_empresaDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleProforma;
	public JButton jButtonid_empresaDetalleProforma= new JButtonMe();
	public JButton jButtonid_empresaDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleProforma;
	public JLabel jLabelid_sucursalDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleProforma;
	public JButton jButtonid_sucursalDetalleProforma= new JButtonMe();
	public JButton jButtonid_sucursalDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleProforma;
	public JLabel jLabelid_ejercicioDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleProforma;
	public JButton jButtonid_ejercicioDetalleProforma= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleProforma;
	public JLabel jLabelid_periodoDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleProforma;
	public JButton jButtonid_periodoDetalleProforma= new JButtonMe();
	public JButton jButtonid_periodoDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleProforma;
	public JLabel jLabelid_anioDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleProforma;
	public JButton jButtonid_anioDetalleProforma= new JButtonMe();
	public JButton jButtonid_anioDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleProforma;
	public JLabel jLabelid_mesDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleProforma;
	public JButton jButtonid_mesDetalleProforma= new JButtonMe();
	public JButton jButtonid_mesDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_proformaDetalleProforma;
	public JLabel jLabelid_proformaDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_proformaDetalleProforma;
	public JButton jButtonid_proformaDetalleProforma= new JButtonMe();
	public JButton jButtonid_proformaDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_proformaDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleProforma;
	public JLabel jLabelid_bodegaDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleProforma;
	public JButton jButtonid_bodegaDetalleProforma= new JButtonMe();
	public JButton jButtonid_bodegaDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleProforma;
	public JLabel jLabelid_productoDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleProforma;
	public JButton jButtonid_productoDetalleProforma= new JButtonMe();
	public JButton jButtonid_productoDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleProforma;
	public JLabel jLabelid_unidadDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleProforma;
	public JButton jButtonid_unidadDetalleProforma= new JButtonMe();
	public JButton jButtonid_unidadDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_empaqueDetalleProforma;
	public JLabel jLabelid_empaqueDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empaqueDetalleProforma;
	public JButton jButtonid_empaqueDetalleProforma= new JButtonMe();
	public JButton jButtonid_empaqueDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_empaqueDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleProforma;
	public JLabel jLabelid_centro_costoDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleProforma;
	public JButton jButtonid_centro_costoDetalleProforma= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleProformaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleProformaArbol= new JButtonMe();

	public JPanel jPanelid_estado_detalle_proformaDetalleProforma;
	public JLabel jLabelid_estado_detalle_proformaDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_proformaDetalleProforma;
	public JButton jButtonid_estado_detalle_proformaDetalleProforma= new JButtonMe();
	public JButton jButtonid_estado_detalle_proformaDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_proformaDetalleProformaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleProforma;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleProformaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleProforma=new JPanel();
				this.jPanelAccionesFormularioDetalleProforma=new JPanel();
				this.jmenuBarDetalleDetalleProforma=new JMenuBar();
				this.jTtoolBarDetalleDetalleProforma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProformaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleProformaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProformaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProformaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProformaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleProforma() {
		return this.jButtonActualizarToolBarDetalleProforma;
	}
	
	public JButton getjButtonEliminarToolBarDetalleProforma() {
		return this.jButtonEliminarToolBarDetalleProforma;
	}
	
	public JButton getjButtonCancelarToolBarDetalleProforma() {
		return this.jButtonCancelarToolBarDetalleProforma;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleProforma() {
		return this.jButtonProcesarInformacionDetalleProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleProforma)	{
		this.jButtonProcesarInformacionDetalleProforma = jButtonProcesarInformacionDetalleProforma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleProforma() {
		return this.jComboBoxTiposAccionesDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleProforma(
			JComboBox jComboBoxTiposRelacionesDetalleProforma) {
		this.jComboBoxTiposRelacionesDetalleProforma = jComboBoxTiposRelacionesDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleProforma(
			JComboBox jComboBoxTiposAccionesDetalleProforma) {
		this.jComboBoxTiposAccionesDetalleProforma = jComboBoxTiposAccionesDetalleProforma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleProforma() {
		return this.jComboBoxTiposAccionesFormularioDetalleProforma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleProforma(
			JComboBox jComboBoxTiposAccionesFormularioDetalleProforma) {
		this.jComboBoxTiposAccionesFormularioDetalleProforma = jComboBoxTiposAccionesFormularioDetalleProforma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleproformaSessionBean=new DetalleProformaSessionBean();
		
		this.detalleproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleproformaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleProforma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleProforma=new JButtonMe();
				this.jButtonModificarToolBarDetalleProforma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleProforma,this.jTtoolBarDetalleDetalleProforma,
							"actualizar","actualizar","Actualizar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleProforma,this.jTtoolBarDetalleDetalleProforma,
							"eliminar","eliminar","Eliminar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleProforma,this.jTtoolBarDetalleDetalleProforma,
							"cancelar","cancelar","Cancelar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleProforma,this.jTtoolBarDetalleDetalleProforma,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleProforma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleProforma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleProforma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleProforma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleProforma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleProforma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleProforma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleProforma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleProforma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleProforma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleProforma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleProforma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleProforma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleProforma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleProforma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleProforma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleProforma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleProforma.add(this.jMenuItemDetalleCerrarDetalleProforma);
		
		this.jmenuDetalleAccionesDetalleProforma.add(this.jMenuItemActualizarDetalleProforma);
		this.jmenuDetalleAccionesDetalleProforma.add(this.jMenuItemEliminarDetalleProforma);
		this.jmenuDetalleAccionesDetalleProforma.add(this.jMenuItemCancelarDetalleProforma);		
		
		//this.jmenuDetalleDatosDetalleProforma.add(this.jMenuItemDetalleAbrirOrderByDetalleProforma);				
		this.jmenuDetalleDatosDetalleProforma.add(this.jMenuItemDetalleMostarOcultarDetalleProforma);				
				
		//this.jmenuDetalleAccionesDetalleProforma.add(this.jMenuItemGuardarCambiosDetalleProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleProforma.add(this.jmenuDetalleArchivoDetalleProforma);		
		this.jmenuBarDetalleDetalleProforma.add(this.jmenuDetalleAccionesDetalleProforma);		
		this.jmenuBarDetalleDetalleProforma.add(this.jmenuDetalleDatosDetalleProforma);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleProforma);				
	}
	
	
	public void inicializarElementosCamposDetalleProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleProforma = new JLabelMe();
		jLabelIdDetalleProforma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleProforma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleProforma= new GridBagLayout();

		this.jPanelidDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);

		jLabelidDetalleProforma = new JLabel();
		jLabelidDetalleProforma.setText("Id");

		jLabelidDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDetalleProforma = new JLabelMe();
		this.jLabeldescripcionDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleProforma.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPaneldescripcionDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextAreadescripcionDetalleProforma= new JTextAreaMe();
		jTextAreadescripcionDetalleProforma.setEnabled(false);
		jTextAreadescripcionDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleProforma.setLineWrap(true);
		jTextAreadescripcionDetalleProforma.setWrapStyleWord(true);
		jTextAreadescripcionDetalleProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleProforma.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleProforma = new JScrollPane(jTextAreadescripcionDetalleProforma);
		jscrollPanedescripcionDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleProformaBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleProformaBusqueda.setText("U");
		this.jButtondescripcionDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_envasesDetalleProforma = new JLabelMe();
		this.jLabelcantidad_envasesDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_CANTIDADENVASES+" : *");
		this.jLabelcantidad_envasesDetalleProforma.setToolTipText("Cantidad Envases");
		this.jLabelcantidad_envasesDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_envasesDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_envasesDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_envasesDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_envasesDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_envasesDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_CANTIDADENVASES);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelcantidad_envasesDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldcantidad_envasesDetalleProforma= new JTextFieldMe();
		jTextFieldcantidad_envasesDetalleProforma.setEnabled(false);
		jTextFieldcantidad_envasesDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_envasesDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_envasesDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_envasesDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_envasesDetalleProforma.setText("0.0");

		this.jButtoncantidad_envasesDetalleProformaBusqueda= new JButtonMe();
		this.jButtoncantidad_envasesDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_envasesDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_envasesDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_envasesDetalleProformaBusqueda.setText("U");
		this.jButtoncantidad_envasesDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_envasesDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_envasesDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_envasesDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_envasesDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_envasesDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_envasesDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleProforma = new JLabelMe();
		this.jLabelcantidadDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleProforma.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelcantidadDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldcantidadDetalleProforma= new JTextFieldMe();
		jTextFieldcantidadDetalleProforma.setEnabled(false);
		jTextFieldcantidadDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleProforma.setText("0");

		this.jButtoncantidadDetalleProformaBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleProformaBusqueda.setText("U");
		this.jButtoncantidadDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetalleProforma = new JLabelMe();
		this.jLabelprecioDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetalleProforma.setToolTipText("Precio");
		this.jLabelprecioDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelprecioDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldprecioDetalleProforma= new JTextFieldMe();
		jTextFieldprecioDetalleProforma.setEnabled(false);
		jTextFieldprecioDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetalleProforma.setText("0.0");

		this.jButtonprecioDetalleProformaBusqueda= new JButtonMe();
		this.jButtonprecioDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetalleProformaBusqueda.setText("U");
		this.jButtonprecioDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleProforma = new JLabelMe();
		this.jLabelivaDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleProforma.setToolTipText("Iva");
		this.jLabelivaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelivaDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldivaDetalleProforma= new JTextFieldMe();
		jTextFieldivaDetalleProforma.setEnabled(false);
		jTextFieldivaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleProforma.setText("0.0");

		this.jButtonivaDetalleProformaBusqueda= new JButtonMe();
		this.jButtonivaDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleProformaBusqueda.setText("U");
		this.jButtonivaDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajeDetalleProforma = new JLabelMe();
		this.jLabeldescuento_porcentajeDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajeDetalleProforma.setToolTipText("Descuento Porcentaje");
		this.jLabeldescuento_porcentajeDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldescuento_porcentajeDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldescuento_porcentajeDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajeDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajeDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajeDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPaneldescuento_porcentajeDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFielddescuento_porcentajeDetalleProforma= new JTextFieldMe();
		jTextFielddescuento_porcentajeDetalleProforma.setEnabled(false);
		jTextFielddescuento_porcentajeDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajeDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajeDetalleProforma.setText("0.0");

		this.jButtondescuento_porcentajeDetalleProformaBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajeDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajeDetalleProformaBusqueda.setText("U");
		this.jButtondescuento_porcentajeDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajeDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajeDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajeDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajeDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajeDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajeDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorDetalleProforma = new JLabelMe();
		this.jLabeldescuento_valorDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorDetalleProforma.setToolTipText("Descuento Valor");
		this.jLabeldescuento_valorDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPaneldescuento_valorDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFielddescuento_valorDetalleProforma= new JTextFieldMe();
		jTextFielddescuento_valorDetalleProforma.setEnabled(false);
		jTextFielddescuento_valorDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorDetalleProforma.setText("0.0");

		this.jButtondescuento_valorDetalleProformaBusqueda= new JButtonMe();
		this.jButtondescuento_valorDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorDetalleProformaBusqueda.setText("U");
		this.jButtondescuento_valorDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelloteDetalleProforma = new JLabelMe();
		this.jLabelloteDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabelloteDetalleProforma.setToolTipText("Lote");
		this.jLabelloteDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelloteDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldloteDetalleProforma= new JTextFieldMe();

		jTextFieldloteDetalleProforma.setEnabled(false);
		jTextFieldloteDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteDetalleProformaBusqueda= new JButtonMe();
		this.jButtonloteDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteDetalleProformaBusqueda.setText("U");
		this.jButtonloteDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetalleProforma = new JLabelMe();
		this.jLabeltotalDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetalleProforma.setToolTipText("Total");
		this.jLabeltotalDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPaneltotalDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldtotalDetalleProforma= new JTextFieldMe();
		jTextFieldtotalDetalleProforma.setEnabled(false);
		jTextFieldtotalDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetalleProforma.setText("0.0");

		this.jButtontotalDetalleProformaBusqueda= new JButtonMe();
		this.jButtontotalDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetalleProformaBusqueda.setText("U");
		this.jButtontotalDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabeliceDetalleProforma = new JLabelMe();
		this.jLabeliceDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetalleProforma.setToolTipText("Ice");
		this.jLabeliceDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPaneliceDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldiceDetalleProforma= new JTextFieldMe();
		jTextFieldiceDetalleProforma.setEnabled(false);
		jTextFieldiceDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetalleProforma.setText("0.0");

		this.jButtoniceDetalleProformaBusqueda= new JButtonMe();
		this.jButtoniceDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetalleProformaBusqueda.setText("U");
		this.jButtoniceDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelcostoDetalleProforma = new JLabelMe();
		this.jLabelcostoDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDetalleProforma.setToolTipText("Costo");
		this.jLabelcostoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelcostoDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldcostoDetalleProforma= new JTextFieldMe();
		jTextFieldcostoDetalleProforma.setEnabled(false);
		jTextFieldcostoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDetalleProforma.setText("0.0");

		this.jButtoncostoDetalleProformaBusqueda= new JButtonMe();
		this.jButtoncostoDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDetalleProformaBusqueda.setText("U");
		this.jButtoncostoDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelutilidadDetalleProforma = new JLabelMe();
		this.jLabelutilidadDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_UTILIDAD+" : *");
		this.jLabelutilidadDetalleProforma.setToolTipText("Utilidad");
		this.jLabelutilidadDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidadDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidadDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidadDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_UTILIDAD);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelutilidadDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextFieldutilidadDetalleProforma= new JTextFieldMe();
		jTextFieldutilidadDetalleProforma.setEnabled(false);
		jTextFieldutilidadDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidadDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidadDetalleProforma.setText("0.0");

		this.jButtonutilidadDetalleProformaBusqueda= new JButtonMe();
		this.jButtonutilidadDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidadDetalleProformaBusqueda.setText("U");
		this.jButtonutilidadDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidadDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidadDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidadDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidadDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidadDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidadDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelareaDetalleProforma = new JLabelMe();
		this.jLabelareaDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_AREA+" : *");
		this.jLabelareaDetalleProforma.setToolTipText("Area");
		this.jLabelareaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelareaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelareaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelareaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelareaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelareaDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_AREA);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelareaDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextAreaareaDetalleProforma= new JTextAreaMe();
		jTextAreaareaDetalleProforma.setEnabled(false);
		jTextAreaareaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaareaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaareaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaareaDetalleProforma.setLineWrap(true);
		jTextAreaareaDetalleProforma.setWrapStyleWord(true);
		jTextAreaareaDetalleProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaareaDetalleProforma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaareaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneareaDetalleProforma = new JScrollPane(jTextAreaareaDetalleProforma);
		jscrollPaneareaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneareaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneareaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonareaDetalleProformaBusqueda= new JButtonMe();
		this.jButtonareaDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonareaDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonareaDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonareaDetalleProformaBusqueda.setText("U");
		this.jButtonareaDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonareaDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonareaDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaareaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaareaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"areaDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonareaDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelmedidaDetalleProforma = new JLabelMe();
		this.jLabelmedidaDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_MEDIDA+" : *");
		this.jLabelmedidaDetalleProforma.setToolTipText("Meda");
		this.jLabelmedidaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmedidaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmedidaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmedidaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmedidaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmedidaDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_MEDIDA);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelmedidaDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jTextAreamedidaDetalleProforma= new JTextAreaMe();
		jTextAreamedidaDetalleProforma.setEnabled(false);
		jTextAreamedidaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamedidaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamedidaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamedidaDetalleProforma.setLineWrap(true);
		jTextAreamedidaDetalleProforma.setWrapStyleWord(true);
		jTextAreamedidaDetalleProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamedidaDetalleProforma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamedidaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemedidaDetalleProforma = new JScrollPane(jTextAreamedidaDetalleProforma);
		jscrollPanemedidaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemedidaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemedidaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmedidaDetalleProformaBusqueda= new JButtonMe();
		this.jButtonmedidaDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmedidaDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmedidaDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmedidaDetalleProformaBusqueda.setText("U");
		this.jButtonmedidaDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmedidaDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmedidaDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamedidaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamedidaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"medidaDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmedidaDetalleProformaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleProforma = new JLabelMe();
		this.jLabelid_empresaDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleProforma.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_empresaDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_empresaDetalleProforma= new JComboBoxMe();
		jComboBoxid_empresaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleProforma.setEnabled(false);

		this.jButtonid_empresaDetalleProforma= new JButtonMe();
		this.jButtonid_empresaDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleProforma.setText("Buscar");
		this.jButtonid_empresaDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleProforma"));

		this.jButtonid_empresaDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleProformaBusqueda.setText("U");
		this.jButtonid_empresaDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleProformaUpdate.setText("U");
		this.jButtonid_empresaDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleProformaUpdate"));



					
		this.jLabelid_sucursalDetalleProforma = new JLabelMe();
		this.jLabelid_sucursalDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleProforma.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_sucursalDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_sucursalDetalleProforma= new JComboBoxMe();
		jComboBoxid_sucursalDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleProforma.setEnabled(false);

		this.jButtonid_sucursalDetalleProforma= new JButtonMe();
		this.jButtonid_sucursalDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleProforma.setText("Buscar");
		this.jButtonid_sucursalDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleProforma"));

		this.jButtonid_sucursalDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleProformaBusqueda.setText("U");
		this.jButtonid_sucursalDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleProformaUpdate.setText("U");
		this.jButtonid_sucursalDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleProformaUpdate"));



					
		this.jLabelid_ejercicioDetalleProforma = new JLabelMe();
		this.jLabelid_ejercicioDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleProforma.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_ejercicioDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_ejercicioDetalleProforma= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleProforma.setEnabled(false);

		this.jButtonid_ejercicioDetalleProforma= new JButtonMe();
		this.jButtonid_ejercicioDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleProforma.setText("Buscar");
		this.jButtonid_ejercicioDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleProforma"));

		this.jButtonid_ejercicioDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleProformaBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleProformaUpdate.setText("U");
		this.jButtonid_ejercicioDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleProformaUpdate"));



					
		this.jLabelid_periodoDetalleProforma = new JLabelMe();
		this.jLabelid_periodoDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleProforma.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_periodoDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_periodoDetalleProforma= new JComboBoxMe();
		jComboBoxid_periodoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleProforma.setEnabled(false);

		this.jButtonid_periodoDetalleProforma= new JButtonMe();
		this.jButtonid_periodoDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleProforma.setText("Buscar");
		this.jButtonid_periodoDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleProforma"));

		this.jButtonid_periodoDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleProformaBusqueda.setText("U");
		this.jButtonid_periodoDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleProformaUpdate.setText("U");
		this.jButtonid_periodoDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleProformaUpdate"));



					
		this.jLabelid_anioDetalleProforma = new JLabelMe();
		this.jLabelid_anioDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleProforma.setToolTipText("Anio");
		this.jLabelid_anioDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_anioDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_anioDetalleProforma= new JComboBoxMe();
		jComboBoxid_anioDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleProforma.setEnabled(false);

		this.jButtonid_anioDetalleProforma= new JButtonMe();
		this.jButtonid_anioDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleProforma.setText("Buscar");
		this.jButtonid_anioDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleProforma"));

		this.jButtonid_anioDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleProformaBusqueda.setText("U");
		this.jButtonid_anioDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_anioDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleProformaUpdate.setText("U");
		this.jButtonid_anioDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleProformaUpdate"));



					
		this.jLabelid_mesDetalleProforma = new JLabelMe();
		this.jLabelid_mesDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleProforma.setToolTipText("Mes");
		this.jLabelid_mesDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_mesDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_mesDetalleProforma= new JComboBoxMe();
		jComboBoxid_mesDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleProforma.setEnabled(false);

		this.jButtonid_mesDetalleProforma= new JButtonMe();
		this.jButtonid_mesDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleProforma.setText("Buscar");
		this.jButtonid_mesDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleProforma"));

		this.jButtonid_mesDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleProformaBusqueda.setText("U");
		this.jButtonid_mesDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_mesDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleProformaUpdate.setText("U");
		this.jButtonid_mesDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleProformaUpdate"));



					
		this.jLabelid_proformaDetalleProforma = new JLabelMe();
		this.jLabelid_proformaDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDPROFORMA+" : *");
		this.jLabelid_proformaDetalleProforma.setToolTipText("Proforma");
		this.jLabelid_proformaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_proformaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_proformaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_proformaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_proformaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_proformaDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDPROFORMA);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_proformaDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_proformaDetalleProforma= new JComboBoxMe();
		jComboBoxid_proformaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proformaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proformaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_proformaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_proformaDetalleProforma= new JButtonMe();
		this.jButtonid_proformaDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proformaDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proformaDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proformaDetalleProforma.setText("Buscar");
		this.jButtonid_proformaDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_proformaDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proformaDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_proformaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proformaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proformaDetalleProforma"));

		this.jButtonid_proformaDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_proformaDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proformaDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proformaDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_proformaDetalleProformaBusqueda.setText("U");
		this.jButtonid_proformaDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_proformaDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proformaDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_proformaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proformaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proformaDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_proformaDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_proformaDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_proformaDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proformaDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proformaDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_proformaDetalleProformaUpdate.setText("U");
		this.jButtonid_proformaDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_proformaDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proformaDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_proformaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proformaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proformaDetalleProformaUpdate"));



					
		this.jLabelid_bodegaDetalleProforma = new JLabelMe();
		this.jLabelid_bodegaDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleProforma.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_bodegaDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_bodegaDetalleProforma= new JComboBoxMe();
		jComboBoxid_bodegaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleProforma= new JButtonMe();
		this.jButtonid_bodegaDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleProforma.setText("Buscar");
		this.jButtonid_bodegaDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleProforma"));

		this.jButtonid_bodegaDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleProformaBusqueda.setText("U");
		this.jButtonid_bodegaDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleProformaUpdate.setText("U");
		this.jButtonid_bodegaDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleProformaUpdate"));



					
		this.jLabelid_productoDetalleProforma = new JLabelMe();
		this.jLabelid_productoDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleProforma.setToolTipText("Producto");
		this.jLabelid_productoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_productoDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_productoDetalleProforma= new JComboBoxMe();
		jComboBoxid_productoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleProforma= new JButtonMe();
		this.jButtonid_productoDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleProforma.setText("Buscar");
		this.jButtonid_productoDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleProforma"));

		this.jButtonid_productoDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleProformaBusqueda.setText("U");
		this.jButtonid_productoDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_productoDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleProformaUpdate.setText("U");
		this.jButtonid_productoDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleProformaUpdate"));



					
		this.jLabelid_unidadDetalleProforma = new JLabelMe();
		this.jLabelid_unidadDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleProforma.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_unidadDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_unidadDetalleProforma= new JComboBoxMe();
		jComboBoxid_unidadDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleProforma= new JButtonMe();
		this.jButtonid_unidadDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleProforma.setText("Buscar");
		this.jButtonid_unidadDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleProforma"));

		this.jButtonid_unidadDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleProformaBusqueda.setText("U");
		this.jButtonid_unidadDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleProformaUpdate.setText("U");
		this.jButtonid_unidadDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleProformaUpdate"));



					
		this.jLabelid_empaqueDetalleProforma = new JLabelMe();
		this.jLabelid_empaqueDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDEMPAQUE+" :");
		this.jLabelid_empaqueDetalleProforma.setToolTipText("Empaque");
		this.jLabelid_empaqueDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empaqueDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empaqueDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empaqueDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empaqueDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empaqueDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDEMPAQUE);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_empaqueDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_empaqueDetalleProforma= new JComboBoxMe();
		jComboBoxid_empaqueDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empaqueDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empaqueDetalleProforma= new JButtonMe();
		this.jButtonid_empaqueDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetalleProforma.setText("Buscar");
		this.jButtonid_empaqueDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empaqueDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empaqueDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetalleProforma"));

		this.jButtonid_empaqueDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_empaqueDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empaqueDetalleProformaBusqueda.setText("U");
		this.jButtonid_empaqueDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empaqueDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empaqueDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empaqueDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_empaqueDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_empaqueDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empaqueDetalleProformaUpdate.setText("U");
		this.jButtonid_empaqueDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empaqueDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empaqueDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetalleProformaUpdate"));



					
		this.jLabelid_centro_costoDetalleProforma = new JLabelMe();
		this.jLabelid_centro_costoDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetalleProforma.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_centro_costoDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_centro_costoDetalleProforma= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetalleProforma= new JButtonMe();
		this.jButtonid_centro_costoDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleProforma.setText("Buscar");
		this.jButtonid_centro_costoDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleProforma"));

		this.jButtonid_centro_costoDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleProformaBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleProformaUpdate.setText("U");
		this.jButtonid_centro_costoDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleProformaUpdate"));


		jButtonid_centro_costoDetalleProformaArbol= new JButtonMe();
		jButtonid_centro_costoDetalleProformaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleProformaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleProformaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleProformaArbol.setText("Arbol");
		jButtonid_centro_costoDetalleProformaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleProformaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleProformaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleProformaArbol"));



					
		this.jLabelid_estado_detalle_proformaDetalleProforma = new JLabelMe();
		this.jLabelid_estado_detalle_proformaDetalleProforma.setText(""+DetalleProformaConstantesFunciones.LABEL_IDESTADODETALLEPROFORMA+" : *");
		this.jLabelid_estado_detalle_proformaDetalleProforma.setToolTipText("Estado");
		this.jLabelid_estado_detalle_proformaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_proformaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_proformaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_proformaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_proformaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_proformaDetalleProforma.setToolTipText(DetalleProformaConstantesFunciones.LABEL_IDESTADODETALLEPROFORMA);
		this.gridaBagLayoutDetalleProforma = new GridBagLayout();
		this.jPanelid_estado_detalle_proformaDetalleProforma.setLayout(this.gridaBagLayoutDetalleProforma);


		jComboBoxid_estado_detalle_proformaDetalleProforma= new JComboBoxMe();
		jComboBoxid_estado_detalle_proformaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_proformaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_proformaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_proformaDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_detalle_proformaDetalleProforma= new JButtonMe();
		this.jButtonid_estado_detalle_proformaDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_proformaDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_proformaDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_proformaDetalleProforma.setText("Buscar");
		this.jButtonid_estado_detalle_proformaDetalleProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_proformaDetalleProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_proformaDetalleProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_proformaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_proformaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_proformaDetalleProforma"));

		this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda.setText("U");
		this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_proformaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_proformaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_proformaDetalleProformaBusqueda"));

		if(this.detalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_proformaDetalleProformaBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_proformaDetalleProformaUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_proformaDetalleProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_proformaDetalleProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_proformaDetalleProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_proformaDetalleProformaUpdate.setText("U");
		this.jButtonid_estado_detalle_proformaDetalleProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_proformaDetalleProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_proformaDetalleProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_proformaDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_proformaDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_proformaDetalleProformaUpdate"));



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
		//this.jInternalFrameDetalleDetalleProforma = new DetalleProformaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Proforma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleProforma= new GridBagLayout();
		

		
		String sToolTipDetalleProforma="";
		sToolTipDetalleProforma=DetalleProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleProforma+="(Facturacion.DetalleProforma)";
		}
		
		if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleProforma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleProforma = new JButtonMe();
		this.jButtonModificarDetalleProforma = new JButtonMe();
        this.jButtonActualizarDetalleProforma = new JButtonMe();
        this.jButtonEliminarDetalleProforma = new JButtonMe();
        this.jButtonCancelarDetalleProforma = new JButtonMe();
        this.jButtonGuardarCambiosDetalleProforma = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleProforma = new JButtonMe();
		this.jButtonCerrarDetalleProforma = new JButtonMe();
		
		this.jScrollPanelDatosDetalleProforma = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleProforma = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleProforma = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Proforma";
		
		if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleProforma.setName("jPanelCamposDetalleProforma"); 

		this.jPanelCamposOcultosDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleProforma.setName("jPanelCamposOcultosDetalleProforma"); 

        this.jPanelAccionesDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleProforma.setToolTipText("Acciones");
        this.jPanelAccionesDetalleProforma.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleProforma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleProforma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleProforma.setText("Nuevo");
		this.jButtonModificarDetalleProforma.setText("Editar");
        this.jButtonActualizarDetalleProforma.setText("Actualizar");
        this.jButtonEliminarDetalleProforma.setText("Eliminar");
        this.jButtonCancelarDetalleProforma.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleProforma.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleProforma.setText("Guardar");
		this.jButtonCerrarDetalleProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleProforma,"nuevo_button","Nuevo",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleProforma,"modificar_button","Editar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleProforma,"actualizar_button","Actualizar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleProforma,"eliminar_button","Eliminar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleProforma,"cancelar_button","Cancelar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleProforma,"guardarcambios_button","Guardar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleProforma,"guardarcambiostabla_button","Guardar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleProforma,"cerrar_button","Salir",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleProforma.setToolTipText("Nuevo"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleProforma.setToolTipText("Editar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleProforma.setToolTipText("Actualizar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleProforma.setToolTipText("Eliminar)"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleProforma.setToolTipText("Cancelar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleProforma.setToolTipText("Guardar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleProforma.setToolTipText("Guardar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleProforma.setToolTipText("Salir"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleProforma";
		inputMap = this.jButtonNuevoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleProforma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleProforma";
		inputMap = this.jButtonActualizarDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleProforma"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleProforma";
		inputMap = this.jButtonEliminarDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleProforma"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleProforma";
		inputMap = this.jButtonCancelarDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleProforma"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleProforma";
		inputMap = this.jButtonCerrarDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleProforma";
		inputMap = this.jButtonGuardarCambiosTablaDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleProforma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleProforma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleProforma.setToolTipText("Nuevo DetalleProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleProforma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleProforma.setToolTipText("Sin Cerrar Ventana DetalleProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleProforma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleProforma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleProforma.setText("Accion");
		this.jComboBoxTiposAccionesDetalleProforma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleProforma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleProforma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleProforma = new JLabelMe();
		
		this.jLabelAccionesDetalleProforma.setText("Acciones");		
		this.jLabelAccionesDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleProforma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleProforma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleProforma=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleProforma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleProforma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleProforma = new GridBagLayout();
		
		this.jPanelCamposDetalleProforma.setLayout(gridaBagLayoutCamposDetalleProforma);
		this.jPanelCamposOcultosDetalleProforma.setLayout(gridaBagLayoutCamposOcultosDetalleProforma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidDetalleProforma.add(jLabelIdDetalleProforma, this.gridBagConstraintsDetalleProforma);



	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidDetalleProforma.add(jLabelidDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaDetalleProforma.add(jLabelid_empresaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleProforma.add(jButtonid_empresaDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleProforma.add(jButtonid_empresaDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaDetalleProforma.add(jComboBoxid_empresaDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalDetalleProforma.add(jLabelid_sucursalDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleProforma.add(jButtonid_sucursalDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleProforma.add(jButtonid_sucursalDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalDetalleProforma.add(jComboBoxid_sucursalDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioDetalleProforma.add(jLabelid_ejercicioDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleProforma.add(jButtonid_ejercicioDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleProforma.add(jButtonid_ejercicioDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioDetalleProforma.add(jComboBoxid_ejercicioDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoDetalleProforma.add(jLabelid_periodoDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleProforma.add(jButtonid_periodoDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleProforma.add(jButtonid_periodoDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoDetalleProforma.add(jComboBoxid_periodoDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioDetalleProforma.add(jLabelid_anioDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleProforma.add(jButtonid_anioDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleProforma.add(jButtonid_anioDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioDetalleProforma.add(jComboBoxid_anioDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesDetalleProforma.add(jLabelid_mesDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleProforma.add(jButtonid_mesDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleProforma.add(jButtonid_mesDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesDetalleProforma.add(jComboBoxid_mesDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_proformaDetalleProforma.add(jLabelid_proformaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_proformaDetalleProforma.add(jButtonid_proformaDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_proformaDetalleProforma.add(jButtonid_proformaDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_proformaDetalleProforma.add(jComboBoxid_proformaDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_bodegaDetalleProforma.add(jLabelid_bodegaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleProforma.add(jButtonid_bodegaDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleProforma.add(jButtonid_bodegaDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_bodegaDetalleProforma.add(jComboBoxid_bodegaDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_productoDetalleProforma.add(jLabelid_productoDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 2;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleProforma.add(jButtonid_productoDetalleProforma, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleProforma.add(jButtonid_productoDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 4;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleProforma.add(jButtonid_productoDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_productoDetalleProforma.add(jComboBoxid_productoDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_unidadDetalleProforma.add(jLabelid_unidadDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleProforma.add(jButtonid_unidadDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleProforma.add(jButtonid_unidadDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_unidadDetalleProforma.add(jComboBoxid_unidadDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empaqueDetalleProforma.add(jLabelid_empaqueDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empaqueDetalleProforma.add(jButtonid_empaqueDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empaqueDetalleProforma.add(jButtonid_empaqueDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empaqueDetalleProforma.add(jComboBoxid_empaqueDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_centro_costoDetalleProforma.add(jLabelid_centro_costoDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleProforma.add(jButtonid_centro_costoDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleProforma.add(jButtonid_centro_costoDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_centro_costoDetalleProforma.add(jComboBoxid_centro_costoDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_detalle_proformaDetalleProforma.add(jLabelid_estado_detalle_proformaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_proformaDetalleProforma.add(jButtonid_estado_detalle_proformaDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 3;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_proformaDetalleProforma.add(jButtonid_estado_detalle_proformaDetalleProformaUpdate, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_detalle_proformaDetalleProforma.add(jComboBoxid_estado_detalle_proformaDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionDetalleProforma.add(jLabeldescripcionDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleProforma.add(jButtondescripcionDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionDetalleProforma.add(jscrollPanedescripcionDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcantidad_envasesDetalleProforma.add(jLabelcantidad_envasesDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_envasesDetalleProforma.add(jButtoncantidad_envasesDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcantidad_envasesDetalleProforma.add(jTextFieldcantidad_envasesDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcantidadDetalleProforma.add(jLabelcantidadDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleProforma.add(jButtoncantidadDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcantidadDetalleProforma.add(jTextFieldcantidadDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelprecioDetalleProforma.add(jLabelprecioDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetalleProforma.add(jButtonprecioDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelprecioDetalleProforma.add(jTextFieldprecioDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaDetalleProforma.add(jLabelivaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleProforma.add(jButtonivaDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaDetalleProforma.add(jTextFieldivaDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_porcentajeDetalleProforma.add(jLabeldescuento_porcentajeDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajeDetalleProforma.add(jButtondescuento_porcentajeDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_porcentajeDetalleProforma.add(jTextFielddescuento_porcentajeDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_valorDetalleProforma.add(jLabeldescuento_valorDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorDetalleProforma.add(jButtondescuento_valorDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_valorDetalleProforma.add(jTextFielddescuento_valorDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelloteDetalleProforma.add(jLabelloteDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteDetalleProforma.add(jButtonloteDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelloteDetalleProforma.add(jTextFieldloteDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalDetalleProforma.add(jLabeltotalDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetalleProforma.add(jButtontotalDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalDetalleProforma.add(jTextFieldtotalDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceDetalleProforma.add(jLabeliceDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetalleProforma.add(jButtoniceDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceDetalleProforma.add(jTextFieldiceDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcostoDetalleProforma.add(jLabelcostoDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDetalleProforma.add(jButtoncostoDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcostoDetalleProforma.add(jTextFieldcostoDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelutilidadDetalleProforma.add(jLabelutilidadDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidadDetalleProforma.add(jButtonutilidadDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelutilidadDetalleProforma.add(jTextFieldutilidadDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelareaDetalleProforma.add(jLabelareaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelareaDetalleProforma.add(jButtonareaDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelareaDetalleProforma.add(jscrollPaneareaDetalleProforma, this.gridBagConstraintsDetalleProforma);


	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 0;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmedidaDetalleProforma.add(jLabelmedidaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 2;
		this.gridBagConstraintsDetalleProforma.ipadx = 0;
		this.gridBagConstraintsDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelmedidaDetalleProforma.add(jButtonmedidaDetalleProformaBusqueda, this.gridBagConstraintsDetalleProforma);
	}

	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProforma.gridy = 0;
	this.gridBagConstraintsDetalleProforma.gridx = 1;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmedidaDetalleProforma.add(jscrollPanemedidaDetalleProforma, this.gridBagConstraintsDetalleProforma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelidDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelid_proformaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelid_bodegaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelid_productoDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelid_unidadDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelid_empaqueDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelid_centro_costoDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelid_estado_detalle_proformaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPaneldescripcionDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelcantidad_envasesDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelcantidadDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelprecioDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelivaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPaneldescuento_porcentajeDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPaneldescuento_valorDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPanelloteDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleProforma.add(this.jPaneltotalDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposDetalleProforma % 1==0) {
		iXPanelCamposDetalleProforma=0;
		iYPanelCamposDetalleProforma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelid_empresaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelid_sucursalDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelid_ejercicioDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelid_periodoDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelid_anioDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelid_mesDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPaneliceDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelcostoDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelutilidadDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelareaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
	}
	this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProforma.gridy = iYPanelCamposOcultosDetalleProforma;
	this.gridBagConstraintsDetalleProforma.gridx = iXPanelCamposOcultosDetalleProforma++;
	this.gridBagConstraintsDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleProforma.add(this.jPanelmedidaDetalleProforma, this.gridBagConstraintsDetalleProforma);



	if(iXPanelCamposOcultosDetalleProforma % 1==0) {
		iXPanelCamposOcultosDetalleProforma=0;
		iYPanelCamposOcultosDetalleProforma++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleProforma= new GridBagLayout();
		this.jPanelAccionesDetalleProforma.setLayout(gridaBagLayoutAccionesDetalleProforma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleProforma= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleProforma.setLayout(gridaBagLayoutAccionesFormularioDetalleProforma);
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleProforma.add(this.jComboBoxTiposAccionesFormularioDetalleProforma, this.gridBagConstraintsDetalleProforma);

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleProforma.add(this.jCheckBoxPostAccionNuevoDetalleProforma, this.gridBagConstraintsDetalleProforma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleproformaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleProforma.add(this.jCheckBoxPostAccionSinCerrarDetalleProforma, this.gridBagConstraintsDetalleProforma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleproformaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleProforma.add(this.jCheckBoxPostAccionSinMensajeDetalleProforma, this.gridBagConstraintsDetalleProforma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleProforma.add(this.jButtonModificarDetalleProforma, this.gridBagConstraintsDetalleProforma);							

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleProforma.add(this.jButtonEliminarDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
			
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = 0;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleProforma.add(this.jButtonActualizarDetalleProforma, this.gridBagConstraintsDetalleProforma);


		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = 0;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleProforma.add(this.jButtonGuardarCambiosDetalleProforma, this.gridBagConstraintsDetalleProforma);	
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = 0;		
		this.gridBagConstraintsDetalleProforma.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleProforma.add(this.jButtonCancelarDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleProforma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();						
			this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleProforma.gridx = 0;		
			//this.gridBagConstraintsDetalleProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleProforma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleProforma.gridx =0;
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleProforma, this.gridBagConstraintsDetalleProforma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleProformaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleProforma = new DetalleProformaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Proforma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Proforma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Proforma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleProformaModel detalleproformaModel=new DetalleProformaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleProformaModel.DetalleProformaFocusTraversalPolicy detalleproformaFocusTraversalPolicy = detalleproformaModel.new DetalleProformaFocusTraversalPolicy(this);
			
			//detalleproformaFocusTraversalPolicy.setdetalleproformaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleproformaModel);
			
			
			this.jContentPaneDetalleDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleProforma = new GridBagLayout();	
			this.jContentPaneDetalleDetalleProforma.setLayout(gridaBagLayoutDetalleDetalleProforma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleProforma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
				this.gridBagConstraintsDetalleProforma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleProforma.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleProforma.add(jTtoolBarDetalleDetalleProforma, gridBagConstraintsDetalleProforma);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleProforma=   new JScrollPane(jContentPaneDetalleDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleProforma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleProforma.gridx = 0;
	        
			this.jContentPaneDetalleDetalleProforma.add(jPanelCamposDetalleProforma, gridBagConstraintsDetalleProforma);
			
			
			
			
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
						&& detalleproformaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleproformaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleProforma= new GridBagConstraints();
						this.gridBagConstraintsDetalleProforma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleProforma.gridx = 0;
						this.jContentPaneDetalleDetalleProforma.add(this.jTabbedPaneRelacionesDetalleProforma, this.gridBagConstraintsDetalleProforma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleProforma.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleProforma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
					this.gridBagConstraintsDetalleProforma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleProforma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleProforma.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleProforma.add(jPanelCamposOcultosDetalleProforma, gridBagConstraintsDetalleProforma);
				
					this.jPanelCamposOcultosDetalleProforma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleProforma.gridx = 0;
	        this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleProforma.add(this.jPanelAccionesFormularioDetalleProforma, this.gridBagConstraintsDetalleProforma);							
			
			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
	        this.gridBagConstraintsDetalleProforma.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleProforma.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleProforma.add(this.jPanelAccionesDetalleProforma, this.gridBagConstraintsDetalleProforma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleProforma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleProforma=   new JScrollPane(this.jPanelCamposDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleProforma.gridx = 0;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleProforma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleProforma, this.gridBagConstraintsDetalleProforma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleProforma, this.gridBagConstraintsDetalleProforma);			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleProforma, this.gridBagConstraintsDetalleProforma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleProforma, this.gridBagConstraintsDetalleProforma);
			
			
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
			
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleProforma, this.gridBagConstraintsDetalleProforma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleProforma;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleProforma;
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
