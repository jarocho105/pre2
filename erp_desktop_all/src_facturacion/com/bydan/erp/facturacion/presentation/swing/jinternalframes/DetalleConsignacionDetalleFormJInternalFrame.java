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
import com.bydan.erp.facturacion.util.DetalleConsignacionConstantesFunciones;

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
public class DetalleConsignacionDetalleFormJInternalFrame extends DetalleConsignacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleConsignacion;
	
	protected JMenuBar jmenuBarDetalleDetalleConsignacion;
	
	protected JMenu jmenuDetalleDetalleConsignacion;
	protected JMenu jmenuDetalleArchivoDetalleConsignacion;
	protected JMenu jmenuDetalleAccionesDetalleConsignacion;
	protected JMenu jmenuDetalleDatosDetalleConsignacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleConsignacion;	
	protected GridBagConstraints gridBagConstraintsDetalleConsignacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleConsignacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleConsignacion;		
	
	
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

	protected ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consignacion="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EstadoDetallePedidoBeanSwingJInternalFrame estadodetallepedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallepedido="";
	
	public DetalleConsignacionSessionBean detalleconsignacionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ConsignacionSessionBean consignacionSessionBean;
	public ProductoSessionBean productoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean;	
	
	public DetalleConsignacionLogic detalleconsignacionLogic;
	
	public JScrollPane jScrollPanelDatosDetalleConsignacion;
	public JScrollPane jScrollPanelDatosEdicionDetalleConsignacion;
	public JScrollPane jScrollPanelDatosGeneralDetalleConsignacion;
	
	protected JPanel jPanelCamposDetalleConsignacion;    
	protected JPanel jPanelCamposOcultosDetalleConsignacion;    	
	protected JPanel jPanelAccionesDetalleConsignacion;
	protected JPanel jPanelAccionesFormularioDetalleConsignacion;
    
	
	
	protected Integer iXPanelCamposDetalleConsignacion=0;
	protected Integer iYPanelCamposDetalleConsignacion=0;
	
	protected Integer iXPanelCamposOcultosDetalleConsignacion=0;
	protected Integer iYPanelCamposOcultosDetalleConsignacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleConsignacion;
	public JButton jButtonModificarDetalleConsignacion;
	public JButton jButtonActualizarDetalleConsignacion;
    public JButton jButtonEliminarDetalleConsignacion;
	public JButton jButtonCancelarDetalleConsignacion;
    public JButton jButtonGuardarCambiosDetalleConsignacion;
	public JButton jButtonGuardarCambiosTablaDetalleConsignacion;
	protected JButton jButtonCerrarDetalleConsignacion;
	
	
	protected JButton jButtonProcesarInformacionDetalleConsignacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleConsignacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleConsignacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleConsignacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleConsignacion;
	protected JButton jButtonModificarToolBarDetalleConsignacion;
	protected JButton jButtonActualizarToolBarDetalleConsignacion;
    protected JButton jButtonEliminarToolBarDetalleConsignacion;
	protected JButton jButtonCancelarToolBarDetalleConsignacion;
    protected JButton jButtonGuardarCambiosToolBarDetalleConsignacion;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleConsignacion;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleConsignacion;
	protected JButton jButtonCerrarToolBarDetalleConsignacion;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleConsignacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleConsignacion;
	protected JMenuItem jMenuItemModificarDetalleConsignacion;
	protected JMenuItem jMenuItemActualizarDetalleConsignacion;
    protected JMenuItem jMenuItemEliminarDetalleConsignacion;
	protected JMenuItem jMenuItemCancelarDetalleConsignacion;
    protected JMenuItem jMenuItemGuardarCambiosDetalleConsignacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleConsignacion;
	protected JMenuItem jMenuItemCerrarDetalleConsignacion;
	protected JMenuItem jMenuItemDetalleCerrarDetalleConsignacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleConsignacion;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleConsignacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleConsignacion;
	protected JMenuItem jMenuItemMostrarOcultarDetalleConsignacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleConsignacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleConsignacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleConsignacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleConsignacion;
	public JLabel jLabelIdDetalleConsignacion;
	public JLabel jLabelidDetalleConsignacion;
	public JButton jButtonidDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleConsignacion;
	public JLabel jLabelcantidadDetalleConsignacion;
	public JTextField jTextFieldcantidadDetalleConsignacion;
	public JButton jButtoncantidadDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetalleConsignacion;
	public JLabel jLabelprecioDetalleConsignacion;
	public JTextField jTextFieldprecioDetalleConsignacion;
	public JButton jButtonprecioDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajeDetalleConsignacion;
	public JLabel jLabeldescuento_porcentajeDetalleConsignacion;
	public JTextField jTextFielddescuento_porcentajeDetalleConsignacion;
	public JButton jButtondescuento_porcentajeDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorDetalleConsignacion;
	public JLabel jLabeldescuento_valorDetalleConsignacion;
	public JTextField jTextFielddescuento_valorDetalleConsignacion;
	public JButton jButtondescuento_valorDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleConsignacion;
	public JLabel jLabelivaDetalleConsignacion;
	public JTextField jTextFieldivaDetalleConsignacion;
	public JButton jButtonivaDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetalleConsignacion;
	public JLabel jLabeltotalDetalleConsignacion;
	public JTextField jTextFieldtotalDetalleConsignacion;
	public JButton jButtontotalDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneliceDetalleConsignacion;
	public JLabel jLabeliceDetalleConsignacion;
	public JTextField jTextFieldiceDetalleConsignacion;
	public JButton jButtoniceDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelcostoDetalleConsignacion;
	public JLabel jLabelcostoDetalleConsignacion;
	public JTextField jTextFieldcostoDetalleConsignacion;
	public JButton jButtoncostoDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelutilidadDetalleConsignacion;
	public JLabel jLabelutilidadDetalleConsignacion;
	public JTextField jTextFieldutilidadDetalleConsignacion;
	public JButton jButtonutilidadDetalleConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleConsignacion;
	public JLabel jLabelid_empresaDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleConsignacion;
	public JButton jButtonid_empresaDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_empresaDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleConsignacion;
	public JLabel jLabelid_sucursalDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleConsignacion;
	public JButton jButtonid_sucursalDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_sucursalDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleConsignacion;
	public JLabel jLabelid_ejercicioDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleConsignacion;
	public JButton jButtonid_ejercicioDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleConsignacion;
	public JLabel jLabelid_periodoDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleConsignacion;
	public JButton jButtonid_periodoDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_periodoDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleConsignacion;
	public JLabel jLabelid_anioDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleConsignacion;
	public JButton jButtonid_anioDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_anioDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleConsignacion;
	public JLabel jLabelid_mesDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleConsignacion;
	public JButton jButtonid_mesDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_mesDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_consignacionDetalleConsignacion;
	public JLabel jLabelid_consignacionDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consignacionDetalleConsignacion;
	public JButton jButtonid_consignacionDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_consignacionDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_consignacionDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleConsignacion;
	public JLabel jLabelid_productoDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleConsignacion;
	public JButton jButtonid_productoDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_productoDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleConsignacion;
	public JLabel jLabelid_bodegaDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleConsignacion;
	public JButton jButtonid_bodegaDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_bodegaDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleConsignacion;
	public JLabel jLabelid_unidadDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleConsignacion;
	public JButton jButtonid_unidadDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_unidadDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_pedidoDetalleConsignacion;
	public JLabel jLabelid_estado_detalle_pedidoDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_pedidoDetalleConsignacion;
	public JButton jButtonid_estado_detalle_pedidoDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleConsignacion;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleConsignacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleConsignacion=new JPanel();
				this.jPanelAccionesFormularioDetalleConsignacion=new JPanel();
				this.jmenuBarDetalleDetalleConsignacion=new JMenuBar();
				this.jTtoolBarDetalleDetalleConsignacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleConsignacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleConsignacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleConsignacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleConsignacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleConsignacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleConsignacion() {
		return this.jButtonActualizarToolBarDetalleConsignacion;
	}
	
	public JButton getjButtonEliminarToolBarDetalleConsignacion() {
		return this.jButtonEliminarToolBarDetalleConsignacion;
	}
	
	public JButton getjButtonCancelarToolBarDetalleConsignacion() {
		return this.jButtonCancelarToolBarDetalleConsignacion;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleConsignacion() {
		return this.jButtonProcesarInformacionDetalleConsignacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleConsignacion)	{
		this.jButtonProcesarInformacionDetalleConsignacion = jButtonProcesarInformacionDetalleConsignacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleConsignacion() {
		return this.jComboBoxTiposAccionesDetalleConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleConsignacion(
			JComboBox jComboBoxTiposRelacionesDetalleConsignacion) {
		this.jComboBoxTiposRelacionesDetalleConsignacion = jComboBoxTiposRelacionesDetalleConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleConsignacion(
			JComboBox jComboBoxTiposAccionesDetalleConsignacion) {
		this.jComboBoxTiposAccionesDetalleConsignacion = jComboBoxTiposAccionesDetalleConsignacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleConsignacion() {
		return this.jComboBoxTiposAccionesFormularioDetalleConsignacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleConsignacion(
			JComboBox jComboBoxTiposAccionesFormularioDetalleConsignacion) {
		this.jComboBoxTiposAccionesFormularioDetalleConsignacion = jComboBoxTiposAccionesFormularioDetalleConsignacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleconsignacionSessionBean=new DetalleConsignacionSessionBean();
		
		this.detalleconsignacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleconsignacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleconsignacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleConsignacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Consignacion MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleConsignacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleConsignacion=new JButtonMe();
				this.jButtonModificarToolBarDetalleConsignacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleConsignacion,this.jTtoolBarDetalleDetalleConsignacion,
							"actualizar","actualizar","Actualizar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleConsignacion,this.jTtoolBarDetalleDetalleConsignacion,
							"eliminar","eliminar","Eliminar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleConsignacion,this.jTtoolBarDetalleDetalleConsignacion,
							"cancelar","cancelar","Cancelar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleConsignacion,this.jTtoolBarDetalleDetalleConsignacion,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleConsignacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleConsignacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleConsignacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleConsignacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleConsignacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleConsignacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleConsignacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleConsignacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleConsignacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleConsignacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleConsignacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleConsignacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleConsignacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleConsignacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleConsignacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleConsignacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleConsignacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleConsignacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleConsignacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleConsignacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleConsignacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleConsignacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleConsignacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleConsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleConsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleConsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleConsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleConsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleConsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleConsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleConsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleConsignacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleConsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleConsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleConsignacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleConsignacion.add(this.jMenuItemDetalleCerrarDetalleConsignacion);
		
		this.jmenuDetalleAccionesDetalleConsignacion.add(this.jMenuItemActualizarDetalleConsignacion);
		this.jmenuDetalleAccionesDetalleConsignacion.add(this.jMenuItemEliminarDetalleConsignacion);
		this.jmenuDetalleAccionesDetalleConsignacion.add(this.jMenuItemCancelarDetalleConsignacion);		
		
		//this.jmenuDetalleDatosDetalleConsignacion.add(this.jMenuItemDetalleAbrirOrderByDetalleConsignacion);				
		this.jmenuDetalleDatosDetalleConsignacion.add(this.jMenuItemDetalleMostarOcultarDetalleConsignacion);				
				
		//this.jmenuDetalleAccionesDetalleConsignacion.add(this.jMenuItemGuardarCambiosDetalleConsignacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleConsignacion.add(this.jmenuDetalleArchivoDetalleConsignacion);		
		this.jmenuBarDetalleDetalleConsignacion.add(this.jmenuDetalleAccionesDetalleConsignacion);		
		this.jmenuBarDetalleDetalleConsignacion.add(this.jmenuDetalleDatosDetalleConsignacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleConsignacion);				
	}
	
	
	public void inicializarElementosCamposDetalleConsignacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleConsignacion = new JLabelMe();
		jLabelIdDetalleConsignacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleConsignacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleConsignacion= new GridBagLayout();

		this.jPanelidDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);

		jLabelidDetalleConsignacion = new JLabel();
		jLabelidDetalleConsignacion.setText("Id");

		jLabelidDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadDetalleConsignacion = new JLabelMe();
		this.jLabelcantidadDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleConsignacion.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelcantidadDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFieldcantidadDetalleConsignacion= new JTextFieldMe();
		jTextFieldcantidadDetalleConsignacion.setEnabled(false);
		jTextFieldcantidadDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleConsignacion.setText("0");

		this.jButtoncantidadDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleConsignacionBusqueda.setText("U");
		this.jButtoncantidadDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetalleConsignacion = new JLabelMe();
		this.jLabelprecioDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetalleConsignacion.setToolTipText("Precio");
		this.jLabelprecioDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelprecioDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFieldprecioDetalleConsignacion= new JTextFieldMe();
		jTextFieldprecioDetalleConsignacion.setEnabled(false);
		jTextFieldprecioDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetalleConsignacion.setText("0.0");

		this.jButtonprecioDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonprecioDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetalleConsignacionBusqueda.setText("U");
		this.jButtonprecioDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetalleConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajeDetalleConsignacion = new JLabelMe();
		this.jLabeldescuento_porcentajeDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajeDetalleConsignacion.setToolTipText("Dscto %");
		this.jLabeldescuento_porcentajeDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajeDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajeDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajeDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPaneldescuento_porcentajeDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFielddescuento_porcentajeDetalleConsignacion= new JTextFieldMe();
		jTextFielddescuento_porcentajeDetalleConsignacion.setEnabled(false);
		jTextFielddescuento_porcentajeDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajeDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajeDetalleConsignacion.setText("0.0");

		this.jButtondescuento_porcentajeDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajeDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajeDetalleConsignacionBusqueda.setText("U");
		this.jButtondescuento_porcentajeDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajeDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajeDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajeDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajeDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajeDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajeDetalleConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorDetalleConsignacion = new JLabelMe();
		this.jLabeldescuento_valorDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorDetalleConsignacion.setToolTipText("Dscto Valor");
		this.jLabeldescuento_valorDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPaneldescuento_valorDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFielddescuento_valorDetalleConsignacion= new JTextFieldMe();
		jTextFielddescuento_valorDetalleConsignacion.setEnabled(false);
		jTextFielddescuento_valorDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorDetalleConsignacion.setText("0.0");

		this.jButtondescuento_valorDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtondescuento_valorDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorDetalleConsignacionBusqueda.setText("U");
		this.jButtondescuento_valorDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorDetalleConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleConsignacion = new JLabelMe();
		this.jLabelivaDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleConsignacion.setToolTipText("Iva");
		this.jLabelivaDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelivaDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFieldivaDetalleConsignacion= new JTextFieldMe();
		jTextFieldivaDetalleConsignacion.setEnabled(false);
		jTextFieldivaDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleConsignacion.setText("0.0");

		this.jButtonivaDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonivaDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleConsignacionBusqueda.setText("U");
		this.jButtonivaDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetalleConsignacion = new JLabelMe();
		this.jLabeltotalDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetalleConsignacion.setToolTipText("Total");
		this.jLabeltotalDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPaneltotalDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFieldtotalDetalleConsignacion= new JTextFieldMe();
		jTextFieldtotalDetalleConsignacion.setEnabled(false);
		jTextFieldtotalDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetalleConsignacion.setText("0.0");

		this.jButtontotalDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtontotalDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetalleConsignacionBusqueda.setText("U");
		this.jButtontotalDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetalleConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeliceDetalleConsignacion = new JLabelMe();
		this.jLabeliceDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetalleConsignacion.setToolTipText("Ice");
		this.jLabeliceDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPaneliceDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFieldiceDetalleConsignacion= new JTextFieldMe();
		jTextFieldiceDetalleConsignacion.setEnabled(false);
		jTextFieldiceDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetalleConsignacion.setText("0.0");

		this.jButtoniceDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtoniceDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetalleConsignacionBusqueda.setText("U");
		this.jButtoniceDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetalleConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelcostoDetalleConsignacion = new JLabelMe();
		this.jLabelcostoDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDetalleConsignacion.setToolTipText("Costo");
		this.jLabelcostoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelcostoDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFieldcostoDetalleConsignacion= new JTextFieldMe();
		jTextFieldcostoDetalleConsignacion.setEnabled(false);
		jTextFieldcostoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDetalleConsignacion.setText("0.0");

		this.jButtoncostoDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtoncostoDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDetalleConsignacionBusqueda.setText("U");
		this.jButtoncostoDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDetalleConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelutilidadDetalleConsignacion = new JLabelMe();
		this.jLabelutilidadDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_UTILIDAD+" : *");
		this.jLabelutilidadDetalleConsignacion.setToolTipText("Utilidad");
		this.jLabelutilidadDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidadDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidadDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidadDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_UTILIDAD);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelutilidadDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jTextFieldutilidadDetalleConsignacion= new JTextFieldMe();
		jTextFieldutilidadDetalleConsignacion.setEnabled(false);
		jTextFieldutilidadDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidadDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidadDetalleConsignacion.setText("0.0");

		this.jButtonutilidadDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonutilidadDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidadDetalleConsignacionBusqueda.setText("U");
		this.jButtonutilidadDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidadDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidadDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidadDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidadDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidadDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidadDetalleConsignacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleConsignacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleConsignacion = new JLabelMe();
		this.jLabelid_empresaDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleConsignacion.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_empresaDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_empresaDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_empresaDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleConsignacion.setEnabled(false);

		this.jButtonid_empresaDetalleConsignacion= new JButtonMe();
		this.jButtonid_empresaDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleConsignacion.setText("Buscar");
		this.jButtonid_empresaDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleConsignacion"));

		this.jButtonid_empresaDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_empresaDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleConsignacionUpdate.setText("U");
		this.jButtonid_empresaDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleConsignacionUpdate"));



					
		this.jLabelid_sucursalDetalleConsignacion = new JLabelMe();
		this.jLabelid_sucursalDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleConsignacion.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_sucursalDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_sucursalDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_sucursalDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleConsignacion.setEnabled(false);

		this.jButtonid_sucursalDetalleConsignacion= new JButtonMe();
		this.jButtonid_sucursalDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleConsignacion.setText("Buscar");
		this.jButtonid_sucursalDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleConsignacion"));

		this.jButtonid_sucursalDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_sucursalDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleConsignacionUpdate.setText("U");
		this.jButtonid_sucursalDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleConsignacionUpdate"));



					
		this.jLabelid_ejercicioDetalleConsignacion = new JLabelMe();
		this.jLabelid_ejercicioDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleConsignacion.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_ejercicioDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_ejercicioDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleConsignacion.setEnabled(false);

		this.jButtonid_ejercicioDetalleConsignacion= new JButtonMe();
		this.jButtonid_ejercicioDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleConsignacion.setText("Buscar");
		this.jButtonid_ejercicioDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleConsignacion"));

		this.jButtonid_ejercicioDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleConsignacionUpdate.setText("U");
		this.jButtonid_ejercicioDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleConsignacionUpdate"));



					
		this.jLabelid_periodoDetalleConsignacion = new JLabelMe();
		this.jLabelid_periodoDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleConsignacion.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_periodoDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_periodoDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_periodoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleConsignacion.setEnabled(false);

		this.jButtonid_periodoDetalleConsignacion= new JButtonMe();
		this.jButtonid_periodoDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleConsignacion.setText("Buscar");
		this.jButtonid_periodoDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleConsignacion"));

		this.jButtonid_periodoDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_periodoDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleConsignacionUpdate.setText("U");
		this.jButtonid_periodoDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleConsignacionUpdate"));



					
		this.jLabelid_anioDetalleConsignacion = new JLabelMe();
		this.jLabelid_anioDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleConsignacion.setToolTipText("Anio");
		this.jLabelid_anioDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_anioDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_anioDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_anioDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleConsignacion.setEnabled(false);

		this.jButtonid_anioDetalleConsignacion= new JButtonMe();
		this.jButtonid_anioDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleConsignacion.setText("Buscar");
		this.jButtonid_anioDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleConsignacion"));

		this.jButtonid_anioDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_anioDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_anioDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleConsignacionUpdate.setText("U");
		this.jButtonid_anioDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleConsignacionUpdate"));



					
		this.jLabelid_mesDetalleConsignacion = new JLabelMe();
		this.jLabelid_mesDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleConsignacion.setToolTipText("Mes");
		this.jLabelid_mesDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_mesDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_mesDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_mesDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleConsignacion.setEnabled(false);

		this.jButtonid_mesDetalleConsignacion= new JButtonMe();
		this.jButtonid_mesDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleConsignacion.setText("Buscar");
		this.jButtonid_mesDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleConsignacion"));

		this.jButtonid_mesDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_mesDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_mesDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleConsignacionUpdate.setText("U");
		this.jButtonid_mesDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleConsignacionUpdate"));



					
		this.jLabelid_consignacionDetalleConsignacion = new JLabelMe();
		this.jLabelid_consignacionDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDCONSIGNACION+" : *");
		this.jLabelid_consignacionDetalleConsignacion.setToolTipText("Consignacion");
		this.jLabelid_consignacionDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consignacionDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consignacionDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_consignacionDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_consignacionDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_consignacionDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDCONSIGNACION);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_consignacionDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_consignacionDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_consignacionDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignacionDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignacionDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consignacionDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_consignacionDetalleConsignacion= new JButtonMe();
		this.jButtonid_consignacionDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignacionDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignacionDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignacionDetalleConsignacion.setText("Buscar");
		this.jButtonid_consignacionDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_consignacionDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignacionDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_consignacionDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignacionDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignacionDetalleConsignacion"));

		this.jButtonid_consignacionDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_consignacionDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignacionDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignacionDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consignacionDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_consignacionDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_consignacionDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignacionDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_consignacionDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignacionDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignacionDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_consignacionDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_consignacionDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_consignacionDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignacionDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignacionDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consignacionDetalleConsignacionUpdate.setText("U");
		this.jButtonid_consignacionDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_consignacionDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignacionDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_consignacionDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignacionDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignacionDetalleConsignacionUpdate"));



					
		this.jLabelid_productoDetalleConsignacion = new JLabelMe();
		this.jLabelid_productoDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleConsignacion.setToolTipText("Producto");
		this.jLabelid_productoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_productoDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_productoDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_productoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleConsignacion= new JButtonMe();
		this.jButtonid_productoDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleConsignacion.setText("Buscar");
		this.jButtonid_productoDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleConsignacion"));

		this.jButtonid_productoDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_productoDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_productoDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleConsignacionUpdate.setText("U");
		this.jButtonid_productoDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleConsignacionUpdate"));



					
		this.jLabelid_bodegaDetalleConsignacion = new JLabelMe();
		this.jLabelid_bodegaDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleConsignacion.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_bodegaDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_bodegaDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_bodegaDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleConsignacion= new JButtonMe();
		this.jButtonid_bodegaDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleConsignacion.setText("Buscar");
		this.jButtonid_bodegaDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleConsignacion"));

		this.jButtonid_bodegaDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_bodegaDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleConsignacionUpdate.setText("U");
		this.jButtonid_bodegaDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleConsignacionUpdate"));



					
		this.jLabelid_unidadDetalleConsignacion = new JLabelMe();
		this.jLabelid_unidadDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleConsignacion.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_unidadDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_unidadDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_unidadDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleConsignacion= new JButtonMe();
		this.jButtonid_unidadDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleConsignacion.setText("Buscar");
		this.jButtonid_unidadDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleConsignacion"));

		this.jButtonid_unidadDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_unidadDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleConsignacionUpdate.setText("U");
		this.jButtonid_unidadDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleConsignacionUpdate"));



					
		this.jLabelid_estado_detalle_pedidoDetalleConsignacion = new JLabelMe();
		this.jLabelid_estado_detalle_pedidoDetalleConsignacion.setText(""+DetalleConsignacionConstantesFunciones.LABEL_IDESTADODETALLEPEDIDO+" : *");
		this.jLabelid_estado_detalle_pedidoDetalleConsignacion.setToolTipText("Estado");
		this.jLabelid_estado_detalle_pedidoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_pedidoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_pedidoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_pedidoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_pedidoDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_pedidoDetalleConsignacion.setToolTipText(DetalleConsignacionConstantesFunciones.LABEL_IDESTADODETALLEPEDIDO);
		this.gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		this.jPanelid_estado_detalle_pedidoDetalleConsignacion.setLayout(this.gridaBagLayoutDetalleConsignacion);


		jComboBoxid_estado_detalle_pedidoDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_pedidoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_detalle_pedidoDetalleConsignacion= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetalleConsignacion.setText("Buscar");
		this.jButtonid_estado_detalle_pedidoDetalleConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_pedidoDetalleConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetalleConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetalleConsignacion"));

		this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda.setText("U");
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetalleConsignacionBusqueda"));

		if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate.setText("U");
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetalleConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetalleConsignacionUpdate"));



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
		//this.jInternalFrameDetalleDetalleConsignacion = new DetalleConsignacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Consignacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleConsignacion= new GridBagLayout();
		

		
		String sToolTipDetalleConsignacion="";
		sToolTipDetalleConsignacion=DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleConsignacion+="(Facturacion.DetalleConsignacion)";
		}
		
		if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleConsignacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleConsignacion = new JButtonMe();
		this.jButtonModificarDetalleConsignacion = new JButtonMe();
        this.jButtonActualizarDetalleConsignacion = new JButtonMe();
        this.jButtonEliminarDetalleConsignacion = new JButtonMe();
        this.jButtonCancelarDetalleConsignacion = new JButtonMe();
        this.jButtonGuardarCambiosDetalleConsignacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleConsignacion = new JButtonMe();
		this.jButtonCerrarDetalleConsignacion = new JButtonMe();
		
		this.jScrollPanelDatosDetalleConsignacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleConsignacion = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleConsignacion = new JScrollPane();
		//this.jScrollPanelDatosDetalleConsignacionTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Consignacion";
		
		if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Consignacions" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleConsignacionTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleConsignacion.setName("jPanelCamposDetalleConsignacion"); 

		this.jPanelCamposOcultosDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleConsignacion.setName("jPanelCamposOcultosDetalleConsignacion"); 

        this.jPanelAccionesDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleConsignacion.setToolTipText("Acciones");
        this.jPanelAccionesDetalleConsignacion.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleConsignacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleConsignacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleConsignacion.setText("Nuevo");
		this.jButtonModificarDetalleConsignacion.setText("Editar");
        this.jButtonActualizarDetalleConsignacion.setText("Actualizar");
        this.jButtonEliminarDetalleConsignacion.setText("Eliminar");
        this.jButtonCancelarDetalleConsignacion.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleConsignacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleConsignacion.setText("Guardar");
		this.jButtonCerrarDetalleConsignacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleConsignacion,"nuevo_button","Nuevo",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleConsignacion,"modificar_button","Editar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleConsignacion,"actualizar_button","Actualizar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleConsignacion,"eliminar_button","Eliminar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleConsignacion,"cancelar_button","Cancelar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleConsignacion,"guardarcambios_button","Guardar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleConsignacion,"guardarcambiostabla_button","Guardar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleConsignacion,"cerrar_button","Salir",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleConsignacion.setToolTipText("Nuevo"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleConsignacion.setToolTipText("Editar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleConsignacion.setToolTipText("Actualizar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleConsignacion.setToolTipText("Eliminar)"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleConsignacion.setToolTipText("Cancelar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleConsignacion.setToolTipText("Guardar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleConsignacion.setToolTipText("Guardar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleConsignacion.setToolTipText("Salir"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleConsignacion";
		inputMap = this.jButtonNuevoDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleConsignacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleConsignacion";
		inputMap = this.jButtonActualizarDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleConsignacion"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleConsignacion";
		inputMap = this.jButtonEliminarDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleConsignacion"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleConsignacion";
		inputMap = this.jButtonCancelarDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleConsignacion"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleConsignacion";
		inputMap = this.jButtonCerrarDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleConsignacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleConsignacion";
		inputMap = this.jButtonGuardarCambiosTablaDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleConsignacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleConsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleConsignacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleConsignacion.setToolTipText("Nuevo DetalleConsignacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleConsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleConsignacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleConsignacion.setToolTipText("Sin Cerrar Ventana DetalleConsignacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleConsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleConsignacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleConsignacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleConsignacion.setText("Accion");
		this.jComboBoxTiposAccionesDetalleConsignacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleConsignacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleConsignacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleConsignacion = new JLabelMe();
		
		this.jLabelAccionesDetalleConsignacion.setText("Acciones");		
		this.jLabelAccionesDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleConsignacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleConsignacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleConsignacion=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleConsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleConsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleConsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleConsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleConsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleConsignacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleConsignacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleConsignacion = new GridBagLayout();
		
		this.jPanelCamposDetalleConsignacion.setLayout(gridaBagLayoutCamposDetalleConsignacion);
		this.jPanelCamposOcultosDetalleConsignacion.setLayout(gridaBagLayoutCamposOcultosDetalleConsignacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleConsignacion.add(jLabelIdDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleConsignacion.add(jLabelidDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleConsignacion.add(jLabelid_empresaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleConsignacion.add(jButtonid_empresaDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleConsignacion.add(jButtonid_empresaDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleConsignacion.add(jComboBoxid_empresaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleConsignacion.add(jLabelid_sucursalDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleConsignacion.add(jButtonid_sucursalDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleConsignacion.add(jButtonid_sucursalDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleConsignacion.add(jComboBoxid_sucursalDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleConsignacion.add(jLabelid_ejercicioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleConsignacion.add(jButtonid_ejercicioDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleConsignacion.add(jButtonid_ejercicioDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleConsignacion.add(jComboBoxid_ejercicioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleConsignacion.add(jLabelid_periodoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleConsignacion.add(jButtonid_periodoDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleConsignacion.add(jButtonid_periodoDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleConsignacion.add(jComboBoxid_periodoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleConsignacion.add(jLabelid_anioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleConsignacion.add(jButtonid_anioDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleConsignacion.add(jButtonid_anioDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleConsignacion.add(jComboBoxid_anioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleConsignacion.add(jLabelid_mesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleConsignacion.add(jButtonid_mesDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleConsignacion.add(jButtonid_mesDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleConsignacion.add(jComboBoxid_mesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_consignacionDetalleConsignacion.add(jLabelid_consignacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consignacionDetalleConsignacion.add(jButtonid_consignacionDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consignacionDetalleConsignacion.add(jButtonid_consignacionDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_consignacionDetalleConsignacion.add(jComboBoxid_consignacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleConsignacion.add(jLabelid_productoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 2;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleConsignacion.add(jButtonid_productoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleConsignacion.add(jButtonid_productoDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 4;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleConsignacion.add(jButtonid_productoDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleConsignacion.add(jComboBoxid_productoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleConsignacion.add(jLabelid_bodegaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleConsignacion.add(jButtonid_bodegaDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleConsignacion.add(jButtonid_bodegaDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleConsignacion.add(jComboBoxid_bodegaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleConsignacion.add(jLabelid_unidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleConsignacion.add(jButtonid_unidadDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleConsignacion.add(jButtonid_unidadDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleConsignacion.add(jComboBoxid_unidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_detalle_pedidoDetalleConsignacion.add(jLabelid_estado_detalle_pedidoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_pedidoDetalleConsignacion.add(jButtonid_estado_detalle_pedidoDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 3;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_pedidoDetalleConsignacion.add(jButtonid_estado_detalle_pedidoDetalleConsignacionUpdate, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_detalle_pedidoDetalleConsignacion.add(jComboBoxid_estado_detalle_pedidoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleConsignacion.add(jLabelcantidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleConsignacion.add(jButtoncantidadDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleConsignacion.add(jTextFieldcantidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetalleConsignacion.add(jLabelprecioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetalleConsignacion.add(jButtonprecioDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetalleConsignacion.add(jTextFieldprecioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_porcentajeDetalleConsignacion.add(jLabeldescuento_porcentajeDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajeDetalleConsignacion.add(jButtondescuento_porcentajeDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_porcentajeDetalleConsignacion.add(jTextFielddescuento_porcentajeDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorDetalleConsignacion.add(jLabeldescuento_valorDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorDetalleConsignacion.add(jButtondescuento_valorDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorDetalleConsignacion.add(jTextFielddescuento_valorDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleConsignacion.add(jLabelivaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleConsignacion.add(jButtonivaDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleConsignacion.add(jTextFieldivaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetalleConsignacion.add(jLabeltotalDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetalleConsignacion.add(jButtontotalDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetalleConsignacion.add(jTextFieldtotalDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetalleConsignacion.add(jLabeliceDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetalleConsignacion.add(jButtoniceDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetalleConsignacion.add(jTextFieldiceDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoDetalleConsignacion.add(jLabelcostoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDetalleConsignacion.add(jButtoncostoDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoDetalleConsignacion.add(jTextFieldcostoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelutilidadDetalleConsignacion.add(jLabelutilidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 2;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
		this.gridBagConstraintsDetalleConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidadDetalleConsignacion.add(jButtonutilidadDetalleConsignacionBusqueda, this.gridBagConstraintsDetalleConsignacion);
	}

	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleConsignacion.gridy = 0;
	this.gridBagConstraintsDetalleConsignacion.gridx = 1;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelutilidadDetalleConsignacion.add(jTextFieldutilidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelidDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelid_consignacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelid_productoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelid_bodegaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelid_unidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelid_estado_detalle_pedidoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelcantidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelprecioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPaneldescuento_porcentajeDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPaneldescuento_valorDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPanelivaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleConsignacion.add(this.jPaneltotalDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposDetalleConsignacion % 1==0) {
		iXPanelCamposDetalleConsignacion=0;
		iYPanelCamposDetalleConsignacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPanelid_empresaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPanelid_sucursalDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPanelid_ejercicioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPanelid_periodoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPanelid_anioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPanelid_mesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPaneliceDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPanelcostoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
	}
	this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleConsignacion.gridy = iYPanelCamposOcultosDetalleConsignacion;
	this.gridBagConstraintsDetalleConsignacion.gridx = iXPanelCamposOcultosDetalleConsignacion++;
	this.gridBagConstraintsDetalleConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleConsignacion.add(this.jPanelutilidadDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);



	if(iXPanelCamposOcultosDetalleConsignacion % 1==0) {
		iXPanelCamposOcultosDetalleConsignacion=0;
		iYPanelCamposOcultosDetalleConsignacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleConsignacion= new GridBagLayout();
		this.jPanelAccionesDetalleConsignacion.setLayout(gridaBagLayoutAccionesDetalleConsignacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleConsignacion= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleConsignacion.setLayout(gridaBagLayoutAccionesFormularioDetalleConsignacion);
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleConsignacion.add(this.jComboBoxTiposAccionesFormularioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleConsignacion.add(this.jCheckBoxPostAccionNuevoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleconsignacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleConsignacion.add(this.jCheckBoxPostAccionSinCerrarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleconsignacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleConsignacion.add(this.jCheckBoxPostAccionSinMensajeDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleConsignacion.add(this.jButtonModificarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);							

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleConsignacion.add(this.jButtonEliminarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
			
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleConsignacion.add(this.jButtonActualizarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleConsignacion.add(this.jButtonGuardarCambiosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);	
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;		
		this.gridBagConstraintsDetalleConsignacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleConsignacion.add(this.jButtonCancelarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleConsignacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();						
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleConsignacion.gridx = 0;		
			//this.gridBagConstraintsDetalleConsignacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleConsignacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleConsignacion.gridx =0;
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleConsignacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleConsignacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleConsignacion = new DetalleConsignacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Consignacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Consignacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Consignacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleConsignacionModel detalleconsignacionModel=new DetalleConsignacionModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleConsignacionModel.DetalleConsignacionFocusTraversalPolicy detalleconsignacionFocusTraversalPolicy = detalleconsignacionModel.new DetalleConsignacionFocusTraversalPolicy(this);
			
			//detalleconsignacionFocusTraversalPolicy.setdetalleconsignacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleconsignacionModel);
			
			
			this.jContentPaneDetalleDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleConsignacion = new GridBagLayout();	
			this.jContentPaneDetalleDetalleConsignacion.setLayout(gridaBagLayoutDetalleDetalleConsignacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleConsignacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
				this.gridBagConstraintsDetalleConsignacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleConsignacion.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleConsignacion.add(jTtoolBarDetalleDetalleConsignacion, gridBagConstraintsDetalleConsignacion);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleConsignacion=   new JScrollPane(jContentPaneDetalleDetalleConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleConsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleConsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleConsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleConsignacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleConsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleConsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleConsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleConsignacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	        
			this.jContentPaneDetalleDetalleConsignacion.add(jPanelCamposDetalleConsignacion, gridBagConstraintsDetalleConsignacion);
			
			
			
			
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
						&& detalleconsignacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleconsignacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleConsignacion= new GridBagConstraints();
						this.gridBagConstraintsDetalleConsignacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleConsignacion.gridx = 0;
						this.jContentPaneDetalleDetalleConsignacion.add(this.jTabbedPaneRelacionesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleConsignacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleConsignacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
					this.gridBagConstraintsDetalleConsignacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleConsignacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleConsignacion.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleConsignacion.add(jPanelCamposOcultosDetalleConsignacion, gridBagConstraintsDetalleConsignacion);
				
					this.jPanelCamposOcultosDetalleConsignacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	        this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleConsignacion.add(this.jPanelAccionesFormularioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);							
			
			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
	        this.gridBagConstraintsDetalleConsignacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleConsignacion.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleConsignacion.add(this.jPanelAccionesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleConsignacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleConsignacion=   new JScrollPane(this.jPanelCamposDetalleConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleConsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleConsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleConsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleConsignacion.gridx = 0;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleConsignacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleConsignacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleConsignacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			
			
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
			
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleConsignacion;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleConsignacion;
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
