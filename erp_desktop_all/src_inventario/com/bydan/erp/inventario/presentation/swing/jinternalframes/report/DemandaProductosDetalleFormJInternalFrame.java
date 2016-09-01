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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.DemandaProductosConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class DemandaProductosDetalleFormJInternalFrame extends DemandaProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDemandaProductos;
	
	protected JMenuBar jmenuBarDetalleDemandaProductos;
	
	protected JMenu jmenuDetalleDemandaProductos;
	protected JMenu jmenuDetalleArchivoDemandaProductos;
	protected JMenu jmenuDetalleAccionesDemandaProductos;
	protected JMenu jmenuDetalleDatosDemandaProductos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDemandaProductos;	
	protected GridBagConstraints gridBagConstraintsDemandaProductos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DemandaProductosBeanSwingJInternalFrameAdditional jInternalFrameDetalleDemandaProductos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public DemandaProductosSessionBean demandaproductosSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public DemandaProductosLogic demandaproductosLogic;
	
	public JScrollPane jScrollPanelDatosDemandaProductos;
	public JScrollPane jScrollPanelDatosEdicionDemandaProductos;
	public JScrollPane jScrollPanelDatosGeneralDemandaProductos;
	
	protected JPanel jPanelCamposDemandaProductos;    
	protected JPanel jPanelCamposOcultosDemandaProductos;    	
	protected JPanel jPanelAccionesDemandaProductos;
	protected JPanel jPanelAccionesFormularioDemandaProductos;
    
	
	
	protected Integer iXPanelCamposDemandaProductos=0;
	protected Integer iYPanelCamposDemandaProductos=0;
	
	protected Integer iXPanelCamposOcultosDemandaProductos=0;
	protected Integer iYPanelCamposOcultosDemandaProductos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDemandaProductos;
	public JButton jButtonModificarDemandaProductos;
	public JButton jButtonActualizarDemandaProductos;
    public JButton jButtonEliminarDemandaProductos;
	public JButton jButtonCancelarDemandaProductos;
    public JButton jButtonGuardarCambiosDemandaProductos;
	public JButton jButtonGuardarCambiosTablaDemandaProductos;
	protected JButton jButtonCerrarDemandaProductos;
	
	
	protected JButton jButtonProcesarInformacionDemandaProductos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDemandaProductos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDemandaProductos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDemandaProductos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDemandaProductos;
	protected JButton jButtonModificarToolBarDemandaProductos;
	protected JButton jButtonActualizarToolBarDemandaProductos;
    protected JButton jButtonEliminarToolBarDemandaProductos;
	protected JButton jButtonCancelarToolBarDemandaProductos;
    protected JButton jButtonGuardarCambiosToolBarDemandaProductos;
	protected JButton jButtonGuardarCambiosTablaToolBarDemandaProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarDemandaProductos;
	protected JButton jButtonCerrarToolBarDemandaProductos;
	
	protected JButton jButtonProcesarInformacionToolBarDemandaProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDemandaProductos;
	protected JMenuItem jMenuItemModificarDemandaProductos;
	protected JMenuItem jMenuItemActualizarDemandaProductos;
    protected JMenuItem jMenuItemEliminarDemandaProductos;
	protected JMenuItem jMenuItemCancelarDemandaProductos;
    protected JMenuItem jMenuItemGuardarCambiosDemandaProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaDemandaProductos;
	protected JMenuItem jMenuItemCerrarDemandaProductos;
	protected JMenuItem jMenuItemDetalleCerrarDemandaProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarDemandaProductos;
	
	protected JMenuItem jMenuItemProcesarInformacionDemandaProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDemandaProductos;
	protected JMenuItem jMenuItemMostrarOcultarDemandaProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDemandaProductos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDemandaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDemandaProductos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDemandaProductos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDemandaProductos;
	public JLabel jLabelIdDemandaProductos;
	public JLabel jLabelidDemandaProductos;
	public JButton jButtonidDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_venta_hastaDemandaProductos;
	public JLabel jLabelfecha_ultima_venta_hastaDemandaProductos;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaDemandaProductos;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaDemandaProductos;
	public JButton jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDemandaProductos;
	public JLabel jLabelcodigoDemandaProductos;
	public JTextArea jTextAreacodigoDemandaProductos;
	public JScrollPane jscrollPanecodigoDemandaProductos;
	public JButton jButtoncodigoDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadDemandaProductos;
	public JLabel jLabelnombre_unidadDemandaProductos;
	public JTextField jTextFieldnombre_unidadDemandaProductos;
	public JButton jButtonnombre_unidadDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleDemandaProductos;
	public JLabel jLabelcantidad_disponibleDemandaProductos;
	public JTextField jTextFieldcantidad_disponibleDemandaProductos;
	public JButton jButtoncantidad_disponibleDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelstock_minimoDemandaProductos;
	public JLabel jLabelstock_minimoDemandaProductos;
	public JTextField jTextFieldstock_minimoDemandaProductos;
	public JButton jButtonstock_minimoDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoDemandaProductos;
	public JLabel jLabelcodigo_productoDemandaProductos;
	public JTextField jTextFieldcodigo_productoDemandaProductos;
	public JButton jButtoncodigo_productoDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombreDemandaProductos;
	public JLabel jLabelnombreDemandaProductos;
	public JTextArea jTextAreanombreDemandaProductos;
	public JScrollPane jscrollPanenombreDemandaProductos;
	public JButton jButtonnombreDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPaneldem_triDemandaProductos;
	public JLabel jLabeldem_triDemandaProductos;
	public JTextField jTextFielddem_triDemandaProductos;
	public JButton jButtondem_triDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPaneldem_biDemandaProductos;
	public JLabel jLabeldem_biDemandaProductos;
	public JTextField jTextFielddem_biDemandaProductos;
	public JButton jButtondem_biDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPaneldem_menDemandaProductos;
	public JLabel jLabeldem_menDemandaProductos;
	public JTextField jTextFielddem_menDemandaProductos;
	public JButton jButtondem_menDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelingresosDemandaProductos;
	public JLabel jLabelingresosDemandaProductos;
	public JTextField jTextFieldingresosDemandaProductos;
	public JButton jButtoningresosDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelegresosDemandaProductos;
	public JLabel jLabelegresosDemandaProductos;
	public JTextField jTextFieldegresosDemandaProductos;
	public JButton jButtonegresosDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelexistenciaDemandaProductos;
	public JLabel jLabelexistenciaDemandaProductos;
	public JTextField jTextFieldexistenciaDemandaProductos;
	public JButton jButtonexistenciaDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelcostoDemandaProductos;
	public JLabel jLabelcostoDemandaProductos;
	public JTextField jTextFieldcostoDemandaProductos;
	public JButton jButtoncostoDemandaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaDemandaProductos;
	public JLabel jLabelid_bodegaDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDemandaProductos;
	public JButton jButtonid_bodegaDemandaProductos= new JButtonMe();
	public JButton jButtonid_bodegaDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDemandaProductos;
	public JLabel jLabelid_productoDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDemandaProductos;
	public JButton jButtonid_productoDemandaProductos= new JButtonMe();
	public JButton jButtonid_productoDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDemandaProductos;
	public JLabel jLabelid_empresaDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDemandaProductos;
	public JButton jButtonid_empresaDemandaProductos= new JButtonMe();
	public JButton jButtonid_empresaDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_empresaDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDemandaProductos;
	public JLabel jLabelid_sucursalDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDemandaProductos;
	public JButton jButtonid_sucursalDemandaProductos= new JButtonMe();
	public JButton jButtonid_sucursalDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaDemandaProductos;
	public JLabel jLabelid_lineaDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaDemandaProductos;
	public JButton jButtonid_lineaDemandaProductos= new JButtonMe();
	public JButton jButtonid_lineaDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoDemandaProductos;
	public JLabel jLabelid_linea_grupoDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoDemandaProductos;
	public JButton jButtonid_linea_grupoDemandaProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaDemandaProductos;
	public JLabel jLabelid_linea_categoriaDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaDemandaProductos;
	public JButton jButtonid_linea_categoriaDemandaProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaDemandaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaDemandaProductos;
	public JLabel jLabelid_linea_marcaDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaDemandaProductos;
	public JButton jButtonid_linea_marcaDemandaProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaDemandaProductosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDemandaProductos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=535;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DemandaProductosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDemandaProductos=new JPanel();
				this.jPanelAccionesFormularioDemandaProductos=new JPanel();
				this.jmenuBarDetalleDemandaProductos=new JMenuBar();
				this.jTtoolBarDetalleDemandaProductos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DemandaProductosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DemandaProductosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DemandaProductosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DemandaProductosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DemandaProductosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDemandaProductos() {
		return this.jButtonActualizarToolBarDemandaProductos;
	}
	
	public JButton getjButtonEliminarToolBarDemandaProductos() {
		return this.jButtonEliminarToolBarDemandaProductos;
	}
	
	public JButton getjButtonCancelarToolBarDemandaProductos() {
		return this.jButtonCancelarToolBarDemandaProductos;
	}		
	
	public JButton getjButtonProcesarInformacionDemandaProductos() {
		return this.jButtonProcesarInformacionDemandaProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDemandaProductos)	{
		this.jButtonProcesarInformacionDemandaProductos = jButtonProcesarInformacionDemandaProductos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDemandaProductos() {
		return this.jComboBoxTiposAccionesDemandaProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDemandaProductos(
			JComboBox jComboBoxTiposRelacionesDemandaProductos) {
		this.jComboBoxTiposRelacionesDemandaProductos = jComboBoxTiposRelacionesDemandaProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDemandaProductos(
			JComboBox jComboBoxTiposAccionesDemandaProductos) {
		this.jComboBoxTiposAccionesDemandaProductos = jComboBoxTiposAccionesDemandaProductos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDemandaProductos() {
		return this.jComboBoxTiposAccionesFormularioDemandaProductos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDemandaProductos(
			JComboBox jComboBoxTiposAccionesFormularioDemandaProductos) {
		this.jComboBoxTiposAccionesFormularioDemandaProductos = jComboBoxTiposAccionesFormularioDemandaProductos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.demandaproductosSessionBean=new DemandaProductosSessionBean();
		
		this.demandaproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.demandaproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.demandaproductosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DemandaProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DemandaProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DemandaProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Demanda Productos MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
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
	
		DemandaProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDemandaProductos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDemandaProductos=new JButtonMe();
				this.jButtonModificarToolBarDemandaProductos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDemandaProductos,this.jTtoolBarDetalleDemandaProductos,
							"actualizar","actualizar","Actualizar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDemandaProductos,this.jTtoolBarDetalleDemandaProductos,
							"eliminar","eliminar","Eliminar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDemandaProductos,this.jTtoolBarDetalleDemandaProductos,
							"cancelar","cancelar","Cancelar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDemandaProductos,this.jTtoolBarDetalleDemandaProductos,
							"guardarcambios","guardarcambios","Guardar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDemandaProductos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDemandaProductos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDemandaProductos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDemandaProductos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDemandaProductos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDemandaProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDemandaProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDemandaProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDemandaProductos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDemandaProductos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDemandaProductos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDemandaProductos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDemandaProductos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDemandaProductos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDemandaProductos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDemandaProductos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDemandaProductos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDemandaProductos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDemandaProductos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDemandaProductos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDemandaProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDemandaProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDemandaProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDemandaProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDemandaProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDemandaProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDemandaProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDemandaProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDemandaProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDemandaProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDemandaProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDemandaProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDemandaProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDemandaProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDemandaProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDemandaProductos.add(this.jMenuItemDetalleCerrarDemandaProductos);
		
		this.jmenuDetalleAccionesDemandaProductos.add(this.jMenuItemActualizarDemandaProductos);
		this.jmenuDetalleAccionesDemandaProductos.add(this.jMenuItemEliminarDemandaProductos);
		this.jmenuDetalleAccionesDemandaProductos.add(this.jMenuItemCancelarDemandaProductos);		
		
		//this.jmenuDetalleDatosDemandaProductos.add(this.jMenuItemDetalleAbrirOrderByDemandaProductos);				
		this.jmenuDetalleDatosDemandaProductos.add(this.jMenuItemDetalleMostarOcultarDemandaProductos);				
				
		//this.jmenuDetalleAccionesDemandaProductos.add(this.jMenuItemGuardarCambiosDemandaProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDemandaProductos.add(this.jmenuDetalleArchivoDemandaProductos);		
		this.jmenuBarDetalleDemandaProductos.add(this.jmenuDetalleAccionesDemandaProductos);		
		this.jmenuBarDetalleDemandaProductos.add(this.jmenuDetalleDatosDemandaProductos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDemandaProductos);				
	}
	
	
	public void inicializarElementosCamposDemandaProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDemandaProductos = new JLabelMe();
		jLabelIdDemandaProductos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDemandaProductos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDemandaProductos= new GridBagLayout();

		this.jPanelidDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);

		jLabelidDemandaProductos = new JLabel();
		jLabelidDemandaProductos.setText("Id");

		jLabelidDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ultima_venta_hastaDemandaProductos = new JLabelMe();
		this.jLabelfecha_ultima_venta_hastaDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA+" : *");
		this.jLabelfecha_ultima_venta_hastaDemandaProductos.setToolTipText("Fecha Ultima Venta Hasta");
		this.jLabelfecha_ultima_venta_hastaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_venta_hastaDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_venta_hastaDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelfecha_ultima_venta_hastaDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		//jFormattedTextFieldfecha_ultima_venta_hastaDemandaProductos= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_venta_hastaDemandaProductos= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaDemandaProductos.setEnabled(false);
		jDateChooserfecha_ultima_venta_hastaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_venta_hastaDemandaProductos.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaDemandaProductos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_venta_hastaDemandaProductos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.setText("U");
		this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_venta_hastaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_venta_hastaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_venta_hastaDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoDemandaProductos = new JLabelMe();
		this.jLabelcodigoDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDemandaProductos.setToolTipText("Codigo");
		this.jLabelcodigoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelcodigoDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextAreacodigoDemandaProductos= new JTextAreaMe();
		jTextAreacodigoDemandaProductos.setEnabled(false);
		jTextAreacodigoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoDemandaProductos.setLineWrap(true);
		jTextAreacodigoDemandaProductos.setWrapStyleWord(true);
		jTextAreacodigoDemandaProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoDemandaProductos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoDemandaProductos = new JScrollPane(jTextAreacodigoDemandaProductos);
		jscrollPanecodigoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanecodigoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanecodigoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtoncodigoDemandaProductosBusqueda= new JButtonMe();
		this.jButtoncodigoDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDemandaProductosBusqueda.setText("U");
		this.jButtoncodigoDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadDemandaProductos = new JLabelMe();
		this.jLabelnombre_unidadDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadDemandaProductos.setToolTipText("Nombre Unidad");
		this.jLabelnombre_unidadDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelnombre_unidadDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFieldnombre_unidadDemandaProductos= new JTextFieldMe();

		jTextFieldnombre_unidadDemandaProductos.setEnabled(false);
		jTextFieldnombre_unidadDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadDemandaProductosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadDemandaProductosBusqueda.setText("U");
		this.jButtonnombre_unidadDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleDemandaProductos = new JLabelMe();
		this.jLabelcantidad_disponibleDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleDemandaProductos.setToolTipText("Cantidad Disponible");
		this.jLabelcantidad_disponibleDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelcantidad_disponibleDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFieldcantidad_disponibleDemandaProductos= new JTextFieldMe();
		jTextFieldcantidad_disponibleDemandaProductos.setEnabled(false);
		jTextFieldcantidad_disponibleDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleDemandaProductos.setText("0");

		this.jButtoncantidad_disponibleDemandaProductosBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleDemandaProductosBusqueda.setText("U");
		this.jButtoncantidad_disponibleDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelstock_minimoDemandaProductos = new JLabelMe();
		this.jLabelstock_minimoDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO+" : *");
		this.jLabelstock_minimoDemandaProductos.setToolTipText("Stock Minimo");
		this.jLabelstock_minimoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_minimoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_minimoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstock_minimoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstock_minimoDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstock_minimoDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelstock_minimoDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFieldstock_minimoDemandaProductos= new JTextFieldMe();
		jTextFieldstock_minimoDemandaProductos.setEnabled(false);
		jTextFieldstock_minimoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_minimoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_minimoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstock_minimoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstock_minimoDemandaProductos.setText("0");

		this.jButtonstock_minimoDemandaProductosBusqueda= new JButtonMe();
		this.jButtonstock_minimoDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_minimoDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_minimoDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstock_minimoDemandaProductosBusqueda.setText("U");
		this.jButtonstock_minimoDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstock_minimoDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstock_minimoDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstock_minimoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstock_minimoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stock_minimoDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstock_minimoDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoDemandaProductos = new JLabelMe();
		this.jLabelcodigo_productoDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoDemandaProductos.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelcodigo_productoDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFieldcodigo_productoDemandaProductos= new JTextFieldMe();

		jTextFieldcodigo_productoDemandaProductos.setEnabled(false);
		jTextFieldcodigo_productoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoDemandaProductosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoDemandaProductosBusqueda.setText("U");
		this.jButtoncodigo_productoDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombreDemandaProductos = new JLabelMe();
		this.jLabelnombreDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDemandaProductos.setToolTipText("Nombre");
		this.jLabelnombreDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelnombreDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextAreanombreDemandaProductos= new JTextAreaMe();
		jTextAreanombreDemandaProductos.setEnabled(false);
		jTextAreanombreDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDemandaProductos.setLineWrap(true);
		jTextAreanombreDemandaProductos.setWrapStyleWord(true);
		jTextAreanombreDemandaProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDemandaProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDemandaProductos = new JScrollPane(jTextAreanombreDemandaProductos);
		jscrollPanenombreDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombreDemandaProductosBusqueda= new JButtonMe();
		this.jButtonnombreDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDemandaProductosBusqueda.setText("U");
		this.jButtonnombreDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabeldem_triDemandaProductos = new JLabelMe();
		this.jLabeldem_triDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_DEMTRI+" : *");
		this.jLabeldem_triDemandaProductos.setToolTipText("Dem Tri");
		this.jLabeldem_triDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldem_triDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldem_triDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldem_triDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldem_triDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldem_triDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_DEMTRI);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPaneldem_triDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFielddem_triDemandaProductos= new JTextFieldMe();
		jTextFielddem_triDemandaProductos.setEnabled(false);
		jTextFielddem_triDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddem_triDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddem_triDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddem_triDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddem_triDemandaProductos.setText("0.0");

		this.jButtondem_triDemandaProductosBusqueda= new JButtonMe();
		this.jButtondem_triDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondem_triDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondem_triDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondem_triDemandaProductosBusqueda.setText("U");
		this.jButtondem_triDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondem_triDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondem_triDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddem_triDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddem_triDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dem_triDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondem_triDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabeldem_biDemandaProductos = new JLabelMe();
		this.jLabeldem_biDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_DEMBI+" : *");
		this.jLabeldem_biDemandaProductos.setToolTipText("Dem Bi");
		this.jLabeldem_biDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldem_biDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldem_biDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldem_biDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldem_biDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldem_biDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_DEMBI);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPaneldem_biDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFielddem_biDemandaProductos= new JTextFieldMe();
		jTextFielddem_biDemandaProductos.setEnabled(false);
		jTextFielddem_biDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddem_biDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddem_biDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddem_biDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddem_biDemandaProductos.setText("0.0");

		this.jButtondem_biDemandaProductosBusqueda= new JButtonMe();
		this.jButtondem_biDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondem_biDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondem_biDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondem_biDemandaProductosBusqueda.setText("U");
		this.jButtondem_biDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondem_biDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondem_biDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddem_biDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddem_biDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dem_biDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondem_biDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabeldem_menDemandaProductos = new JLabelMe();
		this.jLabeldem_menDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_DEMMEN+" : *");
		this.jLabeldem_menDemandaProductos.setToolTipText("Dem Men");
		this.jLabeldem_menDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldem_menDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldem_menDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldem_menDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldem_menDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldem_menDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_DEMMEN);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPaneldem_menDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFielddem_menDemandaProductos= new JTextFieldMe();
		jTextFielddem_menDemandaProductos.setEnabled(false);
		jTextFielddem_menDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddem_menDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddem_menDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddem_menDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddem_menDemandaProductos.setText("0.0");

		this.jButtondem_menDemandaProductosBusqueda= new JButtonMe();
		this.jButtondem_menDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondem_menDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondem_menDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondem_menDemandaProductosBusqueda.setText("U");
		this.jButtondem_menDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondem_menDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondem_menDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddem_menDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddem_menDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dem_menDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondem_menDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelingresosDemandaProductos = new JLabelMe();
		this.jLabelingresosDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_INGRESOS+" : *");
		this.jLabelingresosDemandaProductos.setToolTipText("Ingresos");
		this.jLabelingresosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingresosDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingresosDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingresosDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_INGRESOS);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelingresosDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFieldingresosDemandaProductos= new JTextFieldMe();
		jTextFieldingresosDemandaProductos.setEnabled(false);
		jTextFieldingresosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingresosDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingresosDemandaProductos.setText("0.0");

		this.jButtoningresosDemandaProductosBusqueda= new JButtonMe();
		this.jButtoningresosDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningresosDemandaProductosBusqueda.setText("U");
		this.jButtoningresosDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningresosDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningresosDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingresosDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingresosDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingresosDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningresosDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelegresosDemandaProductos = new JLabelMe();
		this.jLabelegresosDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_EGRESOS+" : *");
		this.jLabelegresosDemandaProductos.setToolTipText("Egresos");
		this.jLabelegresosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelegresosDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelegresosDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelegresosDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_EGRESOS);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelegresosDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFieldegresosDemandaProductos= new JTextFieldMe();
		jTextFieldegresosDemandaProductos.setEnabled(false);
		jTextFieldegresosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldegresosDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldegresosDemandaProductos.setText("0.0");

		this.jButtonegresosDemandaProductosBusqueda= new JButtonMe();
		this.jButtonegresosDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonegresosDemandaProductosBusqueda.setText("U");
		this.jButtonegresosDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonegresosDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonegresosDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldegresosDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldegresosDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"egresosDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonegresosDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelexistenciaDemandaProductos = new JLabelMe();
		this.jLabelexistenciaDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_EXISTENCIA+" : *");
		this.jLabelexistenciaDemandaProductos.setToolTipText("Existencia");
		this.jLabelexistenciaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelexistenciaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelexistenciaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelexistenciaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelexistenciaDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelexistenciaDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_EXISTENCIA);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelexistenciaDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFieldexistenciaDemandaProductos= new JTextFieldMe();
		jTextFieldexistenciaDemandaProductos.setEnabled(false);
		jTextFieldexistenciaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldexistenciaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldexistenciaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldexistenciaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldexistenciaDemandaProductos.setText("0.0");

		this.jButtonexistenciaDemandaProductosBusqueda= new JButtonMe();
		this.jButtonexistenciaDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonexistenciaDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonexistenciaDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonexistenciaDemandaProductosBusqueda.setText("U");
		this.jButtonexistenciaDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonexistenciaDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonexistenciaDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldexistenciaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldexistenciaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"existenciaDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonexistenciaDemandaProductosBusqueda.setVisible(false);		}


					
		this.jLabelcostoDemandaProductos = new JLabelMe();
		this.jLabelcostoDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDemandaProductos.setToolTipText("Costo");
		this.jLabelcostoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelcostoDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jTextFieldcostoDemandaProductos= new JTextFieldMe();
		jTextFieldcostoDemandaProductos.setEnabled(false);
		jTextFieldcostoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDemandaProductos.setText("0.0");

		this.jButtoncostoDemandaProductosBusqueda= new JButtonMe();
		this.jButtoncostoDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDemandaProductosBusqueda.setText("U");
		this.jButtoncostoDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDemandaProductosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDemandaProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaDemandaProductos = new JLabelMe();
		this.jLabelid_bodegaDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDemandaProductos.setToolTipText("Bodega");
		this.jLabelid_bodegaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelid_bodegaDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jComboBoxid_bodegaDemandaProductos= new JComboBoxMe();
		jComboBoxid_bodegaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDemandaProductos= new JButtonMe();
		this.jButtonid_bodegaDemandaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDemandaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDemandaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDemandaProductos.setText("Buscar");
		this.jButtonid_bodegaDemandaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDemandaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDemandaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDemandaProductos"));

		this.jButtonid_bodegaDemandaProductosBusqueda= new JButtonMe();
		this.jButtonid_bodegaDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDemandaProductosBusqueda.setText("U");
		this.jButtonid_bodegaDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDemandaProductosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDemandaProductosUpdate= new JButtonMe();
		this.jButtonid_bodegaDemandaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDemandaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDemandaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDemandaProductosUpdate.setText("U");
		this.jButtonid_bodegaDemandaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDemandaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDemandaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDemandaProductosUpdate"));



					
		this.jLabelid_productoDemandaProductos = new JLabelMe();
		this.jLabelid_productoDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDemandaProductos.setToolTipText("Producto");
		this.jLabelid_productoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelid_productoDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jComboBoxid_productoDemandaProductos= new JComboBoxMe();
		jComboBoxid_productoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDemandaProductos= new JButtonMe();
		this.jButtonid_productoDemandaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDemandaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDemandaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDemandaProductos.setText("Buscar");
		this.jButtonid_productoDemandaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDemandaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDemandaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDemandaProductos"));

		this.jButtonid_productoDemandaProductosBusqueda= new JButtonMe();
		this.jButtonid_productoDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDemandaProductosBusqueda.setText("U");
		this.jButtonid_productoDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDemandaProductosBusqueda.setVisible(false);		}

		this.jButtonid_productoDemandaProductosUpdate= new JButtonMe();
		this.jButtonid_productoDemandaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDemandaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDemandaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDemandaProductosUpdate.setText("U");
		this.jButtonid_productoDemandaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDemandaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDemandaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDemandaProductosUpdate"));



					
		this.jLabelid_empresaDemandaProductos = new JLabelMe();
		this.jLabelid_empresaDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDemandaProductos.setToolTipText("Empresa");
		this.jLabelid_empresaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelid_empresaDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jComboBoxid_empresaDemandaProductos= new JComboBoxMe();
		jComboBoxid_empresaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDemandaProductos.setEnabled(false);

		this.jButtonid_empresaDemandaProductos= new JButtonMe();
		this.jButtonid_empresaDemandaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDemandaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDemandaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDemandaProductos.setText("Buscar");
		this.jButtonid_empresaDemandaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDemandaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDemandaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDemandaProductos"));

		this.jButtonid_empresaDemandaProductosBusqueda= new JButtonMe();
		this.jButtonid_empresaDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDemandaProductosBusqueda.setText("U");
		this.jButtonid_empresaDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDemandaProductosBusqueda.setVisible(false);		}

		this.jButtonid_empresaDemandaProductosUpdate= new JButtonMe();
		this.jButtonid_empresaDemandaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDemandaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDemandaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDemandaProductosUpdate.setText("U");
		this.jButtonid_empresaDemandaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDemandaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDemandaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDemandaProductosUpdate"));



					
		this.jLabelid_sucursalDemandaProductos = new JLabelMe();
		this.jLabelid_sucursalDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDemandaProductos.setToolTipText("Sucursal");
		this.jLabelid_sucursalDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelid_sucursalDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jComboBoxid_sucursalDemandaProductos= new JComboBoxMe();
		jComboBoxid_sucursalDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDemandaProductos.setEnabled(false);

		this.jButtonid_sucursalDemandaProductos= new JButtonMe();
		this.jButtonid_sucursalDemandaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDemandaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDemandaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDemandaProductos.setText("Buscar");
		this.jButtonid_sucursalDemandaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDemandaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDemandaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDemandaProductos"));

		this.jButtonid_sucursalDemandaProductosBusqueda= new JButtonMe();
		this.jButtonid_sucursalDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDemandaProductosBusqueda.setText("U");
		this.jButtonid_sucursalDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDemandaProductosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDemandaProductosUpdate= new JButtonMe();
		this.jButtonid_sucursalDemandaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDemandaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDemandaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDemandaProductosUpdate.setText("U");
		this.jButtonid_sucursalDemandaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDemandaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDemandaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDemandaProductosUpdate"));



					
		this.jLabelid_lineaDemandaProductos = new JLabelMe();
		this.jLabelid_lineaDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaDemandaProductos.setToolTipText("Linea");
		this.jLabelid_lineaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelid_lineaDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jComboBoxid_lineaDemandaProductos= new JComboBoxMe();
		jComboBoxid_lineaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaDemandaProductos= new JButtonMe();
		this.jButtonid_lineaDemandaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDemandaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDemandaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDemandaProductos.setText("Buscar");
		this.jButtonid_lineaDemandaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaDemandaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDemandaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDemandaProductos"));

		this.jButtonid_lineaDemandaProductosBusqueda= new JButtonMe();
		this.jButtonid_lineaDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDemandaProductosBusqueda.setText("U");
		this.jButtonid_lineaDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaDemandaProductosBusqueda.setVisible(false);		}

		this.jButtonid_lineaDemandaProductosUpdate= new JButtonMe();
		this.jButtonid_lineaDemandaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDemandaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDemandaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDemandaProductosUpdate.setText("U");
		this.jButtonid_lineaDemandaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaDemandaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDemandaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDemandaProductosUpdate"));



					
		this.jLabelid_linea_grupoDemandaProductos = new JLabelMe();
		this.jLabelid_linea_grupoDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoDemandaProductos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelid_linea_grupoDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jComboBoxid_linea_grupoDemandaProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoDemandaProductos= new JButtonMe();
		this.jButtonid_linea_grupoDemandaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDemandaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDemandaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDemandaProductos.setText("Buscar");
		this.jButtonid_linea_grupoDemandaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoDemandaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDemandaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDemandaProductos"));

		this.jButtonid_linea_grupoDemandaProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoDemandaProductosBusqueda.setText("U");
		this.jButtonid_linea_grupoDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoDemandaProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoDemandaProductosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoDemandaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDemandaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDemandaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoDemandaProductosUpdate.setText("U");
		this.jButtonid_linea_grupoDemandaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoDemandaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDemandaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDemandaProductosUpdate"));



					
		this.jLabelid_linea_categoriaDemandaProductos = new JLabelMe();
		this.jLabelid_linea_categoriaDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaDemandaProductos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelid_linea_categoriaDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jComboBoxid_linea_categoriaDemandaProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaDemandaProductos= new JButtonMe();
		this.jButtonid_linea_categoriaDemandaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDemandaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDemandaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDemandaProductos.setText("Buscar");
		this.jButtonid_linea_categoriaDemandaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaDemandaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDemandaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDemandaProductos"));

		this.jButtonid_linea_categoriaDemandaProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaDemandaProductosBusqueda.setText("U");
		this.jButtonid_linea_categoriaDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaDemandaProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaDemandaProductosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaDemandaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDemandaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDemandaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaDemandaProductosUpdate.setText("U");
		this.jButtonid_linea_categoriaDemandaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaDemandaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDemandaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDemandaProductosUpdate"));



					
		this.jLabelid_linea_marcaDemandaProductos = new JLabelMe();
		this.jLabelid_linea_marcaDemandaProductos.setText(""+DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaDemandaProductos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaDemandaProductos.setToolTipText(DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutDemandaProductos = new GridBagLayout();
		this.jPanelid_linea_marcaDemandaProductos.setLayout(this.gridaBagLayoutDemandaProductos);


		jComboBoxid_linea_marcaDemandaProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaDemandaProductos= new JButtonMe();
		this.jButtonid_linea_marcaDemandaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDemandaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDemandaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDemandaProductos.setText("Buscar");
		this.jButtonid_linea_marcaDemandaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaDemandaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDemandaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDemandaProductos"));

		this.jButtonid_linea_marcaDemandaProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaDemandaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDemandaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDemandaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaDemandaProductosBusqueda.setText("U");
		this.jButtonid_linea_marcaDemandaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaDemandaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDemandaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDemandaProductosBusqueda"));

		if(this.demandaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaDemandaProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaDemandaProductosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaDemandaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDemandaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDemandaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaDemandaProductosUpdate.setText("U");
		this.jButtonid_linea_marcaDemandaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaDemandaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDemandaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDemandaProductosUpdate"));



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
		//this.jInternalFrameDetalleDemandaProductos = new DemandaProductosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Demanda Productos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDemandaProductos= new GridBagLayout();
		

		
		String sToolTipDemandaProductos="";
		sToolTipDemandaProductos=DemandaProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDemandaProductos+="(Inventario.DemandaProductos)";
		}
		
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipDemandaProductos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDemandaProductos = new JButtonMe();
		this.jButtonModificarDemandaProductos = new JButtonMe();
        this.jButtonActualizarDemandaProductos = new JButtonMe();
        this.jButtonEliminarDemandaProductos = new JButtonMe();
        this.jButtonCancelarDemandaProductos = new JButtonMe();
        this.jButtonGuardarCambiosDemandaProductos = new JButtonMe();
		this.jButtonGuardarCambiosTablaDemandaProductos = new JButtonMe();
		this.jButtonCerrarDemandaProductos = new JButtonMe();
		
		this.jScrollPanelDatosDemandaProductos = new JScrollPane();   
        this.jScrollPanelDatosEdicionDemandaProductos = new JScrollPane();
		this.jScrollPanelDatosGeneralDemandaProductos = new JScrollPane();
				
		
		
		this.jPanelCamposDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Demanda Productos";
		
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Demanda Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosDemandaProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDemandaProductos.setName("jPanelCamposDemandaProductos"); 

		this.jPanelCamposOcultosDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDemandaProductos.setName("jPanelCamposOcultosDemandaProductos"); 

        this.jPanelAccionesDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDemandaProductos.setToolTipText("Acciones");
        this.jPanelAccionesDemandaProductos.setName("Acciones"); 

		this.jPanelAccionesFormularioDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDemandaProductos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDemandaProductos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDemandaProductos.setText("Nuevo");
		this.jButtonModificarDemandaProductos.setText("Editar");
        this.jButtonActualizarDemandaProductos.setText("Actualizar");
        this.jButtonEliminarDemandaProductos.setText("Eliminar");
        this.jButtonCancelarDemandaProductos.setText("Cancelar");
        this.jButtonGuardarCambiosDemandaProductos.setText("Guardar");
		this.jButtonGuardarCambiosTablaDemandaProductos.setText("Guardar");
		this.jButtonCerrarDemandaProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDemandaProductos,"nuevo_button","Nuevo",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDemandaProductos,"modificar_button","Editar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDemandaProductos,"actualizar_button","Actualizar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDemandaProductos,"eliminar_button","Eliminar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDemandaProductos,"cancelar_button","Cancelar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDemandaProductos,"guardarcambios_button","Guardar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDemandaProductos,"guardarcambiostabla_button","Guardar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDemandaProductos,"cerrar_button","Salir",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDemandaProductos.setToolTipText("Nuevo"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDemandaProductos.setToolTipText("Editar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDemandaProductos.setToolTipText("Actualizar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDemandaProductos.setToolTipText("Eliminar)"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDemandaProductos.setToolTipText("Cancelar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDemandaProductos.setToolTipText("Guardar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDemandaProductos.setToolTipText("Guardar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDemandaProductos.setToolTipText("Salir"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDemandaProductos";
		inputMap = this.jButtonNuevoDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDemandaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDemandaProductos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDemandaProductos";
		inputMap = this.jButtonActualizarDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDemandaProductos"));
		
		//ELIMINAR
		sMapKey = "EliminarDemandaProductos";
		inputMap = this.jButtonEliminarDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDemandaProductos"));
		
		//CANCELAR	
		sMapKey = "CancelarDemandaProductos";
		inputMap = this.jButtonCancelarDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDemandaProductos"));
		
		//CERRAR		
		sMapKey = "CerrarDemandaProductos";
		inputMap = this.jButtonCerrarDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDemandaProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDemandaProductos";
		inputMap = this.jButtonGuardarCambiosTablaDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDemandaProductos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDemandaProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDemandaProductos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDemandaProductos.setToolTipText("Nuevo DemandaProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDemandaProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDemandaProductos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDemandaProductos.setToolTipText("Sin Cerrar Ventana DemandaProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDemandaProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDemandaProductos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDemandaProductos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDemandaProductos.setText("Accion");
		this.jComboBoxTiposAccionesDemandaProductos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDemandaProductos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDemandaProductos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDemandaProductos = new JLabelMe();
		
		this.jLabelAccionesDemandaProductos.setText("Acciones");		
		this.jLabelAccionesDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDemandaProductos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDemandaProductos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDemandaProductos=new JTabbedPane();
		this.jTabbedPaneRelacionesDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDemandaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDemandaProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDemandaProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDemandaProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDemandaProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDemandaProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDemandaProductos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDemandaProductos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDemandaProductos = new GridBagLayout();
		
		this.jPanelCamposDemandaProductos.setLayout(gridaBagLayoutCamposDemandaProductos);
		this.jPanelCamposOcultosDemandaProductos.setLayout(gridaBagLayoutCamposOcultosDemandaProductos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDemandaProductos.add(jLabelIdDemandaProductos, this.gridBagConstraintsDemandaProductos);



	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDemandaProductos.add(jLabelidDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDemandaProductos.add(jLabelid_bodegaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDemandaProductos.add(jButtonid_bodegaDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 3;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDemandaProductos.add(jButtonid_bodegaDemandaProductosUpdate, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDemandaProductos.add(jComboBoxid_bodegaDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDemandaProductos.add(jLabelid_productoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDemandaProductos.add(jButtonid_productoDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 3;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDemandaProductos.add(jButtonid_productoDemandaProductosUpdate, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDemandaProductos.add(jComboBoxid_productoDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDemandaProductos.add(jLabelid_empresaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDemandaProductos.add(jButtonid_empresaDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 3;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDemandaProductos.add(jButtonid_empresaDemandaProductosUpdate, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDemandaProductos.add(jComboBoxid_empresaDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDemandaProductos.add(jLabelid_sucursalDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDemandaProductos.add(jButtonid_sucursalDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 3;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDemandaProductos.add(jButtonid_sucursalDemandaProductosUpdate, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDemandaProductos.add(jComboBoxid_sucursalDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaDemandaProductos.add(jLabelid_lineaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDemandaProductos.add(jButtonid_lineaDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 3;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDemandaProductos.add(jButtonid_lineaDemandaProductosUpdate, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaDemandaProductos.add(jComboBoxid_lineaDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoDemandaProductos.add(jLabelid_linea_grupoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoDemandaProductos.add(jButtonid_linea_grupoDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 3;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoDemandaProductos.add(jButtonid_linea_grupoDemandaProductosUpdate, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoDemandaProductos.add(jComboBoxid_linea_grupoDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaDemandaProductos.add(jLabelid_linea_categoriaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaDemandaProductos.add(jButtonid_linea_categoriaDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 3;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaDemandaProductos.add(jButtonid_linea_categoriaDemandaProductosUpdate, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaDemandaProductos.add(jComboBoxid_linea_categoriaDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaDemandaProductos.add(jLabelid_linea_marcaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaDemandaProductos.add(jButtonid_linea_marcaDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 3;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaDemandaProductos.add(jButtonid_linea_marcaDemandaProductosUpdate, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaDemandaProductos.add(jComboBoxid_linea_marcaDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_venta_hastaDemandaProductos.add(jLabelfecha_ultima_venta_hastaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_venta_hastaDemandaProductos.add(jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_venta_hastaDemandaProductos.add(jDateChooserfecha_ultima_venta_hastaDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDemandaProductos.add(jLabelcodigoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDemandaProductos.add(jButtoncodigoDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDemandaProductos.add(jscrollPanecodigoDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadDemandaProductos.add(jLabelnombre_unidadDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadDemandaProductos.add(jButtonnombre_unidadDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadDemandaProductos.add(jTextFieldnombre_unidadDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleDemandaProductos.add(jLabelcantidad_disponibleDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleDemandaProductos.add(jButtoncantidad_disponibleDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleDemandaProductos.add(jTextFieldcantidad_disponibleDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelstock_minimoDemandaProductos.add(jLabelstock_minimoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelstock_minimoDemandaProductos.add(jButtonstock_minimoDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelstock_minimoDemandaProductos.add(jTextFieldstock_minimoDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoDemandaProductos.add(jLabelcodigo_productoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoDemandaProductos.add(jButtoncodigo_productoDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoDemandaProductos.add(jTextFieldcodigo_productoDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDemandaProductos.add(jLabelnombreDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDemandaProductos.add(jButtonnombreDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDemandaProductos.add(jscrollPanenombreDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldem_triDemandaProductos.add(jLabeldem_triDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldem_triDemandaProductos.add(jButtondem_triDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldem_triDemandaProductos.add(jTextFielddem_triDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldem_biDemandaProductos.add(jLabeldem_biDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldem_biDemandaProductos.add(jButtondem_biDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldem_biDemandaProductos.add(jTextFielddem_biDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldem_menDemandaProductos.add(jLabeldem_menDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldem_menDemandaProductos.add(jButtondem_menDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldem_menDemandaProductos.add(jTextFielddem_menDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingresosDemandaProductos.add(jLabelingresosDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelingresosDemandaProductos.add(jButtoningresosDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingresosDemandaProductos.add(jTextFieldingresosDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelegresosDemandaProductos.add(jLabelegresosDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelegresosDemandaProductos.add(jButtonegresosDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelegresosDemandaProductos.add(jTextFieldegresosDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelexistenciaDemandaProductos.add(jLabelexistenciaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelexistenciaDemandaProductos.add(jButtonexistenciaDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelexistenciaDemandaProductos.add(jTextFieldexistenciaDemandaProductos, this.gridBagConstraintsDemandaProductos);


	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 0;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoDemandaProductos.add(jLabelcostoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 2;
		this.gridBagConstraintsDemandaProductos.ipadx = 0;
		this.gridBagConstraintsDemandaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDemandaProductos.add(jButtoncostoDemandaProductosBusqueda, this.gridBagConstraintsDemandaProductos);
	}

	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDemandaProductos.gridy = 0;
	this.gridBagConstraintsDemandaProductos.gridx = 1;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoDemandaProductos.add(jTextFieldcostoDemandaProductos, this.gridBagConstraintsDemandaProductos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelidDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelid_bodegaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelid_productoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelid_lineaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelid_linea_grupoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelid_linea_categoriaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelid_linea_marcaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelfecha_ultima_venta_hastaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelcodigoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelnombre_unidadDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelcantidad_disponibleDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelstock_minimoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelcodigo_productoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelnombreDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPaneldem_triDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPaneldem_biDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPaneldem_menDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelingresosDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelegresosDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelexistenciaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDemandaProductos.add(this.jPanelcostoDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposDemandaProductos % 3==0) {
		iXPanelCamposDemandaProductos=0;
		iYPanelCamposDemandaProductos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposOcultosDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposOcultosDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDemandaProductos.add(this.jPanelid_empresaDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposOcultosDemandaProductos % 3==0) {
		iXPanelCamposOcultosDemandaProductos=0;
		iYPanelCamposOcultosDemandaProductos++;
	}
	this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDemandaProductos.gridy = iYPanelCamposOcultosDemandaProductos;
	this.gridBagConstraintsDemandaProductos.gridx = iXPanelCamposOcultosDemandaProductos++;
	this.gridBagConstraintsDemandaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDemandaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDemandaProductos.add(this.jPanelid_sucursalDemandaProductos, this.gridBagConstraintsDemandaProductos);



	if(iXPanelCamposOcultosDemandaProductos % 3==0) {
		iXPanelCamposOcultosDemandaProductos=0;
		iYPanelCamposOcultosDemandaProductos++;
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
			
		GridBagLayout gridaBagLayoutAccionesDemandaProductos= new GridBagLayout();
		this.jPanelAccionesDemandaProductos.setLayout(gridaBagLayoutAccionesDemandaProductos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDemandaProductos= new GridBagLayout();
		this.jPanelAccionesFormularioDemandaProductos.setLayout(gridaBagLayoutAccionesFormularioDemandaProductos);
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDemandaProductos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDemandaProductos.add(this.jComboBoxTiposAccionesFormularioDemandaProductos, this.gridBagConstraintsDemandaProductos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXAccion++;
			
		this.jPanelAccionesDemandaProductos.add(this.jButtonModificarDemandaProductos, this.gridBagConstraintsDemandaProductos);							

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx =iPosXAccion++;
			
		this.jPanelAccionesDemandaProductos.add(this.jButtonEliminarDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
			
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = 0;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesDemandaProductos.add(this.jButtonActualizarDemandaProductos, this.gridBagConstraintsDemandaProductos);


		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = 0;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesDemandaProductos.add(this.jButtonGuardarCambiosDemandaProductos, this.gridBagConstraintsDemandaProductos);	
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = 0;		
		this.gridBagConstraintsDemandaProductos.gridx =iPosXAccion++;
		
		this.jPanelAccionesDemandaProductos.add(this.jButtonCancelarDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDemandaProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDemandaProductos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();						
			this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDemandaProductos.gridx = 0;		
			//this.gridBagConstraintsDemandaProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDemandaProductos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDemandaProductos.gridx =0;
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDemandaProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDemandaProductos, this.gridBagConstraintsDemandaProductos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DemandaProductosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDemandaProductos = new DemandaProductosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Demanda Productos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Demanda Productos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Demanda Productos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DemandaProductosModel demandaproductosModel=new DemandaProductosModel(this);
			
			//SI USARA CLASE INTERNA
			//DemandaProductosModel.DemandaProductosFocusTraversalPolicy demandaproductosFocusTraversalPolicy = demandaproductosModel.new DemandaProductosFocusTraversalPolicy(this);
			
			//demandaproductosFocusTraversalPolicy.setdemandaproductosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(demandaproductosModel);
			
			
			this.jContentPaneDetalleDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDemandaProductos = new GridBagLayout();	
			this.jContentPaneDetalleDemandaProductos.setLayout(gridaBagLayoutDetalleDemandaProductos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDemandaProductos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
				this.gridBagConstraintsDemandaProductos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDemandaProductos.gridx = 0;
					
				
				this.jContentPaneDetalleDemandaProductos.add(jTtoolBarDetalleDemandaProductos, gridBagConstraintsDemandaProductos);								
				
}
			
			this.jScrollPanelDatosEdicionDemandaProductos=   new JScrollPane(jContentPaneDetalleDemandaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDemandaProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDemandaProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDemandaProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDemandaProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDemandaProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDemandaProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDemandaProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDemandaProductos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDemandaProductos.gridx = 0;
	        
			this.jContentPaneDetalleDemandaProductos.add(jPanelCamposDemandaProductos, gridBagConstraintsDemandaProductos);
			
			
			
			
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
						//&& demandaproductosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDemandaProductos= new GridBagConstraints();
						this.gridBagConstraintsDemandaProductos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDemandaProductos.gridx = 0;
						this.jContentPaneDetalleDemandaProductos.add(this.jTabbedPaneRelacionesDemandaProductos, this.gridBagConstraintsDemandaProductos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDemandaProductos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDemandaProductos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
					this.gridBagConstraintsDemandaProductos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDemandaProductos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDemandaProductos.gridx = 0;
					
				
					this.jContentPaneDetalleDemandaProductos.add(jPanelCamposOcultosDemandaProductos, gridBagConstraintsDemandaProductos);
				
					this.jPanelCamposOcultosDemandaProductos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDemandaProductos.gridx = 0;
	        this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDemandaProductos.add(this.jPanelAccionesFormularioDemandaProductos, this.gridBagConstraintsDemandaProductos);							
			
			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
	        this.gridBagConstraintsDemandaProductos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDemandaProductos.gridx = 0;
	        
			
			this.jContentPaneDetalleDemandaProductos.add(this.jPanelAccionesDemandaProductos, this.gridBagConstraintsDemandaProductos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDemandaProductos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDemandaProductos=   new JScrollPane(this.jPanelCamposDemandaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDemandaProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDemandaProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDemandaProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDemandaProductos.gridx = 0;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDemandaProductos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDemandaProductos, this.gridBagConstraintsDemandaProductos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDemandaProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDemandaProductos, this.gridBagConstraintsDemandaProductos);			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDemandaProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDemandaProductos, this.gridBagConstraintsDemandaProductos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDemandaProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDemandaProductos, this.gridBagConstraintsDemandaProductos);
			
			
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDemandaProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
			
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDemandaProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDemandaProductos, this.gridBagConstraintsDemandaProductos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDemandaProductos;//jContentPane;
		
		return jScrollPanelDatosEdicionDemandaProductos;
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
