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


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.DetallePedidoConstantesFunciones;

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
public class DetallePedidoDetalleFormJInternalFrame extends DetallePedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePedido;
	
	protected JMenuBar jmenuBarDetalleDetallePedido;
	
	protected JMenu jmenuDetalleDetallePedido;
	protected JMenu jmenuDetalleArchivoDetallePedido;
	protected JMenu jmenuDetalleAccionesDetallePedido;
	protected JMenu jmenuDetalleDatosDetallePedido;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedido;	
	protected GridBagConstraints gridBagConstraintsDetallePedido;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePedidoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePedido;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedido="";

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

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EstadoDetallePedidoBeanSwingJInternalFrame estadodetallepedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallepedido="";
	
	public DetallePedidoSessionBean detallepedidoSessionBean;
	
	
	
	
	public PedidoSessionBean pedidoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ProductoSessionBean productoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean;	
	
	public DetallePedidoLogic detallepedidoLogic;
	
	public JScrollPane jScrollPanelDatosDetallePedido;
	public JScrollPane jScrollPanelDatosEdicionDetallePedido;
	public JScrollPane jScrollPanelDatosGeneralDetallePedido;
	
	protected JPanel jPanelCamposDetallePedido;    
	protected JPanel jPanelCamposOcultosDetallePedido;    	
	protected JPanel jPanelAccionesDetallePedido;
	protected JPanel jPanelAccionesFormularioDetallePedido;
    
	
	
	protected Integer iXPanelCamposDetallePedido=0;
	protected Integer iYPanelCamposDetallePedido=0;
	
	protected Integer iXPanelCamposOcultosDetallePedido=0;
	protected Integer iYPanelCamposOcultosDetallePedido=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePedido;
	public JButton jButtonModificarDetallePedido;
	public JButton jButtonActualizarDetallePedido;
    public JButton jButtonEliminarDetallePedido;
	public JButton jButtonCancelarDetallePedido;
    public JButton jButtonGuardarCambiosDetallePedido;
	public JButton jButtonGuardarCambiosTablaDetallePedido;
	protected JButton jButtonCerrarDetallePedido;
	
	
	protected JButton jButtonProcesarInformacionDetallePedido;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePedido;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePedido;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePedido;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedido;
	protected JButton jButtonModificarToolBarDetallePedido;
	protected JButton jButtonActualizarToolBarDetallePedido;
    protected JButton jButtonEliminarToolBarDetallePedido;
	protected JButton jButtonCancelarToolBarDetallePedido;
    protected JButton jButtonGuardarCambiosToolBarDetallePedido;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePedido;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedido;
	protected JButton jButtonCerrarToolBarDetallePedido;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedido;
	protected JMenuItem jMenuItemModificarDetallePedido;
	protected JMenuItem jMenuItemActualizarDetallePedido;
    protected JMenuItem jMenuItemEliminarDetallePedido;
	protected JMenuItem jMenuItemCancelarDetallePedido;
    protected JMenuItem jMenuItemGuardarCambiosDetallePedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedido;
	protected JMenuItem jMenuItemCerrarDetallePedido;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedido;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedido;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedido;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedido;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePedido;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePedido;
	public JLabel jLabelIdDetallePedido;
	public JLabel jLabelidDetallePedido;
	public JButton jButtonidDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetallePedido;
	public JLabel jLabelcantidadDetallePedido;
	public JTextField jTextFieldcantidadDetallePedido;
	public JButton jButtoncantidadDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetallePedido;
	public JLabel jLabelprecioDetallePedido;
	public JTextField jTextFieldprecioDetallePedido;
	public JButton jButtonprecioDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajeDetallePedido;
	public JLabel jLabeldescuento_porcentajeDetallePedido;
	public JTextField jTextFielddescuento_porcentajeDetallePedido;
	public JButton jButtondescuento_porcentajeDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorDetallePedido;
	public JLabel jLabeldescuento_valorDetallePedido;
	public JTextField jTextFielddescuento_valorDetallePedido;
	public JButton jButtondescuento_valorDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelivaDetallePedido;
	public JLabel jLabelivaDetallePedido;
	public JTextField jTextFieldivaDetallePedido;
	public JButton jButtonivaDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPaneliceDetallePedido;
	public JLabel jLabeliceDetallePedido;
	public JTextField jTextFieldiceDetallePedido;
	public JButton jButtoniceDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetallePedido;
	public JLabel jLabeltotalDetallePedido;
	public JTextField jTextFieldtotalDetallePedido;
	public JButton jButtontotalDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelcostoDetallePedido;
	public JLabel jLabelcostoDetallePedido;
	public JTextField jTextFieldcostoDetallePedido;
	public JButton jButtoncostoDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelutilidadDetallePedido;
	public JLabel jLabelutilidadDetallePedido;
	public JTextField jTextFieldutilidadDetallePedido;
	public JButton jButtonutilidadDetallePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedidoDetallePedido;
	public JLabel jLabelid_pedidoDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedidoDetallePedido;
	public JButton jButtonid_pedidoDetallePedido= new JButtonMe();
	public JButton jButtonid_pedidoDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_pedidoDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetallePedido;
	public JLabel jLabelid_empresaDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePedido;
	public JButton jButtonid_empresaDetallePedido= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallePedido;
	public JLabel jLabelid_sucursalDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallePedido;
	public JButton jButtonid_sucursalDetallePedido= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetallePedido;
	public JLabel jLabelid_ejercicioDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetallePedido;
	public JButton jButtonid_ejercicioDetallePedido= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetallePedido;
	public JLabel jLabelid_periodoDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetallePedido;
	public JButton jButtonid_periodoDetallePedido= new JButtonMe();
	public JButton jButtonid_periodoDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetallePedido;
	public JLabel jLabelid_anioDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetallePedido;
	public JButton jButtonid_anioDetallePedido= new JButtonMe();
	public JButton jButtonid_anioDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_anioDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetallePedido;
	public JLabel jLabelid_mesDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetallePedido;
	public JButton jButtonid_mesDetallePedido= new JButtonMe();
	public JButton jButtonid_mesDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_mesDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetallePedido;
	public JLabel jLabelid_productoDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetallePedido;
	public JButton jButtonid_productoDetallePedido= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetallePedido;
	public JLabel jLabelid_bodegaDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetallePedido;
	public JButton jButtonid_bodegaDetallePedido= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetallePedido;
	public JLabel jLabelid_unidadDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetallePedido;
	public JButton jButtonid_unidadDetallePedido= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_pedidoDetallePedido;
	public JLabel jLabelid_estado_detalle_pedidoDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_pedidoDetallePedido;
	public JButton jButtonid_estado_detalle_pedidoDetallePedido= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoDetallePedidoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePedido;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePedidoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePedido=new JPanel();
				this.jPanelAccionesFormularioDetallePedido=new JPanel();
				this.jmenuBarDetalleDetallePedido=new JMenuBar();
				this.jTtoolBarDetalleDetallePedido=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePedidoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePedido() {
		return this.jButtonActualizarToolBarDetallePedido;
	}
	
	public JButton getjButtonEliminarToolBarDetallePedido() {
		return this.jButtonEliminarToolBarDetallePedido;
	}
	
	public JButton getjButtonCancelarToolBarDetallePedido() {
		return this.jButtonCancelarToolBarDetallePedido;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePedido() {
		return this.jButtonProcesarInformacionDetallePedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedido)	{
		this.jButtonProcesarInformacionDetallePedido = jButtonProcesarInformacionDetallePedido;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedido() {
		return this.jComboBoxTiposAccionesDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedido(
			JComboBox jComboBoxTiposRelacionesDetallePedido) {
		this.jComboBoxTiposRelacionesDetallePedido = jComboBoxTiposRelacionesDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedido(
			JComboBox jComboBoxTiposAccionesDetallePedido) {
		this.jComboBoxTiposAccionesDetallePedido = jComboBoxTiposAccionesDetallePedido;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePedido() {
		return this.jComboBoxTiposAccionesFormularioDetallePedido;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePedido(
			JComboBox jComboBoxTiposAccionesFormularioDetallePedido) {
		this.jComboBoxTiposAccionesFormularioDetallePedido = jComboBoxTiposAccionesFormularioDetallePedido;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallepedidoSessionBean=new DetallePedidoSessionBean();
		
		this.detallepedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePedido= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePedido=new JButtonMe();
				this.jButtonModificarToolBarDetallePedido=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePedido,this.jTtoolBarDetalleDetallePedido,
							"actualizar","actualizar","Actualizar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePedido,this.jTtoolBarDetalleDetallePedido,
							"eliminar","eliminar","Eliminar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePedido,this.jTtoolBarDetalleDetallePedido,
							"cancelar","cancelar","Cancelar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePedido,this.jTtoolBarDetalleDetallePedido,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePedido=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePedido=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePedido=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePedido=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePedido=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePedido= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePedido.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePedido,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePedido= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePedido.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePedido,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePedido= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePedido.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePedido,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePedido= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePedido.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePedido,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePedido.add(this.jMenuItemDetalleCerrarDetallePedido);
		
		this.jmenuDetalleAccionesDetallePedido.add(this.jMenuItemActualizarDetallePedido);
		this.jmenuDetalleAccionesDetallePedido.add(this.jMenuItemEliminarDetallePedido);
		this.jmenuDetalleAccionesDetallePedido.add(this.jMenuItemCancelarDetallePedido);		
		
		//this.jmenuDetalleDatosDetallePedido.add(this.jMenuItemDetalleAbrirOrderByDetallePedido);				
		this.jmenuDetalleDatosDetallePedido.add(this.jMenuItemDetalleMostarOcultarDetallePedido);				
				
		//this.jmenuDetalleAccionesDetallePedido.add(this.jMenuItemGuardarCambiosDetallePedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePedido.add(this.jmenuDetalleArchivoDetallePedido);		
		this.jmenuBarDetalleDetallePedido.add(this.jmenuDetalleAccionesDetallePedido);		
		this.jmenuBarDetalleDetallePedido.add(this.jmenuDetalleDatosDetallePedido);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePedido);				
	}
	
	
	public void inicializarElementosCamposDetallePedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePedido = new JLabelMe();
		jLabelIdDetallePedido.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePedido = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePedido= new GridBagLayout();

		this.jPanelidDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);

		jLabelidDetallePedido = new JLabel();
		jLabelidDetallePedido.setText("Id");

		jLabelidDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadDetallePedido = new JLabelMe();
		this.jLabelcantidadDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetallePedido.setToolTipText("Cantidad");
		this.jLabelcantidadDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelcantidadDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFieldcantidadDetallePedido= new JTextFieldMe();
		jTextFieldcantidadDetallePedido.setEnabled(false);
		jTextFieldcantidadDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetallePedido.setText("0");

		this.jButtoncantidadDetallePedidoBusqueda= new JButtonMe();
		this.jButtoncantidadDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetallePedidoBusqueda.setText("U");
		this.jButtoncantidadDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetallePedido = new JLabelMe();
		this.jLabelprecioDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetallePedido.setToolTipText("Precio");
		this.jLabelprecioDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelprecioDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFieldprecioDetallePedido= new JTextFieldMe();
		jTextFieldprecioDetallePedido.setEnabled(false);
		jTextFieldprecioDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetallePedido.setText("0.0");

		this.jButtonprecioDetallePedidoBusqueda= new JButtonMe();
		this.jButtonprecioDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetallePedidoBusqueda.setText("U");
		this.jButtonprecioDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajeDetallePedido = new JLabelMe();
		this.jLabeldescuento_porcentajeDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajeDetallePedido.setToolTipText("Dscto %");
		this.jLabeldescuento_porcentajeDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajeDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajeDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajeDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPaneldescuento_porcentajeDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFielddescuento_porcentajeDetallePedido= new JTextFieldMe();
		jTextFielddescuento_porcentajeDetallePedido.setEnabled(false);
		jTextFielddescuento_porcentajeDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajeDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajeDetallePedido.setText("0.0");

		this.jButtondescuento_porcentajeDetallePedidoBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajeDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajeDetallePedidoBusqueda.setText("U");
		this.jButtondescuento_porcentajeDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajeDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajeDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajeDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajeDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajeDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajeDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorDetallePedido = new JLabelMe();
		this.jLabeldescuento_valorDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorDetallePedido.setToolTipText("Dscto Valor");
		this.jLabeldescuento_valorDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPaneldescuento_valorDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFielddescuento_valorDetallePedido= new JTextFieldMe();
		jTextFielddescuento_valorDetallePedido.setEnabled(false);
		jTextFielddescuento_valorDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorDetallePedido.setText("0.0");

		this.jButtondescuento_valorDetallePedidoBusqueda= new JButtonMe();
		this.jButtondescuento_valorDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorDetallePedidoBusqueda.setText("U");
		this.jButtondescuento_valorDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabelivaDetallePedido = new JLabelMe();
		this.jLabelivaDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetallePedido.setToolTipText("Iva");
		this.jLabelivaDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelivaDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFieldivaDetallePedido= new JTextFieldMe();
		jTextFieldivaDetallePedido.setEnabled(false);
		jTextFieldivaDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetallePedido.setText("0.0");

		this.jButtonivaDetallePedidoBusqueda= new JButtonMe();
		this.jButtonivaDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetallePedidoBusqueda.setText("U");
		this.jButtonivaDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabeliceDetallePedido = new JLabelMe();
		this.jLabeliceDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetallePedido.setToolTipText("Ice");
		this.jLabeliceDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPaneliceDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFieldiceDetallePedido= new JTextFieldMe();
		jTextFieldiceDetallePedido.setEnabled(false);
		jTextFieldiceDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetallePedido.setText("0.0");

		this.jButtoniceDetallePedidoBusqueda= new JButtonMe();
		this.jButtoniceDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetallePedidoBusqueda.setText("U");
		this.jButtoniceDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetallePedido = new JLabelMe();
		this.jLabeltotalDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetallePedido.setToolTipText("Total");
		this.jLabeltotalDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPaneltotalDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFieldtotalDetallePedido= new JTextFieldMe();
		jTextFieldtotalDetallePedido.setEnabled(false);
		jTextFieldtotalDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetallePedido.setText("0.0");

		this.jButtontotalDetallePedidoBusqueda= new JButtonMe();
		this.jButtontotalDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetallePedidoBusqueda.setText("U");
		this.jButtontotalDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabelcostoDetallePedido = new JLabelMe();
		this.jLabelcostoDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDetallePedido.setToolTipText("Costo");
		this.jLabelcostoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelcostoDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFieldcostoDetallePedido= new JTextFieldMe();
		jTextFieldcostoDetallePedido.setEnabled(false);
		jTextFieldcostoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDetallePedido.setText("0.0");

		this.jButtoncostoDetallePedidoBusqueda= new JButtonMe();
		this.jButtoncostoDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDetallePedidoBusqueda.setText("U");
		this.jButtoncostoDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabelutilidadDetallePedido = new JLabelMe();
		this.jLabelutilidadDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_UTILIDAD+" : *");
		this.jLabelutilidadDetallePedido.setToolTipText("Utilidad");
		this.jLabelutilidadDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidadDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidadDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidadDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_UTILIDAD);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelutilidadDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jTextFieldutilidadDetallePedido= new JTextFieldMe();
		jTextFieldutilidadDetallePedido.setEnabled(false);
		jTextFieldutilidadDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidadDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidadDetallePedido.setText("0.0");

		this.jButtonutilidadDetallePedidoBusqueda= new JButtonMe();
		this.jButtonutilidadDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidadDetallePedidoBusqueda.setText("U");
		this.jButtonutilidadDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidadDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidadDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidadDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidadDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidadDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidadDetallePedidoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_pedidoDetallePedido = new JLabelMe();
		this.jLabelid_pedidoDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDPEDIDO+" : *");
		this.jLabelid_pedidoDetallePedido.setToolTipText("Pedido");
		this.jLabelid_pedidoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedidoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedidoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedidoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedidoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedidoDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDPEDIDO);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_pedidoDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_pedidoDetallePedido= new JComboBoxMe();
		jComboBoxid_pedidoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedidoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedidoDetallePedido= new JButtonMe();
		this.jButtonid_pedidoDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoDetallePedido.setText("Buscar");
		this.jButtonid_pedidoDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedidoDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedidoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoDetallePedido"));

		this.jButtonid_pedidoDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_pedidoDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedidoDetallePedidoBusqueda.setText("U");
		this.jButtonid_pedidoDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedidoDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedidoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedidoDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_pedidoDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_pedidoDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedidoDetallePedidoUpdate.setText("U");
		this.jButtonid_pedidoDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedidoDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedidoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoDetallePedidoUpdate"));



					
		this.jLabelid_empresaDetallePedido = new JLabelMe();
		this.jLabelid_empresaDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePedido.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_empresaDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_empresaDetallePedido= new JComboBoxMe();
		jComboBoxid_empresaDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePedido.setEnabled(false);

		this.jButtonid_empresaDetallePedido= new JButtonMe();
		this.jButtonid_empresaDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedido.setText("Buscar");
		this.jButtonid_empresaDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedido"));

		this.jButtonid_empresaDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoBusqueda.setText("U");
		this.jButtonid_empresaDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoUpdate.setText("U");
		this.jButtonid_empresaDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoUpdate"));



					
		this.jLabelid_sucursalDetallePedido = new JLabelMe();
		this.jLabelid_sucursalDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallePedido.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_sucursalDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_sucursalDetallePedido= new JComboBoxMe();
		jComboBoxid_sucursalDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallePedido.setEnabled(false);

		this.jButtonid_sucursalDetallePedido= new JButtonMe();
		this.jButtonid_sucursalDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedido.setText("Buscar");
		this.jButtonid_sucursalDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedido"));

		this.jButtonid_sucursalDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoBusqueda.setText("U");
		this.jButtonid_sucursalDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoUpdate.setText("U");
		this.jButtonid_sucursalDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoUpdate"));



					
		this.jLabelid_ejercicioDetallePedido = new JLabelMe();
		this.jLabelid_ejercicioDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetallePedido.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_ejercicioDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_ejercicioDetallePedido= new JComboBoxMe();
		jComboBoxid_ejercicioDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetallePedido.setEnabled(false);

		this.jButtonid_ejercicioDetallePedido= new JButtonMe();
		this.jButtonid_ejercicioDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedido.setText("Buscar");
		this.jButtonid_ejercicioDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedido"));

		this.jButtonid_ejercicioDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePedidoBusqueda.setText("U");
		this.jButtonid_ejercicioDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePedidoUpdate.setText("U");
		this.jButtonid_ejercicioDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoUpdate"));



					
		this.jLabelid_periodoDetallePedido = new JLabelMe();
		this.jLabelid_periodoDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetallePedido.setToolTipText("Periodo");
		this.jLabelid_periodoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_periodoDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_periodoDetallePedido= new JComboBoxMe();
		jComboBoxid_periodoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetallePedido.setEnabled(false);

		this.jButtonid_periodoDetallePedido= new JButtonMe();
		this.jButtonid_periodoDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedido.setText("Buscar");
		this.jButtonid_periodoDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedido"));

		this.jButtonid_periodoDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_periodoDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePedidoBusqueda.setText("U");
		this.jButtonid_periodoDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_periodoDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePedidoUpdate.setText("U");
		this.jButtonid_periodoDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoUpdate"));



					
		this.jLabelid_anioDetallePedido = new JLabelMe();
		this.jLabelid_anioDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetallePedido.setToolTipText("Anio");
		this.jLabelid_anioDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_anioDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_anioDetallePedido= new JComboBoxMe();
		jComboBoxid_anioDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetallePedido.setEnabled(false);

		this.jButtonid_anioDetallePedido= new JButtonMe();
		this.jButtonid_anioDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedido.setText("Buscar");
		this.jButtonid_anioDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedido"));

		this.jButtonid_anioDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_anioDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePedidoBusqueda.setText("U");
		this.jButtonid_anioDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_anioDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_anioDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePedidoUpdate.setText("U");
		this.jButtonid_anioDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoUpdate"));



					
		this.jLabelid_mesDetallePedido = new JLabelMe();
		this.jLabelid_mesDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetallePedido.setToolTipText("Mes");
		this.jLabelid_mesDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_mesDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_mesDetallePedido= new JComboBoxMe();
		jComboBoxid_mesDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetallePedido.setEnabled(false);

		this.jButtonid_mesDetallePedido= new JButtonMe();
		this.jButtonid_mesDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedido.setText("Buscar");
		this.jButtonid_mesDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedido"));

		this.jButtonid_mesDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_mesDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePedidoBusqueda.setText("U");
		this.jButtonid_mesDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_mesDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_mesDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePedidoUpdate.setText("U");
		this.jButtonid_mesDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoUpdate"));



					
		this.jLabelid_productoDetallePedido = new JLabelMe();
		this.jLabelid_productoDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetallePedido.setToolTipText("Producto");
		this.jLabelid_productoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_productoDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_productoDetallePedido= new JComboBoxMe();
		jComboBoxid_productoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetallePedido= new JButtonMe();
		this.jButtonid_productoDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedido.setText("Buscar");
		this.jButtonid_productoDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedido"));

		this.jButtonid_productoDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_productoDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoBusqueda.setText("U");
		this.jButtonid_productoDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_productoDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_productoDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoUpdate.setText("U");
		this.jButtonid_productoDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoUpdate"));



					
		this.jLabelid_bodegaDetallePedido = new JLabelMe();
		this.jLabelid_bodegaDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetallePedido.setToolTipText("Bodega");
		this.jLabelid_bodegaDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_bodegaDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_bodegaDetallePedido= new JComboBoxMe();
		jComboBoxid_bodegaDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetallePedido= new JButtonMe();
		this.jButtonid_bodegaDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedido.setText("Buscar");
		this.jButtonid_bodegaDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedido"));

		this.jButtonid_bodegaDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoBusqueda.setText("U");
		this.jButtonid_bodegaDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoUpdate.setText("U");
		this.jButtonid_bodegaDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoUpdate"));



					
		this.jLabelid_unidadDetallePedido = new JLabelMe();
		this.jLabelid_unidadDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetallePedido.setToolTipText("Unidad");
		this.jLabelid_unidadDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_unidadDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_unidadDetallePedido= new JComboBoxMe();
		jComboBoxid_unidadDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetallePedido= new JButtonMe();
		this.jButtonid_unidadDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedido.setText("Buscar");
		this.jButtonid_unidadDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedido"));

		this.jButtonid_unidadDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_unidadDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoBusqueda.setText("U");
		this.jButtonid_unidadDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_unidadDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoUpdate.setText("U");
		this.jButtonid_unidadDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoUpdate"));



					
		this.jLabelid_estado_detalle_pedidoDetallePedido = new JLabelMe();
		this.jLabelid_estado_detalle_pedidoDetallePedido.setText(""+DetallePedidoConstantesFunciones.LABEL_IDESTADODETALLEPEDIDO+" : *");
		this.jLabelid_estado_detalle_pedidoDetallePedido.setToolTipText("Estado");
		this.jLabelid_estado_detalle_pedidoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_pedidoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_pedidoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_pedidoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_pedidoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_pedidoDetallePedido.setToolTipText(DetallePedidoConstantesFunciones.LABEL_IDESTADODETALLEPEDIDO);
		this.gridaBagLayoutDetallePedido = new GridBagLayout();
		this.jPanelid_estado_detalle_pedidoDetallePedido.setLayout(this.gridaBagLayoutDetallePedido);


		jComboBoxid_estado_detalle_pedidoDetallePedido= new JComboBoxMe();
		jComboBoxid_estado_detalle_pedidoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_pedidoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_detalle_pedidoDetallePedido= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_pedidoDetallePedido.setText("Buscar");
		this.jButtonid_estado_detalle_pedidoDetallePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_pedidoDetallePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetallePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_pedidoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetallePedido"));

		this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda.setText("U");
		this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_pedidoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetallePedidoBusqueda"));

		if(this.detallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_pedidoDetallePedidoBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_pedidoDetallePedidoUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_pedidoDetallePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetallePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_pedidoDetallePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_pedidoDetallePedidoUpdate.setText("U");
		this.jButtonid_estado_detalle_pedidoDetallePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_pedidoDetallePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_pedidoDetallePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_pedidoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_pedidoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_pedidoDetallePedidoUpdate"));



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
		//this.jInternalFrameDetalleDetallePedido = new DetallePedidoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedido= new GridBagLayout();
		

		
		String sToolTipDetallePedido="";
		sToolTipDetallePedido=DetallePedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedido+="(Inventario.DetallePedido)";
		}
		
		if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedido+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePedido = new JButtonMe();
		this.jButtonModificarDetallePedido = new JButtonMe();
        this.jButtonActualizarDetallePedido = new JButtonMe();
        this.jButtonEliminarDetallePedido = new JButtonMe();
        this.jButtonCancelarDetallePedido = new JButtonMe();
        this.jButtonGuardarCambiosDetallePedido = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePedido = new JButtonMe();
		this.jButtonCerrarDetallePedido = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedido = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePedido = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePedido = new JScrollPane();
		//this.jScrollPanelDatosDetallePedidoTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido";
		
		if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetallePedidoTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePedido.setName("jPanelCamposDetallePedido"); 

		this.jPanelCamposOcultosDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePedido.setName("jPanelCamposOcultosDetallePedido"); 

        this.jPanelAccionesDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedido.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedido.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePedido.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePedido.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePedido.setText("Nuevo");
		this.jButtonModificarDetallePedido.setText("Editar");
        this.jButtonActualizarDetallePedido.setText("Actualizar");
        this.jButtonEliminarDetallePedido.setText("Eliminar");
        this.jButtonCancelarDetallePedido.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePedido.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePedido.setText("Guardar");
		this.jButtonCerrarDetallePedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedido,"nuevo_button","Nuevo",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePedido,"modificar_button","Editar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePedido,"actualizar_button","Actualizar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePedido,"eliminar_button","Eliminar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePedido,"cancelar_button","Cancelar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePedido,"guardarcambios_button","Guardar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedido,"guardarcambiostabla_button","Guardar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedido,"cerrar_button","Salir",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePedido.setToolTipText("Nuevo"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePedido.setToolTipText("Editar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePedido.setToolTipText("Actualizar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePedido.setToolTipText("Eliminar)"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePedido.setToolTipText("Cancelar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePedido.setToolTipText("Guardar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePedido.setToolTipText("Guardar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedido.setToolTipText("Salir"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedido";
		inputMap = this.jButtonNuevoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedido"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePedido";
		inputMap = this.jButtonActualizarDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePedido"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePedido";
		inputMap = this.jButtonEliminarDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePedido"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePedido";
		inputMap = this.jButtonCancelarDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePedido"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePedido";
		inputMap = this.jButtonCerrarDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedido";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedido"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePedido.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePedido.setToolTipText("Nuevo DetallePedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePedido.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePedido.setToolTipText("Sin Cerrar Ventana DetallePedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePedido.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePedido.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedido.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedido.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePedido.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePedido.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePedido = new JLabelMe();
		
		this.jLabelAccionesDetallePedido.setText("Acciones");		
		this.jLabelAccionesDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePedido();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePedido();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePedido=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedido.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePedido = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePedido = new GridBagLayout();
		
		this.jPanelCamposDetallePedido.setLayout(gridaBagLayoutCamposDetallePedido);
		this.jPanelCamposOcultosDetallePedido.setLayout(gridaBagLayoutCamposOcultosDetallePedido);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallePedido.add(jLabelIdDetallePedido, this.gridBagConstraintsDetallePedido);



	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallePedido.add(jLabelidDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pedidoDetallePedido.add(jLabelid_pedidoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedidoDetallePedido.add(jButtonid_pedidoDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedidoDetallePedido.add(jButtonid_pedidoDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pedidoDetallePedido.add(jComboBoxid_pedidoDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallePedido.add(jLabelid_empresaDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedido.add(jButtonid_empresaDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedido.add(jButtonid_empresaDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallePedido.add(jComboBoxid_empresaDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetallePedido.add(jLabelid_sucursalDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedido.add(jButtonid_sucursalDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedido.add(jButtonid_sucursalDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetallePedido.add(jComboBoxid_sucursalDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetallePedido.add(jLabelid_ejercicioDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePedido.add(jButtonid_ejercicioDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePedido.add(jButtonid_ejercicioDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetallePedido.add(jComboBoxid_ejercicioDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetallePedido.add(jLabelid_periodoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePedido.add(jButtonid_periodoDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePedido.add(jButtonid_periodoDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetallePedido.add(jComboBoxid_periodoDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetallePedido.add(jLabelid_anioDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePedido.add(jButtonid_anioDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePedido.add(jButtonid_anioDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetallePedido.add(jComboBoxid_anioDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetallePedido.add(jLabelid_mesDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePedido.add(jButtonid_mesDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePedido.add(jButtonid_mesDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetallePedido.add(jComboBoxid_mesDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetallePedido.add(jLabelid_productoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 2;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetallePedido.add(jButtonid_productoDetallePedido, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedido.add(jButtonid_productoDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 4;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedido.add(jButtonid_productoDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetallePedido.add(jComboBoxid_productoDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetallePedido.add(jLabelid_bodegaDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedido.add(jButtonid_bodegaDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedido.add(jButtonid_bodegaDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetallePedido.add(jComboBoxid_bodegaDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetallePedido.add(jLabelid_unidadDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedido.add(jButtonid_unidadDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedido.add(jButtonid_unidadDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetallePedido.add(jComboBoxid_unidadDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_detalle_pedidoDetallePedido.add(jLabelid_estado_detalle_pedidoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_pedidoDetallePedido.add(jButtonid_estado_detalle_pedidoDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 3;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_pedidoDetallePedido.add(jButtonid_estado_detalle_pedidoDetallePedidoUpdate, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_detalle_pedidoDetallePedido.add(jComboBoxid_estado_detalle_pedidoDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetallePedido.add(jLabelcantidadDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetallePedido.add(jButtoncantidadDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetallePedido.add(jTextFieldcantidadDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetallePedido.add(jLabelprecioDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetallePedido.add(jButtonprecioDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetallePedido.add(jTextFieldprecioDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_porcentajeDetallePedido.add(jLabeldescuento_porcentajeDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajeDetallePedido.add(jButtondescuento_porcentajeDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_porcentajeDetallePedido.add(jTextFielddescuento_porcentajeDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorDetallePedido.add(jLabeldescuento_valorDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorDetallePedido.add(jButtondescuento_valorDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorDetallePedido.add(jTextFielddescuento_valorDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetallePedido.add(jLabelivaDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetallePedido.add(jButtonivaDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetallePedido.add(jTextFieldivaDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetallePedido.add(jLabeliceDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetallePedido.add(jButtoniceDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetallePedido.add(jTextFieldiceDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetallePedido.add(jLabeltotalDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetallePedido.add(jButtontotalDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetallePedido.add(jTextFieldtotalDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoDetallePedido.add(jLabelcostoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDetallePedido.add(jButtoncostoDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoDetallePedido.add(jTextFieldcostoDetallePedido, this.gridBagConstraintsDetallePedido);


	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 0;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelutilidadDetallePedido.add(jLabelutilidadDetallePedido, this.gridBagConstraintsDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 2;
		this.gridBagConstraintsDetallePedido.ipadx = 0;
		this.gridBagConstraintsDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidadDetallePedido.add(jButtonutilidadDetallePedidoBusqueda, this.gridBagConstraintsDetallePedido);
	}

	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedido.gridy = 0;
	this.gridBagConstraintsDetallePedido.gridx = 1;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelutilidadDetallePedido.add(jTextFieldutilidadDetallePedido, this.gridBagConstraintsDetallePedido);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelidDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelid_pedidoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelid_productoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelid_bodegaDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelid_unidadDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelid_estado_detalle_pedidoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelcantidadDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelprecioDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPaneldescuento_porcentajeDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPaneldescuento_valorDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPanelivaDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPaneliceDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedido.add(this.jPaneltotalDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposDetallePedido % 1==0) {
		iXPanelCamposDetallePedido=0;
		iYPanelCamposDetallePedido++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposOcultosDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposOcultosDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedido.add(this.jPanelid_empresaDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposOcultosDetallePedido % 1==0) {
		iXPanelCamposOcultosDetallePedido=0;
		iYPanelCamposOcultosDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposOcultosDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposOcultosDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedido.add(this.jPanelid_sucursalDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposOcultosDetallePedido % 1==0) {
		iXPanelCamposOcultosDetallePedido=0;
		iYPanelCamposOcultosDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposOcultosDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposOcultosDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedido.add(this.jPanelid_ejercicioDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposOcultosDetallePedido % 1==0) {
		iXPanelCamposOcultosDetallePedido=0;
		iYPanelCamposOcultosDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposOcultosDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposOcultosDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedido.add(this.jPanelid_periodoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposOcultosDetallePedido % 1==0) {
		iXPanelCamposOcultosDetallePedido=0;
		iYPanelCamposOcultosDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposOcultosDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposOcultosDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedido.add(this.jPanelid_anioDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposOcultosDetallePedido % 1==0) {
		iXPanelCamposOcultosDetallePedido=0;
		iYPanelCamposOcultosDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposOcultosDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposOcultosDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedido.add(this.jPanelid_mesDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposOcultosDetallePedido % 1==0) {
		iXPanelCamposOcultosDetallePedido=0;
		iYPanelCamposOcultosDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposOcultosDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposOcultosDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedido.add(this.jPanelcostoDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposOcultosDetallePedido % 1==0) {
		iXPanelCamposOcultosDetallePedido=0;
		iYPanelCamposOcultosDetallePedido++;
	}
	this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedido.gridy = iYPanelCamposOcultosDetallePedido;
	this.gridBagConstraintsDetallePedido.gridx = iXPanelCamposOcultosDetallePedido++;
	this.gridBagConstraintsDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedido.add(this.jPanelutilidadDetallePedido, this.gridBagConstraintsDetallePedido);



	if(iXPanelCamposOcultosDetallePedido % 1==0) {
		iXPanelCamposOcultosDetallePedido=0;
		iYPanelCamposOcultosDetallePedido++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePedido= new GridBagLayout();
		this.jPanelAccionesDetallePedido.setLayout(gridaBagLayoutAccionesDetallePedido);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePedido= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePedido.setLayout(gridaBagLayoutAccionesFormularioDetallePedido);
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedido.add(this.jComboBoxTiposAccionesFormularioDetallePedido, this.gridBagConstraintsDetallePedido);

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedido.add(this.jCheckBoxPostAccionNuevoDetallePedido, this.gridBagConstraintsDetallePedido);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallepedidoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedido.add(this.jCheckBoxPostAccionSinCerrarDetallePedido, this.gridBagConstraintsDetallePedido);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallepedidoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedido.add(this.jCheckBoxPostAccionSinMensajeDetallePedido, this.gridBagConstraintsDetallePedido);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePedido.add(this.jButtonModificarDetallePedido, this.gridBagConstraintsDetallePedido);							

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePedido.add(this.jButtonEliminarDetallePedido, this.gridBagConstraintsDetallePedido);
		
			
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = 0;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedido.add(this.jButtonActualizarDetallePedido, this.gridBagConstraintsDetallePedido);


		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = 0;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedido.add(this.jButtonGuardarCambiosDetallePedido, this.gridBagConstraintsDetallePedido);	
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = 0;		
		this.gridBagConstraintsDetallePedido.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePedido.add(this.jButtonCancelarDetallePedido, this.gridBagConstraintsDetallePedido);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedido);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedido.gridx = 0;		
			//this.gridBagConstraintsDetallePedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedido.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedido.gridx =0;
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedido, this.gridBagConstraintsDetallePedido);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePedidoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePedido = new DetallePedidoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Pedido DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Pedido DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pedido Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallePedidoModel detallepedidoModel=new DetallePedidoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePedidoModel.DetallePedidoFocusTraversalPolicy detallepedidoFocusTraversalPolicy = detallepedidoModel.new DetallePedidoFocusTraversalPolicy(this);
			
			//detallepedidoFocusTraversalPolicy.setdetallepedidoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallepedidoModel);
			
			
			this.jContentPaneDetalleDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePedido = new GridBagLayout();	
			this.jContentPaneDetalleDetallePedido.setLayout(gridaBagLayoutDetalleDetallePedido);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedido = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePedido = new GridBagConstraints();
				this.gridBagConstraintsDetallePedido.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePedido.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePedido.add(jTtoolBarDetalleDetallePedido, gridBagConstraintsDetallePedido);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePedido=   new JScrollPane(jContentPaneDetalleDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePedido.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePedido.gridx = 0;
	        
			this.jContentPaneDetalleDetallePedido.add(jPanelCamposDetallePedido, gridBagConstraintsDetallePedido);
			
			
			
			
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
						&& detallepedidoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallepedidoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePedido= new GridBagConstraints();
						this.gridBagConstraintsDetallePedido.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePedido.gridx = 0;
						this.jContentPaneDetalleDetallePedido.add(this.jTabbedPaneRelacionesDetallePedido, this.gridBagConstraintsDetallePedido);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePedido.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePedido.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePedido = new GridBagConstraints();
					this.gridBagConstraintsDetallePedido.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePedido.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePedido.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePedido.add(jPanelCamposOcultosDetallePedido, gridBagConstraintsDetallePedido);
				
					this.jPanelCamposOcultosDetallePedido.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePedido.gridx = 0;
	        this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePedido.add(this.jPanelAccionesFormularioDetallePedido, this.gridBagConstraintsDetallePedido);							
			
			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
	        this.gridBagConstraintsDetallePedido.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePedido.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePedido.add(this.jPanelAccionesDetallePedido, this.gridBagConstraintsDetallePedido);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePedido);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePedido=   new JScrollPane(this.jPanelCamposDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedido.gridx = 0;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePedido.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePedido, this.gridBagConstraintsDetallePedido);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePedido, this.gridBagConstraintsDetallePedido);			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePedido, this.gridBagConstraintsDetallePedido);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedido, this.gridBagConstraintsDetallePedido);
			
			
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedido, this.gridBagConstraintsDetallePedido);
		
			
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedido, this.gridBagConstraintsDetallePedido);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePedido;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePedido;
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
