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
import com.bydan.erp.puntoventa.util.DetalleFacturaPuntoVentaConstantesFunciones;

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
public class DetalleFacturaPuntoVentaDetalleFormJInternalFrame extends DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleFacturaPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleDetalleFacturaPuntoVenta;
	
	protected JMenu jmenuDetalleDetalleFacturaPuntoVenta;
	protected JMenu jmenuDetalleArchivoDetalleFacturaPuntoVenta;
	protected JMenu jmenuDetalleAccionesDetalleFacturaPuntoVenta;
	protected JMenu jmenuDetalleDatosDetalleFacturaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFacturaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsDetalleFacturaPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleFacturaPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_facturapuntoventa="";

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
	
	public DetalleFacturaPuntoVentaSessionBean detallefacturapuntoventaSessionBean;
	
	
	
	
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public DetalleFacturaPuntoVentaLogic detallefacturapuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionDetalleFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralDetalleFacturaPuntoVenta;
	
	protected JPanel jPanelCamposDetalleFacturaPuntoVenta;    
	protected JPanel jPanelCamposOcultosDetalleFacturaPuntoVenta;    	
	protected JPanel jPanelAccionesDetalleFacturaPuntoVenta;
	protected JPanel jPanelAccionesFormularioDetalleFacturaPuntoVenta;
    
	
	
	protected Integer iXPanelCamposDetalleFacturaPuntoVenta=0;
	protected Integer iYPanelCamposDetalleFacturaPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosDetalleFacturaPuntoVenta=0;
	protected Integer iYPanelCamposOcultosDetalleFacturaPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleFacturaPuntoVenta;
	public JButton jButtonModificarDetalleFacturaPuntoVenta;
	public JButton jButtonActualizarDetalleFacturaPuntoVenta;
    public JButton jButtonEliminarDetalleFacturaPuntoVenta;
	public JButton jButtonCancelarDetalleFacturaPuntoVenta;
    public JButton jButtonGuardarCambiosDetalleFacturaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta;
	protected JButton jButtonCerrarDetalleFacturaPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionDetalleFacturaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleFacturaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleFacturaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleFacturaPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonModificarToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonActualizarToolBarDetalleFacturaPuntoVenta;
    protected JButton jButtonEliminarToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonCancelarToolBarDetalleFacturaPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonCerrarToolBarDetalleFacturaPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleFacturaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemModificarDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemActualizarDetalleFacturaPuntoVenta;
    protected JMenuItem jMenuItemEliminarDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemCancelarDetalleFacturaPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemCerrarDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFacturaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFacturaPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFacturaPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleFacturaPuntoVenta;
	public JLabel jLabelIdDetalleFacturaPuntoVenta;
	public JLabel jLabelidDetalleFacturaPuntoVenta;
	public JButton jButtonidDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelserieDetalleFacturaPuntoVenta;
	public JLabel jLabelserieDetalleFacturaPuntoVenta;
	public JTextField jTextFieldserieDetalleFacturaPuntoVenta;
	public JButton jButtonserieDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleFacturaPuntoVenta;
	public JLabel jLabelcantidadDetalleFacturaPuntoVenta;
	public JTextField jTextFieldcantidadDetalleFacturaPuntoVenta;
	public JButton jButtoncantidadDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetalleFacturaPuntoVenta;
	public JLabel jLabelprecioDetalleFacturaPuntoVenta;
	public JTextField jTextFieldprecioDetalleFacturaPuntoVenta;
	public JButton jButtonprecioDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleFacturaPuntoVenta;
	public JLabel jLabeldescuentoDetalleFacturaPuntoVenta;
	public JTextField jTextFielddescuentoDetalleFacturaPuntoVenta;
	public JButton jButtondescuentoDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorDetalleFacturaPuntoVenta;
	public JLabel jLabeldescuento_valorDetalleFacturaPuntoVenta;
	public JTextField jTextFielddescuento_valorDetalleFacturaPuntoVenta;
	public JButton jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleFacturaPuntoVenta;
	public JLabel jLabelivaDetalleFacturaPuntoVenta;
	public JTextField jTextFieldivaDetalleFacturaPuntoVenta;
	public JButton jButtonivaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorDetalleFacturaPuntoVenta;
	public JLabel jLabeliva_valorDetalleFacturaPuntoVenta;
	public JTextField jTextFieldiva_valorDetalleFacturaPuntoVenta;
	public JButton jButtoniva_valorDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneliceDetalleFacturaPuntoVenta;
	public JLabel jLabeliceDetalleFacturaPuntoVenta;
	public JTextField jTextFieldiceDetalleFacturaPuntoVenta;
	public JButton jButtoniceDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelice_valorDetalleFacturaPuntoVenta;
	public JLabel jLabelice_valorDetalleFacturaPuntoVenta;
	public JTextField jTextFieldice_valorDetalleFacturaPuntoVenta;
	public JButton jButtonice_valorDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalDetalleFacturaPuntoVenta;
	public JLabel jLabelsub_totalDetalleFacturaPuntoVenta;
	public JTextField jTextFieldsub_totalDetalleFacturaPuntoVenta;
	public JButton jButtonsub_totalDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetalleFacturaPuntoVenta;
	public JLabel jLabeltotalDetalleFacturaPuntoVenta;
	public JTextField jTextFieldtotalDetalleFacturaPuntoVenta;
	public JButton jButtontotalDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleFacturaPuntoVenta;
	public JLabel jLabeldescripcionDetalleFacturaPuntoVenta;
	public JTextArea jTextAreadescripcionDetalleFacturaPuntoVenta;
	public JScrollPane jscrollPanedescripcionDetalleFacturaPuntoVenta;
	public JButton jButtondescripcionDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta;
	public JLabel jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta;
	public JButton jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleFacturaPuntoVenta;
	public JLabel jLabelid_empresaDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleFacturaPuntoVenta;
	public JButton jButtonid_empresaDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleFacturaPuntoVenta;
	public JLabel jLabelid_sucursalDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleFacturaPuntoVenta;
	public JButton jButtonid_sucursalDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleFacturaPuntoVenta;
	public JLabel jLabelid_bodegaDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleFacturaPuntoVenta;
	public JButton jButtonid_bodegaDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_bodegaDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleFacturaPuntoVenta;
	public JLabel jLabelid_productoDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleFacturaPuntoVenta;
	public JButton jButtonid_productoDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_productoDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleFacturaPuntoVenta;
	public JLabel jLabelid_unidadDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleFacturaPuntoVenta;
	public JButton jButtonid_unidadDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_unidadDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleFacturaPuntoVenta;
	
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
	
	public DetalleFacturaPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleFacturaPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioDetalleFacturaPuntoVenta=new JPanel();
				this.jmenuBarDetalleDetalleFacturaPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleDetalleFacturaPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleFacturaPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleFacturaPuntoVenta() {
		return this.jButtonActualizarToolBarDetalleFacturaPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarDetalleFacturaPuntoVenta() {
		return this.jButtonEliminarToolBarDetalleFacturaPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarDetalleFacturaPuntoVenta() {
		return this.jButtonCancelarToolBarDetalleFacturaPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleFacturaPuntoVenta() {
		return this.jButtonProcesarInformacionDetalleFacturaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFacturaPuntoVenta)	{
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta = jButtonProcesarInformacionDetalleFacturaPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta = jComboBoxTiposRelacionesDetalleFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta = jComboBoxTiposAccionesDetalleFacturaPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta = jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
		
		this.detallefacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFacturaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Factura MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleFacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleFacturaPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleFacturaPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarDetalleFacturaPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleDetalleFacturaPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleDetalleFacturaPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleDetalleFacturaPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleDetalleFacturaPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleFacturaPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleFacturaPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleFacturaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleFacturaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleFacturaPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFacturaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFacturaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFacturaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleFacturaPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleFacturaPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleFacturaPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleFacturaPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleFacturaPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleFacturaPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleFacturaPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleFacturaPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleFacturaPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleFacturaPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleFacturaPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleFacturaPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleFacturaPuntoVenta.add(this.jMenuItemDetalleCerrarDetalleFacturaPuntoVenta);
		
		this.jmenuDetalleAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemActualizarDetalleFacturaPuntoVenta);
		this.jmenuDetalleAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemEliminarDetalleFacturaPuntoVenta);
		this.jmenuDetalleAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemCancelarDetalleFacturaPuntoVenta);		
		
		//this.jmenuDetalleDatosDetalleFacturaPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta);				
		this.jmenuDetalleDatosDetalleFacturaPuntoVenta.add(this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta);				
				
		//this.jmenuDetalleAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleFacturaPuntoVenta.add(this.jmenuDetalleArchivoDetalleFacturaPuntoVenta);		
		this.jmenuBarDetalleDetalleFacturaPuntoVenta.add(this.jmenuDetalleAccionesDetalleFacturaPuntoVenta);		
		this.jmenuBarDetalleDetalleFacturaPuntoVenta.add(this.jmenuDetalleDatosDetalleFacturaPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleFacturaPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposDetalleFacturaPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleFacturaPuntoVenta = new JLabelMe();
		jLabelIdDetalleFacturaPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleFacturaPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleFacturaPuntoVenta= new GridBagLayout();

		this.jPanelidDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);

		jLabelidDetalleFacturaPuntoVenta = new JLabel();
		jLabelidDetalleFacturaPuntoVenta.setText("Id");

		jLabelidDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelserieDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelserieDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE+" :");
		this.jLabelserieDetalleFacturaPuntoVenta.setToolTipText("Serie");
		this.jLabelserieDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelserieDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldserieDetalleFacturaPuntoVenta= new JTextFieldMe();

		jTextFieldserieDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldserieDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonserieDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonserieDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelcantidadDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleFacturaPuntoVenta.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelcantidadDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldcantidadDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldcantidadDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldcantidadDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleFacturaPuntoVenta.setText("0");

		this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelprecioDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetalleFacturaPuntoVenta.setToolTipText("Precio");
		this.jLabelprecioDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelprecioDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldprecioDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldprecioDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldprecioDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtonprecioDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonprecioDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonprecioDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabeldescuentoDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleFacturaPuntoVenta.setToolTipText("Descuento %");
		this.jLabeldescuentoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPaneldescuentoDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFielddescuentoDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFielddescuentoDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFielddescuentoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabeldescuento_valorDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorDetalleFacturaPuntoVenta.setToolTipText("Descuento");
		this.jLabeldescuento_valorDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPaneldescuento_valorDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFielddescuento_valorDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFielddescuento_valorDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFielddescuento_valorDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelivaDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleFacturaPuntoVenta.setToolTipText("Iva %");
		this.jLabelivaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelivaDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldivaDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldivaDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldivaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtonivaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonivaDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonivaDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabeliva_valorDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorDetalleFacturaPuntoVenta.setToolTipText("Iva");
		this.jLabeliva_valorDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPaneliva_valorDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldiva_valorDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldiva_valorDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldiva_valorDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeliceDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabeliceDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetalleFacturaPuntoVenta.setToolTipText("Ice %");
		this.jLabeliceDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPaneliceDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldiceDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldiceDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldiceDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtoniceDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtoniceDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtoniceDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelice_valorDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelice_valorDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorDetalleFacturaPuntoVenta.setToolTipText("Ice");
		this.jLabelice_valorDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelice_valorDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldice_valorDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldice_valorDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldice_valorDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelsub_totalDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalDetalleFacturaPuntoVenta.setToolTipText("Sub Total");
		this.jLabelsub_totalDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelsub_totalDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldsub_totalDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldsub_totalDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldsub_totalDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabeltotalDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetalleFacturaPuntoVenta.setToolTipText("Total");
		this.jLabeltotalDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPaneltotalDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextFieldtotalDetalleFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldtotalDetalleFacturaPuntoVenta.setEnabled(false);
		jTextFieldtotalDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetalleFacturaPuntoVenta.setText("0.0");

		this.jButtontotalDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotalDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtontotalDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabeldescripcionDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleFacturaPuntoVenta.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPaneldescripcionDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jTextAreadescripcionDetalleFacturaPuntoVenta= new JTextAreaMe();
		jTextAreadescripcionDetalleFacturaPuntoVenta.setEnabled(false);
		jTextAreadescripcionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFacturaPuntoVenta.setLineWrap(true);
		jTextAreadescripcionDetalleFacturaPuntoVenta.setWrapStyleWord(true);
		jTextAreadescripcionDetalleFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleFacturaPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleFacturaPuntoVenta = new JScrollPane(jTextAreadescripcionDetalleFacturaPuntoVenta);
		jscrollPanedescripcionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleFacturaPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA+" : *");
		this.jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta.setToolTipText("Factura");
		this.jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaDetalleFacturaPuntoVenta"));

		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaDetalleFacturaPuntoVentaUpdate"));



					
		this.jLabelid_empresaDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_empresaDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleFacturaPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jComboBoxid_empresaDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleFacturaPuntoVenta.setEnabled(false);

		this.jButtonid_empresaDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_empresaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_empresaDetalleFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturaPuntoVenta"));

		this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturaPuntoVentaUpdate"));



					
		this.jLabelid_sucursalDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleFacturaPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jComboBoxid_sucursalDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalDetalleFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFacturaPuntoVenta"));

		this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFacturaPuntoVentaUpdate"));



					
		this.jLabelid_bodegaDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_bodegaDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleFacturaPuntoVenta.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_bodegaDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jComboBoxid_bodegaDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_bodegaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_bodegaDetalleFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFacturaPuntoVenta"));

		this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFacturaPuntoVentaUpdate"));



					
		this.jLabelid_productoDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_productoDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleFacturaPuntoVenta.setToolTipText("Producto");
		this.jLabelid_productoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_productoDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jComboBoxid_productoDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_productoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_productoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_productoDetalleFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFacturaPuntoVenta"));

		this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_productoDetalleFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_productoDetalleFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFacturaPuntoVentaUpdate"));



					
		this.jLabelid_unidadDetalleFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_unidadDetalleFacturaPuntoVenta.setText(""+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleFacturaPuntoVenta.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleFacturaPuntoVenta.setToolTipText(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_unidadDetalleFacturaPuntoVenta.setLayout(this.gridaBagLayoutDetalleFacturaPuntoVenta);


		jComboBoxid_unidadDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_unidadDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_unidadDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_unidadDetalleFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFacturaPuntoVenta"));

		this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFacturaPuntoVentaBusqueda"));

		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFacturaPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleDetalleFacturaPuntoVenta = new DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFacturaPuntoVenta= new GridBagLayout();
		

		
		String sToolTipDetalleFacturaPuntoVenta="";
		sToolTipDetalleFacturaPuntoVenta=DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFacturaPuntoVenta+="(PuntoVenta.DetalleFacturaPuntoVenta)";
		}
		
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFacturaPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonModificarDetalleFacturaPuntoVenta = new JButtonMe();
        this.jButtonActualizarDetalleFacturaPuntoVenta = new JButtonMe();
        this.jButtonEliminarDetalleFacturaPuntoVenta = new JButtonMe();
        this.jButtonCancelarDetalleFacturaPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarDetalleFacturaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFacturaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Factura";
		
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleFacturaPuntoVenta.setName("jPanelCamposDetalleFacturaPuntoVenta"); 

		this.jPanelCamposOcultosDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleFacturaPuntoVenta.setName("jPanelCamposOcultosDetalleFacturaPuntoVenta"); 

        this.jPanelAccionesDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFacturaPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleFacturaPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleFacturaPuntoVenta.setText("Nuevo");
		this.jButtonModificarDetalleFacturaPuntoVenta.setText("Editar");
        this.jButtonActualizarDetalleFacturaPuntoVenta.setText("Actualizar");
        this.jButtonEliminarDetalleFacturaPuntoVenta.setText("Eliminar");
        this.jButtonCancelarDetalleFacturaPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleFacturaPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.setText("Guardar");
		this.jButtonCerrarDetalleFacturaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFacturaPuntoVenta,"nuevo_button","Nuevo",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleFacturaPuntoVenta,"modificar_button","Editar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleFacturaPuntoVenta,"actualizar_button","Actualizar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleFacturaPuntoVenta,"eliminar_button","Eliminar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleFacturaPuntoVenta,"cancelar_button","Cancelar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleFacturaPuntoVenta,"guardarcambios_button","Guardar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta,"guardarcambiostabla_button","Guardar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFacturaPuntoVenta,"cerrar_button","Salir",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleFacturaPuntoVenta.setToolTipText("Nuevo"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleFacturaPuntoVenta.setToolTipText("Editar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleFacturaPuntoVenta.setToolTipText("Actualizar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleFacturaPuntoVenta.setToolTipText("Eliminar)"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleFacturaPuntoVenta.setToolTipText("Cancelar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleFacturaPuntoVenta.setToolTipText("Guardar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.setToolTipText("Guardar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFacturaPuntoVenta.setToolTipText("Salir"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFacturaPuntoVenta";
		inputMap = this.jButtonNuevoDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFacturaPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonActualizarDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleFacturaPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonEliminarDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleFacturaPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonCancelarDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleFacturaPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonCerrarDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFacturaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFacturaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFacturaPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleFacturaPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleFacturaPuntoVenta.setToolTipText("Nuevo DetalleFacturaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleFacturaPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleFacturaPuntoVenta.setToolTipText("Sin Cerrar Ventana DetalleFacturaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleFacturaPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleFacturaPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleFacturaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesDetalleFacturaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleFacturaPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleFacturaPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleFacturaPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleFacturaPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleFacturaPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutCamposDetalleFacturaPuntoVenta);
		this.jPanelCamposOcultosDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutCamposOcultosDetalleFacturaPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleFacturaPuntoVenta.add(jLabelIdDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleFacturaPuntoVenta.add(jLabelidDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta.add(jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta.add(jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta.add(jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta.add(jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleFacturaPuntoVenta.add(jLabelid_empresaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFacturaPuntoVenta.add(jButtonid_empresaDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFacturaPuntoVenta.add(jButtonid_empresaDetalleFacturaPuntoVentaUpdate, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleFacturaPuntoVenta.add(jComboBoxid_empresaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleFacturaPuntoVenta.add(jLabelid_sucursalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleFacturaPuntoVenta.add(jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleFacturaPuntoVenta.add(jButtonid_sucursalDetalleFacturaPuntoVentaUpdate, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleFacturaPuntoVenta.add(jComboBoxid_sucursalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleFacturaPuntoVenta.add(jLabelid_bodegaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleFacturaPuntoVenta.add(jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleFacturaPuntoVenta.add(jButtonid_bodegaDetalleFacturaPuntoVentaUpdate, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleFacturaPuntoVenta.add(jComboBoxid_bodegaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleFacturaPuntoVenta.add(jLabelid_productoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleFacturaPuntoVenta.add(jButtonid_productoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleFacturaPuntoVenta.add(jButtonid_productoDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 4;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleFacturaPuntoVenta.add(jButtonid_productoDetalleFacturaPuntoVentaUpdate, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleFacturaPuntoVenta.add(jComboBoxid_productoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleFacturaPuntoVenta.add(jLabelid_unidadDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleFacturaPuntoVenta.add(jButtonid_unidadDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleFacturaPuntoVenta.add(jButtonid_unidadDetalleFacturaPuntoVentaUpdate, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleFacturaPuntoVenta.add(jComboBoxid_unidadDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieDetalleFacturaPuntoVenta.add(jLabelserieDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieDetalleFacturaPuntoVenta.add(jButtonserieDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieDetalleFacturaPuntoVenta.add(jTextFieldserieDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleFacturaPuntoVenta.add(jLabelcantidadDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleFacturaPuntoVenta.add(jButtoncantidadDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleFacturaPuntoVenta.add(jTextFieldcantidadDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetalleFacturaPuntoVenta.add(jLabelprecioDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetalleFacturaPuntoVenta.add(jButtonprecioDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetalleFacturaPuntoVenta.add(jTextFieldprecioDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleFacturaPuntoVenta.add(jLabeldescuentoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleFacturaPuntoVenta.add(jButtondescuentoDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleFacturaPuntoVenta.add(jTextFielddescuentoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorDetalleFacturaPuntoVenta.add(jLabeldescuento_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorDetalleFacturaPuntoVenta.add(jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorDetalleFacturaPuntoVenta.add(jTextFielddescuento_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleFacturaPuntoVenta.add(jLabelivaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleFacturaPuntoVenta.add(jButtonivaDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleFacturaPuntoVenta.add(jTextFieldivaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorDetalleFacturaPuntoVenta.add(jLabeliva_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorDetalleFacturaPuntoVenta.add(jButtoniva_valorDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorDetalleFacturaPuntoVenta.add(jTextFieldiva_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetalleFacturaPuntoVenta.add(jLabeliceDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetalleFacturaPuntoVenta.add(jButtoniceDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetalleFacturaPuntoVenta.add(jTextFieldiceDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorDetalleFacturaPuntoVenta.add(jLabelice_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorDetalleFacturaPuntoVenta.add(jButtonice_valorDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorDetalleFacturaPuntoVenta.add(jTextFieldice_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalDetalleFacturaPuntoVenta.add(jLabelsub_totalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalDetalleFacturaPuntoVenta.add(jButtonsub_totalDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalDetalleFacturaPuntoVenta.add(jTextFieldsub_totalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetalleFacturaPuntoVenta.add(jLabeltotalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetalleFacturaPuntoVenta.add(jButtontotalDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetalleFacturaPuntoVenta.add(jTextFieldtotalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleFacturaPuntoVenta.add(jLabeldescripcionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleFacturaPuntoVenta.add(jButtondescripcionDetalleFacturaPuntoVentaBusqueda, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	}

	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleFacturaPuntoVenta.add(jscrollPanedescripcionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelidDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelid_bodegaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelid_productoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelid_unidadDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelserieDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelcantidadDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelprecioDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPaneldescuentoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPaneldescuento_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelivaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPaneliva_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPaneliceDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelice_valorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPanelsub_totalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPaneltotalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaPuntoVenta.add(this.jPaneldescripcionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposDetalleFacturaPuntoVenta=0;
		iYPanelCamposDetalleFacturaPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposOcultosDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposOcultosDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFacturaPuntoVenta.add(this.jPanelid_empresaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposOcultosDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposOcultosDetalleFacturaPuntoVenta=0;
		iYPanelCamposOcultosDetalleFacturaPuntoVenta++;
	}
	this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iYPanelCamposOcultosDetalleFacturaPuntoVenta;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iXPanelCamposOcultosDetalleFacturaPuntoVenta++;
	this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFacturaPuntoVenta.add(this.jPanelid_sucursalDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);



	if(iXPanelCamposOcultosDetalleFacturaPuntoVenta % 1==0) {
		iXPanelCamposOcultosDetalleFacturaPuntoVenta=0;
		iYPanelCamposOcultosDetalleFacturaPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesDetalleFacturaPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioDetalleFacturaPuntoVenta);
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFacturaPuntoVenta.add(this.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFacturaPuntoVenta.add(this.jCheckBoxPostAccionNuevoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleFacturaPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleFacturaPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleFacturaPuntoVenta.add(this.jButtonModificarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);							

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleFacturaPuntoVenta.add(this.jButtonEliminarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
			
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturaPuntoVenta.add(this.jButtonActualizarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturaPuntoVenta.add(this.jButtonGuardarCambiosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);	
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturaPuntoVenta.add(this.jButtonCancelarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFacturaPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleFacturaPuntoVenta = new DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Factura DATOS");
			
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
		    
			DetalleFacturaPuntoVentaModel detallefacturapuntoventaModel=new DetalleFacturaPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleFacturaPuntoVentaModel.DetalleFacturaPuntoVentaFocusTraversalPolicy detallefacturapuntoventaFocusTraversalPolicy = detallefacturapuntoventaModel.new DetalleFacturaPuntoVentaFocusTraversalPolicy(this);
			
			//detallefacturapuntoventaFocusTraversalPolicy.setdetallefacturapuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallefacturapuntoventaModel);
			
			
			this.jContentPaneDetalleDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleFacturaPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutDetalleDetalleFacturaPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFacturaPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleFacturaPuntoVenta.add(jTtoolBarDetalleDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta=   new JScrollPane(jContentPaneDetalleDetalleFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleDetalleFacturaPuntoVenta.add(jPanelCamposDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);
			
			
			
			
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
						&& detallefacturapuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleFacturaPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
						this.jContentPaneDetalleDetalleFacturaPuntoVenta.add(this.jTabbedPaneRelacionesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleFacturaPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsDetalleFacturaPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleFacturaPuntoVenta.add(jPanelCamposOcultosDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);
				
					this.jPanelCamposOcultosDetalleFacturaPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	        this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleFacturaPuntoVenta.add(this.jPanelAccionesFormularioDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);							
			
			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleFacturaPuntoVenta.add(this.jPanelAccionesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleFacturaPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta=   new JScrollPane(this.jPanelCamposDetalleFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			
			
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
			
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleFacturaPuntoVenta;
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
