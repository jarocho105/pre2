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
import com.bydan.erp.inventario.util.report.DisponiblesCostosConstantesFunciones;

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
public class DisponiblesCostosDetalleFormJInternalFrame extends DisponiblesCostosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDisponiblesCostos;
	
	protected JMenuBar jmenuBarDetalleDisponiblesCostos;
	
	protected JMenu jmenuDetalleDisponiblesCostos;
	protected JMenu jmenuDetalleArchivoDisponiblesCostos;
	protected JMenu jmenuDetalleAccionesDisponiblesCostos;
	protected JMenu jmenuDetalleDatosDisponiblesCostos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDisponiblesCostos;	
	protected GridBagConstraints gridBagConstraintsDisponiblesCostos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DisponiblesCostosBeanSwingJInternalFrameAdditional jInternalFrameDetalleDisponiblesCostos;		
	
	
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
	
	public DisponiblesCostosSessionBean disponiblescostosSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public DisponiblesCostosLogic disponiblescostosLogic;
	
	public JScrollPane jScrollPanelDatosDisponiblesCostos;
	public JScrollPane jScrollPanelDatosEdicionDisponiblesCostos;
	public JScrollPane jScrollPanelDatosGeneralDisponiblesCostos;
	
	protected JPanel jPanelCamposDisponiblesCostos;    
	protected JPanel jPanelCamposOcultosDisponiblesCostos;    	
	protected JPanel jPanelAccionesDisponiblesCostos;
	protected JPanel jPanelAccionesFormularioDisponiblesCostos;
    
	
	
	protected Integer iXPanelCamposDisponiblesCostos=0;
	protected Integer iYPanelCamposDisponiblesCostos=0;
	
	protected Integer iXPanelCamposOcultosDisponiblesCostos=0;
	protected Integer iYPanelCamposOcultosDisponiblesCostos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDisponiblesCostos;
	public JButton jButtonModificarDisponiblesCostos;
	public JButton jButtonActualizarDisponiblesCostos;
    public JButton jButtonEliminarDisponiblesCostos;
	public JButton jButtonCancelarDisponiblesCostos;
    public JButton jButtonGuardarCambiosDisponiblesCostos;
	public JButton jButtonGuardarCambiosTablaDisponiblesCostos;
	protected JButton jButtonCerrarDisponiblesCostos;
	
	
	protected JButton jButtonProcesarInformacionDisponiblesCostos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDisponiblesCostos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDisponiblesCostos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDisponiblesCostos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDisponiblesCostos;
	protected JButton jButtonModificarToolBarDisponiblesCostos;
	protected JButton jButtonActualizarToolBarDisponiblesCostos;
    protected JButton jButtonEliminarToolBarDisponiblesCostos;
	protected JButton jButtonCancelarToolBarDisponiblesCostos;
    protected JButton jButtonGuardarCambiosToolBarDisponiblesCostos;
	protected JButton jButtonGuardarCambiosTablaToolBarDisponiblesCostos;
	protected JButton jButtonMostrarOcultarTablaToolBarDisponiblesCostos;
	protected JButton jButtonCerrarToolBarDisponiblesCostos;
	
	protected JButton jButtonProcesarInformacionToolBarDisponiblesCostos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDisponiblesCostos;
	protected JMenuItem jMenuItemModificarDisponiblesCostos;
	protected JMenuItem jMenuItemActualizarDisponiblesCostos;
    protected JMenuItem jMenuItemEliminarDisponiblesCostos;
	protected JMenuItem jMenuItemCancelarDisponiblesCostos;
    protected JMenuItem jMenuItemGuardarCambiosDisponiblesCostos;
	protected JMenuItem jMenuItemGuardarCambiosTablaDisponiblesCostos;
	protected JMenuItem jMenuItemCerrarDisponiblesCostos;
	protected JMenuItem jMenuItemDetalleCerrarDisponiblesCostos;
	protected JMenuItem jMenuItemDetalleMostarOcultarDisponiblesCostos;
	
	protected JMenuItem jMenuItemProcesarInformacionDisponiblesCostos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDisponiblesCostos;
	protected JMenuItem jMenuItemMostrarOcultarDisponiblesCostos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDisponiblesCostos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDisponiblesCostos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDisponiblesCostos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDisponiblesCostos;
	public JLabel jLabelIdDisponiblesCostos;
	public JLabel jLabelidDisponiblesCostos;
	public JButton jButtonidDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaDisponiblesCostos;
	public JLabel jLabelfecha_emision_hastaDisponiblesCostos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaDisponiblesCostos;

	public JDateChooser jDateChooserfecha_emision_hastaDisponiblesCostos;
	public JButton jButtonfecha_emision_hastaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalDisponiblesCostos;
	public JLabel jLabelnombre_sucursalDisponiblesCostos;
	public JTextArea jTextAreanombre_sucursalDisponiblesCostos;
	public JScrollPane jscrollPanenombre_sucursalDisponiblesCostos;
	public JButton jButtonnombre_sucursalDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaDisponiblesCostos;
	public JLabel jLabelnombre_lineaDisponiblesCostos;
	public JTextArea jTextAreanombre_lineaDisponiblesCostos;
	public JScrollPane jscrollPanenombre_lineaDisponiblesCostos;
	public JButton jButtonnombre_lineaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoDisponiblesCostos;
	public JLabel jLabelnombre_linea_grupoDisponiblesCostos;
	public JTextArea jTextAreanombre_linea_grupoDisponiblesCostos;
	public JScrollPane jscrollPanenombre_linea_grupoDisponiblesCostos;
	public JButton jButtonnombre_linea_grupoDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaDisponiblesCostos;
	public JLabel jLabelnombre_linea_categoriaDisponiblesCostos;
	public JTextArea jTextAreanombre_linea_categoriaDisponiblesCostos;
	public JScrollPane jscrollPanenombre_linea_categoriaDisponiblesCostos;
	public JButton jButtonnombre_linea_categoriaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaDisponiblesCostos;
	public JLabel jLabelnombre_linea_marcaDisponiblesCostos;
	public JTextArea jTextAreanombre_linea_marcaDisponiblesCostos;
	public JScrollPane jscrollPanenombre_linea_marcaDisponiblesCostos;
	public JButton jButtonnombre_linea_marcaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDisponiblesCostos;
	public JLabel jLabelcodigoDisponiblesCostos;
	public JTextField jTextFieldcodigoDisponiblesCostos;
	public JButton jButtoncodigoDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombreDisponiblesCostos;
	public JLabel jLabelnombreDisponiblesCostos;
	public JTextArea jTextAreanombreDisponiblesCostos;
	public JScrollPane jscrollPanenombreDisponiblesCostos;
	public JButton jButtonnombreDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaDisponiblesCostos;
	public JLabel jLabelnombre_bodegaDisponiblesCostos;
	public JTextArea jTextAreanombre_bodegaDisponiblesCostos;
	public JScrollPane jscrollPanenombre_bodegaDisponiblesCostos;
	public JButton jButtonnombre_bodegaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadDisponiblesCostos;
	public JLabel jLabelnombre_unidadDisponiblesCostos;
	public JTextField jTextFieldnombre_unidadDisponiblesCostos;
	public JButton jButtonnombre_unidadDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelingresosDisponiblesCostos;
	public JLabel jLabelingresosDisponiblesCostos;
	public JTextField jTextFieldingresosDisponiblesCostos;
	public JButton jButtoningresosDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelegresosDisponiblesCostos;
	public JLabel jLabelegresosDisponiblesCostos;
	public JTextField jTextFieldegresosDisponiblesCostos;
	public JButton jButtonegresosDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPaneldisponible_corteDisponiblesCostos;
	public JLabel jLabeldisponible_corteDisponiblesCostos;
	public JTextField jTextFielddisponible_corteDisponiblesCostos;
	public JButton jButtondisponible_corteDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelcostoDisponiblesCostos;
	public JLabel jLabelcostoDisponiblesCostos;
	public JTextField jTextFieldcostoDisponiblesCostos;
	public JButton jButtoncostoDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPaneltotalDisponiblesCostos;
	public JLabel jLabeltotalDisponiblesCostos;
	public JTextField jTextFieldtotalDisponiblesCostos;
	public JButton jButtontotalDisponiblesCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaDisponiblesCostos;
	public JLabel jLabelid_bodegaDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDisponiblesCostos;
	public JButton jButtonid_bodegaDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_bodegaDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDisponiblesCostos;
	public JLabel jLabelid_productoDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDisponiblesCostos;
	public JButton jButtonid_productoDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_productoDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_productoDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDisponiblesCostos;
	public JLabel jLabelid_empresaDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDisponiblesCostos;
	public JButton jButtonid_empresaDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_empresaDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_empresaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDisponiblesCostos;
	public JLabel jLabelid_sucursalDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDisponiblesCostos;
	public JButton jButtonid_sucursalDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_sucursalDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaDisponiblesCostos;
	public JLabel jLabelid_lineaDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaDisponiblesCostos;
	public JButton jButtonid_lineaDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_lineaDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_lineaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoDisponiblesCostos;
	public JLabel jLabelid_linea_grupoDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoDisponiblesCostos;
	public JButton jButtonid_linea_grupoDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_linea_grupoDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaDisponiblesCostos;
	public JLabel jLabelid_linea_categoriaDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaDisponiblesCostos;
	public JButton jButtonid_linea_categoriaDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_linea_categoriaDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaDisponiblesCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaDisponiblesCostos;
	public JLabel jLabelid_linea_marcaDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaDisponiblesCostos;
	public JButton jButtonid_linea_marcaDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_linea_marcaDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaDisponiblesCostosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDisponiblesCostos;
	
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
	public int iHeightFormulario=696;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DisponiblesCostosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDisponiblesCostos=new JPanel();
				this.jPanelAccionesFormularioDisponiblesCostos=new JPanel();
				this.jmenuBarDetalleDisponiblesCostos=new JMenuBar();
				this.jTtoolBarDetalleDisponiblesCostos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DisponiblesCostosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DisponiblesCostosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DisponiblesCostosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DisponiblesCostosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DisponiblesCostosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDisponiblesCostos() {
		return this.jButtonActualizarToolBarDisponiblesCostos;
	}
	
	public JButton getjButtonEliminarToolBarDisponiblesCostos() {
		return this.jButtonEliminarToolBarDisponiblesCostos;
	}
	
	public JButton getjButtonCancelarToolBarDisponiblesCostos() {
		return this.jButtonCancelarToolBarDisponiblesCostos;
	}		
	
	public JButton getjButtonProcesarInformacionDisponiblesCostos() {
		return this.jButtonProcesarInformacionDisponiblesCostos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDisponiblesCostos)	{
		this.jButtonProcesarInformacionDisponiblesCostos = jButtonProcesarInformacionDisponiblesCostos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDisponiblesCostos() {
		return this.jComboBoxTiposAccionesDisponiblesCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDisponiblesCostos(
			JComboBox jComboBoxTiposRelacionesDisponiblesCostos) {
		this.jComboBoxTiposRelacionesDisponiblesCostos = jComboBoxTiposRelacionesDisponiblesCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDisponiblesCostos(
			JComboBox jComboBoxTiposAccionesDisponiblesCostos) {
		this.jComboBoxTiposAccionesDisponiblesCostos = jComboBoxTiposAccionesDisponiblesCostos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDisponiblesCostos() {
		return this.jComboBoxTiposAccionesFormularioDisponiblesCostos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDisponiblesCostos(
			JComboBox jComboBoxTiposAccionesFormularioDisponiblesCostos) {
		this.jComboBoxTiposAccionesFormularioDisponiblesCostos = jComboBoxTiposAccionesFormularioDisponiblesCostos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
		
		this.disponiblescostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.disponiblescostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.disponiblescostosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DisponiblesCostosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DisponiblesCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DisponiblesCostosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Disponibles Costos MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
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
	
		DisponiblesCostosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDisponiblesCostos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDisponiblesCostos=new JButtonMe();
				this.jButtonModificarToolBarDisponiblesCostos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDisponiblesCostos,this.jTtoolBarDetalleDisponiblesCostos,
							"actualizar","actualizar","Actualizar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDisponiblesCostos,this.jTtoolBarDetalleDisponiblesCostos,
							"eliminar","eliminar","Eliminar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDisponiblesCostos,this.jTtoolBarDetalleDisponiblesCostos,
							"cancelar","cancelar","Cancelar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDisponiblesCostos,this.jTtoolBarDetalleDisponiblesCostos,
							"guardarcambios","guardarcambios","Guardar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDisponiblesCostos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDisponiblesCostos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDisponiblesCostos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDisponiblesCostos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDisponiblesCostos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDisponiblesCostos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDisponiblesCostos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDisponiblesCostos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDisponiblesCostos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDisponiblesCostos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDisponiblesCostos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDisponiblesCostos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDisponiblesCostos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDisponiblesCostos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDisponiblesCostos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDisponiblesCostos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDisponiblesCostos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDisponiblesCostos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDisponiblesCostos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDisponiblesCostos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDisponiblesCostos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDisponiblesCostos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDisponiblesCostos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDisponiblesCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDisponiblesCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDisponiblesCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDisponiblesCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDisponiblesCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDisponiblesCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDisponiblesCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDisponiblesCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDisponiblesCostos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDisponiblesCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDisponiblesCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDisponiblesCostos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDisponiblesCostos.add(this.jMenuItemDetalleCerrarDisponiblesCostos);
		
		this.jmenuDetalleAccionesDisponiblesCostos.add(this.jMenuItemActualizarDisponiblesCostos);
		this.jmenuDetalleAccionesDisponiblesCostos.add(this.jMenuItemEliminarDisponiblesCostos);
		this.jmenuDetalleAccionesDisponiblesCostos.add(this.jMenuItemCancelarDisponiblesCostos);		
		
		//this.jmenuDetalleDatosDisponiblesCostos.add(this.jMenuItemDetalleAbrirOrderByDisponiblesCostos);				
		this.jmenuDetalleDatosDisponiblesCostos.add(this.jMenuItemDetalleMostarOcultarDisponiblesCostos);				
				
		//this.jmenuDetalleAccionesDisponiblesCostos.add(this.jMenuItemGuardarCambiosDisponiblesCostos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDisponiblesCostos.add(this.jmenuDetalleArchivoDisponiblesCostos);		
		this.jmenuBarDetalleDisponiblesCostos.add(this.jmenuDetalleAccionesDisponiblesCostos);		
		this.jmenuBarDetalleDisponiblesCostos.add(this.jmenuDetalleDatosDisponiblesCostos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDisponiblesCostos);				
	}
	
	
	public void inicializarElementosCamposDisponiblesCostos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDisponiblesCostos = new JLabelMe();
		jLabelIdDisponiblesCostos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDisponiblesCostos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDisponiblesCostos= new GridBagLayout();

		this.jPanelidDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);

		jLabelidDisponiblesCostos = new JLabel();
		jLabelidDisponiblesCostos.setText("Id");

		jLabelidDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_hastaDisponiblesCostos = new JLabelMe();
		this.jLabelfecha_emision_hastaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaDisponiblesCostos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelfecha_emision_hastaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		//jFormattedTextFieldfecha_emision_hastaDisponiblesCostos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaDisponiblesCostos= new JDateChooser();
		jDateChooserfecha_emision_hastaDisponiblesCostos.setEnabled(false);
		jDateChooserfecha_emision_hastaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaDisponiblesCostos.setDate(new Date());
		jDateChooserfecha_emision_hastaDisponiblesCostos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaDisponiblesCostos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalDisponiblesCostos = new JLabelMe();
		this.jLabelnombre_sucursalDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalDisponiblesCostos.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelnombre_sucursalDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextAreanombre_sucursalDisponiblesCostos= new JTextAreaMe();
		jTextAreanombre_sucursalDisponiblesCostos.setEnabled(false);
		jTextAreanombre_sucursalDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalDisponiblesCostos.setLineWrap(true);
		jTextAreanombre_sucursalDisponiblesCostos.setWrapStyleWord(true);
		jTextAreanombre_sucursalDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalDisponiblesCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalDisponiblesCostos = new JScrollPane(jTextAreanombre_sucursalDisponiblesCostos);
		jscrollPanenombre_sucursalDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_sucursalDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalDisponiblesCostosBusqueda.setText("U");
		this.jButtonnombre_sucursalDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaDisponiblesCostos = new JLabelMe();
		this.jLabelnombre_lineaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaDisponiblesCostos.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelnombre_lineaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextAreanombre_lineaDisponiblesCostos= new JTextAreaMe();
		jTextAreanombre_lineaDisponiblesCostos.setEnabled(false);
		jTextAreanombre_lineaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaDisponiblesCostos.setLineWrap(true);
		jTextAreanombre_lineaDisponiblesCostos.setWrapStyleWord(true);
		jTextAreanombre_lineaDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaDisponiblesCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaDisponiblesCostos = new JScrollPane(jTextAreanombre_lineaDisponiblesCostos);
		jscrollPanenombre_lineaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_lineaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_lineaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_lineaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonnombre_lineaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaDisponiblesCostosBusqueda.setText("U");
		this.jButtonnombre_lineaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoDisponiblesCostos = new JLabelMe();
		this.jLabelnombre_linea_grupoDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoDisponiblesCostos.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelnombre_linea_grupoDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextAreanombre_linea_grupoDisponiblesCostos= new JTextAreaMe();
		jTextAreanombre_linea_grupoDisponiblesCostos.setEnabled(false);
		jTextAreanombre_linea_grupoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoDisponiblesCostos.setLineWrap(true);
		jTextAreanombre_linea_grupoDisponiblesCostos.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoDisponiblesCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoDisponiblesCostos = new JScrollPane(jTextAreanombre_linea_grupoDisponiblesCostos);
		jscrollPanenombre_linea_grupoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_grupoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_grupoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.setText("U");
		this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaDisponiblesCostos = new JLabelMe();
		this.jLabelnombre_linea_categoriaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaDisponiblesCostos.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelnombre_linea_categoriaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextAreanombre_linea_categoriaDisponiblesCostos= new JTextAreaMe();
		jTextAreanombre_linea_categoriaDisponiblesCostos.setEnabled(false);
		jTextAreanombre_linea_categoriaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaDisponiblesCostos.setLineWrap(true);
		jTextAreanombre_linea_categoriaDisponiblesCostos.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaDisponiblesCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaDisponiblesCostos = new JScrollPane(jTextAreanombre_linea_categoriaDisponiblesCostos);
		jscrollPanenombre_linea_categoriaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_categoriaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_categoriaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaDisponiblesCostos = new JLabelMe();
		this.jLabelnombre_linea_marcaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaDisponiblesCostos.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelnombre_linea_marcaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextAreanombre_linea_marcaDisponiblesCostos= new JTextAreaMe();
		jTextAreanombre_linea_marcaDisponiblesCostos.setEnabled(false);
		jTextAreanombre_linea_marcaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaDisponiblesCostos.setLineWrap(true);
		jTextAreanombre_linea_marcaDisponiblesCostos.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaDisponiblesCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaDisponiblesCostos = new JScrollPane(jTextAreanombre_linea_marcaDisponiblesCostos);
		jscrollPanenombre_linea_marcaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_marcaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_linea_marcaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.setText("U");
		this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoDisponiblesCostos = new JLabelMe();
		this.jLabelcodigoDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDisponiblesCostos.setToolTipText("Codigo");
		this.jLabelcodigoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelcodigoDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextFieldcodigoDisponiblesCostos= new JTextFieldMe();

		jTextFieldcodigoDisponiblesCostos.setEnabled(false);
		jTextFieldcodigoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtoncodigoDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDisponiblesCostosBusqueda.setText("U");
		this.jButtoncodigoDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombreDisponiblesCostos = new JLabelMe();
		this.jLabelnombreDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDisponiblesCostos.setToolTipText("Nombre");
		this.jLabelnombreDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelnombreDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextAreanombreDisponiblesCostos= new JTextAreaMe();
		jTextAreanombreDisponiblesCostos.setEnabled(false);
		jTextAreanombreDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDisponiblesCostos.setLineWrap(true);
		jTextAreanombreDisponiblesCostos.setWrapStyleWord(true);
		jTextAreanombreDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDisponiblesCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDisponiblesCostos = new JScrollPane(jTextAreanombreDisponiblesCostos);
		jscrollPanenombreDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombreDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonnombreDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDisponiblesCostosBusqueda.setText("U");
		this.jButtonnombreDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaDisponiblesCostos = new JLabelMe();
		this.jLabelnombre_bodegaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaDisponiblesCostos.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelnombre_bodegaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextAreanombre_bodegaDisponiblesCostos= new JTextAreaMe();
		jTextAreanombre_bodegaDisponiblesCostos.setEnabled(false);
		jTextAreanombre_bodegaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaDisponiblesCostos.setLineWrap(true);
		jTextAreanombre_bodegaDisponiblesCostos.setWrapStyleWord(true);
		jTextAreanombre_bodegaDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaDisponiblesCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaDisponiblesCostos = new JScrollPane(jTextAreanombre_bodegaDisponiblesCostos);
		jscrollPanenombre_bodegaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_bodegaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_bodegaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_bodegaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaDisponiblesCostosBusqueda.setText("U");
		this.jButtonnombre_bodegaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadDisponiblesCostos = new JLabelMe();
		this.jLabelnombre_unidadDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadDisponiblesCostos.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelnombre_unidadDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextFieldnombre_unidadDisponiblesCostos= new JTextFieldMe();

		jTextFieldnombre_unidadDisponiblesCostos.setEnabled(false);
		jTextFieldnombre_unidadDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadDisponiblesCostosBusqueda.setText("U");
		this.jButtonnombre_unidadDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelingresosDisponiblesCostos = new JLabelMe();
		this.jLabelingresosDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_INGRESOS+" : *");
		this.jLabelingresosDisponiblesCostos.setToolTipText("Ingresos");
		this.jLabelingresosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingresosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingresosDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingresosDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_INGRESOS);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelingresosDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextFieldingresosDisponiblesCostos= new JTextFieldMe();
		jTextFieldingresosDisponiblesCostos.setEnabled(false);
		jTextFieldingresosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingresosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingresosDisponiblesCostos.setText("0.0");

		this.jButtoningresosDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtoningresosDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningresosDisponiblesCostosBusqueda.setText("U");
		this.jButtoningresosDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningresosDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningresosDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingresosDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingresosDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingresosDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningresosDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelegresosDisponiblesCostos = new JLabelMe();
		this.jLabelegresosDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_EGRESOS+" : *");
		this.jLabelegresosDisponiblesCostos.setToolTipText("Egresos");
		this.jLabelegresosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelegresosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelegresosDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelegresosDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_EGRESOS);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelegresosDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextFieldegresosDisponiblesCostos= new JTextFieldMe();
		jTextFieldegresosDisponiblesCostos.setEnabled(false);
		jTextFieldegresosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldegresosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldegresosDisponiblesCostos.setText("0.0");

		this.jButtonegresosDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonegresosDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonegresosDisponiblesCostosBusqueda.setText("U");
		this.jButtonegresosDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonegresosDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonegresosDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldegresosDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldegresosDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"egresosDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonegresosDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabeldisponible_corteDisponiblesCostos = new JLabelMe();
		this.jLabeldisponible_corteDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE+" : *");
		this.jLabeldisponible_corteDisponiblesCostos.setToolTipText("Disponible Corte");
		this.jLabeldisponible_corteDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldisponible_corteDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldisponible_corteDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponible_corteDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponible_corteDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponible_corteDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPaneldisponible_corteDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextFielddisponible_corteDisponiblesCostos= new JTextFieldMe();
		jTextFielddisponible_corteDisponiblesCostos.setEnabled(false);
		jTextFielddisponible_corteDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponible_corteDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponible_corteDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponible_corteDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponible_corteDisponiblesCostos.setText("0.0");

		this.jButtondisponible_corteDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtondisponible_corteDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponible_corteDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponible_corteDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponible_corteDisponiblesCostosBusqueda.setText("U");
		this.jButtondisponible_corteDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponible_corteDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponible_corteDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponible_corteDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponible_corteDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponible_corteDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponible_corteDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabelcostoDisponiblesCostos = new JLabelMe();
		this.jLabelcostoDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDisponiblesCostos.setToolTipText("Costo");
		this.jLabelcostoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelcostoDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextFieldcostoDisponiblesCostos= new JTextFieldMe();
		jTextFieldcostoDisponiblesCostos.setEnabled(false);
		jTextFieldcostoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDisponiblesCostos.setText("0.0");

		this.jButtoncostoDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtoncostoDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDisponiblesCostosBusqueda.setText("U");
		this.jButtoncostoDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDisponiblesCostosBusqueda.setVisible(false);		}


					
		this.jLabeltotalDisponiblesCostos = new JLabelMe();
		this.jLabeltotalDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDisponiblesCostos.setToolTipText("Total");
		this.jLabeltotalDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPaneltotalDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jTextFieldtotalDisponiblesCostos= new JTextFieldMe();
		jTextFieldtotalDisponiblesCostos.setEnabled(false);
		jTextFieldtotalDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDisponiblesCostos.setText("0.0");

		this.jButtontotalDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtontotalDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDisponiblesCostosBusqueda.setText("U");
		this.jButtontotalDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDisponiblesCostosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDisponiblesCostos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaDisponiblesCostos = new JLabelMe();
		this.jLabelid_bodegaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDisponiblesCostos.setToolTipText("Bodega");
		this.jLabelid_bodegaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelid_bodegaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jComboBoxid_bodegaDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_bodegaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDisponiblesCostos= new JButtonMe();
		this.jButtonid_bodegaDisponiblesCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDisponiblesCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDisponiblesCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDisponiblesCostos.setText("Buscar");
		this.jButtonid_bodegaDisponiblesCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDisponiblesCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDisponiblesCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDisponiblesCostos"));

		this.jButtonid_bodegaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonid_bodegaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDisponiblesCostosBusqueda.setText("U");
		this.jButtonid_bodegaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDisponiblesCostosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDisponiblesCostosUpdate= new JButtonMe();
		this.jButtonid_bodegaDisponiblesCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDisponiblesCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDisponiblesCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDisponiblesCostosUpdate.setText("U");
		this.jButtonid_bodegaDisponiblesCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDisponiblesCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDisponiblesCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDisponiblesCostosUpdate"));



					
		this.jLabelid_productoDisponiblesCostos = new JLabelMe();
		this.jLabelid_productoDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDisponiblesCostos.setToolTipText("Producto");
		this.jLabelid_productoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelid_productoDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jComboBoxid_productoDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_productoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDisponiblesCostos= new JButtonMe();
		this.jButtonid_productoDisponiblesCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDisponiblesCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDisponiblesCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDisponiblesCostos.setText("Buscar");
		this.jButtonid_productoDisponiblesCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDisponiblesCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDisponiblesCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDisponiblesCostos"));

		this.jButtonid_productoDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonid_productoDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDisponiblesCostosBusqueda.setText("U");
		this.jButtonid_productoDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDisponiblesCostosBusqueda.setVisible(false);		}

		this.jButtonid_productoDisponiblesCostosUpdate= new JButtonMe();
		this.jButtonid_productoDisponiblesCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDisponiblesCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDisponiblesCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDisponiblesCostosUpdate.setText("U");
		this.jButtonid_productoDisponiblesCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDisponiblesCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDisponiblesCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDisponiblesCostosUpdate"));



					
		this.jLabelid_empresaDisponiblesCostos = new JLabelMe();
		this.jLabelid_empresaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDisponiblesCostos.setToolTipText("Empresa");
		this.jLabelid_empresaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelid_empresaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jComboBoxid_empresaDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_empresaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDisponiblesCostos.setEnabled(false);

		this.jButtonid_empresaDisponiblesCostos= new JButtonMe();
		this.jButtonid_empresaDisponiblesCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDisponiblesCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDisponiblesCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDisponiblesCostos.setText("Buscar");
		this.jButtonid_empresaDisponiblesCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDisponiblesCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDisponiblesCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDisponiblesCostos"));

		this.jButtonid_empresaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonid_empresaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDisponiblesCostosBusqueda.setText("U");
		this.jButtonid_empresaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDisponiblesCostosBusqueda.setVisible(false);		}

		this.jButtonid_empresaDisponiblesCostosUpdate= new JButtonMe();
		this.jButtonid_empresaDisponiblesCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDisponiblesCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDisponiblesCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDisponiblesCostosUpdate.setText("U");
		this.jButtonid_empresaDisponiblesCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDisponiblesCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDisponiblesCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDisponiblesCostosUpdate"));



					
		this.jLabelid_sucursalDisponiblesCostos = new JLabelMe();
		this.jLabelid_sucursalDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDisponiblesCostos.setToolTipText("Sucursal");
		this.jLabelid_sucursalDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelid_sucursalDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jComboBoxid_sucursalDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_sucursalDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDisponiblesCostos.setEnabled(false);

		this.jButtonid_sucursalDisponiblesCostos= new JButtonMe();
		this.jButtonid_sucursalDisponiblesCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDisponiblesCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDisponiblesCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDisponiblesCostos.setText("Buscar");
		this.jButtonid_sucursalDisponiblesCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDisponiblesCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDisponiblesCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDisponiblesCostos"));

		this.jButtonid_sucursalDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonid_sucursalDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDisponiblesCostosBusqueda.setText("U");
		this.jButtonid_sucursalDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDisponiblesCostosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDisponiblesCostosUpdate= new JButtonMe();
		this.jButtonid_sucursalDisponiblesCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDisponiblesCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDisponiblesCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDisponiblesCostosUpdate.setText("U");
		this.jButtonid_sucursalDisponiblesCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDisponiblesCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDisponiblesCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDisponiblesCostosUpdate"));



					
		this.jLabelid_lineaDisponiblesCostos = new JLabelMe();
		this.jLabelid_lineaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaDisponiblesCostos.setToolTipText("Linea");
		this.jLabelid_lineaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelid_lineaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jComboBoxid_lineaDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_lineaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaDisponiblesCostos= new JButtonMe();
		this.jButtonid_lineaDisponiblesCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDisponiblesCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDisponiblesCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDisponiblesCostos.setText("Buscar");
		this.jButtonid_lineaDisponiblesCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaDisponiblesCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDisponiblesCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDisponiblesCostos"));

		this.jButtonid_lineaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonid_lineaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDisponiblesCostosBusqueda.setText("U");
		this.jButtonid_lineaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaDisponiblesCostosBusqueda.setVisible(false);		}

		this.jButtonid_lineaDisponiblesCostosUpdate= new JButtonMe();
		this.jButtonid_lineaDisponiblesCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDisponiblesCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDisponiblesCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDisponiblesCostosUpdate.setText("U");
		this.jButtonid_lineaDisponiblesCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaDisponiblesCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDisponiblesCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDisponiblesCostosUpdate"));



					
		this.jLabelid_linea_grupoDisponiblesCostos = new JLabelMe();
		this.jLabelid_linea_grupoDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoDisponiblesCostos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelid_linea_grupoDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jComboBoxid_linea_grupoDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_linea_grupoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoDisponiblesCostos= new JButtonMe();
		this.jButtonid_linea_grupoDisponiblesCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDisponiblesCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDisponiblesCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoDisponiblesCostos.setText("Buscar");
		this.jButtonid_linea_grupoDisponiblesCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoDisponiblesCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDisponiblesCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDisponiblesCostos"));

		this.jButtonid_linea_grupoDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoDisponiblesCostosBusqueda.setText("U");
		this.jButtonid_linea_grupoDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoDisponiblesCostosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoDisponiblesCostosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoDisponiblesCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDisponiblesCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoDisponiblesCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoDisponiblesCostosUpdate.setText("U");
		this.jButtonid_linea_grupoDisponiblesCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoDisponiblesCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoDisponiblesCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoDisponiblesCostosUpdate"));



					
		this.jLabelid_linea_categoriaDisponiblesCostos = new JLabelMe();
		this.jLabelid_linea_categoriaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaDisponiblesCostos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelid_linea_categoriaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jComboBoxid_linea_categoriaDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_linea_categoriaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaDisponiblesCostos= new JButtonMe();
		this.jButtonid_linea_categoriaDisponiblesCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDisponiblesCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDisponiblesCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaDisponiblesCostos.setText("Buscar");
		this.jButtonid_linea_categoriaDisponiblesCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaDisponiblesCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDisponiblesCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDisponiblesCostos"));

		this.jButtonid_linea_categoriaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaDisponiblesCostosBusqueda.setText("U");
		this.jButtonid_linea_categoriaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaDisponiblesCostosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaDisponiblesCostosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaDisponiblesCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDisponiblesCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaDisponiblesCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaDisponiblesCostosUpdate.setText("U");
		this.jButtonid_linea_categoriaDisponiblesCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaDisponiblesCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaDisponiblesCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaDisponiblesCostosUpdate"));



					
		this.jLabelid_linea_marcaDisponiblesCostos = new JLabelMe();
		this.jLabelid_linea_marcaDisponiblesCostos.setText(""+DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaDisponiblesCostos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaDisponiblesCostos.setToolTipText(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		this.jPanelid_linea_marcaDisponiblesCostos.setLayout(this.gridaBagLayoutDisponiblesCostos);


		jComboBoxid_linea_marcaDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_linea_marcaDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaDisponiblesCostos= new JButtonMe();
		this.jButtonid_linea_marcaDisponiblesCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDisponiblesCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDisponiblesCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaDisponiblesCostos.setText("Buscar");
		this.jButtonid_linea_marcaDisponiblesCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaDisponiblesCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDisponiblesCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDisponiblesCostos"));

		this.jButtonid_linea_marcaDisponiblesCostosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaDisponiblesCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDisponiblesCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDisponiblesCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaDisponiblesCostosBusqueda.setText("U");
		this.jButtonid_linea_marcaDisponiblesCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaDisponiblesCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDisponiblesCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDisponiblesCostosBusqueda"));

		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaDisponiblesCostosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaDisponiblesCostosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaDisponiblesCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDisponiblesCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaDisponiblesCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaDisponiblesCostosUpdate.setText("U");
		this.jButtonid_linea_marcaDisponiblesCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaDisponiblesCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaDisponiblesCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaDisponiblesCostosUpdate"));



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
		//this.jInternalFrameDetalleDisponiblesCostos = new DisponiblesCostosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Disponibles Costos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDisponiblesCostos= new GridBagLayout();
		

		
		String sToolTipDisponiblesCostos="";
		sToolTipDisponiblesCostos=DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDisponiblesCostos+="(Inventario.DisponiblesCostos)";
		}
		
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			sToolTipDisponiblesCostos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDisponiblesCostos = new JButtonMe();
		this.jButtonModificarDisponiblesCostos = new JButtonMe();
        this.jButtonActualizarDisponiblesCostos = new JButtonMe();
        this.jButtonEliminarDisponiblesCostos = new JButtonMe();
        this.jButtonCancelarDisponiblesCostos = new JButtonMe();
        this.jButtonGuardarCambiosDisponiblesCostos = new JButtonMe();
		this.jButtonGuardarCambiosTablaDisponiblesCostos = new JButtonMe();
		this.jButtonCerrarDisponiblesCostos = new JButtonMe();
		
		this.jScrollPanelDatosDisponiblesCostos = new JScrollPane();   
        this.jScrollPanelDatosEdicionDisponiblesCostos = new JScrollPane();
		this.jScrollPanelDatosGeneralDisponiblesCostos = new JScrollPane();
				
		
		
		this.jPanelCamposDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Disponibles Costos";
		
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Disponibles Costoses" + this.sPath));
		} else {
			this.jScrollPanelDatosDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDisponiblesCostos.setName("jPanelCamposDisponiblesCostos"); 

		this.jPanelCamposOcultosDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDisponiblesCostos.setName("jPanelCamposOcultosDisponiblesCostos"); 

        this.jPanelAccionesDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDisponiblesCostos.setToolTipText("Acciones");
        this.jPanelAccionesDisponiblesCostos.setName("Acciones"); 

		this.jPanelAccionesFormularioDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDisponiblesCostos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDisponiblesCostos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDisponiblesCostos.setText("Nuevo");
		this.jButtonModificarDisponiblesCostos.setText("Editar");
        this.jButtonActualizarDisponiblesCostos.setText("Actualizar");
        this.jButtonEliminarDisponiblesCostos.setText("Eliminar");
        this.jButtonCancelarDisponiblesCostos.setText("Cancelar");
        this.jButtonGuardarCambiosDisponiblesCostos.setText("Guardar");
		this.jButtonGuardarCambiosTablaDisponiblesCostos.setText("Guardar");
		this.jButtonCerrarDisponiblesCostos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDisponiblesCostos,"nuevo_button","Nuevo",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDisponiblesCostos,"modificar_button","Editar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDisponiblesCostos,"actualizar_button","Actualizar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDisponiblesCostos,"eliminar_button","Eliminar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDisponiblesCostos,"cancelar_button","Cancelar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDisponiblesCostos,"guardarcambios_button","Guardar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDisponiblesCostos,"guardarcambiostabla_button","Guardar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDisponiblesCostos,"cerrar_button","Salir",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDisponiblesCostos.setToolTipText("Nuevo"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDisponiblesCostos.setToolTipText("Editar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDisponiblesCostos.setToolTipText("Actualizar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDisponiblesCostos.setToolTipText("Eliminar)"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDisponiblesCostos.setToolTipText("Cancelar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDisponiblesCostos.setToolTipText("Guardar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDisponiblesCostos.setToolTipText("Guardar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDisponiblesCostos.setToolTipText("Salir"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDisponiblesCostos";
		inputMap = this.jButtonNuevoDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDisponiblesCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDisponiblesCostos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDisponiblesCostos";
		inputMap = this.jButtonActualizarDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDisponiblesCostos"));
		
		//ELIMINAR
		sMapKey = "EliminarDisponiblesCostos";
		inputMap = this.jButtonEliminarDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDisponiblesCostos"));
		
		//CANCELAR	
		sMapKey = "CancelarDisponiblesCostos";
		inputMap = this.jButtonCancelarDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDisponiblesCostos"));
		
		//CERRAR		
		sMapKey = "CerrarDisponiblesCostos";
		inputMap = this.jButtonCerrarDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDisponiblesCostos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDisponiblesCostos";
		inputMap = this.jButtonGuardarCambiosTablaDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDisponiblesCostos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDisponiblesCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDisponiblesCostos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDisponiblesCostos.setToolTipText("Nuevo DisponiblesCostos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDisponiblesCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDisponiblesCostos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDisponiblesCostos.setToolTipText("Sin Cerrar Ventana DisponiblesCostos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDisponiblesCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDisponiblesCostos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDisponiblesCostos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDisponiblesCostos.setText("Accion");
		this.jComboBoxTiposAccionesDisponiblesCostos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDisponiblesCostos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDisponiblesCostos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDisponiblesCostos = new JLabelMe();
		
		this.jLabelAccionesDisponiblesCostos.setText("Acciones");		
		this.jLabelAccionesDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDisponiblesCostos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDisponiblesCostos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDisponiblesCostos=new JTabbedPane();
		this.jTabbedPaneRelacionesDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDisponiblesCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDisponiblesCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDisponiblesCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDisponiblesCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDisponiblesCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDisponiblesCostos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDisponiblesCostos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDisponiblesCostos = new GridBagLayout();
		
		this.jPanelCamposDisponiblesCostos.setLayout(gridaBagLayoutCamposDisponiblesCostos);
		this.jPanelCamposOcultosDisponiblesCostos.setLayout(gridaBagLayoutCamposOcultosDisponiblesCostos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDisponiblesCostos.add(jLabelIdDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDisponiblesCostos.add(jLabelidDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDisponiblesCostos.add(jLabelid_bodegaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDisponiblesCostos.add(jButtonid_bodegaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 3;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDisponiblesCostos.add(jButtonid_bodegaDisponiblesCostosUpdate, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDisponiblesCostos.add(jComboBoxid_bodegaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDisponiblesCostos.add(jLabelid_productoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDisponiblesCostos.add(jButtonid_productoDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 3;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDisponiblesCostos.add(jButtonid_productoDisponiblesCostosUpdate, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDisponiblesCostos.add(jComboBoxid_productoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDisponiblesCostos.add(jLabelid_empresaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDisponiblesCostos.add(jButtonid_empresaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 3;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDisponiblesCostos.add(jButtonid_empresaDisponiblesCostosUpdate, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDisponiblesCostos.add(jComboBoxid_empresaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDisponiblesCostos.add(jLabelid_sucursalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDisponiblesCostos.add(jButtonid_sucursalDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 3;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDisponiblesCostos.add(jButtonid_sucursalDisponiblesCostosUpdate, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDisponiblesCostos.add(jComboBoxid_sucursalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaDisponiblesCostos.add(jLabelid_lineaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDisponiblesCostos.add(jButtonid_lineaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 3;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDisponiblesCostos.add(jButtonid_lineaDisponiblesCostosUpdate, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaDisponiblesCostos.add(jComboBoxid_lineaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoDisponiblesCostos.add(jLabelid_linea_grupoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoDisponiblesCostos.add(jButtonid_linea_grupoDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 3;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoDisponiblesCostos.add(jButtonid_linea_grupoDisponiblesCostosUpdate, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoDisponiblesCostos.add(jComboBoxid_linea_grupoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaDisponiblesCostos.add(jLabelid_linea_categoriaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaDisponiblesCostos.add(jButtonid_linea_categoriaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 3;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaDisponiblesCostos.add(jButtonid_linea_categoriaDisponiblesCostosUpdate, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaDisponiblesCostos.add(jComboBoxid_linea_categoriaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaDisponiblesCostos.add(jLabelid_linea_marcaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaDisponiblesCostos.add(jButtonid_linea_marcaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 3;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaDisponiblesCostos.add(jButtonid_linea_marcaDisponiblesCostosUpdate, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaDisponiblesCostos.add(jComboBoxid_linea_marcaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaDisponiblesCostos.add(jLabelfecha_emision_hastaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaDisponiblesCostos.add(jButtonfecha_emision_hastaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaDisponiblesCostos.add(jDateChooserfecha_emision_hastaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalDisponiblesCostos.add(jLabelnombre_sucursalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalDisponiblesCostos.add(jButtonnombre_sucursalDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalDisponiblesCostos.add(jscrollPanenombre_sucursalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaDisponiblesCostos.add(jLabelnombre_lineaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaDisponiblesCostos.add(jButtonnombre_lineaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaDisponiblesCostos.add(jscrollPanenombre_lineaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoDisponiblesCostos.add(jLabelnombre_linea_grupoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoDisponiblesCostos.add(jButtonnombre_linea_grupoDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoDisponiblesCostos.add(jscrollPanenombre_linea_grupoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaDisponiblesCostos.add(jLabelnombre_linea_categoriaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaDisponiblesCostos.add(jButtonnombre_linea_categoriaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaDisponiblesCostos.add(jscrollPanenombre_linea_categoriaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaDisponiblesCostos.add(jLabelnombre_linea_marcaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaDisponiblesCostos.add(jButtonnombre_linea_marcaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaDisponiblesCostos.add(jscrollPanenombre_linea_marcaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDisponiblesCostos.add(jLabelcodigoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDisponiblesCostos.add(jButtoncodigoDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDisponiblesCostos.add(jTextFieldcodigoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDisponiblesCostos.add(jLabelnombreDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDisponiblesCostos.add(jButtonnombreDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDisponiblesCostos.add(jscrollPanenombreDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaDisponiblesCostos.add(jLabelnombre_bodegaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaDisponiblesCostos.add(jButtonnombre_bodegaDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaDisponiblesCostos.add(jscrollPanenombre_bodegaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadDisponiblesCostos.add(jLabelnombre_unidadDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadDisponiblesCostos.add(jButtonnombre_unidadDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadDisponiblesCostos.add(jTextFieldnombre_unidadDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingresosDisponiblesCostos.add(jLabelingresosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelingresosDisponiblesCostos.add(jButtoningresosDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingresosDisponiblesCostos.add(jTextFieldingresosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelegresosDisponiblesCostos.add(jLabelegresosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelegresosDisponiblesCostos.add(jButtonegresosDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelegresosDisponiblesCostos.add(jTextFieldegresosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponible_corteDisponiblesCostos.add(jLabeldisponible_corteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponible_corteDisponiblesCostos.add(jButtondisponible_corteDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponible_corteDisponiblesCostos.add(jTextFielddisponible_corteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoDisponiblesCostos.add(jLabelcostoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDisponiblesCostos.add(jButtoncostoDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoDisponiblesCostos.add(jTextFieldcostoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDisponiblesCostos.add(jLabeltotalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 2;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
		this.gridBagConstraintsDisponiblesCostos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDisponiblesCostos.add(jButtontotalDisponiblesCostosBusqueda, this.gridBagConstraintsDisponiblesCostos);
	}

	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDisponiblesCostos.gridy = 0;
	this.gridBagConstraintsDisponiblesCostos.gridx = 1;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDisponiblesCostos.add(jTextFieldtotalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelidDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelid_bodegaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelid_productoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelid_lineaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelid_linea_grupoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelid_linea_categoriaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelid_linea_marcaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelfecha_emision_hastaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelnombre_sucursalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelnombre_lineaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelnombre_linea_grupoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelnombre_linea_categoriaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelnombre_linea_marcaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelcodigoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelnombreDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelnombre_bodegaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelnombre_unidadDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelingresosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelegresosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPaneldisponible_corteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPanelcostoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDisponiblesCostos.add(this.jPaneltotalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposDisponiblesCostos % 3==0) {
		iXPanelCamposDisponiblesCostos=0;
		iYPanelCamposDisponiblesCostos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposOcultosDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposOcultosDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDisponiblesCostos.add(this.jPanelid_empresaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposOcultosDisponiblesCostos % 3==0) {
		iXPanelCamposOcultosDisponiblesCostos=0;
		iYPanelCamposOcultosDisponiblesCostos++;
	}
	this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDisponiblesCostos.gridy = iYPanelCamposOcultosDisponiblesCostos;
	this.gridBagConstraintsDisponiblesCostos.gridx = iXPanelCamposOcultosDisponiblesCostos++;
	this.gridBagConstraintsDisponiblesCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDisponiblesCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDisponiblesCostos.add(this.jPanelid_sucursalDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);



	if(iXPanelCamposOcultosDisponiblesCostos % 3==0) {
		iXPanelCamposOcultosDisponiblesCostos=0;
		iYPanelCamposOcultosDisponiblesCostos++;
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
			
		GridBagLayout gridaBagLayoutAccionesDisponiblesCostos= new GridBagLayout();
		this.jPanelAccionesDisponiblesCostos.setLayout(gridaBagLayoutAccionesDisponiblesCostos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDisponiblesCostos= new GridBagLayout();
		this.jPanelAccionesFormularioDisponiblesCostos.setLayout(gridaBagLayoutAccionesFormularioDisponiblesCostos);
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDisponiblesCostos.add(this.jComboBoxTiposAccionesFormularioDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccion++;
			
		this.jPanelAccionesDisponiblesCostos.add(this.jButtonModificarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);							

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx =iPosXAccion++;
			
		this.jPanelAccionesDisponiblesCostos.add(this.jButtonEliminarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
			
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccion++;
		
		this.jPanelAccionesDisponiblesCostos.add(this.jButtonActualizarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccion++;
		
		this.jPanelAccionesDisponiblesCostos.add(this.jButtonGuardarCambiosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);	
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;		
		this.gridBagConstraintsDisponiblesCostos.gridx =iPosXAccion++;
		
		this.jPanelAccionesDisponiblesCostos.add(this.jButtonCancelarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDisponiblesCostos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();						
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDisponiblesCostos.gridx = 0;		
			//this.gridBagConstraintsDisponiblesCostos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDisponiblesCostos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDisponiblesCostos.gridx =0;
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDisponiblesCostos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDisponiblesCostos = new DisponiblesCostosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Disponibles Costos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Disponibles Costos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Disponibles Costos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DisponiblesCostosModel disponiblescostosModel=new DisponiblesCostosModel(this);
			
			//SI USARA CLASE INTERNA
			//DisponiblesCostosModel.DisponiblesCostosFocusTraversalPolicy disponiblescostosFocusTraversalPolicy = disponiblescostosModel.new DisponiblesCostosFocusTraversalPolicy(this);
			
			//disponiblescostosFocusTraversalPolicy.setdisponiblescostosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(disponiblescostosModel);
			
			
			this.jContentPaneDetalleDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDisponiblesCostos = new GridBagLayout();	
			this.jContentPaneDetalleDisponiblesCostos.setLayout(gridaBagLayoutDetalleDisponiblesCostos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDisponiblesCostos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
				this.gridBagConstraintsDisponiblesCostos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDisponiblesCostos.gridx = 0;
					
				
				this.jContentPaneDetalleDisponiblesCostos.add(jTtoolBarDetalleDisponiblesCostos, gridBagConstraintsDisponiblesCostos);								
				
}
			
			this.jScrollPanelDatosEdicionDisponiblesCostos=   new JScrollPane(jContentPaneDetalleDisponiblesCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDisponiblesCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDisponiblesCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDisponiblesCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDisponiblesCostos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDisponiblesCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDisponiblesCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDisponiblesCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDisponiblesCostos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	        
			this.jContentPaneDetalleDisponiblesCostos.add(jPanelCamposDisponiblesCostos, gridBagConstraintsDisponiblesCostos);
			
			
			
			
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
						//&& disponiblescostosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDisponiblesCostos= new GridBagConstraints();
						this.gridBagConstraintsDisponiblesCostos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDisponiblesCostos.gridx = 0;
						this.jContentPaneDetalleDisponiblesCostos.add(this.jTabbedPaneRelacionesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDisponiblesCostos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDisponiblesCostos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
					this.gridBagConstraintsDisponiblesCostos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDisponiblesCostos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDisponiblesCostos.gridx = 0;
					
				
					this.jContentPaneDetalleDisponiblesCostos.add(jPanelCamposOcultosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);
				
					this.jPanelCamposOcultosDisponiblesCostos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	        this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDisponiblesCostos.add(this.jPanelAccionesFormularioDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);							
			
			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
	        this.gridBagConstraintsDisponiblesCostos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDisponiblesCostos.gridx = 0;
	        
			
			this.jContentPaneDetalleDisponiblesCostos.add(this.jPanelAccionesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDisponiblesCostos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDisponiblesCostos=   new JScrollPane(this.jPanelCamposDisponiblesCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDisponiblesCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDisponiblesCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDisponiblesCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDisponiblesCostos.gridx = 0;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDisponiblesCostos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDisponiblesCostos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDisponiblesCostos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			
			
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
			
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDisponiblesCostos;//jContentPane;
		
		return jScrollPanelDatosEdicionDisponiblesCostos;
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
