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
import com.bydan.erp.facturacion.util.DetalleFacturaConstantesFunciones;

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
public class DetalleFacturaDetalleFormJInternalFrame extends DetalleFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleFactura;
	
	protected JMenuBar jmenuBarDetalleDetalleFactura;
	
	protected JMenu jmenuDetalleDetalleFactura;
	protected JMenu jmenuDetalleArchivoDetalleFactura;
	protected JMenu jmenuDetalleAccionesDetalleFactura;
	protected JMenu jmenuDetalleDatosDetalleFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFactura;	
	protected GridBagConstraints gridBagConstraintsDetalleFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleFacturaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleFactura;		
	
	
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

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetalleFacturaSessionBean detallefacturaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public DetalleFacturaLogic detallefacturaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleFactura;
	public JScrollPane jScrollPanelDatosEdicionDetalleFactura;
	public JScrollPane jScrollPanelDatosGeneralDetalleFactura;
	
	protected JPanel jPanelCamposDetalleFactura;    
	protected JPanel jPanelCamposOcultosDetalleFactura;    	
	protected JPanel jPanelAccionesDetalleFactura;
	protected JPanel jPanelAccionesFormularioDetalleFactura;
    
	
	
	protected Integer iXPanelCamposDetalleFactura=0;
	protected Integer iYPanelCamposDetalleFactura=0;
	
	protected Integer iXPanelCamposOcultosDetalleFactura=0;
	protected Integer iYPanelCamposOcultosDetalleFactura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleFactura;
	public JButton jButtonModificarDetalleFactura;
	public JButton jButtonActualizarDetalleFactura;
    public JButton jButtonEliminarDetalleFactura;
	public JButton jButtonCancelarDetalleFactura;
    public JButton jButtonGuardarCambiosDetalleFactura;
	public JButton jButtonGuardarCambiosTablaDetalleFactura;
	protected JButton jButtonCerrarDetalleFactura;
	
	
	protected JButton jButtonProcesarInformacionDetalleFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFactura;
	protected JButton jButtonModificarToolBarDetalleFactura;
	protected JButton jButtonActualizarToolBarDetalleFactura;
    protected JButton jButtonEliminarToolBarDetalleFactura;
	protected JButton jButtonCancelarToolBarDetalleFactura;
    protected JButton jButtonGuardarCambiosToolBarDetalleFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFactura;
	protected JButton jButtonCerrarToolBarDetalleFactura;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFactura;
	protected JMenuItem jMenuItemModificarDetalleFactura;
	protected JMenuItem jMenuItemActualizarDetalleFactura;
    protected JMenuItem jMenuItemEliminarDetalleFactura;
	protected JMenuItem jMenuItemCancelarDetalleFactura;
    protected JMenuItem jMenuItemGuardarCambiosDetalleFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFactura;
	protected JMenuItem jMenuItemCerrarDetalleFactura;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFactura;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleFactura;
	public JLabel jLabelIdDetalleFactura;
	public JLabel jLabelidDetalleFactura;
	public JButton jButtonidDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_loteDetalleFactura;
	public JLabel jLabelcodigo_loteDetalleFactura;
	public JTextField jTextFieldcodigo_loteDetalleFactura;
	public JButton jButtoncodigo_loteDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfechaDetalleFactura;
	public JLabel jLabelfechaDetalleFactura;
	//public JFormattedTextField jDateChooserfechaDetalleFactura;

	public JDateChooser jDateChooserfechaDetalleFactura;
	public JButton jButtonfechaDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleFactura;
	public JLabel jLabeldescripcionDetalleFactura;
	public JTextArea jTextAreadescripcionDetalleFactura;
	public JScrollPane jscrollPanedescripcionDetalleFactura;
	public JButton jButtondescripcionDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleFactura;
	public JLabel jLabelcantidadDetalleFactura;
	public JTextField jTextFieldcantidadDetalleFactura;
	public JButton jButtoncantidadDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetalleFactura;
	public JLabel jLabelprecioDetalleFactura;
	public JTextField jTextFieldprecioDetalleFactura;
	public JButton jButtonprecioDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleFactura;
	public JLabel jLabelivaDetalleFactura;
	public JTextField jTextFieldivaDetalleFactura;
	public JButton jButtonivaDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorDetalleFactura;
	public JLabel jLabeliva_valorDetalleFactura;
	public JTextField jTextFieldiva_valorDetalleFactura;
	public JButton jButtoniva_valorDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneliceDetalleFactura;
	public JLabel jLabeliceDetalleFactura;
	public JTextField jTextFieldiceDetalleFactura;
	public JButton jButtoniceDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelice_valorDetalleFactura;
	public JLabel jLabelice_valorDetalleFactura;
	public JTextField jTextFieldice_valorDetalleFactura;
	public JButton jButtonice_valorDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleFactura;
	public JLabel jLabeldescuentoDetalleFactura;
	public JTextField jTextFielddescuentoDetalleFactura;
	public JButton jButtondescuentoDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorDetalleFactura;
	public JLabel jLabeldescuento_valorDetalleFactura;
	public JTextField jTextFielddescuento_valorDetalleFactura;
	public JButton jButtondescuento_valorDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento2DetalleFactura;
	public JLabel jLabeldescuento2DetalleFactura;
	public JTextField jTextFielddescuento2DetalleFactura;
	public JButton jButtondescuento2DetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalDetalleFactura;
	public JLabel jLabelsub_totalDetalleFactura;
	public JTextField jTextFieldsub_totalDetalleFactura;
	public JButton jButtonsub_totalDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetalleFactura;
	public JLabel jLabeltotalDetalleFactura;
	public JTextField jTextFieldtotalDetalleFactura;
	public JButton jButtontotalDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelmontoDetalleFactura;
	public JLabel jLabelmontoDetalleFactura;
	public JTextField jTextFieldmontoDetalleFactura;
	public JButton jButtonmontoDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombreDetalleFactura;
	public JLabel jLabelnombreDetalleFactura;
	public JTextArea jTextAreanombreDetalleFactura;
	public JScrollPane jscrollPanenombreDetalleFactura;
	public JButton jButtonnombreDetalleFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleFactura;
	public JLabel jLabelid_empresaDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleFactura;
	public JButton jButtonid_empresaDetalleFactura= new JButtonMe();
	public JButton jButtonid_empresaDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleFactura;
	public JLabel jLabelid_sucursalDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleFactura;
	public JButton jButtonid_sucursalDetalleFactura= new JButtonMe();
	public JButton jButtonid_sucursalDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleFactura;
	public JLabel jLabelid_ejercicioDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleFactura;
	public JButton jButtonid_ejercicioDetalleFactura= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleFactura;
	public JLabel jLabelid_periodoDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleFactura;
	public JButton jButtonid_periodoDetalleFactura= new JButtonMe();
	public JButton jButtonid_periodoDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleFactura;
	public JLabel jLabelid_anioDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleFactura;
	public JButton jButtonid_anioDetalleFactura= new JButtonMe();
	public JButton jButtonid_anioDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleFactura;
	public JLabel jLabelid_mesDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleFactura;
	public JButton jButtonid_mesDetalleFactura= new JButtonMe();
	public JButton jButtonid_mesDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaDetalleFactura;
	public JLabel jLabelid_facturaDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaDetalleFactura;
	public JButton jButtonid_facturaDetalleFactura= new JButtonMe();
	public JButton jButtonid_facturaDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_facturaDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleFactura;
	public JLabel jLabelid_bodegaDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleFactura;
	public JButton jButtonid_bodegaDetalleFactura= new JButtonMe();
	public JButton jButtonid_bodegaDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleFactura;
	public JLabel jLabelid_productoDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleFactura;
	public JButton jButtonid_productoDetalleFactura= new JButtonMe();
	public JButton jButtonid_productoDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleFactura;
	public JLabel jLabelid_unidadDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleFactura;
	public JButton jButtonid_unidadDetalleFactura= new JButtonMe();
	public JButton jButtonid_unidadDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleFactura;
	public JLabel jLabelid_centro_costoDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleFactura;
	public JButton jButtonid_centro_costoDetalleFactura= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleFacturaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleFactura;
	
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
	public int iHeightFormulario=1166;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleFacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleFactura=new JPanel();
				this.jPanelAccionesFormularioDetalleFactura=new JPanel();
				this.jmenuBarDetalleDetalleFactura=new JMenuBar();
				this.jTtoolBarDetalleDetalleFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleFacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleFactura() {
		return this.jButtonActualizarToolBarDetalleFactura;
	}
	
	public JButton getjButtonEliminarToolBarDetalleFactura() {
		return this.jButtonEliminarToolBarDetalleFactura;
	}
	
	public JButton getjButtonCancelarToolBarDetalleFactura() {
		return this.jButtonCancelarToolBarDetalleFactura;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleFactura() {
		return this.jButtonProcesarInformacionDetalleFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFactura)	{
		this.jButtonProcesarInformacionDetalleFactura = jButtonProcesarInformacionDetalleFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFactura() {
		return this.jComboBoxTiposAccionesDetalleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFactura(
			JComboBox jComboBoxTiposRelacionesDetalleFactura) {
		this.jComboBoxTiposRelacionesDetalleFactura = jComboBoxTiposRelacionesDetalleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFactura(
			JComboBox jComboBoxTiposAccionesDetalleFactura) {
		this.jComboBoxTiposAccionesDetalleFactura = jComboBoxTiposAccionesDetalleFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleFactura() {
		return this.jComboBoxTiposAccionesFormularioDetalleFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleFactura(
			JComboBox jComboBoxTiposAccionesFormularioDetalleFactura) {
		this.jComboBoxTiposAccionesFormularioDetalleFactura = jComboBoxTiposAccionesFormularioDetalleFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallefacturaSessionBean=new DetalleFacturaSessionBean();
		
		this.detallefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallefacturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Factura MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleFactura=new JButtonMe();
				this.jButtonModificarToolBarDetalleFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleFactura,this.jTtoolBarDetalleDetalleFactura,
							"actualizar","actualizar","Actualizar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleFactura,this.jTtoolBarDetalleDetalleFactura,
							"eliminar","eliminar","Eliminar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleFactura,this.jTtoolBarDetalleDetalleFactura,
							"cancelar","cancelar","Cancelar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleFactura,this.jTtoolBarDetalleDetalleFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleFactura.add(this.jMenuItemDetalleCerrarDetalleFactura);
		
		this.jmenuDetalleAccionesDetalleFactura.add(this.jMenuItemActualizarDetalleFactura);
		this.jmenuDetalleAccionesDetalleFactura.add(this.jMenuItemEliminarDetalleFactura);
		this.jmenuDetalleAccionesDetalleFactura.add(this.jMenuItemCancelarDetalleFactura);		
		
		//this.jmenuDetalleDatosDetalleFactura.add(this.jMenuItemDetalleAbrirOrderByDetalleFactura);				
		this.jmenuDetalleDatosDetalleFactura.add(this.jMenuItemDetalleMostarOcultarDetalleFactura);				
				
		//this.jmenuDetalleAccionesDetalleFactura.add(this.jMenuItemGuardarCambiosDetalleFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleFactura.add(this.jmenuDetalleArchivoDetalleFactura);		
		this.jmenuBarDetalleDetalleFactura.add(this.jmenuDetalleAccionesDetalleFactura);		
		this.jmenuBarDetalleDetalleFactura.add(this.jmenuDetalleDatosDetalleFactura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleFactura);				
	}
	
	
	public void inicializarElementosCamposDetalleFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleFactura = new JLabelMe();
		jLabelIdDetalleFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleFactura= new GridBagLayout();

		this.jPanelidDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);

		jLabelidDetalleFactura = new JLabel();
		jLabelidDetalleFactura.setText("Id");

		jLabelidDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_loteDetalleFactura = new JLabelMe();
		this.jLabelcodigo_loteDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_CODIGOLOTE+" : *");
		this.jLabelcodigo_loteDetalleFactura.setToolTipText("Codigo Lote");
		this.jLabelcodigo_loteDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_loteDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_loteDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_loteDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_loteDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_loteDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_CODIGOLOTE);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelcodigo_loteDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldcodigo_loteDetalleFactura= new JTextFieldMe();

		jTextFieldcodigo_loteDetalleFactura.setEnabled(false);
		jTextFieldcodigo_loteDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_loteDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_loteDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_loteDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_loteDetalleFacturaBusqueda= new JButtonMe();
		this.jButtoncodigo_loteDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_loteDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_loteDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_loteDetalleFacturaBusqueda.setText("U");
		this.jButtoncodigo_loteDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_loteDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_loteDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_loteDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_loteDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_loteDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_loteDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfechaDetalleFactura = new JLabelMe();
		this.jLabelfechaDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDetalleFactura.setToolTipText("Fecha");
		this.jLabelfechaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelfechaDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		//jFormattedTextFieldfechaDetalleFactura= new JFormattedTextFieldMe();

		jDateChooserfechaDetalleFactura= new JDateChooser();
		jDateChooserfechaDetalleFactura.setEnabled(false);
		jDateChooserfechaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDetalleFactura.setDate(new Date());
		jDateChooserfechaDetalleFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDetalleFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonfechaDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDetalleFacturaBusqueda.setText("U");
		this.jButtonfechaDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleFactura = new JLabelMe();
		this.jLabeldescripcionDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleFactura.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPaneldescripcionDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextAreadescripcionDetalleFactura= new JTextAreaMe();
		jTextAreadescripcionDetalleFactura.setEnabled(false);
		jTextAreadescripcionDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFactura.setLineWrap(true);
		jTextAreadescripcionDetalleFactura.setWrapStyleWord(true);
		jTextAreadescripcionDetalleFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleFactura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleFactura = new JScrollPane(jTextAreadescripcionDetalleFactura);
		jscrollPanedescripcionDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleFacturaBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleFacturaBusqueda.setText("U");
		this.jButtondescripcionDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleFactura = new JLabelMe();
		this.jLabelcantidadDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleFactura.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelcantidadDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldcantidadDetalleFactura= new JTextFieldMe();
		jTextFieldcantidadDetalleFactura.setEnabled(false);
		jTextFieldcantidadDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleFactura.setText("0");

		this.jButtoncantidadDetalleFacturaBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleFacturaBusqueda.setText("U");
		this.jButtoncantidadDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetalleFactura = new JLabelMe();
		this.jLabelprecioDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetalleFactura.setToolTipText("Precio");
		this.jLabelprecioDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelprecioDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldprecioDetalleFactura= new JTextFieldMe();
		jTextFieldprecioDetalleFactura.setEnabled(false);
		jTextFieldprecioDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetalleFactura.setText("0.0");

		this.jButtonprecioDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonprecioDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetalleFacturaBusqueda.setText("U");
		this.jButtonprecioDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleFactura = new JLabelMe();
		this.jLabelivaDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleFactura.setToolTipText("Iva %");
		this.jLabelivaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelivaDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldivaDetalleFactura= new JTextFieldMe();
		jTextFieldivaDetalleFactura.setEnabled(false);
		jTextFieldivaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleFactura.setText("0.0");

		this.jButtonivaDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonivaDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleFacturaBusqueda.setText("U");
		this.jButtonivaDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorDetalleFactura = new JLabelMe();
		this.jLabeliva_valorDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorDetalleFactura.setToolTipText("Iva Valor");
		this.jLabeliva_valorDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPaneliva_valorDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldiva_valorDetalleFactura= new JTextFieldMe();
		jTextFieldiva_valorDetalleFactura.setEnabled(false);
		jTextFieldiva_valorDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorDetalleFactura.setText("0.0");

		this.jButtoniva_valorDetalleFacturaBusqueda= new JButtonMe();
		this.jButtoniva_valorDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorDetalleFacturaBusqueda.setText("U");
		this.jButtoniva_valorDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeliceDetalleFactura = new JLabelMe();
		this.jLabeliceDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetalleFactura.setToolTipText("Ice %");
		this.jLabeliceDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPaneliceDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldiceDetalleFactura= new JTextFieldMe();
		jTextFieldiceDetalleFactura.setEnabled(false);
		jTextFieldiceDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetalleFactura.setText("0.0");

		this.jButtoniceDetalleFacturaBusqueda= new JButtonMe();
		this.jButtoniceDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetalleFacturaBusqueda.setText("U");
		this.jButtoniceDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelice_valorDetalleFactura = new JLabelMe();
		this.jLabelice_valorDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorDetalleFactura.setToolTipText("Ice Valor");
		this.jLabelice_valorDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelice_valorDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldice_valorDetalleFactura= new JTextFieldMe();
		jTextFieldice_valorDetalleFactura.setEnabled(false);
		jTextFieldice_valorDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorDetalleFactura.setText("0.0");

		this.jButtonice_valorDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonice_valorDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorDetalleFacturaBusqueda.setText("U");
		this.jButtonice_valorDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleFactura = new JLabelMe();
		this.jLabeldescuentoDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleFactura.setToolTipText("Descuento %");
		this.jLabeldescuentoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPaneldescuentoDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFielddescuentoDetalleFactura= new JTextFieldMe();
		jTextFielddescuentoDetalleFactura.setEnabled(false);
		jTextFielddescuentoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleFactura.setText("0.0");

		this.jButtondescuentoDetalleFacturaBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleFacturaBusqueda.setText("U");
		this.jButtondescuentoDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorDetalleFactura = new JLabelMe();
		this.jLabeldescuento_valorDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorDetalleFactura.setToolTipText("Descuento Valor");
		this.jLabeldescuento_valorDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPaneldescuento_valorDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFielddescuento_valorDetalleFactura= new JTextFieldMe();
		jTextFielddescuento_valorDetalleFactura.setEnabled(false);
		jTextFielddescuento_valorDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorDetalleFactura.setText("0.0");

		this.jButtondescuento_valorDetalleFacturaBusqueda= new JButtonMe();
		this.jButtondescuento_valorDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorDetalleFacturaBusqueda.setText("U");
		this.jButtondescuento_valorDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento2DetalleFactura = new JLabelMe();
		this.jLabeldescuento2DetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_DESCUENTO2+" : *");
		this.jLabeldescuento2DetalleFactura.setToolTipText("Descuento2");
		this.jLabeldescuento2DetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento2DetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento2DetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento2DetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_DESCUENTO2);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPaneldescuento2DetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFielddescuento2DetalleFactura= new JTextFieldMe();
		jTextFielddescuento2DetalleFactura.setEnabled(false);
		jTextFielddescuento2DetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento2DetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento2DetalleFactura.setText("0.0");

		this.jButtondescuento2DetalleFacturaBusqueda= new JButtonMe();
		this.jButtondescuento2DetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento2DetalleFacturaBusqueda.setText("U");
		this.jButtondescuento2DetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento2DetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento2DetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento2DetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento2DetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento2DetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento2DetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalDetalleFactura = new JLabelMe();
		this.jLabelsub_totalDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalDetalleFactura.setToolTipText("Sub Total");
		this.jLabelsub_totalDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelsub_totalDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldsub_totalDetalleFactura= new JTextFieldMe();
		jTextFieldsub_totalDetalleFactura.setEnabled(false);
		jTextFieldsub_totalDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalDetalleFactura.setText("0.0");

		this.jButtonsub_totalDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonsub_totalDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalDetalleFacturaBusqueda.setText("U");
		this.jButtonsub_totalDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetalleFactura = new JLabelMe();
		this.jLabeltotalDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetalleFactura.setToolTipText("Total");
		this.jLabeltotalDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPaneltotalDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldtotalDetalleFactura= new JTextFieldMe();
		jTextFieldtotalDetalleFactura.setEnabled(false);
		jTextFieldtotalDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetalleFactura.setText("0.0");

		this.jButtontotalDetalleFacturaBusqueda= new JButtonMe();
		this.jButtontotalDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetalleFacturaBusqueda.setText("U");
		this.jButtontotalDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelmontoDetalleFactura = new JLabelMe();
		this.jLabelmontoDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoDetalleFactura.setToolTipText("Monto");
		this.jLabelmontoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelmontoDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextFieldmontoDetalleFactura= new JTextFieldMe();
		jTextFieldmontoDetalleFactura.setEnabled(false);
		jTextFieldmontoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoDetalleFactura.setText("0.0");

		this.jButtonmontoDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonmontoDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoDetalleFacturaBusqueda.setText("U");
		this.jButtonmontoDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoDetalleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombreDetalleFactura = new JLabelMe();
		this.jLabelnombreDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDetalleFactura.setToolTipText("Nombre");
		this.jLabelnombreDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelnombreDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jTextAreanombreDetalleFactura= new JTextAreaMe();
		jTextAreanombreDetalleFactura.setEnabled(false);
		jTextAreanombreDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleFactura.setLineWrap(true);
		jTextAreanombreDetalleFactura.setWrapStyleWord(true);
		jTextAreanombreDetalleFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDetalleFactura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDetalleFactura = new JScrollPane(jTextAreanombreDetalleFactura);
		jscrollPanenombreDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonnombreDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDetalleFacturaBusqueda.setText("U");
		this.jButtonnombreDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDetalleFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleFactura = new JLabelMe();
		this.jLabelid_empresaDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleFactura.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_empresaDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_empresaDetalleFactura= new JComboBoxMe();
		jComboBoxid_empresaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleFactura.setEnabled(false);

		this.jButtonid_empresaDetalleFactura= new JButtonMe();
		this.jButtonid_empresaDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFactura.setText("Buscar");
		this.jButtonid_empresaDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFactura"));

		this.jButtonid_empresaDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFacturaBusqueda.setText("U");
		this.jButtonid_empresaDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFacturaUpdate.setText("U");
		this.jButtonid_empresaDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturaUpdate"));



					
		this.jLabelid_sucursalDetalleFactura = new JLabelMe();
		this.jLabelid_sucursalDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleFactura.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_sucursalDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_sucursalDetalleFactura= new JComboBoxMe();
		jComboBoxid_sucursalDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleFactura.setEnabled(false);

		this.jButtonid_sucursalDetalleFactura= new JButtonMe();
		this.jButtonid_sucursalDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFactura.setText("Buscar");
		this.jButtonid_sucursalDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFactura"));

		this.jButtonid_sucursalDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleFacturaBusqueda.setText("U");
		this.jButtonid_sucursalDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleFacturaUpdate.setText("U");
		this.jButtonid_sucursalDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFacturaUpdate"));



					
		this.jLabelid_ejercicioDetalleFactura = new JLabelMe();
		this.jLabelid_ejercicioDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleFactura.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_ejercicioDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_ejercicioDetalleFactura= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleFactura.setEnabled(false);

		this.jButtonid_ejercicioDetalleFactura= new JButtonMe();
		this.jButtonid_ejercicioDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFactura.setText("Buscar");
		this.jButtonid_ejercicioDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFactura"));

		this.jButtonid_ejercicioDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleFacturaBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleFacturaUpdate.setText("U");
		this.jButtonid_ejercicioDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFacturaUpdate"));



					
		this.jLabelid_periodoDetalleFactura = new JLabelMe();
		this.jLabelid_periodoDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleFactura.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_periodoDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_periodoDetalleFactura= new JComboBoxMe();
		jComboBoxid_periodoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleFactura.setEnabled(false);

		this.jButtonid_periodoDetalleFactura= new JButtonMe();
		this.jButtonid_periodoDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleFactura.setText("Buscar");
		this.jButtonid_periodoDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleFactura"));

		this.jButtonid_periodoDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleFacturaBusqueda.setText("U");
		this.jButtonid_periodoDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleFacturaUpdate.setText("U");
		this.jButtonid_periodoDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleFacturaUpdate"));



					
		this.jLabelid_anioDetalleFactura = new JLabelMe();
		this.jLabelid_anioDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleFactura.setToolTipText("Anio");
		this.jLabelid_anioDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_anioDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_anioDetalleFactura= new JComboBoxMe();
		jComboBoxid_anioDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleFactura.setEnabled(false);

		this.jButtonid_anioDetalleFactura= new JButtonMe();
		this.jButtonid_anioDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleFactura.setText("Buscar");
		this.jButtonid_anioDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleFactura"));

		this.jButtonid_anioDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleFacturaBusqueda.setText("U");
		this.jButtonid_anioDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_anioDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleFacturaUpdate.setText("U");
		this.jButtonid_anioDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleFacturaUpdate"));



					
		this.jLabelid_mesDetalleFactura = new JLabelMe();
		this.jLabelid_mesDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleFactura.setToolTipText("Mes");
		this.jLabelid_mesDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_mesDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_mesDetalleFactura= new JComboBoxMe();
		jComboBoxid_mesDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleFactura.setEnabled(false);

		this.jButtonid_mesDetalleFactura= new JButtonMe();
		this.jButtonid_mesDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleFactura.setText("Buscar");
		this.jButtonid_mesDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleFactura"));

		this.jButtonid_mesDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleFacturaBusqueda.setText("U");
		this.jButtonid_mesDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_mesDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleFacturaUpdate.setText("U");
		this.jButtonid_mesDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleFacturaUpdate"));



					
		this.jLabelid_facturaDetalleFactura = new JLabelMe();
		this.jLabelid_facturaDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaDetalleFactura.setToolTipText("Factura");
		this.jLabelid_facturaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_facturaDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_facturaDetalleFactura= new JComboBoxMe();
		jComboBoxid_facturaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaDetalleFactura= new JButtonMe();
		this.jButtonid_facturaDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleFactura.setText("Buscar");
		this.jButtonid_facturaDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleFactura"));

		this.jButtonid_facturaDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_facturaDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleFacturaBusqueda.setText("U");
		this.jButtonid_facturaDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_facturaDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_facturaDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleFacturaUpdate.setText("U");
		this.jButtonid_facturaDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleFacturaUpdate"));



					
		this.jLabelid_bodegaDetalleFactura = new JLabelMe();
		this.jLabelid_bodegaDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleFactura.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_bodegaDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_bodegaDetalleFactura= new JComboBoxMe();
		jComboBoxid_bodegaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleFactura= new JButtonMe();
		this.jButtonid_bodegaDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFactura.setText("Buscar");
		this.jButtonid_bodegaDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFactura"));

		this.jButtonid_bodegaDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleFacturaBusqueda.setText("U");
		this.jButtonid_bodegaDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleFacturaUpdate.setText("U");
		this.jButtonid_bodegaDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFacturaUpdate"));



					
		this.jLabelid_productoDetalleFactura = new JLabelMe();
		this.jLabelid_productoDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleFactura.setToolTipText("Producto");
		this.jLabelid_productoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_productoDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_productoDetalleFactura= new JComboBoxMe();
		jComboBoxid_productoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleFactura= new JButtonMe();
		this.jButtonid_productoDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFactura.setText("Buscar");
		this.jButtonid_productoDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFactura"));

		this.jButtonid_productoDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleFacturaBusqueda.setText("U");
		this.jButtonid_productoDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_productoDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleFacturaUpdate.setText("U");
		this.jButtonid_productoDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFacturaUpdate"));



					
		this.jLabelid_unidadDetalleFactura = new JLabelMe();
		this.jLabelid_unidadDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleFactura.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_unidadDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_unidadDetalleFactura= new JComboBoxMe();
		jComboBoxid_unidadDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleFactura= new JButtonMe();
		this.jButtonid_unidadDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFactura.setText("Buscar");
		this.jButtonid_unidadDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFactura"));

		this.jButtonid_unidadDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleFacturaBusqueda.setText("U");
		this.jButtonid_unidadDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleFacturaUpdate.setText("U");
		this.jButtonid_unidadDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFacturaUpdate"));



					
		this.jLabelid_centro_costoDetalleFactura = new JLabelMe();
		this.jLabelid_centro_costoDetalleFactura.setText(""+DetalleFacturaConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetalleFactura.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleFactura.setToolTipText(DetalleFacturaConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleFactura = new GridBagLayout();
		this.jPanelid_centro_costoDetalleFactura.setLayout(this.gridaBagLayoutDetalleFactura);


		jComboBoxid_centro_costoDetalleFactura= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetalleFactura= new JButtonMe();
		this.jButtonid_centro_costoDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleFactura.setText("Buscar");
		this.jButtonid_centro_costoDetalleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleFactura"));

		this.jButtonid_centro_costoDetalleFacturaBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleFacturaBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleFacturaBusqueda"));

		if(this.detallefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleFacturaUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleFacturaUpdate.setText("U");
		this.jButtonid_centro_costoDetalleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleFacturaUpdate"));


		jButtonid_centro_costoDetalleFacturaArbol= new JButtonMe();
		jButtonid_centro_costoDetalleFacturaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleFacturaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleFacturaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleFacturaArbol.setText("Arbol");
		jButtonid_centro_costoDetalleFacturaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleFacturaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleFacturaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleFacturaArbol"));



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
		//this.jInternalFrameDetalleDetalleFactura = new DetalleFacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFactura= new GridBagLayout();
		

		
		String sToolTipDetalleFactura="";
		sToolTipDetalleFactura=DetalleFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFactura+="(Facturacion.DetalleFactura)";
		}
		
		if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleFactura = new JButtonMe();
		this.jButtonModificarDetalleFactura = new JButtonMe();
        this.jButtonActualizarDetalleFactura = new JButtonMe();
        this.jButtonEliminarDetalleFactura = new JButtonMe();
        this.jButtonCancelarDetalleFactura = new JButtonMe();
        this.jButtonGuardarCambiosDetalleFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleFactura = new JButtonMe();
		this.jButtonCerrarDetalleFactura = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleFactura = new JScrollPane();
		//this.jScrollPanelDatosDetalleFacturaTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Factura";
		
		if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleFacturaTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleFactura.setName("jPanelCamposDetalleFactura"); 

		this.jPanelCamposOcultosDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleFactura.setName("jPanelCamposOcultosDetalleFactura"); 

        this.jPanelAccionesDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFactura.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleFactura.setText("Nuevo");
		this.jButtonModificarDetalleFactura.setText("Editar");
        this.jButtonActualizarDetalleFactura.setText("Actualizar");
        this.jButtonEliminarDetalleFactura.setText("Eliminar");
        this.jButtonCancelarDetalleFactura.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleFactura.setText("Guardar");
		this.jButtonCerrarDetalleFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFactura,"nuevo_button","Nuevo",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleFactura,"modificar_button","Editar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleFactura,"actualizar_button","Actualizar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleFactura,"eliminar_button","Eliminar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleFactura,"cancelar_button","Cancelar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleFactura,"guardarcambios_button","Guardar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFactura,"guardarcambiostabla_button","Guardar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFactura,"cerrar_button","Salir",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleFactura.setToolTipText("Nuevo"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleFactura.setToolTipText("Editar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleFactura.setToolTipText("Actualizar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleFactura.setToolTipText("Eliminar)"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleFactura.setToolTipText("Cancelar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleFactura.setToolTipText("Guardar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleFactura.setToolTipText("Guardar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFactura.setToolTipText("Salir"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFactura";
		inputMap = this.jButtonNuevoDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleFactura";
		inputMap = this.jButtonActualizarDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleFactura";
		inputMap = this.jButtonEliminarDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleFactura";
		inputMap = this.jButtonCancelarDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleFactura"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleFactura";
		inputMap = this.jButtonCerrarDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFactura";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleFactura.setToolTipText("Nuevo DetalleFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleFactura.setToolTipText("Sin Cerrar Ventana DetalleFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFactura.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleFactura = new JLabelMe();
		
		this.jLabelAccionesDetalleFactura.setText("Acciones");		
		this.jLabelAccionesDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleFactura = new GridBagLayout();
		
		this.jPanelCamposDetalleFactura.setLayout(gridaBagLayoutCamposDetalleFactura);
		this.jPanelCamposOcultosDetalleFactura.setLayout(gridaBagLayoutCamposOcultosDetalleFactura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleFactura.add(jLabelIdDetalleFactura, this.gridBagConstraintsDetalleFactura);



	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleFactura.add(jLabelidDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleFactura.add(jLabelid_empresaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFactura.add(jButtonid_empresaDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFactura.add(jButtonid_empresaDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleFactura.add(jComboBoxid_empresaDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleFactura.add(jLabelid_sucursalDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleFactura.add(jButtonid_sucursalDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleFactura.add(jButtonid_sucursalDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleFactura.add(jComboBoxid_sucursalDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleFactura.add(jLabelid_ejercicioDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleFactura.add(jButtonid_ejercicioDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleFactura.add(jButtonid_ejercicioDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleFactura.add(jComboBoxid_ejercicioDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleFactura.add(jLabelid_periodoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleFactura.add(jButtonid_periodoDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleFactura.add(jButtonid_periodoDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleFactura.add(jComboBoxid_periodoDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleFactura.add(jLabelid_anioDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleFactura.add(jButtonid_anioDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleFactura.add(jButtonid_anioDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleFactura.add(jComboBoxid_anioDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleFactura.add(jLabelid_mesDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleFactura.add(jButtonid_mesDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleFactura.add(jButtonid_mesDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleFactura.add(jComboBoxid_mesDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaDetalleFactura.add(jLabelid_facturaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 2;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaDetalleFactura.add(jButtonid_facturaDetalleFactura, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleFactura.add(jButtonid_facturaDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 4;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleFactura.add(jButtonid_facturaDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaDetalleFactura.add(jComboBoxid_facturaDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleFactura.add(jLabelid_bodegaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleFactura.add(jButtonid_bodegaDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleFactura.add(jButtonid_bodegaDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleFactura.add(jComboBoxid_bodegaDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleFactura.add(jLabelid_productoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 2;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleFactura.add(jButtonid_productoDetalleFactura, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleFactura.add(jButtonid_productoDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 4;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleFactura.add(jButtonid_productoDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleFactura.add(jComboBoxid_productoDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleFactura.add(jLabelid_unidadDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleFactura.add(jButtonid_unidadDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 3;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleFactura.add(jButtonid_unidadDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleFactura.add(jComboBoxid_unidadDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_loteDetalleFactura.add(jLabelcodigo_loteDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_loteDetalleFactura.add(jButtoncodigo_loteDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_loteDetalleFactura.add(jTextFieldcodigo_loteDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleFactura.add(jLabelid_centro_costoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 2;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleFactura.add(jButtonid_centro_costoDetalleFactura, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 3;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleFactura.add(jButtonid_centro_costoDetalleFacturaArbol, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 4;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleFactura.add(jButtonid_centro_costoDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 5;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleFactura.add(jButtonid_centro_costoDetalleFacturaUpdate, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleFactura.add(jComboBoxid_centro_costoDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDetalleFactura.add(jLabelfechaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDetalleFactura.add(jButtonfechaDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDetalleFactura.add(jDateChooserfechaDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleFactura.add(jLabeldescripcionDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleFactura.add(jButtondescripcionDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleFactura.add(jscrollPanedescripcionDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleFactura.add(jLabelcantidadDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleFactura.add(jButtoncantidadDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleFactura.add(jTextFieldcantidadDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetalleFactura.add(jLabelprecioDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetalleFactura.add(jButtonprecioDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetalleFactura.add(jTextFieldprecioDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleFactura.add(jLabelivaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleFactura.add(jButtonivaDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleFactura.add(jTextFieldivaDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorDetalleFactura.add(jLabeliva_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorDetalleFactura.add(jButtoniva_valorDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorDetalleFactura.add(jTextFieldiva_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetalleFactura.add(jLabeliceDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetalleFactura.add(jButtoniceDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetalleFactura.add(jTextFieldiceDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorDetalleFactura.add(jLabelice_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorDetalleFactura.add(jButtonice_valorDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorDetalleFactura.add(jTextFieldice_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleFactura.add(jLabeldescuentoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleFactura.add(jButtondescuentoDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleFactura.add(jTextFielddescuentoDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorDetalleFactura.add(jLabeldescuento_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorDetalleFactura.add(jButtondescuento_valorDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorDetalleFactura.add(jTextFielddescuento_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento2DetalleFactura.add(jLabeldescuento2DetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento2DetalleFactura.add(jButtondescuento2DetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento2DetalleFactura.add(jTextFielddescuento2DetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalDetalleFactura.add(jLabelsub_totalDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalDetalleFactura.add(jButtonsub_totalDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalDetalleFactura.add(jTextFieldsub_totalDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetalleFactura.add(jLabeltotalDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetalleFactura.add(jButtontotalDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetalleFactura.add(jTextFieldtotalDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoDetalleFactura.add(jLabelmontoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoDetalleFactura.add(jButtonmontoDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoDetalleFactura.add(jTextFieldmontoDetalleFactura, this.gridBagConstraintsDetalleFactura);


	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 0;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDetalleFactura.add(jLabelnombreDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 2;
		this.gridBagConstraintsDetalleFactura.ipadx = 0;
		this.gridBagConstraintsDetalleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDetalleFactura.add(jButtonnombreDetalleFacturaBusqueda, this.gridBagConstraintsDetalleFactura);
	}

	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFactura.gridy = 0;
	this.gridBagConstraintsDetalleFactura.gridx = 1;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDetalleFactura.add(jscrollPanenombreDetalleFactura, this.gridBagConstraintsDetalleFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelidDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelid_facturaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelid_bodegaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelid_productoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelid_unidadDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelcodigo_loteDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelid_centro_costoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelfechaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPaneldescripcionDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelcantidadDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelprecioDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelivaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPaneliva_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPaneliceDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelice_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPaneldescuentoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPaneldescuento_valorDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPaneldescuento2DetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPanelsub_totalDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFactura.add(this.jPaneltotalDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposDetalleFactura % 1==0) {
		iXPanelCamposDetalleFactura=0;
		iYPanelCamposDetalleFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposOcultosDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposOcultosDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFactura.add(this.jPanelid_empresaDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposOcultosDetalleFactura % 1==0) {
		iXPanelCamposOcultosDetalleFactura=0;
		iYPanelCamposOcultosDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposOcultosDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposOcultosDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFactura.add(this.jPanelid_sucursalDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposOcultosDetalleFactura % 1==0) {
		iXPanelCamposOcultosDetalleFactura=0;
		iYPanelCamposOcultosDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposOcultosDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposOcultosDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFactura.add(this.jPanelid_ejercicioDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposOcultosDetalleFactura % 1==0) {
		iXPanelCamposOcultosDetalleFactura=0;
		iYPanelCamposOcultosDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposOcultosDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposOcultosDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFactura.add(this.jPanelid_periodoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposOcultosDetalleFactura % 1==0) {
		iXPanelCamposOcultosDetalleFactura=0;
		iYPanelCamposOcultosDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposOcultosDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposOcultosDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFactura.add(this.jPanelid_anioDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposOcultosDetalleFactura % 1==0) {
		iXPanelCamposOcultosDetalleFactura=0;
		iYPanelCamposOcultosDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposOcultosDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposOcultosDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFactura.add(this.jPanelid_mesDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposOcultosDetalleFactura % 1==0) {
		iXPanelCamposOcultosDetalleFactura=0;
		iYPanelCamposOcultosDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposOcultosDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposOcultosDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFactura.add(this.jPanelmontoDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposOcultosDetalleFactura % 1==0) {
		iXPanelCamposOcultosDetalleFactura=0;
		iYPanelCamposOcultosDetalleFactura++;
	}
	this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFactura.gridy = iYPanelCamposOcultosDetalleFactura;
	this.gridBagConstraintsDetalleFactura.gridx = iXPanelCamposOcultosDetalleFactura++;
	this.gridBagConstraintsDetalleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFactura.add(this.jPanelnombreDetalleFactura, this.gridBagConstraintsDetalleFactura);



	if(iXPanelCamposOcultosDetalleFactura % 1==0) {
		iXPanelCamposOcultosDetalleFactura=0;
		iYPanelCamposOcultosDetalleFactura++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleFactura= new GridBagLayout();
		this.jPanelAccionesDetalleFactura.setLayout(gridaBagLayoutAccionesDetalleFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleFactura= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleFactura.setLayout(gridaBagLayoutAccionesFormularioDetalleFactura);
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFactura.add(this.jComboBoxTiposAccionesFormularioDetalleFactura, this.gridBagConstraintsDetalleFactura);

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFactura.add(this.jCheckBoxPostAccionNuevoDetalleFactura, this.gridBagConstraintsDetalleFactura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallefacturaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleFactura.add(this.jCheckBoxPostAccionSinCerrarDetalleFactura, this.gridBagConstraintsDetalleFactura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallefacturaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleFactura.add(this.jCheckBoxPostAccionSinMensajeDetalleFactura, this.gridBagConstraintsDetalleFactura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleFactura.add(this.jButtonModificarDetalleFactura, this.gridBagConstraintsDetalleFactura);							

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleFactura.add(this.jButtonEliminarDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
			
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = 0;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFactura.add(this.jButtonActualizarDetalleFactura, this.gridBagConstraintsDetalleFactura);


		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = 0;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFactura.add(this.jButtonGuardarCambiosDetalleFactura, this.gridBagConstraintsDetalleFactura);	
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = 0;		
		this.gridBagConstraintsDetalleFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleFactura.add(this.jButtonCancelarDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallefacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFactura.gridx = 0;		
			//this.gridBagConstraintsDetalleFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFactura.gridx =0;
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFactura, this.gridBagConstraintsDetalleFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleFacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleFactura = new DetalleFacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleFacturaModel detallefacturaModel=new DetalleFacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleFacturaModel.DetalleFacturaFocusTraversalPolicy detallefacturaFocusTraversalPolicy = detallefacturaModel.new DetalleFacturaFocusTraversalPolicy(this);
			
			//detallefacturaFocusTraversalPolicy.setdetallefacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallefacturaModel);
			
			
			this.jContentPaneDetalleDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleFactura = new GridBagLayout();	
			this.jContentPaneDetalleDetalleFactura.setLayout(gridaBagLayoutDetalleDetalleFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
				this.gridBagConstraintsDetalleFactura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleFactura.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleFactura.add(jTtoolBarDetalleDetalleFactura, gridBagConstraintsDetalleFactura);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleFactura=   new JScrollPane(jContentPaneDetalleDetalleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleFactura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleFactura.gridx = 0;
	        
			this.jContentPaneDetalleDetalleFactura.add(jPanelCamposDetalleFactura, gridBagConstraintsDetalleFactura);
			
			
			
			
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
						&& detallefacturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallefacturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleFactura= new GridBagConstraints();
						this.gridBagConstraintsDetalleFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleFactura.gridx = 0;
						this.jContentPaneDetalleDetalleFactura.add(this.jTabbedPaneRelacionesDetalleFactura, this.gridBagConstraintsDetalleFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleFactura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
					this.gridBagConstraintsDetalleFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleFactura.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleFactura.add(jPanelCamposOcultosDetalleFactura, gridBagConstraintsDetalleFactura);
				
					this.jPanelCamposOcultosDetalleFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleFactura.gridx = 0;
	        this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleFactura.add(this.jPanelAccionesFormularioDetalleFactura, this.gridBagConstraintsDetalleFactura);							
			
			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
	        this.gridBagConstraintsDetalleFactura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleFactura.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleFactura.add(this.jPanelAccionesDetalleFactura, this.gridBagConstraintsDetalleFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleFactura=   new JScrollPane(this.jPanelCamposDetalleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFactura.gridx = 0;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleFactura, this.gridBagConstraintsDetalleFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleFactura, this.gridBagConstraintsDetalleFactura);			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleFactura, this.gridBagConstraintsDetalleFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFactura, this.gridBagConstraintsDetalleFactura);
			
			
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
			
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFactura, this.gridBagConstraintsDetalleFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleFactura;
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
