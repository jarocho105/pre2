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
import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaConstantesFunciones;

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
public class DetallePedidoPuntoVentaDetalleFormJInternalFrame extends DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePedidoPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleDetallePedidoPuntoVenta;
	
	protected JMenu jmenuDetalleDetallePedidoPuntoVenta;
	protected JMenu jmenuDetalleArchivoDetallePedidoPuntoVenta;
	protected JMenu jmenuDetalleAccionesDetallePedidoPuntoVenta;
	protected JMenu jmenuDetalleDatosDetallePedidoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedidoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsDetallePedidoPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePedidoPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidopuntoventa="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public DetallePedidoPuntoVentaSessionBean detallepedidopuntoventaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public DetallePedidoPuntoVentaLogic detallepedidopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosDetallePedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionDetallePedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralDetallePedidoPuntoVenta;
	
	protected JPanel jPanelCamposDetallePedidoPuntoVenta;    
	protected JPanel jPanelCamposOcultosDetallePedidoPuntoVenta;    	
	protected JPanel jPanelAccionesDetallePedidoPuntoVenta;
	protected JPanel jPanelAccionesFormularioDetallePedidoPuntoVenta;
    
	
	
	protected Integer iXPanelCamposDetallePedidoPuntoVenta=0;
	protected Integer iYPanelCamposDetallePedidoPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosDetallePedidoPuntoVenta=0;
	protected Integer iYPanelCamposOcultosDetallePedidoPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePedidoPuntoVenta;
	public JButton jButtonModificarDetallePedidoPuntoVenta;
	public JButton jButtonActualizarDetallePedidoPuntoVenta;
    public JButton jButtonEliminarDetallePedidoPuntoVenta;
	public JButton jButtonCancelarDetallePedidoPuntoVenta;
    public JButton jButtonGuardarCambiosDetallePedidoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaDetallePedidoPuntoVenta;
	protected JButton jButtonCerrarDetallePedidoPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionDetallePedidoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePedidoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePedidoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePedidoPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonModificarToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonActualizarToolBarDetallePedidoPuntoVenta;
    protected JButton jButtonEliminarToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonCancelarToolBarDetallePedidoPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonCerrarToolBarDetallePedidoPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePedidoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemModificarDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemActualizarDetallePedidoPuntoVenta;
    protected JMenuItem jMenuItemEliminarDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemCancelarDetallePedidoPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemCerrarDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedidoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedidoPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedidoPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePedidoPuntoVenta;
	public JLabel jLabelIdDetallePedidoPuntoVenta;
	public JLabel jLabelidDetallePedidoPuntoVenta;
	public JButton jButtonidDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelserieDetallePedidoPuntoVenta;
	public JLabel jLabelserieDetallePedidoPuntoVenta;
	public JTextField jTextFieldserieDetallePedidoPuntoVenta;
	public JButton jButtonserieDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetallePedidoPuntoVenta;
	public JLabel jLabelcantidadDetallePedidoPuntoVenta;
	public JTextField jTextFieldcantidadDetallePedidoPuntoVenta;
	public JButton jButtoncantidadDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetallePedidoPuntoVenta;
	public JLabel jLabelprecioDetallePedidoPuntoVenta;
	public JTextField jTextFieldprecioDetallePedidoPuntoVenta;
	public JButton jButtonprecioDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetallePedidoPuntoVenta;
	public JLabel jLabeldescuentoDetallePedidoPuntoVenta;
	public JTextField jTextFielddescuentoDetallePedidoPuntoVenta;
	public JButton jButtondescuentoDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorDetallePedidoPuntoVenta;
	public JLabel jLabeldescuento_valorDetallePedidoPuntoVenta;
	public JTextField jTextFielddescuento_valorDetallePedidoPuntoVenta;
	public JButton jButtondescuento_valorDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelivaDetallePedidoPuntoVenta;
	public JLabel jLabelivaDetallePedidoPuntoVenta;
	public JTextField jTextFieldivaDetallePedidoPuntoVenta;
	public JButton jButtonivaDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorDetallePedidoPuntoVenta;
	public JLabel jLabeliva_valorDetallePedidoPuntoVenta;
	public JTextField jTextFieldiva_valorDetallePedidoPuntoVenta;
	public JButton jButtoniva_valorDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneliceDetallePedidoPuntoVenta;
	public JLabel jLabeliceDetallePedidoPuntoVenta;
	public JTextField jTextFieldiceDetallePedidoPuntoVenta;
	public JButton jButtoniceDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelice_valorDetallePedidoPuntoVenta;
	public JLabel jLabelice_valorDetallePedidoPuntoVenta;
	public JTextField jTextFieldice_valorDetallePedidoPuntoVenta;
	public JButton jButtonice_valorDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalDetallePedidoPuntoVenta;
	public JLabel jLabelsub_totalDetallePedidoPuntoVenta;
	public JTextField jTextFieldsub_totalDetallePedidoPuntoVenta;
	public JButton jButtonsub_totalDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetallePedidoPuntoVenta;
	public JLabel jLabeltotalDetallePedidoPuntoVenta;
	public JTextField jTextFieldtotalDetallePedidoPuntoVenta;
	public JButton jButtontotalDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetallePedidoPuntoVenta;
	public JLabel jLabelid_empresaDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePedidoPuntoVenta;
	public JButton jButtonid_empresaDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallePedidoPuntoVenta;
	public JLabel jLabelid_sucursalDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallePedidoPuntoVenta;
	public JButton jButtonid_sucursalDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta;
	public JLabel jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta;
	public JButton jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetallePedidoPuntoVenta;
	public JLabel jLabelid_bodegaDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetallePedidoPuntoVenta;
	public JButton jButtonid_bodegaDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetallePedidoPuntoVenta;
	public JLabel jLabelid_productoDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetallePedidoPuntoVenta;
	public JButton jButtonid_productoDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetallePedidoPuntoVenta;
	public JLabel jLabelid_unidadDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetallePedidoPuntoVenta;
	public JButton jButtonid_unidadDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePedidoPuntoVenta;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePedidoPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePedidoPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioDetallePedidoPuntoVenta=new JPanel();
				this.jmenuBarDetalleDetallePedidoPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleDetallePedidoPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePedidoPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePedidoPuntoVenta() {
		return this.jButtonActualizarToolBarDetallePedidoPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarDetallePedidoPuntoVenta() {
		return this.jButtonEliminarToolBarDetallePedidoPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarDetallePedidoPuntoVenta() {
		return this.jButtonCancelarToolBarDetallePedidoPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePedidoPuntoVenta() {
		return this.jButtonProcesarInformacionDetallePedidoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedidoPuntoVenta)	{
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta = jButtonProcesarInformacionDetallePedidoPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesDetallePedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesDetallePedidoPuntoVenta) {
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta = jComboBoxTiposRelacionesDetallePedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesDetallePedidoPuntoVenta) {
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta = jComboBoxTiposAccionesDetallePedidoPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta = jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
		
		this.detallepedidopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePedidoPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePedidoPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarDetallePedidoPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetalleDetallePedidoPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetalleDetallePedidoPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetalleDetallePedidoPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetalleDetallePedidoPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePedidoPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePedidoPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePedidoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePedidoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePedidoPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedidoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedidoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedidoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePedidoPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePedidoPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePedidoPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePedidoPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePedidoPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePedidoPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePedidoPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePedidoPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePedidoPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePedidoPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePedidoPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePedidoPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePedidoPuntoVenta.add(this.jMenuItemDetalleCerrarDetallePedidoPuntoVenta);
		
		this.jmenuDetalleAccionesDetallePedidoPuntoVenta.add(this.jMenuItemActualizarDetallePedidoPuntoVenta);
		this.jmenuDetalleAccionesDetallePedidoPuntoVenta.add(this.jMenuItemEliminarDetallePedidoPuntoVenta);
		this.jmenuDetalleAccionesDetallePedidoPuntoVenta.add(this.jMenuItemCancelarDetallePedidoPuntoVenta);		
		
		//this.jmenuDetalleDatosDetallePedidoPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta);				
		this.jmenuDetalleDatosDetallePedidoPuntoVenta.add(this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta);				
				
		//this.jmenuDetalleAccionesDetallePedidoPuntoVenta.add(this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePedidoPuntoVenta.add(this.jmenuDetalleArchivoDetallePedidoPuntoVenta);		
		this.jmenuBarDetalleDetallePedidoPuntoVenta.add(this.jmenuDetalleAccionesDetallePedidoPuntoVenta);		
		this.jmenuBarDetalleDetallePedidoPuntoVenta.add(this.jmenuDetalleDatosDetallePedidoPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePedidoPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposDetallePedidoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePedidoPuntoVenta = new JLabelMe();
		jLabelIdDetallePedidoPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePedidoPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePedidoPuntoVenta= new GridBagLayout();

		this.jPanelidDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);

		jLabelidDetallePedidoPuntoVenta = new JLabel();
		jLabelidDetallePedidoPuntoVenta.setText("Id");

		jLabelidDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelserieDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelserieDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE+" :");
		this.jLabelserieDetallePedidoPuntoVenta.setToolTipText("Serie");
		this.jLabelserieDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelserieDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldserieDetallePedidoPuntoVenta= new JTextFieldMe();

		jTextFieldserieDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldserieDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonserieDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonserieDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelcantidadDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetallePedidoPuntoVenta.setToolTipText("Cantidad");
		this.jLabelcantidadDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelcantidadDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldcantidadDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldcantidadDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldcantidadDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetallePedidoPuntoVenta.setText("0");

		this.jButtoncantidadDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoncantidadDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtoncantidadDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelprecioDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetallePedidoPuntoVenta.setToolTipText("Precio");
		this.jLabelprecioDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelprecioDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldprecioDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldprecioDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldprecioDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetallePedidoPuntoVenta.setText("0.0");

		this.jButtonprecioDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonprecioDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonprecioDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabeldescuentoDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetallePedidoPuntoVenta.setToolTipText("Descuento %");
		this.jLabeldescuentoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPaneldescuentoDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFielddescuentoDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFielddescuentoDetallePedidoPuntoVenta.setEnabled(false);
		jTextFielddescuentoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetallePedidoPuntoVenta.setText("0.0");

		this.jButtondescuentoDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuentoDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtondescuentoDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabeldescuento_valorDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorDetallePedidoPuntoVenta.setToolTipText("Descuento");
		this.jLabeldescuento_valorDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPaneldescuento_valorDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFielddescuento_valorDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFielddescuento_valorDetallePedidoPuntoVenta.setEnabled(false);
		jTextFielddescuento_valorDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorDetallePedidoPuntoVenta.setText("0.0");

		this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelivaDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelivaDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetallePedidoPuntoVenta.setToolTipText("Iva %");
		this.jLabelivaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelivaDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldivaDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldivaDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldivaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetallePedidoPuntoVenta.setText("0.0");

		this.jButtonivaDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonivaDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonivaDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabeliva_valorDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorDetallePedidoPuntoVenta.setToolTipText("Iva");
		this.jLabeliva_valorDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPaneliva_valorDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldiva_valorDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldiva_valorDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldiva_valorDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorDetallePedidoPuntoVenta.setText("0.0");

		this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeliceDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabeliceDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetallePedidoPuntoVenta.setToolTipText("Ice %");
		this.jLabeliceDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPaneliceDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldiceDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldiceDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldiceDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetallePedidoPuntoVenta.setText("0.0");

		this.jButtoniceDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoniceDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtoniceDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelice_valorDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelice_valorDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorDetallePedidoPuntoVenta.setToolTipText("Ice");
		this.jLabelice_valorDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelice_valorDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldice_valorDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldice_valorDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldice_valorDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorDetallePedidoPuntoVenta.setText("0.0");

		this.jButtonice_valorDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonice_valorDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonice_valorDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelsub_totalDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalDetallePedidoPuntoVenta.setToolTipText("Sub Total");
		this.jLabelsub_totalDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelsub_totalDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldsub_totalDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldsub_totalDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldsub_totalDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalDetallePedidoPuntoVenta.setText("0.0");

		this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabeltotalDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetallePedidoPuntoVenta.setToolTipText("Total");
		this.jLabeltotalDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPaneltotalDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jTextFieldtotalDetallePedidoPuntoVenta= new JTextFieldMe();
		jTextFieldtotalDetallePedidoPuntoVenta.setEnabled(false);
		jTextFieldtotalDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetallePedidoPuntoVenta.setText("0.0");

		this.jButtontotalDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotalDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtontotalDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetallePedidoPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePedidoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelid_empresaDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePedidoPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jComboBoxid_empresaDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePedidoPuntoVenta.setEnabled(false);

		this.jButtonid_empresaDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonid_empresaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonid_empresaDetallePedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoPuntoVenta"));

		this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaDetallePedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoPuntoVentaUpdate"));



					
		this.jLabelid_sucursalDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallePedidoPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jComboBoxid_sucursalDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallePedidoPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalDetallePedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallePedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoPuntoVenta"));

		this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallePedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoPuntoVentaUpdate"));



					
		this.jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA+" : *");
		this.jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta.setToolTipText("Pedido");
		this.jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_punto_ventaDetallePedidoPuntoVenta"));

		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_punto_ventaDetallePedidoPuntoVentaUpdate"));



					
		this.jLabelid_bodegaDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelid_bodegaDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetallePedidoPuntoVenta.setToolTipText("Bodega");
		this.jLabelid_bodegaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_bodegaDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jComboBoxid_bodegaDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_bodegaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonid_bodegaDetallePedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetallePedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoPuntoVenta"));

		this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetallePedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoPuntoVentaUpdate"));



					
		this.jLabelid_productoDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelid_productoDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetallePedidoPuntoVenta.setToolTipText("Producto");
		this.jLabelid_productoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_productoDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jComboBoxid_productoDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_productoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonid_productoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonid_productoDetallePedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetallePedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoPuntoVenta"));

		this.jButtonid_productoDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_productoDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_productoDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetallePedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_productoDetallePedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_productoDetallePedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_productoDetallePedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetallePedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoPuntoVentaUpdate"));



					
		this.jLabelid_unidadDetallePedidoPuntoVenta = new JLabelMe();
		this.jLabelid_unidadDetallePedidoPuntoVenta.setText(""+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetallePedidoPuntoVenta.setToolTipText("Unidad");
		this.jLabelid_unidadDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetallePedidoPuntoVenta.setToolTipText(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		this.jPanelid_unidadDetallePedidoPuntoVenta.setLayout(this.gridaBagLayoutDetallePedidoPuntoVenta);


		jComboBoxid_unidadDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_unidadDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonid_unidadDetallePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonid_unidadDetallePedidoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetallePedidoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoPuntoVenta"));

		this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.setText("U");
		this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoPuntoVentaBusqueda"));

		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetallePedidoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_unidadDetallePedidoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoPuntoVentaUpdate.setText("U");
		this.jButtonid_unidadDetallePedidoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetallePedidoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleDetallePedidoPuntoVenta = new DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedidoPuntoVenta= new GridBagLayout();
		

		
		String sToolTipDetallePedidoPuntoVenta="";
		sToolTipDetallePedidoPuntoVenta=DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedidoPuntoVenta+="(PuntoVenta.DetallePedidoPuntoVenta)";
		}
		
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedidoPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonModificarDetallePedidoPuntoVenta = new JButtonMe();
        this.jButtonActualizarDetallePedidoPuntoVenta = new JButtonMe();
        this.jButtonEliminarDetallePedidoPuntoVenta = new JButtonMe();
        this.jButtonCancelarDetallePedidoPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarDetallePedidoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedidoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido";
		
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePedidoPuntoVenta.setName("jPanelCamposDetallePedidoPuntoVenta"); 

		this.jPanelCamposOcultosDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePedidoPuntoVenta.setName("jPanelCamposOcultosDetallePedidoPuntoVenta"); 

        this.jPanelAccionesDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedidoPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePedidoPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePedidoPuntoVenta.setText("Nuevo");
		this.jButtonModificarDetallePedidoPuntoVenta.setText("Editar");
        this.jButtonActualizarDetallePedidoPuntoVenta.setText("Actualizar");
        this.jButtonEliminarDetallePedidoPuntoVenta.setText("Eliminar");
        this.jButtonCancelarDetallePedidoPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePedidoPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.setText("Guardar");
		this.jButtonCerrarDetallePedidoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedidoPuntoVenta,"nuevo_button","Nuevo",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePedidoPuntoVenta,"modificar_button","Editar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePedidoPuntoVenta,"actualizar_button","Actualizar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePedidoPuntoVenta,"eliminar_button","Eliminar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePedidoPuntoVenta,"cancelar_button","Cancelar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePedidoPuntoVenta,"guardarcambios_button","Guardar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta,"guardarcambiostabla_button","Guardar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedidoPuntoVenta,"cerrar_button","Salir",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePedidoPuntoVenta.setToolTipText("Nuevo"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePedidoPuntoVenta.setToolTipText("Editar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePedidoPuntoVenta.setToolTipText("Actualizar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePedidoPuntoVenta.setToolTipText("Eliminar)"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePedidoPuntoVenta.setToolTipText("Cancelar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePedidoPuntoVenta.setToolTipText("Guardar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.setToolTipText("Guardar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedidoPuntoVenta.setToolTipText("Salir"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedidoPuntoVenta";
		inputMap = this.jButtonNuevoDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedidoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePedidoPuntoVenta";
		inputMap = this.jButtonActualizarDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePedidoPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePedidoPuntoVenta";
		inputMap = this.jButtonEliminarDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePedidoPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePedidoPuntoVenta";
		inputMap = this.jButtonCancelarDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePedidoPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePedidoPuntoVenta";
		inputMap = this.jButtonCerrarDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedidoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedidoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedidoPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePedidoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePedidoPuntoVenta.setToolTipText("Nuevo DetallePedidoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePedidoPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePedidoPuntoVenta.setToolTipText("Sin Cerrar Ventana DetallePedidoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePedidoPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePedidoPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePedidoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesDetallePedidoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePedidoPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePedidoPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePedidoPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePedidoPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePedidoPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposDetallePedidoPuntoVenta.setLayout(gridaBagLayoutCamposDetallePedidoPuntoVenta);
		this.jPanelCamposOcultosDetallePedidoPuntoVenta.setLayout(gridaBagLayoutCamposOcultosDetallePedidoPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallePedidoPuntoVenta.add(jLabelIdDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallePedidoPuntoVenta.add(jLabelidDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallePedidoPuntoVenta.add(jLabelid_empresaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedidoPuntoVenta.add(jButtonid_empresaDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedidoPuntoVenta.add(jButtonid_empresaDetallePedidoPuntoVentaUpdate, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallePedidoPuntoVenta.add(jComboBoxid_empresaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetallePedidoPuntoVenta.add(jLabelid_sucursalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedidoPuntoVenta.add(jButtonid_sucursalDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedidoPuntoVenta.add(jButtonid_sucursalDetallePedidoPuntoVentaUpdate, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetallePedidoPuntoVenta.add(jComboBoxid_sucursalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta.add(jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta.add(jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta.add(jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta.add(jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetallePedidoPuntoVenta.add(jLabelid_bodegaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedidoPuntoVenta.add(jButtonid_bodegaDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedidoPuntoVenta.add(jButtonid_bodegaDetallePedidoPuntoVentaUpdate, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetallePedidoPuntoVenta.add(jComboBoxid_bodegaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetallePedidoPuntoVenta.add(jLabelid_productoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetallePedidoPuntoVenta.add(jButtonid_productoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedidoPuntoVenta.add(jButtonid_productoDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 4;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedidoPuntoVenta.add(jButtonid_productoDetallePedidoPuntoVentaUpdate, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetallePedidoPuntoVenta.add(jComboBoxid_productoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetallePedidoPuntoVenta.add(jLabelid_unidadDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedidoPuntoVenta.add(jButtonid_unidadDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedidoPuntoVenta.add(jButtonid_unidadDetallePedidoPuntoVentaUpdate, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetallePedidoPuntoVenta.add(jComboBoxid_unidadDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieDetallePedidoPuntoVenta.add(jLabelserieDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieDetallePedidoPuntoVenta.add(jButtonserieDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieDetallePedidoPuntoVenta.add(jTextFieldserieDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetallePedidoPuntoVenta.add(jLabelcantidadDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetallePedidoPuntoVenta.add(jButtoncantidadDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetallePedidoPuntoVenta.add(jTextFieldcantidadDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetallePedidoPuntoVenta.add(jLabelprecioDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetallePedidoPuntoVenta.add(jButtonprecioDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetallePedidoPuntoVenta.add(jTextFieldprecioDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetallePedidoPuntoVenta.add(jLabeldescuentoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetallePedidoPuntoVenta.add(jButtondescuentoDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetallePedidoPuntoVenta.add(jTextFielddescuentoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorDetallePedidoPuntoVenta.add(jLabeldescuento_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorDetallePedidoPuntoVenta.add(jButtondescuento_valorDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorDetallePedidoPuntoVenta.add(jTextFielddescuento_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetallePedidoPuntoVenta.add(jLabelivaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetallePedidoPuntoVenta.add(jButtonivaDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetallePedidoPuntoVenta.add(jTextFieldivaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorDetallePedidoPuntoVenta.add(jLabeliva_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorDetallePedidoPuntoVenta.add(jButtoniva_valorDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorDetallePedidoPuntoVenta.add(jTextFieldiva_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetallePedidoPuntoVenta.add(jLabeliceDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetallePedidoPuntoVenta.add(jButtoniceDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetallePedidoPuntoVenta.add(jTextFieldiceDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorDetallePedidoPuntoVenta.add(jLabelice_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorDetallePedidoPuntoVenta.add(jButtonice_valorDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorDetallePedidoPuntoVenta.add(jTextFieldice_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalDetallePedidoPuntoVenta.add(jLabelsub_totalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalDetallePedidoPuntoVenta.add(jButtonsub_totalDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalDetallePedidoPuntoVenta.add(jTextFieldsub_totalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetallePedidoPuntoVenta.add(jLabeltotalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetallePedidoPuntoVenta.add(jButtontotalDetallePedidoPuntoVentaBusqueda, this.gridBagConstraintsDetallePedidoPuntoVenta);
	}

	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetallePedidoPuntoVenta.add(jTextFieldtotalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelidDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelid_bodegaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelid_productoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelid_unidadDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelserieDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelcantidadDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelprecioDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPaneldescuentoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPaneldescuento_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelivaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPaneliva_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPaneliceDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelice_valorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPanelsub_totalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoPuntoVenta.add(this.jPaneltotalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposDetallePedidoPuntoVenta=0;
		iYPanelCamposDetallePedidoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposOcultosDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposOcultosDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoPuntoVenta.add(this.jPanelid_empresaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposOcultosDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposOcultosDetallePedidoPuntoVenta=0;
		iYPanelCamposOcultosDetallePedidoPuntoVenta++;
	}
	this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iYPanelCamposOcultosDetallePedidoPuntoVenta;
	this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iXPanelCamposOcultosDetallePedidoPuntoVenta++;
	this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoPuntoVenta.add(this.jPanelid_sucursalDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);



	if(iXPanelCamposOcultosDetallePedidoPuntoVenta % 1==0) {
		iXPanelCamposOcultosDetallePedidoPuntoVenta=0;
		iYPanelCamposOcultosDetallePedidoPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesDetallePedidoPuntoVenta.setLayout(gridaBagLayoutAccionesDetallePedidoPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePedidoPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioDetallePedidoPuntoVenta);
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedidoPuntoVenta.add(this.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedidoPuntoVenta.add(this.jCheckBoxPostAccionNuevoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedidoPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedidoPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePedidoPuntoVenta.add(this.jButtonModificarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);							

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePedidoPuntoVenta.add(this.jButtonEliminarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
			
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoPuntoVenta.add(this.jButtonActualizarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoPuntoVenta.add(this.jButtonGuardarCambiosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);	
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoPuntoVenta.add(this.jButtonCancelarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedidoPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsDetallePedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedidoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePedidoPuntoVenta = new DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Pedido DATOS");
			
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
		    
			DetallePedidoPuntoVentaModel detallepedidopuntoventaModel=new DetallePedidoPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePedidoPuntoVentaModel.DetallePedidoPuntoVentaFocusTraversalPolicy detallepedidopuntoventaFocusTraversalPolicy = detallepedidopuntoventaModel.new DetallePedidoPuntoVentaFocusTraversalPolicy(this);
			
			//detallepedidopuntoventaFocusTraversalPolicy.setdetallepedidopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallepedidopuntoventaModel);
			
			
			this.jContentPaneDetalleDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePedidoPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleDetallePedidoPuntoVenta.setLayout(gridaBagLayoutDetalleDetallePedidoPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedidoPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePedidoPuntoVenta.add(jTtoolBarDetalleDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta=   new JScrollPane(jContentPaneDetalleDetallePedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleDetallePedidoPuntoVenta.add(jPanelCamposDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);
			
			
			
			
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
						&& detallepedidopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePedidoPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
						this.jContentPaneDetalleDetallePedidoPuntoVenta.add(this.jTabbedPaneRelacionesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePedidoPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsDetallePedidoPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePedidoPuntoVenta.add(jPanelCamposOcultosDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);
				
					this.jPanelCamposOcultosDetallePedidoPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	        this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePedidoPuntoVenta.add(this.jPanelAccionesFormularioDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);							
			
			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePedidoPuntoVenta.add(this.jPanelAccionesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePedidoPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta=   new JScrollPane(this.jPanelCamposDetallePedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePedidoPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			
			
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
			
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePedidoPuntoVenta;
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
