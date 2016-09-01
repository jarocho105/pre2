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
import com.bydan.erp.inventario.util.report.DiferenciasFisicasProductosConstantesFunciones;

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
public class DiferenciasFisicasProductosDetalleFormJInternalFrame extends DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDiferenciasFisicasProductos;
	
	protected JMenuBar jmenuBarDetalleDiferenciasFisicasProductos;
	
	protected JMenu jmenuDetalleDiferenciasFisicasProductos;
	protected JMenu jmenuDetalleArchivoDiferenciasFisicasProductos;
	protected JMenu jmenuDetalleAccionesDiferenciasFisicasProductos;
	protected JMenu jmenuDetalleDatosDiferenciasFisicasProductos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDiferenciasFisicasProductos;	
	protected GridBagConstraints gridBagConstraintsDiferenciasFisicasProductos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional jInternalFrameDetalleDiferenciasFisicasProductos;		
	
	
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
	
	public DiferenciasFisicasProductosSessionBean diferenciasfisicasproductosSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public DiferenciasFisicasProductosLogic diferenciasfisicasproductosLogic;
	
	public JScrollPane jScrollPanelDatosDiferenciasFisicasProductos;
	public JScrollPane jScrollPanelDatosEdicionDiferenciasFisicasProductos;
	public JScrollPane jScrollPanelDatosGeneralDiferenciasFisicasProductos;
	
	protected JPanel jPanelCamposDiferenciasFisicasProductos;    
	protected JPanel jPanelCamposOcultosDiferenciasFisicasProductos;    	
	protected JPanel jPanelAccionesDiferenciasFisicasProductos;
	protected JPanel jPanelAccionesFormularioDiferenciasFisicasProductos;
    
	
	
	protected Integer iXPanelCamposDiferenciasFisicasProductos=0;
	protected Integer iYPanelCamposDiferenciasFisicasProductos=0;
	
	protected Integer iXPanelCamposOcultosDiferenciasFisicasProductos=0;
	protected Integer iYPanelCamposOcultosDiferenciasFisicasProductos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDiferenciasFisicasProductos;
	public JButton jButtonModificarDiferenciasFisicasProductos;
	public JButton jButtonActualizarDiferenciasFisicasProductos;
    public JButton jButtonEliminarDiferenciasFisicasProductos;
	public JButton jButtonCancelarDiferenciasFisicasProductos;
    public JButton jButtonGuardarCambiosDiferenciasFisicasProductos;
	public JButton jButtonGuardarCambiosTablaDiferenciasFisicasProductos;
	protected JButton jButtonCerrarDiferenciasFisicasProductos;
	
	
	protected JButton jButtonProcesarInformacionDiferenciasFisicasProductos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDiferenciasFisicasProductos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDiferenciasFisicasProductos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDiferenciasFisicasProductos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDiferenciasFisicasProductos;
	protected JButton jButtonModificarToolBarDiferenciasFisicasProductos;
	protected JButton jButtonActualizarToolBarDiferenciasFisicasProductos;
    protected JButton jButtonEliminarToolBarDiferenciasFisicasProductos;
	protected JButton jButtonCancelarToolBarDiferenciasFisicasProductos;
    protected JButton jButtonGuardarCambiosToolBarDiferenciasFisicasProductos;
	protected JButton jButtonGuardarCambiosTablaToolBarDiferenciasFisicasProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarDiferenciasFisicasProductos;
	protected JButton jButtonCerrarToolBarDiferenciasFisicasProductos;
	
	protected JButton jButtonProcesarInformacionToolBarDiferenciasFisicasProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemModificarDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemActualizarDiferenciasFisicasProductos;
    protected JMenuItem jMenuItemEliminarDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemCancelarDiferenciasFisicasProductos;
    protected JMenuItem jMenuItemGuardarCambiosDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemCerrarDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemDetalleCerrarDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos;
	
	protected JMenuItem jMenuItemProcesarInformacionDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemMostrarOcultarDiferenciasFisicasProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDiferenciasFisicasProductos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDiferenciasFisicasProductos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDiferenciasFisicasProductos;
	public JLabel jLabelIdDiferenciasFisicasProductos;
	public JLabel jLabelidDiferenciasFisicasProductos;
	public JButton jButtonidDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos;
	public JLabel jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos;
	public JButton jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDiferenciasFisicasProductos;
	public JLabel jLabelcodigoDiferenciasFisicasProductos;
	public JTextArea jTextAreacodigoDiferenciasFisicasProductos;
	public JScrollPane jscrollPanecodigoDiferenciasFisicasProductos;
	public JButton jButtoncodigoDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadDiferenciasFisicasProductos;
	public JLabel jLabelnombre_unidadDiferenciasFisicasProductos;
	public JTextField jTextFieldnombre_unidadDiferenciasFisicasProductos;
	public JButton jButtonnombre_unidadDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleDiferenciasFisicasProductos;
	public JLabel jLabelcantidad_disponibleDiferenciasFisicasProductos;
	public JTextField jTextFieldcantidad_disponibleDiferenciasFisicasProductos;
	public JButton jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_fisicaDiferenciasFisicasProductos;
	public JLabel jLabelcantidad_fisicaDiferenciasFisicasProductos;
	public JTextField jTextFieldcantidad_fisicaDiferenciasFisicasProductos;
	public JButton jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoDiferenciasFisicasProductos;
	public JLabel jLabelcodigo_productoDiferenciasFisicasProductos;
	public JTextField jTextFieldcodigo_productoDiferenciasFisicasProductos;
	public JButton jButtoncodigo_productoDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombreDiferenciasFisicasProductos;
	public JLabel jLabelnombreDiferenciasFisicasProductos;
	public JTextArea jTextAreanombreDiferenciasFisicasProductos;
	public JScrollPane jscrollPanenombreDiferenciasFisicasProductos;
	public JButton jButtonnombreDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelingresosDiferenciasFisicasProductos;
	public JLabel jLabelingresosDiferenciasFisicasProductos;
	public JTextField jTextFieldingresosDiferenciasFisicasProductos;
	public JButton jButtoningresosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelegresosDiferenciasFisicasProductos;
	public JLabel jLabelegresosDiferenciasFisicasProductos;
	public JTextField jTextFieldegresosDiferenciasFisicasProductos;
	public JButton jButtonegresosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPaneldisponible_corteDiferenciasFisicasProductos;
	public JLabel jLabeldisponible_corteDiferenciasFisicasProductos;
	public JTextField jTextFielddisponible_corteDiferenciasFisicasProductos;
	public JButton jButtondisponible_corteDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPaneldiferenciaDiferenciasFisicasProductos;
	public JLabel jLabeldiferenciaDiferenciasFisicasProductos;
	public JTextField jTextFielddiferenciaDiferenciasFisicasProductos;
	public JButton jButtondiferenciaDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelcostoDiferenciasFisicasProductos;
	public JLabel jLabelcostoDiferenciasFisicasProductos;
	public JTextField jTextFieldcostoDiferenciasFisicasProductos;
	public JButton jButtoncostoDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPaneltotalDiferenciasFisicasProductos;
	public JLabel jLabeltotalDiferenciasFisicasProductos;
	public JTextField jTextFieldtotalDiferenciasFisicasProductos;
	public JButton jButtontotalDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaDiferenciasFisicasProductos;
	public JLabel jLabelid_bodegaDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDiferenciasFisicasProductos;
	public JButton jButtonid_bodegaDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_bodegaDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDiferenciasFisicasProductos;
	public JLabel jLabelid_productoDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDiferenciasFisicasProductos;
	public JButton jButtonid_productoDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_productoDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDiferenciasFisicasProductos;
	public JLabel jLabelid_empresaDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDiferenciasFisicasProductos;
	public JButton jButtonid_empresaDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_empresaDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_empresaDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDiferenciasFisicasProductos;
	public JLabel jLabelid_sucursalDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDiferenciasFisicasProductos;
	public JButton jButtonid_sucursalDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_sucursalDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaDiferenciasFisicasProductos;
	public JLabel jLabelid_lineaDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaDiferenciasFisicasProductos;
	public JButton jButtonid_lineaDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_lineaDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoDiferenciasFisicasProductos;
	public JLabel jLabelid_linea_grupoDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoDiferenciasFisicasProductos;
	public JButton jButtonid_linea_grupoDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaDiferenciasFisicasProductos;
	public JLabel jLabelid_linea_categoriaDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaDiferenciasFisicasProductos;
	public JButton jButtonid_linea_categoriaDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaDiferenciasFisicasProductos;
	public JLabel jLabelid_linea_marcaDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaDiferenciasFisicasProductos;
	public JButton jButtonid_linea_marcaDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDiferenciasFisicasProductos;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DiferenciasFisicasProductosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDiferenciasFisicasProductos=new JPanel();
				this.jPanelAccionesFormularioDiferenciasFisicasProductos=new JPanel();
				this.jmenuBarDetalleDiferenciasFisicasProductos=new JMenuBar();
				this.jTtoolBarDetalleDiferenciasFisicasProductos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiferenciasFisicasProductosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DiferenciasFisicasProductosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiferenciasFisicasProductosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiferenciasFisicasProductosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiferenciasFisicasProductosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDiferenciasFisicasProductos() {
		return this.jButtonActualizarToolBarDiferenciasFisicasProductos;
	}
	
	public JButton getjButtonEliminarToolBarDiferenciasFisicasProductos() {
		return this.jButtonEliminarToolBarDiferenciasFisicasProductos;
	}
	
	public JButton getjButtonCancelarToolBarDiferenciasFisicasProductos() {
		return this.jButtonCancelarToolBarDiferenciasFisicasProductos;
	}		
	
	public JButton getjButtonProcesarInformacionDiferenciasFisicasProductos() {
		return this.jButtonProcesarInformacionDiferenciasFisicasProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDiferenciasFisicasProductos)	{
		this.jButtonProcesarInformacionDiferenciasFisicasProductos = jButtonProcesarInformacionDiferenciasFisicasProductos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDiferenciasFisicasProductos() {
		return this.jComboBoxTiposAccionesDiferenciasFisicasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposRelacionesDiferenciasFisicasProductos) {
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos = jComboBoxTiposRelacionesDiferenciasFisicasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposAccionesDiferenciasFisicasProductos) {
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos = jComboBoxTiposAccionesDiferenciasFisicasProductos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDiferenciasFisicasProductos() {
		return this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos) {
		this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos = jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
		
		this.diferenciasfisicasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diferenciasfisicasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiferenciasFisicasProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiferenciasFisicasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiferenciasFisicasProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Diferencias Fisicas Productos MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
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
	
		DiferenciasFisicasProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDiferenciasFisicasProductos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDiferenciasFisicasProductos=new JButtonMe();
				this.jButtonModificarToolBarDiferenciasFisicasProductos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDiferenciasFisicasProductos,this.jTtoolBarDetalleDiferenciasFisicasProductos,
							"actualizar","actualizar","Actualizar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDiferenciasFisicasProductos,this.jTtoolBarDetalleDiferenciasFisicasProductos,
							"eliminar","eliminar","Eliminar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDiferenciasFisicasProductos,this.jTtoolBarDetalleDiferenciasFisicasProductos,
							"cancelar","cancelar","Cancelar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDiferenciasFisicasProductos,this.jTtoolBarDetalleDiferenciasFisicasProductos,
							"guardarcambios","guardarcambios","Guardar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDiferenciasFisicasProductos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDiferenciasFisicasProductos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDiferenciasFisicasProductos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDiferenciasFisicasProductos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDiferenciasFisicasProductos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDiferenciasFisicasProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDiferenciasFisicasProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDiferenciasFisicasProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDiferenciasFisicasProductos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDiferenciasFisicasProductos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDiferenciasFisicasProductos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDiferenciasFisicasProductos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDiferenciasFisicasProductos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDiferenciasFisicasProductos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDiferenciasFisicasProductos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDiferenciasFisicasProductos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDiferenciasFisicasProductos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDiferenciasFisicasProductos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDiferenciasFisicasProductos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDiferenciasFisicasProductos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDiferenciasFisicasProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDiferenciasFisicasProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDiferenciasFisicasProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDiferenciasFisicasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDiferenciasFisicasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDiferenciasFisicasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDiferenciasFisicasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDiferenciasFisicasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDiferenciasFisicasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDiferenciasFisicasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDiferenciasFisicasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDiferenciasFisicasProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDiferenciasFisicasProductos.add(this.jMenuItemDetalleCerrarDiferenciasFisicasProductos);
		
		this.jmenuDetalleAccionesDiferenciasFisicasProductos.add(this.jMenuItemActualizarDiferenciasFisicasProductos);
		this.jmenuDetalleAccionesDiferenciasFisicasProductos.add(this.jMenuItemEliminarDiferenciasFisicasProductos);
		this.jmenuDetalleAccionesDiferenciasFisicasProductos.add(this.jMenuItemCancelarDiferenciasFisicasProductos);		
		
		//this.jmenuDetalleDatosDiferenciasFisicasProductos.add(this.jMenuItemDetalleAbrirOrderByDiferenciasFisicasProductos);				
		this.jmenuDetalleDatosDiferenciasFisicasProductos.add(this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos);				
				
		//this.jmenuDetalleAccionesDiferenciasFisicasProductos.add(this.jMenuItemGuardarCambiosDiferenciasFisicasProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDiferenciasFisicasProductos.add(this.jmenuDetalleArchivoDiferenciasFisicasProductos);		
		this.jmenuBarDetalleDiferenciasFisicasProductos.add(this.jmenuDetalleAccionesDiferenciasFisicasProductos);		
		this.jmenuBarDetalleDiferenciasFisicasProductos.add(this.jmenuDetalleDatosDiferenciasFisicasProductos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDiferenciasFisicasProductos);				
	}
	
	
	public void inicializarElementosCamposDiferenciasFisicasProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDiferenciasFisicasProductos = new JLabelMe();
		jLabelIdDiferenciasFisicasProductos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDiferenciasFisicasProductos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDiferenciasFisicasProductos= new GridBagLayout();

		this.jPanelidDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);

		jLabelidDiferenciasFisicasProductos = new JLabel();
		jLabelidDiferenciasFisicasProductos.setText("Id");

		jLabelidDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA+" : *");
		this.jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos.setToolTipText("Fecha Ultima Venta Hasta");
		this.jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		//jFormattedTextFieldfecha_ultima_venta_hastaDiferenciasFisicasProductos= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setEnabled(false);
		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_venta_hastaDiferenciasFisicasProductos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelcodigoDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDiferenciasFisicasProductos.setToolTipText("Codigo");
		this.jLabelcodigoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelcodigoDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextAreacodigoDiferenciasFisicasProductos= new JTextAreaMe();
		jTextAreacodigoDiferenciasFisicasProductos.setEnabled(false);
		jTextAreacodigoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoDiferenciasFisicasProductos.setLineWrap(true);
		jTextAreacodigoDiferenciasFisicasProductos.setWrapStyleWord(true);
		jTextAreacodigoDiferenciasFisicasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoDiferenciasFisicasProductos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoDiferenciasFisicasProductos = new JScrollPane(jTextAreacodigoDiferenciasFisicasProductos);
		jscrollPanecodigoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtoncodigoDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtoncodigoDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelnombre_unidadDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadDiferenciasFisicasProductos.setToolTipText("Nombre Unidad");
		this.jLabelnombre_unidadDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelnombre_unidadDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFieldnombre_unidadDiferenciasFisicasProductos= new JTextFieldMe();

		jTextFieldnombre_unidadDiferenciasFisicasProductos.setEnabled(false);
		jTextFieldnombre_unidadDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelcantidad_disponibleDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleDiferenciasFisicasProductos.setToolTipText("Cantidad Disponible");
		this.jLabelcantidad_disponibleDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelcantidad_disponibleDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFieldcantidad_disponibleDiferenciasFisicasProductos= new JTextFieldMe();
		jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setEnabled(false);
		jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setText("0");

		this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_fisicaDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelcantidad_fisicaDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA+" : *");
		this.jLabelcantidad_fisicaDiferenciasFisicasProductos.setToolTipText("Cantidad Fisica");
		this.jLabelcantidad_fisicaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_fisicaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_fisicaDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_fisicaDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelcantidad_fisicaDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFieldcantidad_fisicaDiferenciasFisicasProductos= new JTextFieldMe();
		jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setEnabled(false);
		jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_fisicaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setText("0");

		this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_fisicaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_fisicaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_fisicaDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelcodigo_productoDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoDiferenciasFisicasProductos.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelcodigo_productoDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFieldcodigo_productoDiferenciasFisicasProductos= new JTextFieldMe();

		jTextFieldcodigo_productoDiferenciasFisicasProductos.setEnabled(false);
		jTextFieldcodigo_productoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombreDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelnombreDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDiferenciasFisicasProductos.setToolTipText("Nombre");
		this.jLabelnombreDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelnombreDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextAreanombreDiferenciasFisicasProductos= new JTextAreaMe();
		jTextAreanombreDiferenciasFisicasProductos.setEnabled(false);
		jTextAreanombreDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDiferenciasFisicasProductos.setLineWrap(true);
		jTextAreanombreDiferenciasFisicasProductos.setWrapStyleWord(true);
		jTextAreanombreDiferenciasFisicasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDiferenciasFisicasProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDiferenciasFisicasProductos = new JScrollPane(jTextAreanombreDiferenciasFisicasProductos);
		jscrollPanenombreDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonnombreDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonnombreDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelingresosDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelingresosDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS+" : *");
		this.jLabelingresosDiferenciasFisicasProductos.setToolTipText("Ingresos");
		this.jLabelingresosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingresosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingresosDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingresosDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelingresosDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFieldingresosDiferenciasFisicasProductos= new JTextFieldMe();
		jTextFieldingresosDiferenciasFisicasProductos.setEnabled(false);
		jTextFieldingresosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingresosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingresosDiferenciasFisicasProductos.setText("0.0");

		this.jButtoningresosDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtoningresosDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningresosDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtoningresosDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningresosDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningresosDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingresosDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingresosDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingresosDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningresosDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelegresosDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelegresosDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS+" : *");
		this.jLabelegresosDiferenciasFisicasProductos.setToolTipText("Egresos");
		this.jLabelegresosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelegresosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelegresosDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelegresosDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelegresosDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFieldegresosDiferenciasFisicasProductos= new JTextFieldMe();
		jTextFieldegresosDiferenciasFisicasProductos.setEnabled(false);
		jTextFieldegresosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldegresosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldegresosDiferenciasFisicasProductos.setText("0.0");

		this.jButtonegresosDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonegresosDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonegresosDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonegresosDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonegresosDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonegresosDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldegresosDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldegresosDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"egresosDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonegresosDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabeldisponible_corteDiferenciasFisicasProductos = new JLabelMe();
		this.jLabeldisponible_corteDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE+" : *");
		this.jLabeldisponible_corteDiferenciasFisicasProductos.setToolTipText("Disponible Corte");
		this.jLabeldisponible_corteDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldisponible_corteDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldisponible_corteDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponible_corteDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponible_corteDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponible_corteDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPaneldisponible_corteDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFielddisponible_corteDiferenciasFisicasProductos= new JTextFieldMe();
		jTextFielddisponible_corteDiferenciasFisicasProductos.setEnabled(false);
		jTextFielddisponible_corteDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponible_corteDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponible_corteDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponible_corteDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponible_corteDiferenciasFisicasProductos.setText("0.0");

		this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponible_corteDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponible_corteDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponible_corteDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabeldiferenciaDiferenciasFisicasProductos = new JLabelMe();
		this.jLabeldiferenciaDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA+" : *");
		this.jLabeldiferenciaDiferenciasFisicasProductos.setToolTipText("Diferencia");
		this.jLabeldiferenciaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiferenciaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiferenciaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiferenciaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiferenciaDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiferenciaDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPaneldiferenciaDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFielddiferenciaDiferenciasFisicasProductos= new JTextFieldMe();
		jTextFielddiferenciaDiferenciasFisicasProductos.setEnabled(false);
		jTextFielddiferenciaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiferenciaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiferenciaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiferenciaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiferenciaDiferenciasFisicasProductos.setText("0.0");

		this.jButtondiferenciaDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtondiferenciaDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiferenciaDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiferenciaDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiferenciaDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtondiferenciaDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiferenciaDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiferenciaDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiferenciaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiferenciaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diferenciaDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiferenciaDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabelcostoDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelcostoDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDiferenciasFisicasProductos.setToolTipText("Costo");
		this.jLabelcostoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelcostoDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFieldcostoDiferenciasFisicasProductos= new JTextFieldMe();
		jTextFieldcostoDiferenciasFisicasProductos.setEnabled(false);
		jTextFieldcostoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDiferenciasFisicasProductos.setText("0.0");

		this.jButtoncostoDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtoncostoDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtoncostoDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDiferenciasFisicasProductosBusqueda.setVisible(false);		}


					
		this.jLabeltotalDiferenciasFisicasProductos = new JLabelMe();
		this.jLabeltotalDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDiferenciasFisicasProductos.setToolTipText("Total");
		this.jLabeltotalDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPaneltotalDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jTextFieldtotalDiferenciasFisicasProductos= new JTextFieldMe();
		jTextFieldtotalDiferenciasFisicasProductos.setEnabled(false);
		jTextFieldtotalDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDiferenciasFisicasProductos.setText("0.0");

		this.jButtontotalDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtontotalDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtontotalDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDiferenciasFisicasProductosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDiferenciasFisicasProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelid_bodegaDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDiferenciasFisicasProductos.setToolTipText("Bodega");
		this.jLabelid_bodegaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelid_bodegaDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jComboBoxid_bodegaDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_bodegaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonid_bodegaDiferenciasFisicasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDiferenciasFisicasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDiferenciasFisicasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonid_bodegaDiferenciasFisicasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDiferenciasFisicasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDiferenciasFisicasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDiferenciasFisicasProductos"));

		this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDiferenciasFisicasProductosUpdate= new JButtonMe();
		this.jButtonid_bodegaDiferenciasFisicasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDiferenciasFisicasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDiferenciasFisicasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDiferenciasFisicasProductosUpdate.setText("U");
		this.jButtonid_bodegaDiferenciasFisicasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDiferenciasFisicasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDiferenciasFisicasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDiferenciasFisicasProductosUpdate"));



					
		this.jLabelid_productoDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelid_productoDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDiferenciasFisicasProductos.setToolTipText("Producto");
		this.jLabelid_productoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelid_productoDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jComboBoxid_productoDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_productoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonid_productoDiferenciasFisicasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDiferenciasFisicasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDiferenciasFisicasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonid_productoDiferenciasFisicasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDiferenciasFisicasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDiferenciasFisicasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDiferenciasFisicasProductos"));

		this.jButtonid_productoDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonid_productoDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonid_productoDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDiferenciasFisicasProductosBusqueda.setVisible(false);		}

		this.jButtonid_productoDiferenciasFisicasProductosUpdate= new JButtonMe();
		this.jButtonid_productoDiferenciasFisicasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDiferenciasFisicasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDiferenciasFisicasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDiferenciasFisicasProductosUpdate.setText("U");
		this.jButtonid_productoDiferenciasFisicasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDiferenciasFisicasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDiferenciasFisicasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDiferenciasFisicasProductosUpdate"));



					
		this.jLabelid_empresaDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelid_empresaDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDiferenciasFisicasProductos.setToolTipText("Empresa");
		this.jLabelid_empresaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelid_empresaDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jComboBoxid_empresaDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_empresaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDiferenciasFisicasProductos.setEnabled(false);

		this.jButtonid_empresaDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonid_empresaDiferenciasFisicasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiferenciasFisicasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiferenciasFisicasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonid_empresaDiferenciasFisicasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDiferenciasFisicasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiferenciasFisicasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiferenciasFisicasProductos"));

		this.jButtonid_empresaDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonid_empresaDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonid_empresaDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDiferenciasFisicasProductosBusqueda.setVisible(false);		}

		this.jButtonid_empresaDiferenciasFisicasProductosUpdate= new JButtonMe();
		this.jButtonid_empresaDiferenciasFisicasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiferenciasFisicasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiferenciasFisicasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDiferenciasFisicasProductosUpdate.setText("U");
		this.jButtonid_empresaDiferenciasFisicasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDiferenciasFisicasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiferenciasFisicasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiferenciasFisicasProductosUpdate"));



					
		this.jLabelid_sucursalDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelid_sucursalDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDiferenciasFisicasProductos.setToolTipText("Sucursal");
		this.jLabelid_sucursalDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelid_sucursalDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jComboBoxid_sucursalDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_sucursalDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDiferenciasFisicasProductos.setEnabled(false);

		this.jButtonid_sucursalDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonid_sucursalDiferenciasFisicasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiferenciasFisicasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiferenciasFisicasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonid_sucursalDiferenciasFisicasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDiferenciasFisicasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiferenciasFisicasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiferenciasFisicasProductos"));

		this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDiferenciasFisicasProductosUpdate= new JButtonMe();
		this.jButtonid_sucursalDiferenciasFisicasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiferenciasFisicasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiferenciasFisicasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDiferenciasFisicasProductosUpdate.setText("U");
		this.jButtonid_sucursalDiferenciasFisicasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDiferenciasFisicasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiferenciasFisicasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiferenciasFisicasProductosUpdate"));



					
		this.jLabelid_lineaDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelid_lineaDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaDiferenciasFisicasProductos.setToolTipText("Linea");
		this.jLabelid_lineaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelid_lineaDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jComboBoxid_lineaDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_lineaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonid_lineaDiferenciasFisicasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDiferenciasFisicasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDiferenciasFisicasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonid_lineaDiferenciasFisicasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaDiferenciasFisicasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDiferenciasFisicasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDiferenciasFisicasProductos"));

		this.jButtonid_lineaDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonid_lineaDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonid_lineaDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaDiferenciasFisicasProductosBusqueda.setVisible(false);		}

		this.jButtonid_lineaDiferenciasFisicasProductosUpdate= new JButtonMe();
		this.jButtonid_lineaDiferenciasFisicasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDiferenciasFisicasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDiferenciasFisicasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDiferenciasFisicasProductosUpdate.setText("U");
		this.jButtonid_lineaDiferenciasFisicasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaDiferenciasFisicasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDiferenciasFisicasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDiferenciasFisicasProductosUpdate"));



					
		this.jLabelid_linea_grupoDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelid_linea_grupoDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoDiferenciasFisicasProductos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelid_linea_grupoDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jComboBoxid_linea_grupoDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonid_linea_grupoDiferenciasFisicasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDiferenciasFisicasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDiferenciasFisicasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonid_linea_grupoDiferenciasFisicasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoDiferenciasFisicasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDiferenciasFisicasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDiferenciasFisicasProductos"));

		this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.setText("U");
		this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDiferenciasFisicasProductosUpdate"));



					
		this.jLabelid_linea_categoriaDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelid_linea_categoriaDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaDiferenciasFisicasProductos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelid_linea_categoriaDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jComboBoxid_linea_categoriaDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonid_linea_categoriaDiferenciasFisicasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDiferenciasFisicasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDiferenciasFisicasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonid_linea_categoriaDiferenciasFisicasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaDiferenciasFisicasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDiferenciasFisicasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDiferenciasFisicasProductos"));

		this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.setText("U");
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDiferenciasFisicasProductosUpdate"));



					
		this.jLabelid_linea_marcaDiferenciasFisicasProductos = new JLabelMe();
		this.jLabelid_linea_marcaDiferenciasFisicasProductos.setText(""+DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaDiferenciasFisicasProductos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaDiferenciasFisicasProductos.setToolTipText(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		this.jPanelid_linea_marcaDiferenciasFisicasProductos.setLayout(this.gridaBagLayoutDiferenciasFisicasProductos);


		jComboBoxid_linea_marcaDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonid_linea_marcaDiferenciasFisicasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDiferenciasFisicasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDiferenciasFisicasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonid_linea_marcaDiferenciasFisicasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaDiferenciasFisicasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDiferenciasFisicasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDiferenciasFisicasProductos"));

		this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.setText("U");
		this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDiferenciasFisicasProductosBusqueda"));

		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.setText("U");
		this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDiferenciasFisicasProductosUpdate"));



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
		//this.jInternalFrameDetalleDiferenciasFisicasProductos = new DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Diferencias Fisicas Productos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDiferenciasFisicasProductos= new GridBagLayout();
		

		
		String sToolTipDiferenciasFisicasProductos="";
		sToolTipDiferenciasFisicasProductos=DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDiferenciasFisicasProductos+="(Inventario.DiferenciasFisicasProductos)";
		}
		
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipDiferenciasFisicasProductos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonModificarDiferenciasFisicasProductos = new JButtonMe();
        this.jButtonActualizarDiferenciasFisicasProductos = new JButtonMe();
        this.jButtonEliminarDiferenciasFisicasProductos = new JButtonMe();
        this.jButtonCancelarDiferenciasFisicasProductos = new JButtonMe();
        this.jButtonGuardarCambiosDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonCerrarDiferenciasFisicasProductos = new JButtonMe();
		
		this.jScrollPanelDatosDiferenciasFisicasProductos = new JScrollPane();   
        this.jScrollPanelDatosEdicionDiferenciasFisicasProductos = new JScrollPane();
		this.jScrollPanelDatosGeneralDiferenciasFisicasProductos = new JScrollPane();
				
		
		
		this.jPanelCamposDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Diferencias Fisicas Productos";
		
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diferencias Fisicas Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosDiferenciasFisicasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDiferenciasFisicasProductos.setName("jPanelCamposDiferenciasFisicasProductos"); 

		this.jPanelCamposOcultosDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDiferenciasFisicasProductos.setName("jPanelCamposOcultosDiferenciasFisicasProductos"); 

        this.jPanelAccionesDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDiferenciasFisicasProductos.setToolTipText("Acciones");
        this.jPanelAccionesDiferenciasFisicasProductos.setName("Acciones"); 

		this.jPanelAccionesFormularioDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDiferenciasFisicasProductos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDiferenciasFisicasProductos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDiferenciasFisicasProductos.setText("Nuevo");
		this.jButtonModificarDiferenciasFisicasProductos.setText("Editar");
        this.jButtonActualizarDiferenciasFisicasProductos.setText("Actualizar");
        this.jButtonEliminarDiferenciasFisicasProductos.setText("Eliminar");
        this.jButtonCancelarDiferenciasFisicasProductos.setText("Cancelar");
        this.jButtonGuardarCambiosDiferenciasFisicasProductos.setText("Guardar");
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.setText("Guardar");
		this.jButtonCerrarDiferenciasFisicasProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDiferenciasFisicasProductos,"nuevo_button","Nuevo",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDiferenciasFisicasProductos,"modificar_button","Editar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDiferenciasFisicasProductos,"actualizar_button","Actualizar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDiferenciasFisicasProductos,"eliminar_button","Eliminar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDiferenciasFisicasProductos,"cancelar_button","Cancelar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDiferenciasFisicasProductos,"guardarcambios_button","Guardar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos,"guardarcambiostabla_button","Guardar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDiferenciasFisicasProductos,"cerrar_button","Salir",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDiferenciasFisicasProductos.setToolTipText("Nuevo"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDiferenciasFisicasProductos.setToolTipText("Editar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDiferenciasFisicasProductos.setToolTipText("Actualizar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDiferenciasFisicasProductos.setToolTipText("Eliminar)"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDiferenciasFisicasProductos.setToolTipText("Cancelar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDiferenciasFisicasProductos.setToolTipText("Guardar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.setToolTipText("Guardar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDiferenciasFisicasProductos.setToolTipText("Salir"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDiferenciasFisicasProductos";
		inputMap = this.jButtonNuevoDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDiferenciasFisicasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDiferenciasFisicasProductos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDiferenciasFisicasProductos";
		inputMap = this.jButtonActualizarDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDiferenciasFisicasProductos"));
		
		//ELIMINAR
		sMapKey = "EliminarDiferenciasFisicasProductos";
		inputMap = this.jButtonEliminarDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDiferenciasFisicasProductos"));
		
		//CANCELAR	
		sMapKey = "CancelarDiferenciasFisicasProductos";
		inputMap = this.jButtonCancelarDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDiferenciasFisicasProductos"));
		
		//CERRAR		
		sMapKey = "CerrarDiferenciasFisicasProductos";
		inputMap = this.jButtonCerrarDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDiferenciasFisicasProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDiferenciasFisicasProductos";
		inputMap = this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDiferenciasFisicasProductos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDiferenciasFisicasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDiferenciasFisicasProductos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDiferenciasFisicasProductos.setToolTipText("Nuevo DiferenciasFisicasProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDiferenciasFisicasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDiferenciasFisicasProductos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDiferenciasFisicasProductos.setToolTipText("Sin Cerrar Ventana DiferenciasFisicasProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDiferenciasFisicasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDiferenciasFisicasProductos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDiferenciasFisicasProductos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setText("Accion");
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDiferenciasFisicasProductos = new JLabelMe();
		
		this.jLabelAccionesDiferenciasFisicasProductos.setText("Acciones");		
		this.jLabelAccionesDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDiferenciasFisicasProductos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDiferenciasFisicasProductos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDiferenciasFisicasProductos=new JTabbedPane();
		this.jTabbedPaneRelacionesDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDiferenciasFisicasProductos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDiferenciasFisicasProductos = new GridBagLayout();
		
		this.jPanelCamposDiferenciasFisicasProductos.setLayout(gridaBagLayoutCamposDiferenciasFisicasProductos);
		this.jPanelCamposOcultosDiferenciasFisicasProductos.setLayout(gridaBagLayoutCamposOcultosDiferenciasFisicasProductos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDiferenciasFisicasProductos.add(jLabelIdDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDiferenciasFisicasProductos.add(jLabelidDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDiferenciasFisicasProductos.add(jLabelid_bodegaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDiferenciasFisicasProductos.add(jButtonid_bodegaDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 3;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDiferenciasFisicasProductos.add(jButtonid_bodegaDiferenciasFisicasProductosUpdate, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDiferenciasFisicasProductos.add(jComboBoxid_bodegaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDiferenciasFisicasProductos.add(jLabelid_productoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDiferenciasFisicasProductos.add(jButtonid_productoDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 3;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDiferenciasFisicasProductos.add(jButtonid_productoDiferenciasFisicasProductosUpdate, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDiferenciasFisicasProductos.add(jComboBoxid_productoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDiferenciasFisicasProductos.add(jLabelid_empresaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDiferenciasFisicasProductos.add(jButtonid_empresaDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 3;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDiferenciasFisicasProductos.add(jButtonid_empresaDiferenciasFisicasProductosUpdate, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDiferenciasFisicasProductos.add(jComboBoxid_empresaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDiferenciasFisicasProductos.add(jLabelid_sucursalDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDiferenciasFisicasProductos.add(jButtonid_sucursalDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 3;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDiferenciasFisicasProductos.add(jButtonid_sucursalDiferenciasFisicasProductosUpdate, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDiferenciasFisicasProductos.add(jComboBoxid_sucursalDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaDiferenciasFisicasProductos.add(jLabelid_lineaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDiferenciasFisicasProductos.add(jButtonid_lineaDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 3;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDiferenciasFisicasProductos.add(jButtonid_lineaDiferenciasFisicasProductosUpdate, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaDiferenciasFisicasProductos.add(jComboBoxid_lineaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoDiferenciasFisicasProductos.add(jLabelid_linea_grupoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoDiferenciasFisicasProductos.add(jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 3;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoDiferenciasFisicasProductos.add(jButtonid_linea_grupoDiferenciasFisicasProductosUpdate, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoDiferenciasFisicasProductos.add(jComboBoxid_linea_grupoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaDiferenciasFisicasProductos.add(jLabelid_linea_categoriaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaDiferenciasFisicasProductos.add(jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 3;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaDiferenciasFisicasProductos.add(jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaDiferenciasFisicasProductos.add(jComboBoxid_linea_categoriaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaDiferenciasFisicasProductos.add(jLabelid_linea_marcaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaDiferenciasFisicasProductos.add(jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 3;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaDiferenciasFisicasProductos.add(jButtonid_linea_marcaDiferenciasFisicasProductosUpdate, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaDiferenciasFisicasProductos.add(jComboBoxid_linea_marcaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos.add(jLabelfecha_ultima_venta_hastaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos.add(jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos.add(jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDiferenciasFisicasProductos.add(jLabelcodigoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDiferenciasFisicasProductos.add(jButtoncodigoDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDiferenciasFisicasProductos.add(jscrollPanecodigoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadDiferenciasFisicasProductos.add(jLabelnombre_unidadDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadDiferenciasFisicasProductos.add(jButtonnombre_unidadDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadDiferenciasFisicasProductos.add(jTextFieldnombre_unidadDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleDiferenciasFisicasProductos.add(jLabelcantidad_disponibleDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleDiferenciasFisicasProductos.add(jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleDiferenciasFisicasProductos.add(jTextFieldcantidad_disponibleDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_fisicaDiferenciasFisicasProductos.add(jLabelcantidad_fisicaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_fisicaDiferenciasFisicasProductos.add(jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_fisicaDiferenciasFisicasProductos.add(jTextFieldcantidad_fisicaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoDiferenciasFisicasProductos.add(jLabelcodigo_productoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoDiferenciasFisicasProductos.add(jButtoncodigo_productoDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoDiferenciasFisicasProductos.add(jTextFieldcodigo_productoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDiferenciasFisicasProductos.add(jLabelnombreDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDiferenciasFisicasProductos.add(jButtonnombreDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDiferenciasFisicasProductos.add(jscrollPanenombreDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingresosDiferenciasFisicasProductos.add(jLabelingresosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelingresosDiferenciasFisicasProductos.add(jButtoningresosDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingresosDiferenciasFisicasProductos.add(jTextFieldingresosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelegresosDiferenciasFisicasProductos.add(jLabelegresosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelegresosDiferenciasFisicasProductos.add(jButtonegresosDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelegresosDiferenciasFisicasProductos.add(jTextFieldegresosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponible_corteDiferenciasFisicasProductos.add(jLabeldisponible_corteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponible_corteDiferenciasFisicasProductos.add(jButtondisponible_corteDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponible_corteDiferenciasFisicasProductos.add(jTextFielddisponible_corteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiferenciaDiferenciasFisicasProductos.add(jLabeldiferenciaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiferenciaDiferenciasFisicasProductos.add(jButtondiferenciaDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiferenciaDiferenciasFisicasProductos.add(jTextFielddiferenciaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoDiferenciasFisicasProductos.add(jLabelcostoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDiferenciasFisicasProductos.add(jButtoncostoDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoDiferenciasFisicasProductos.add(jTextFieldcostoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDiferenciasFisicasProductos.add(jLabeltotalDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 2;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDiferenciasFisicasProductos.add(jButtontotalDiferenciasFisicasProductosBusqueda, this.gridBagConstraintsDiferenciasFisicasProductos);
	}

	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDiferenciasFisicasProductos.add(jTextFieldtotalDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelidDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelid_bodegaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelid_productoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelid_lineaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelid_linea_grupoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelid_linea_categoriaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelid_linea_marcaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelcodigoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelnombre_unidadDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelcantidad_disponibleDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelcantidad_fisicaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelcodigo_productoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelnombreDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelingresosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelegresosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPaneldisponible_corteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPaneldiferenciaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPanelcostoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiferenciasFisicasProductos.add(this.jPaneltotalDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposDiferenciasFisicasProductos=0;
		iYPanelCamposDiferenciasFisicasProductos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposOcultosDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposOcultosDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiferenciasFisicasProductos.add(this.jPanelid_empresaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposOcultosDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposOcultosDiferenciasFisicasProductos=0;
		iYPanelCamposOcultosDiferenciasFisicasProductos++;
	}
	this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iYPanelCamposOcultosDiferenciasFisicasProductos;
	this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iXPanelCamposOcultosDiferenciasFisicasProductos++;
	this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiferenciasFisicasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiferenciasFisicasProductos.add(this.jPanelid_sucursalDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);



	if(iXPanelCamposOcultosDiferenciasFisicasProductos % 2==0) {
		iXPanelCamposOcultosDiferenciasFisicasProductos=0;
		iYPanelCamposOcultosDiferenciasFisicasProductos++;
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
			
		GridBagLayout gridaBagLayoutAccionesDiferenciasFisicasProductos= new GridBagLayout();
		this.jPanelAccionesDiferenciasFisicasProductos.setLayout(gridaBagLayoutAccionesDiferenciasFisicasProductos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDiferenciasFisicasProductos= new GridBagLayout();
		this.jPanelAccionesFormularioDiferenciasFisicasProductos.setLayout(gridaBagLayoutAccionesFormularioDiferenciasFisicasProductos);
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDiferenciasFisicasProductos.add(this.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccion++;
			
		this.jPanelAccionesDiferenciasFisicasProductos.add(this.jButtonModificarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);							

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iPosXAccion++;
			
		this.jPanelAccionesDiferenciasFisicasProductos.add(this.jButtonEliminarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
			
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesDiferenciasFisicasProductos.add(this.jButtonActualizarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesDiferenciasFisicasProductos.add(this.jButtonGuardarCambiosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);	
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iPosXAccion++;
		
		this.jPanelAccionesDiferenciasFisicasProductos.add(this.jButtonCancelarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDiferenciasFisicasProductos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();						
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;		
			//this.gridBagConstraintsDiferenciasFisicasProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx =0;
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDiferenciasFisicasProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDiferenciasFisicasProductos = new DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Diferencias Fisicas Productos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Diferencias Fisicas Productos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Diferencias Fisicas Productos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DiferenciasFisicasProductosModel diferenciasfisicasproductosModel=new DiferenciasFisicasProductosModel(this);
			
			//SI USARA CLASE INTERNA
			//DiferenciasFisicasProductosModel.DiferenciasFisicasProductosFocusTraversalPolicy diferenciasfisicasproductosFocusTraversalPolicy = diferenciasfisicasproductosModel.new DiferenciasFisicasProductosFocusTraversalPolicy(this);
			
			//diferenciasfisicasproductosFocusTraversalPolicy.setdiferenciasfisicasproductosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(diferenciasfisicasproductosModel);
			
			
			this.jContentPaneDetalleDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDiferenciasFisicasProductos = new GridBagLayout();	
			this.jContentPaneDetalleDiferenciasFisicasProductos.setLayout(gridaBagLayoutDetalleDiferenciasFisicasProductos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDiferenciasFisicasProductos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
				this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
					
				
				this.jContentPaneDetalleDiferenciasFisicasProductos.add(jTtoolBarDetalleDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);								
				
}
			
			this.jScrollPanelDatosEdicionDiferenciasFisicasProductos=   new JScrollPane(jContentPaneDetalleDiferenciasFisicasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDiferenciasFisicasProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	        
			this.jContentPaneDetalleDiferenciasFisicasProductos.add(jPanelCamposDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);
			
			
			
			
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
						//&& diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDiferenciasFisicasProductos= new GridBagConstraints();
						this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
						this.jContentPaneDetalleDiferenciasFisicasProductos.add(this.jTabbedPaneRelacionesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDiferenciasFisicasProductos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDiferenciasFisicasProductos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
					this.gridBagConstraintsDiferenciasFisicasProductos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
					
				
					this.jContentPaneDetalleDiferenciasFisicasProductos.add(jPanelCamposOcultosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);
				
					this.jPanelCamposOcultosDiferenciasFisicasProductos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	        this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDiferenciasFisicasProductos.add(this.jPanelAccionesFormularioDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);							
			
			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
	        this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
	        
			
			this.jContentPaneDetalleDiferenciasFisicasProductos.add(this.jPanelAccionesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDiferenciasFisicasProductos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDiferenciasFisicasProductos=   new JScrollPane(this.jPanelCamposDiferenciasFisicasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDiferenciasFisicasProductos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			
			
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
			
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDiferenciasFisicasProductos;//jContentPane;
		
		return jScrollPanelDatosEdicionDiferenciasFisicasProductos;
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
