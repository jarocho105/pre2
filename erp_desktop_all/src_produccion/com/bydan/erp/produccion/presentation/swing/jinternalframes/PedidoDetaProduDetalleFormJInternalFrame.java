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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.PedidoDetaProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class PedidoDetaProduDetalleFormJInternalFrame extends PedidoDetaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedidoDetaProdu;
	
	protected JMenuBar jmenuBarDetallePedidoDetaProdu;
	
	protected JMenu jmenuDetallePedidoDetaProdu;
	protected JMenu jmenuDetalleArchivoPedidoDetaProdu;
	protected JMenu jmenuDetalleAccionesPedidoDetaProdu;
	protected JMenu jmenuDetalleDatosPedidoDetaProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoDetaProdu;	
	protected GridBagConstraints gridBagConstraintsPedidoDetaProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidoDetaProduBeanSwingJInternalFrameAdditional jInternalFrameDetallePedidoDetaProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidoprodu="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected BodegaBeanSwingJInternalFrame bodegadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegadestino="";

	protected TipoProcesoProduBeanSwingJInternalFrame tipoprocesoproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoprodu="";
	
	public PedidoDetaProduSessionBean pedidodetaproduSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public PedidoProduSessionBean pedidoproduSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public BodegaSessionBean bodegadestinoSessionBean;
	public TipoProcesoProduSessionBean tipoprocesoproduSessionBean;	
	
	public PedidoDetaProduLogic pedidodetaproduLogic;
	
	public JScrollPane jScrollPanelDatosPedidoDetaProdu;
	public JScrollPane jScrollPanelDatosEdicionPedidoDetaProdu;
	public JScrollPane jScrollPanelDatosGeneralPedidoDetaProdu;
	
	protected JPanel jPanelCamposPedidoDetaProdu;    
	protected JPanel jPanelCamposOcultosPedidoDetaProdu;    	
	protected JPanel jPanelAccionesPedidoDetaProdu;
	protected JPanel jPanelAccionesFormularioPedidoDetaProdu;
    
	
	
	protected Integer iXPanelCamposPedidoDetaProdu=0;
	protected Integer iYPanelCamposPedidoDetaProdu=0;
	
	protected Integer iXPanelCamposOcultosPedidoDetaProdu=0;
	protected Integer iYPanelCamposOcultosPedidoDetaProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedidoDetaProdu;
	public JButton jButtonModificarPedidoDetaProdu;
	public JButton jButtonActualizarPedidoDetaProdu;
    public JButton jButtonEliminarPedidoDetaProdu;
	public JButton jButtonCancelarPedidoDetaProdu;
    public JButton jButtonGuardarCambiosPedidoDetaProdu;
	public JButton jButtonGuardarCambiosTablaPedidoDetaProdu;
	protected JButton jButtonCerrarPedidoDetaProdu;
	
	
	protected JButton jButtonProcesarInformacionPedidoDetaProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedidoDetaProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedidoDetaProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedidoDetaProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoDetaProdu;
	protected JButton jButtonModificarToolBarPedidoDetaProdu;
	protected JButton jButtonActualizarToolBarPedidoDetaProdu;
    protected JButton jButtonEliminarToolBarPedidoDetaProdu;
	protected JButton jButtonCancelarToolBarPedidoDetaProdu;
    protected JButton jButtonGuardarCambiosToolBarPedidoDetaProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarPedidoDetaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoDetaProdu;
	protected JButton jButtonCerrarToolBarPedidoDetaProdu;
	
	protected JButton jButtonProcesarInformacionToolBarPedidoDetaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoDetaProdu;
	protected JMenuItem jMenuItemModificarPedidoDetaProdu;
	protected JMenuItem jMenuItemActualizarPedidoDetaProdu;
    protected JMenuItem jMenuItemEliminarPedidoDetaProdu;
	protected JMenuItem jMenuItemCancelarPedidoDetaProdu;
    protected JMenuItem jMenuItemGuardarCambiosPedidoDetaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoDetaProdu;
	protected JMenuItem jMenuItemCerrarPedidoDetaProdu;
	protected JMenuItem jMenuItemDetalleCerrarPedidoDetaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoDetaProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionPedidoDetaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoDetaProdu;
	protected JMenuItem jMenuItemMostrarOcultarPedidoDetaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoDetaProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoDetaProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedidoDetaProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedidoDetaProdu;
	public JLabel jLabelIdPedidoDetaProdu;
	public JLabel jLabelidPedidoDetaProdu;
	public JButton jButtonidPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelcantidadPedidoDetaProdu;
	public JLabel jLabelcantidadPedidoDetaProdu;
	public JTextField jTextFieldcantidadPedidoDetaProdu;
	public JButton jButtoncantidadPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pendientePedidoDetaProdu;
	public JLabel jLabelcantidad_pendientePedidoDetaProdu;
	public JTextField jTextFieldcantidad_pendientePedidoDetaProdu;
	public JButton jButtoncantidad_pendientePedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPedidoDetaProdu;
	public JLabel jLabeldescripcionPedidoDetaProdu;
	public JTextArea jTextAreadescripcionPedidoDetaProdu;
	public JScrollPane jscrollPanedescripcionPedidoDetaProdu;
	public JButton jButtondescripcionPedidoDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedidoDetaProdu;
	public JLabel jLabelid_empresaPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedidoDetaProdu;
	public JButton jButtonid_empresaPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_empresaPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPedidoDetaProdu;
	public JLabel jLabelid_sucursalPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPedidoDetaProdu;
	public JButton jButtonid_sucursalPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_sucursalPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPedidoDetaProdu;
	public JLabel jLabelid_ejercicioPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPedidoDetaProdu;
	public JButton jButtonid_ejercicioPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPedidoDetaProdu;
	public JLabel jLabelid_periodoPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPedidoDetaProdu;
	public JButton jButtonid_periodoPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_periodoPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_periodoPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_pedido_produPedidoDetaProdu;
	public JLabel jLabelid_pedido_produPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_produPedidoDetaProdu;
	public JButton jButtonid_pedido_produPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_pedido_produPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_pedido_produPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaPedidoDetaProdu;
	public JLabel jLabelid_bodegaPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaPedidoDetaProdu;
	public JButton jButtonid_bodegaPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_bodegaPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_productoPedidoDetaProdu;
	public JLabel jLabelid_productoPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoPedidoDetaProdu;
	public JButton jButtonid_productoPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_productoPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_productoPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadPedidoDetaProdu;
	public JLabel jLabelid_unidadPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadPedidoDetaProdu;
	public JButton jButtonid_unidadPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_unidadPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_destinoPedidoDetaProdu;
	public JLabel jLabelid_bodega_destinoPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_destinoPedidoDetaProdu;
	public JButton jButtonid_bodega_destinoPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_bodega_destinoPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodega_destinoPedidoDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_proceso_produPedidoDetaProdu;
	public JLabel jLabelid_tipo_proceso_produPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_produPedidoDetaProdu;
	public JButton jButtonid_tipo_proceso_produPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_tipo_proceso_produPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_produPedidoDetaProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedidoDetaProdu;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidoDetaProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedidoDetaProdu=new JPanel();
				this.jPanelAccionesFormularioPedidoDetaProdu=new JPanel();
				this.jmenuBarDetallePedidoDetaProdu=new JMenuBar();
				this.jTtoolBarDetallePedidoDetaProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetaProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidoDetaProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetaProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetaProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetaProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPedidoDetaProdu() {
		return this.jButtonActualizarToolBarPedidoDetaProdu;
	}
	
	public JButton getjButtonEliminarToolBarPedidoDetaProdu() {
		return this.jButtonEliminarToolBarPedidoDetaProdu;
	}
	
	public JButton getjButtonCancelarToolBarPedidoDetaProdu() {
		return this.jButtonCancelarToolBarPedidoDetaProdu;
	}		
	
	public JButton getjButtonProcesarInformacionPedidoDetaProdu() {
		return this.jButtonProcesarInformacionPedidoDetaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoDetaProdu)	{
		this.jButtonProcesarInformacionPedidoDetaProdu = jButtonProcesarInformacionPedidoDetaProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoDetaProdu() {
		return this.jComboBoxTiposAccionesPedidoDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoDetaProdu(
			JComboBox jComboBoxTiposRelacionesPedidoDetaProdu) {
		this.jComboBoxTiposRelacionesPedidoDetaProdu = jComboBoxTiposRelacionesPedidoDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoDetaProdu(
			JComboBox jComboBoxTiposAccionesPedidoDetaProdu) {
		this.jComboBoxTiposAccionesPedidoDetaProdu = jComboBoxTiposAccionesPedidoDetaProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedidoDetaProdu() {
		return this.jComboBoxTiposAccionesFormularioPedidoDetaProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedidoDetaProdu(
			JComboBox jComboBoxTiposAccionesFormularioPedidoDetaProdu) {
		this.jComboBoxTiposAccionesFormularioPedidoDetaProdu = jComboBoxTiposAccionesFormularioPedidoDetaProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		
		this.pedidodetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidodetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidodetaproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoDetaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Detalle Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoDetaProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedidoDetaProdu=new JButtonMe();
				this.jButtonModificarToolBarPedidoDetaProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedidoDetaProdu,this.jTtoolBarDetallePedidoDetaProdu,
							"actualizar","actualizar","Actualizar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedidoDetaProdu,this.jTtoolBarDetallePedidoDetaProdu,
							"eliminar","eliminar","Eliminar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedidoDetaProdu,this.jTtoolBarDetallePedidoDetaProdu,
							"cancelar","cancelar","Cancelar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedidoDetaProdu,this.jTtoolBarDetallePedidoDetaProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedidoDetaProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedidoDetaProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedidoDetaProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedidoDetaProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedidoDetaProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoDetaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoDetaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoDetaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedidoDetaProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedidoDetaProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedidoDetaProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedidoDetaProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedidoDetaProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedidoDetaProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedidoDetaProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedidoDetaProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedidoDetaProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedidoDetaProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedidoDetaProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedidoDetaProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedidoDetaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoDetaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoDetaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedidoDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedidoDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedidoDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedidoDetaProdu.add(this.jMenuItemDetalleCerrarPedidoDetaProdu);
		
		this.jmenuDetalleAccionesPedidoDetaProdu.add(this.jMenuItemActualizarPedidoDetaProdu);
		this.jmenuDetalleAccionesPedidoDetaProdu.add(this.jMenuItemEliminarPedidoDetaProdu);
		this.jmenuDetalleAccionesPedidoDetaProdu.add(this.jMenuItemCancelarPedidoDetaProdu);		
		
		//this.jmenuDetalleDatosPedidoDetaProdu.add(this.jMenuItemDetalleAbrirOrderByPedidoDetaProdu);				
		this.jmenuDetalleDatosPedidoDetaProdu.add(this.jMenuItemDetalleMostarOcultarPedidoDetaProdu);				
				
		//this.jmenuDetalleAccionesPedidoDetaProdu.add(this.jMenuItemGuardarCambiosPedidoDetaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedidoDetaProdu.add(this.jmenuDetalleArchivoPedidoDetaProdu);		
		this.jmenuBarDetallePedidoDetaProdu.add(this.jmenuDetalleAccionesPedidoDetaProdu);		
		this.jmenuBarDetallePedidoDetaProdu.add(this.jmenuDetalleDatosPedidoDetaProdu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePedidoDetaProdu);				
	}
	
	
	public void inicializarElementosCamposPedidoDetaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedidoDetaProdu = new JLabelMe();
		jLabelIdPedidoDetaProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedidoDetaProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedidoDetaProdu= new GridBagLayout();

		this.jPanelidPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);

		jLabelidPedidoDetaProdu = new JLabel();
		jLabelidPedidoDetaProdu.setText("Id");

		jLabelidPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadPedidoDetaProdu = new JLabelMe();
		this.jLabelcantidadPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadPedidoDetaProdu.setToolTipText("Cantad");
		this.jLabelcantidadPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelcantidadPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jTextFieldcantidadPedidoDetaProdu= new JTextFieldMe();
		jTextFieldcantidadPedidoDetaProdu.setEnabled(false);
		jTextFieldcantidadPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadPedidoDetaProdu.setText("0");

		this.jButtoncantidadPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtoncantidadPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadPedidoDetaProduBusqueda.setText("U");
		this.jButtoncantidadPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadPedidoDetaProduBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pendientePedidoDetaProdu = new JLabelMe();
		this.jLabelcantidad_pendientePedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE+" : *");
		this.jLabelcantidad_pendientePedidoDetaProdu.setToolTipText("Cantad Pendiente");
		this.jLabelcantidad_pendientePedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendientePedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendientePedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pendientePedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pendientePedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pendientePedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelcantidad_pendientePedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jTextFieldcantidad_pendientePedidoDetaProdu= new JTextFieldMe();
		jTextFieldcantidad_pendientePedidoDetaProdu.setEnabled(false);
		jTextFieldcantidad_pendientePedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendientePedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendientePedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pendientePedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pendientePedidoDetaProdu.setText("0");

		this.jButtoncantidad_pendientePedidoDetaProduBusqueda= new JButtonMe();
		this.jButtoncantidad_pendientePedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendientePedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendientePedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pendientePedidoDetaProduBusqueda.setText("U");
		this.jButtoncantidad_pendientePedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pendientePedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pendientePedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pendientePedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pendientePedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pendientePedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pendientePedidoDetaProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPedidoDetaProdu = new JLabelMe();
		this.jLabeldescripcionPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPedidoDetaProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPaneldescripcionPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jTextAreadescripcionPedidoDetaProdu= new JTextAreaMe();
		jTextAreadescripcionPedidoDetaProdu.setEnabled(false);
		jTextAreadescripcionPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoDetaProdu.setLineWrap(true);
		jTextAreadescripcionPedidoDetaProdu.setWrapStyleWord(true);
		jTextAreadescripcionPedidoDetaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPedidoDetaProdu.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPedidoDetaProdu = new JScrollPane(jTextAreadescripcionPedidoDetaProdu);
		jscrollPanedescripcionPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtondescripcionPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPedidoDetaProduBusqueda.setText("U");
		this.jButtondescripcionPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPedidoDetaProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedidoDetaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedidoDetaProdu = new JLabelMe();
		this.jLabelid_empresaPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedidoDetaProdu.setToolTipText("Empresa");
		this.jLabelid_empresaPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_empresaPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_empresaPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_empresaPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedidoDetaProdu.setEnabled(false);

		this.jButtonid_empresaPedidoDetaProdu= new JButtonMe();
		this.jButtonid_empresaPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoDetaProdu.setText("Buscar");
		this.jButtonid_empresaPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoDetaProdu"));

		this.jButtonid_empresaPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_empresaPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_empresaPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoDetaProduUpdate.setText("U");
		this.jButtonid_empresaPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoDetaProduUpdate"));



					
		this.jLabelid_sucursalPedidoDetaProdu = new JLabelMe();
		this.jLabelid_sucursalPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPedidoDetaProdu.setToolTipText("Sucursal");
		this.jLabelid_sucursalPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_sucursalPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_sucursalPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_sucursalPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPedidoDetaProdu.setEnabled(false);

		this.jButtonid_sucursalPedidoDetaProdu= new JButtonMe();
		this.jButtonid_sucursalPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoDetaProdu.setText("Buscar");
		this.jButtonid_sucursalPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoDetaProdu"));

		this.jButtonid_sucursalPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_sucursalPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_sucursalPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_sucursalPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoDetaProduUpdate.setText("U");
		this.jButtonid_sucursalPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoDetaProduUpdate"));



					
		this.jLabelid_ejercicioPedidoDetaProdu = new JLabelMe();
		this.jLabelid_ejercicioPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPedidoDetaProdu.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_ejercicioPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_ejercicioPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_ejercicioPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPedidoDetaProdu.setEnabled(false);

		this.jButtonid_ejercicioPedidoDetaProdu= new JButtonMe();
		this.jButtonid_ejercicioPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoDetaProdu.setText("Buscar");
		this.jButtonid_ejercicioPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoDetaProdu"));

		this.jButtonid_ejercicioPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_ejercicioPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_ejercicioPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoDetaProduUpdate.setText("U");
		this.jButtonid_ejercicioPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoDetaProduUpdate"));



					
		this.jLabelid_periodoPedidoDetaProdu = new JLabelMe();
		this.jLabelid_periodoPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPedidoDetaProdu.setToolTipText("Periodo");
		this.jLabelid_periodoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_periodoPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_periodoPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_periodoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPedidoDetaProdu.setEnabled(false);

		this.jButtonid_periodoPedidoDetaProdu= new JButtonMe();
		this.jButtonid_periodoPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoDetaProdu.setText("Buscar");
		this.jButtonid_periodoPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoDetaProdu"));

		this.jButtonid_periodoPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_periodoPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_periodoPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_periodoPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_periodoPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoDetaProduUpdate.setText("U");
		this.jButtonid_periodoPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoDetaProduUpdate"));



					
		this.jLabelid_pedido_produPedidoDetaProdu = new JLabelMe();
		this.jLabelid_pedido_produPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU+" : *");
		this.jLabelid_pedido_produPedidoDetaProdu.setToolTipText("Pedido Produ");
		this.jLabelid_pedido_produPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedido_produPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedido_produPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_produPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedido_produPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedido_produPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_pedido_produPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_pedido_produPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_pedido_produPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_produPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_produPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_produPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedido_produPedidoDetaProdu= new JButtonMe();
		this.jButtonid_pedido_produPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_produPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_produPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_produPedidoDetaProdu.setText("Buscar");
		this.jButtonid_pedido_produPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedido_produPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_produPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedido_produPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_produPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_produPedidoDetaProdu"));

		this.jButtonid_pedido_produPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_pedido_produPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_produPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_produPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_produPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_pedido_produPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedido_produPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_produPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedido_produPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_produPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_produPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedido_produPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_pedido_produPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_pedido_produPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_produPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_produPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_produPedidoDetaProduUpdate.setText("U");
		this.jButtonid_pedido_produPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedido_produPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_produPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedido_produPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_produPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_produPedidoDetaProduUpdate"));



					
		this.jLabelid_bodegaPedidoDetaProdu = new JLabelMe();
		this.jLabelid_bodegaPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaPedidoDetaProdu.setToolTipText("Bodega");
		this.jLabelid_bodegaPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_bodegaPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_bodegaPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_bodegaPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaPedidoDetaProdu= new JButtonMe();
		this.jButtonid_bodegaPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPedidoDetaProdu.setText("Buscar");
		this.jButtonid_bodegaPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPedidoDetaProdu"));

		this.jButtonid_bodegaPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_bodegaPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_bodegaPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_bodegaPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_bodegaPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPedidoDetaProduUpdate.setText("U");
		this.jButtonid_bodegaPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPedidoDetaProduUpdate"));



					
		this.jLabelid_productoPedidoDetaProdu = new JLabelMe();
		this.jLabelid_productoPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoPedidoDetaProdu.setToolTipText("Producto");
		this.jLabelid_productoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_productoPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_productoPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_productoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoPedidoDetaProdu= new JButtonMe();
		this.jButtonid_productoPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPedidoDetaProdu.setText("Buscar");
		this.jButtonid_productoPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPedidoDetaProdu"));

		this.jButtonid_productoPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_productoPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_productoPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_productoPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_productoPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPedidoDetaProduUpdate.setText("U");
		this.jButtonid_productoPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPedidoDetaProduUpdate"));



					
		this.jLabelid_unidadPedidoDetaProdu = new JLabelMe();
		this.jLabelid_unidadPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadPedidoDetaProdu.setToolTipText("Unad");
		this.jLabelid_unidadPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_unidadPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_unidadPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_unidadPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadPedidoDetaProdu= new JButtonMe();
		this.jButtonid_unidadPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadPedidoDetaProdu.setText("Buscar");
		this.jButtonid_unidadPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadPedidoDetaProdu"));

		this.jButtonid_unidadPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_unidadPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_unidadPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_unidadPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_unidadPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadPedidoDetaProduUpdate.setText("U");
		this.jButtonid_unidadPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadPedidoDetaProduUpdate"));



					
		this.jLabelid_bodega_destinoPedidoDetaProdu = new JLabelMe();
		this.jLabelid_bodega_destinoPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO+" : *");
		this.jLabelid_bodega_destinoPedidoDetaProdu.setToolTipText("Bodega Destino");
		this.jLabelid_bodega_destinoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_destinoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_destinoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_destinoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_destinoPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_destinoPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_bodega_destinoPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_bodega_destinoPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_bodega_destinoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_destinoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_destinoPedidoDetaProdu= new JButtonMe();
		this.jButtonid_bodega_destinoPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoPedidoDetaProdu.setText("Buscar");
		this.jButtonid_bodega_destinoPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_destinoPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_destinoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoPedidoDetaProdu"));

		this.jButtonid_bodega_destinoPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_bodega_destinoPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_destinoPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_bodega_destinoPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_destinoPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_destinoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_destinoPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_bodega_destinoPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_bodega_destinoPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_destinoPedidoDetaProduUpdate.setText("U");
		this.jButtonid_bodega_destinoPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_destinoPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_destinoPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoPedidoDetaProduUpdate"));



					
		this.jLabelid_tipo_proceso_produPedidoDetaProdu = new JLabelMe();
		this.jLabelid_tipo_proceso_produPedidoDetaProdu.setText(""+PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU+" : *");
		this.jLabelid_tipo_proceso_produPedidoDetaProdu.setToolTipText("Tipo Proceso Produ");
		this.jLabelid_tipo_proceso_produPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_proceso_produPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_proceso_produPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_produPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_proceso_produPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_proceso_produPedidoDetaProdu.setToolTipText(PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU);
		this.gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		this.jPanelid_tipo_proceso_produPedidoDetaProdu.setLayout(this.gridaBagLayoutPedidoDetaProdu);


		jComboBoxid_tipo_proceso_produPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_produPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_proceso_produPedidoDetaProdu= new JButtonMe();
		this.jButtonid_tipo_proceso_produPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_produPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_produPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_produPedidoDetaProdu.setText("Buscar");
		this.jButtonid_tipo_proceso_produPedidoDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_proceso_produPedidoDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_produPedidoDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_produPedidoDetaProdu"));

		this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda= new JButtonMe();
		this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.setText("U");
		this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_produPedidoDetaProduBusqueda"));

		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_tipo_proceso_produPedidoDetaProduUpdate= new JButtonMe();
		this.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.setText("U");
		this.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_produPedidoDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_produPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_produPedidoDetaProduUpdate"));



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
		//this.jInternalFrameDetallePedidoDetaProdu = new PedidoDetaProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedido Detalle Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoDetaProdu= new GridBagLayout();
		

		
		String sToolTipPedidoDetaProdu="";
		sToolTipPedidoDetaProdu=PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoDetaProdu+="(Produccion.PedidoDetaProdu)";
		}
		
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoDetaProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedidoDetaProdu = new JButtonMe();
		this.jButtonModificarPedidoDetaProdu = new JButtonMe();
        this.jButtonActualizarPedidoDetaProdu = new JButtonMe();
        this.jButtonEliminarPedidoDetaProdu = new JButtonMe();
        this.jButtonCancelarPedidoDetaProdu = new JButtonMe();
        this.jButtonGuardarCambiosPedidoDetaProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedidoDetaProdu = new JButtonMe();
		this.jButtonCerrarPedidoDetaProdu = new JButtonMe();
		
		this.jScrollPanelDatosPedidoDetaProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedidoDetaProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralPedidoDetaProdu = new JScrollPane();
				
		
		
		this.jPanelCamposPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Detalle Produccion";
		
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Detalle Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPedidoDetaProdu.setName("jPanelCamposPedidoDetaProdu"); 

		this.jPanelCamposOcultosPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedidoDetaProdu.setName("jPanelCamposOcultosPedidoDetaProdu"); 

        this.jPanelAccionesPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesPedidoDetaProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedidoDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedidoDetaProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedidoDetaProdu.setText("Nuevo");
		this.jButtonModificarPedidoDetaProdu.setText("Editar");
        this.jButtonActualizarPedidoDetaProdu.setText("Actualizar");
        this.jButtonEliminarPedidoDetaProdu.setText("Eliminar");
        this.jButtonCancelarPedidoDetaProdu.setText("Cancelar");
        this.jButtonGuardarCambiosPedidoDetaProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.setText("Guardar");
		this.jButtonCerrarPedidoDetaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoDetaProdu,"nuevo_button","Nuevo",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedidoDetaProdu,"modificar_button","Editar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedidoDetaProdu,"actualizar_button","Actualizar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedidoDetaProdu,"eliminar_button","Eliminar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedidoDetaProdu,"cancelar_button","Cancelar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedidoDetaProdu,"guardarcambios_button","Guardar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoDetaProdu,"guardarcambiostabla_button","Guardar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoDetaProdu,"cerrar_button","Salir",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedidoDetaProdu.setToolTipText("Nuevo"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedidoDetaProdu.setToolTipText("Editar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedidoDetaProdu.setToolTipText("Actualizar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedidoDetaProdu.setToolTipText("Eliminar)"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedidoDetaProdu.setToolTipText("Cancelar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedidoDetaProdu.setToolTipText("Guardar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.setToolTipText("Guardar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoDetaProdu.setToolTipText("Salir"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoDetaProdu";
		inputMap = this.jButtonNuevoPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoDetaProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedidoDetaProdu";
		inputMap = this.jButtonActualizarPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedidoDetaProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarPedidoDetaProdu";
		inputMap = this.jButtonEliminarPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedidoDetaProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarPedidoDetaProdu";
		inputMap = this.jButtonCancelarPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedidoDetaProdu"));
		
		//CERRAR		
		sMapKey = "CerrarPedidoDetaProdu";
		inputMap = this.jButtonCerrarPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoDetaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoDetaProdu";
		inputMap = this.jButtonGuardarCambiosTablaPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoDetaProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedidoDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedidoDetaProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedidoDetaProdu.setToolTipText("Nuevo PedidoDetaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedidoDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedidoDetaProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedidoDetaProdu.setToolTipText("Sin Cerrar Ventana PedidoDetaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedidoDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedidoDetaProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedidoDetaProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoDetaProdu.setText("Accion");
		this.jComboBoxTiposAccionesPedidoDetaProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedidoDetaProdu = new JLabelMe();
		
		this.jLabelAccionesPedidoDetaProdu.setText("Acciones");		
		this.jLabelAccionesPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedidoDetaProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedidoDetaProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedidoDetaProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedidoDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedidoDetaProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedidoDetaProdu = new GridBagLayout();
		
		this.jPanelCamposPedidoDetaProdu.setLayout(gridaBagLayoutCamposPedidoDetaProdu);
		this.jPanelCamposOcultosPedidoDetaProdu.setLayout(gridaBagLayoutCamposOcultosPedidoDetaProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPedidoDetaProdu.add(jLabelIdPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPedidoDetaProdu.add(jLabelidPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPedidoDetaProdu.add(jLabelid_empresaPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoDetaProdu.add(jButtonid_empresaPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoDetaProdu.add(jButtonid_empresaPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPedidoDetaProdu.add(jComboBoxid_empresaPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPedidoDetaProdu.add(jLabelid_sucursalPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoDetaProdu.add(jButtonid_sucursalPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoDetaProdu.add(jButtonid_sucursalPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPedidoDetaProdu.add(jComboBoxid_sucursalPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPedidoDetaProdu.add(jLabelid_ejercicioPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoDetaProdu.add(jButtonid_ejercicioPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoDetaProdu.add(jButtonid_ejercicioPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPedidoDetaProdu.add(jComboBoxid_ejercicioPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPedidoDetaProdu.add(jLabelid_periodoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoDetaProdu.add(jButtonid_periodoPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoDetaProdu.add(jButtonid_periodoPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPedidoDetaProdu.add(jComboBoxid_periodoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pedido_produPedidoDetaProdu.add(jLabelid_pedido_produPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_produPedidoDetaProdu.add(jButtonid_pedido_produPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_produPedidoDetaProdu.add(jButtonid_pedido_produPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pedido_produPedidoDetaProdu.add(jComboBoxid_pedido_produPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaPedidoDetaProdu.add(jLabelid_bodegaPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPedidoDetaProdu.add(jButtonid_bodegaPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPedidoDetaProdu.add(jButtonid_bodegaPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaPedidoDetaProdu.add(jComboBoxid_bodegaPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoPedidoDetaProdu.add(jLabelid_productoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoPedidoDetaProdu.add(jButtonid_productoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPedidoDetaProdu.add(jButtonid_productoPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 4;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPedidoDetaProdu.add(jButtonid_productoPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoPedidoDetaProdu.add(jComboBoxid_productoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadPedidoDetaProdu.add(jLabelid_unidadPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadPedidoDetaProdu.add(jButtonid_unidadPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadPedidoDetaProdu.add(jButtonid_unidadPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadPedidoDetaProdu.add(jComboBoxid_unidadPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_destinoPedidoDetaProdu.add(jLabelid_bodega_destinoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_destinoPedidoDetaProdu.add(jButtonid_bodega_destinoPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_destinoPedidoDetaProdu.add(jButtonid_bodega_destinoPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_destinoPedidoDetaProdu.add(jComboBoxid_bodega_destinoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_proceso_produPedidoDetaProdu.add(jLabelid_tipo_proceso_produPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_produPedidoDetaProdu.add(jButtonid_tipo_proceso_produPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 3;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_produPedidoDetaProdu.add(jButtonid_tipo_proceso_produPedidoDetaProduUpdate, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_proceso_produPedidoDetaProdu.add(jComboBoxid_tipo_proceso_produPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadPedidoDetaProdu.add(jLabelcantidadPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadPedidoDetaProdu.add(jButtoncantidadPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadPedidoDetaProdu.add(jTextFieldcantidadPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pendientePedidoDetaProdu.add(jLabelcantidad_pendientePedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pendientePedidoDetaProdu.add(jButtoncantidad_pendientePedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pendientePedidoDetaProdu.add(jTextFieldcantidad_pendientePedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPedidoDetaProdu.add(jLabeldescripcionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 2;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
		this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPedidoDetaProdu.add(jButtondescripcionPedidoDetaProduBusqueda, this.gridBagConstraintsPedidoDetaProdu);
	}

	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
	this.gridBagConstraintsPedidoDetaProdu.gridx = 1;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPedidoDetaProdu.add(jscrollPanedescripcionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelidPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelid_pedido_produPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelid_bodegaPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelid_productoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelid_unidadPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelid_bodega_destinoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelid_tipo_proceso_produPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelcantidadPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPanelcantidad_pendientePedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoDetaProdu.add(this.jPaneldescripcionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposPedidoDetaProdu % 2==0) {
		iXPanelCamposPedidoDetaProdu=0;
		iYPanelCamposPedidoDetaProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposOcultosPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposOcultosPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoDetaProdu.add(this.jPanelid_empresaPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposOcultosPedidoDetaProdu % 2==0) {
		iXPanelCamposOcultosPedidoDetaProdu=0;
		iYPanelCamposOcultosPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposOcultosPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposOcultosPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoDetaProdu.add(this.jPanelid_sucursalPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposOcultosPedidoDetaProdu % 2==0) {
		iXPanelCamposOcultosPedidoDetaProdu=0;
		iYPanelCamposOcultosPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposOcultosPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposOcultosPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoDetaProdu.add(this.jPanelid_ejercicioPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposOcultosPedidoDetaProdu % 2==0) {
		iXPanelCamposOcultosPedidoDetaProdu=0;
		iYPanelCamposOcultosPedidoDetaProdu++;
	}
	this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoDetaProdu.gridy = iYPanelCamposOcultosPedidoDetaProdu;
	this.gridBagConstraintsPedidoDetaProdu.gridx = iXPanelCamposOcultosPedidoDetaProdu++;
	this.gridBagConstraintsPedidoDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoDetaProdu.add(this.jPanelid_periodoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);



	if(iXPanelCamposOcultosPedidoDetaProdu % 2==0) {
		iXPanelCamposOcultosPedidoDetaProdu=0;
		iYPanelCamposOcultosPedidoDetaProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesPedidoDetaProdu= new GridBagLayout();
		this.jPanelAccionesPedidoDetaProdu.setLayout(gridaBagLayoutAccionesPedidoDetaProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedidoDetaProdu= new GridBagLayout();
		this.jPanelAccionesFormularioPedidoDetaProdu.setLayout(gridaBagLayoutAccionesFormularioPedidoDetaProdu);
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoDetaProdu.add(this.jComboBoxTiposAccionesFormularioPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoDetaProdu.add(this.jCheckBoxPostAccionNuevoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoDetaProdu.add(this.jCheckBoxPostAccionSinCerrarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoDetaProdu.add(this.jCheckBoxPostAccionSinMensajePedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedidoDetaProdu.add(this.jButtonModificarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);							

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedidoDetaProdu.add(this.jButtonEliminarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
			
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoDetaProdu.add(this.jButtonActualizarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);


		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoDetaProdu.add(this.jButtonGuardarCambiosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);	
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;		
		this.gridBagConstraintsPedidoDetaProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedidoDetaProdu.add(this.jButtonCancelarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoDetaProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();						
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoDetaProdu.gridx = 0;		
			//this.gridBagConstraintsPedidoDetaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoDetaProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoDetaProdu.gridx =0;
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoDetaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedidoDetaProdu = new PedidoDetaProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedido Detalle Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedido Detalle Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Detalle Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidoDetaProduModel pedidodetaproduModel=new PedidoDetaProduModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidoDetaProduModel.PedidoDetaProduFocusTraversalPolicy pedidodetaproduFocusTraversalPolicy = pedidodetaproduModel.new PedidoDetaProduFocusTraversalPolicy(this);
			
			//pedidodetaproduFocusTraversalPolicy.setpedidodetaproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidodetaproduModel);
			
			
			this.jContentPaneDetallePedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedidoDetaProdu = new GridBagLayout();	
			this.jContentPaneDetallePedidoDetaProdu.setLayout(gridaBagLayoutDetallePedidoDetaProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoDetaProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
					
				
				this.jContentPaneDetallePedidoDetaProdu.add(jTtoolBarDetallePedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);								
				
}
			
			this.jScrollPanelDatosEdicionPedidoDetaProdu=   new JScrollPane(jContentPaneDetallePedidoDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedidoDetaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	        
			this.jContentPaneDetallePedidoDetaProdu.add(jPanelCamposPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);
			
			
			
			
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
						&& pedidodetaproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedidoDetaProdu= new GridBagConstraints();
						this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
						this.jContentPaneDetallePedidoDetaProdu.add(this.jTabbedPaneRelacionesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedidoDetaProdu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedidoDetaProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
					this.gridBagConstraintsPedidoDetaProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
					
				
					this.jContentPaneDetallePedidoDetaProdu.add(jPanelCamposOcultosPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);
				
					this.jPanelCamposOcultosPedidoDetaProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	        this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePedidoDetaProdu.add(this.jPanelAccionesFormularioPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);							
			
			
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
	        this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
	        
			
			this.jContentPaneDetallePedidoDetaProdu.add(this.jPanelAccionesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedidoDetaProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedidoDetaProdu=   new JScrollPane(this.jPanelCamposPedidoDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedidoDetaProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			
			
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
			
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedidoDetaProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionPedidoDetaProdu;
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
