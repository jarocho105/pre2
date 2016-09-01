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
import com.bydan.erp.inventario.util.report.ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones;

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
public class ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame extends ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras;
	
	protected JMenuBar jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras;
	
	protected JMenu jmenuDetalleProcesoCrearEtiquetasCodigoBarras;
	protected JMenu jmenuDetalleArchivoProcesoCrearEtiquetasCodigoBarras;
	protected JMenu jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras;
	protected JMenu jmenuDetalleDatosProcesoCrearEtiquetasCodigoBarras;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCrearEtiquetasCodigoBarras;	
	protected GridBagConstraints gridBagConstraintsProcesoCrearEtiquetasCodigoBarras;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCrearEtiquetasCodigoBarras;		
	
	
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
	
	public ProcesoCrearEtiquetasCodigoBarrasSessionBean procesocrearetiquetascodigobarrasSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ProcesoCrearEtiquetasCodigoBarrasLogic procesocrearetiquetascodigobarrasLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras;
	public JScrollPane jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras;
	public JScrollPane jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras;
	
	protected JPanel jPanelCamposProcesoCrearEtiquetasCodigoBarras;    
	protected JPanel jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras;    	
	protected JPanel jPanelAccionesProcesoCrearEtiquetasCodigoBarras;
	protected JPanel jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras;
    
	
	
	protected Integer iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
	protected Integer iYPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
	
	protected Integer iXPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras=0;
	protected Integer iYPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonModificarProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonActualizarProcesoCrearEtiquetasCodigoBarras;
    public JButton jButtonEliminarProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonCancelarProcesoCrearEtiquetasCodigoBarras;
    public JButton jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonCerrarProcesoCrearEtiquetasCodigoBarras;
	
	
	protected JButton jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCrearEtiquetasCodigoBarras;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasCodigoBarras;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasCodigoBarras;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonModificarToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras;
    protected JButton jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras;
    protected JButton jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonCerrarToolBarProcesoCrearEtiquetasCodigoBarras;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCrearEtiquetasCodigoBarras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemModificarProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras;
    protected JMenuItem jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCrearEtiquetasCodigoBarras;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelIdProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelidProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonidProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelcodigoProcesoCrearEtiquetasCodigoBarras;
	public JTextField jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelnombreProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelnombreProcesoCrearEtiquetasCodigoBarras;
	public JTextArea jTextAreanombreProcesoCrearEtiquetasCodigoBarras;
	public JScrollPane jscrollPanenombreProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelprecioProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelprecioProcesoCrearEtiquetasCodigoBarras;
	public JTextField jTextFieldprecioProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelnumeroProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelnumeroProcesoCrearEtiquetasCodigoBarras;
	public JTextField jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPaneltallaProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabeltallaProcesoCrearEtiquetasCodigoBarras;
	public JTextArea jTextAreatallaProcesoCrearEtiquetasCodigoBarras;
	public JScrollPane jscrollPanetallaProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_productoProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_productoProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_empresaProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_empresaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_lineaProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_lineaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCrearEtiquetasCodigoBarras=new JPanel();
				this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras=new JPanel();
				this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras=new JMenuBar();
				this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras() {
		return this.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras() {
		return this.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras() {
		return this.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras() {
		return this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras)	{
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras = jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras() {
		return this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras() {
		return this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
		
		this.procesocrearetiquetascodigobarrasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocrearetiquetascodigobarrasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Crear Etiquetas Codigo Barras MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCrearEtiquetasCodigoBarras=new JButtonMe();
				this.jButtonModificarToolBarProcesoCrearEtiquetasCodigoBarras=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCrearEtiquetasCodigoBarras=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCrearEtiquetasCodigoBarras=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCrearEtiquetasCodigoBarras=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras);
		
		this.jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras);
		this.jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras);
		this.jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras);		
		
		//this.jmenuDetalleDatosProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras);				
		this.jmenuDetalleDatosProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras);				
				
		//this.jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras.add(this.jmenuDetalleArchivoProcesoCrearEtiquetasCodigoBarras);		
		this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras.add(this.jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras);		
		this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras.add(this.jmenuDetalleDatosProcesoCrearEtiquetasCodigoBarras);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras);				
	}
	
	
	public void inicializarElementosCamposProcesoCrearEtiquetasCodigoBarras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		jLabelIdProcesoCrearEtiquetasCodigoBarras.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCrearEtiquetasCodigoBarras = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras= new GridBagLayout();

		this.jPanelidProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);

		jLabelidProcesoCrearEtiquetasCodigoBarras = new JLabel();
		jLabelidProcesoCrearEtiquetasCodigoBarras.setText("Id");

		jLabelidProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelcodigoProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Codigo");
		this.jLabelcodigoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelcodigoProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras= new JTextFieldMe();

		jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setEnabled(false);
		jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}


					
		this.jLabelnombreProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelnombreProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProcesoCrearEtiquetasCodigoBarras.setToolTipText("Nombre");
		this.jLabelnombreProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelnombreProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jTextAreanombreProcesoCrearEtiquetasCodigoBarras= new JTextAreaMe();
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setEnabled(false);
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setLineWrap(true);
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setWrapStyleWord(true);
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProcesoCrearEtiquetasCodigoBarras = new JScrollPane(jTextAreanombreProcesoCrearEtiquetasCodigoBarras);
		jscrollPanenombreProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}


					
		this.jLabelprecioProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelprecioProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioProcesoCrearEtiquetasCodigoBarras.setToolTipText("Precio");
		this.jLabelprecioProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelprecioProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jTextFieldprecioProcesoCrearEtiquetasCodigoBarras= new JTextFieldMe();
		jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setEnabled(false);
		jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setText("0.0");

		this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}


					
		this.jLabelnumeroProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelnumeroProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroProcesoCrearEtiquetasCodigoBarras.setToolTipText("Numero");
		this.jLabelnumeroProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelnumeroProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras= new JTextFieldMe();
		jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setEnabled(false);
		jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setText("0.0");

		this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}


					
		this.jLabeltallaProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabeltallaProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA+" : *");
		this.jLabeltallaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Talla");
		this.jLabeltallaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltallaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltallaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltallaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltallaProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltallaProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPaneltallaProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jTextAreatallaProcesoCrearEtiquetasCodigoBarras= new JTextAreaMe();
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setEnabled(false);
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setLineWrap(true);
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setWrapStyleWord(true);
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreatallaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetallaProcesoCrearEtiquetasCodigoBarras = new JScrollPane(jTextAreatallaProcesoCrearEtiquetasCodigoBarras);
		jscrollPanetallaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetallaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetallaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatallaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tallaProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoCrearEtiquetasCodigoBarras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Bodega");
		this.jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCrearEtiquetasCodigoBarras"));

		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.setText("U");
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate"));



					
		this.jLabelid_productoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelid_productoProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Producto");
		this.jLabelid_productoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelid_productoProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCrearEtiquetasCodigoBarras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCrearEtiquetasCodigoBarras"));

		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}

		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.setText("U");
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCrearEtiquetasCodigoBarrasUpdate"));



					
		this.jLabelid_empresaProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelid_empresaProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setEnabled(false);

		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCrearEtiquetasCodigoBarras"));

		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.setText("U");
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCrearEtiquetasCodigoBarrasUpdate"));



					
		this.jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setEnabled(false);

		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCrearEtiquetasCodigoBarras"));

		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.setText("U");
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate"));



					
		this.jLabelid_lineaProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelid_lineaProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Linea");
		this.jLabelid_lineaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCrearEtiquetasCodigoBarras"));

		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}

		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.setText("U");
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCrearEtiquetasCodigoBarrasUpdate"));



					
		this.jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarras"));

		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.setText("U");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate"));



					
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarras"));

		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.setText("U");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate"));



					
		this.jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		this.jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setText(""+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setToolTipText(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		this.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setLayout(this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);


		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarras"));

		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.setText("U");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda"));

		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.setText("U");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate"));



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
		//this.jInternalFrameDetalleProcesoCrearEtiquetasCodigoBarras = new ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Crear Etiquetas Codigo Barras DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras= new GridBagLayout();
		

		
		String sToolTipProcesoCrearEtiquetasCodigoBarras="";
		sToolTipProcesoCrearEtiquetasCodigoBarras=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCrearEtiquetasCodigoBarras+="(Inventario.ProcesoCrearEtiquetasCodigoBarras)";
		}
		
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCrearEtiquetasCodigoBarras+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonModificarProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
        this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
        this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
        this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Crear Etiquetas Codigo Barras";
		
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Codigo Barrases" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.setName("jPanelCamposProcesoCrearEtiquetasCodigoBarras"); 

		this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras.setName("jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras"); 

        this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.setText("Nuevo");
		this.jButtonModificarProcesoCrearEtiquetasCodigoBarras.setText("Editar");
        this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.setText("Actualizar");
        this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.setText("Eliminar");
        this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.setText("Guardar");
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras,"nuevo_button","Nuevo",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCrearEtiquetasCodigoBarras,"modificar_button","Editar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras,"actualizar_button","Actualizar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras,"eliminar_button","Eliminar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras,"cancelar_button","Cancelar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras,"guardarcambios_button","Guardar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras,"guardarcambiostabla_button","Guardar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras,"cerrar_button","Salir",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Nuevo"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Editar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Actualizar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Eliminar)"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Cancelar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setToolTipText("Guardar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Guardar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Salir"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCrearEtiquetasCodigoBarras"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCrearEtiquetasCodigoBarras"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCrearEtiquetasCodigoBarras"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCrearEtiquetasCodigoBarras"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCrearEtiquetasCodigoBarras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasCodigoBarras.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Nuevo ProcesoCrearEtiquetasCodigoBarras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasCodigoBarras.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Sin Cerrar Ventana ProcesoCrearEtiquetasCodigoBarras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasCodigoBarras.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasCodigoBarras.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras.setText("Acciones");		
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCrearEtiquetasCodigoBarras();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCrearEtiquetasCodigoBarras();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		
		this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutCamposProcesoCrearEtiquetasCodigoBarras);
		this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutCamposOcultosProcesoCrearEtiquetasCodigoBarras);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCrearEtiquetasCodigoBarras.add(jLabelIdProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCrearEtiquetasCodigoBarras.add(jLabelidProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras.add(jLabelid_bodegaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProcesoCrearEtiquetasCodigoBarras.add(jLabelid_productoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoCrearEtiquetasCodigoBarras.add(jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoCrearEtiquetasCodigoBarras.add(jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras.add(jLabelid_empresaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras.add(jLabelid_sucursalProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras.add(jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras.add(jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras.add(jLabelid_lineaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.add(jLabelid_linea_grupoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.add(jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.add(jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.add(jLabelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.add(jLabelid_linea_marcaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 3;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.add(jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoCrearEtiquetasCodigoBarras.add(jLabelcodigoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoCrearEtiquetasCodigoBarras.add(jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoCrearEtiquetasCodigoBarras.add(jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProcesoCrearEtiquetasCodigoBarras.add(jLabelnombreProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProcesoCrearEtiquetasCodigoBarras.add(jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProcesoCrearEtiquetasCodigoBarras.add(jscrollPanenombreProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioProcesoCrearEtiquetasCodigoBarras.add(jLabelprecioProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioProcesoCrearEtiquetasCodigoBarras.add(jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioProcesoCrearEtiquetasCodigoBarras.add(jTextFieldprecioProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroProcesoCrearEtiquetasCodigoBarras.add(jLabelnumeroProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroProcesoCrearEtiquetasCodigoBarras.add(jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroProcesoCrearEtiquetasCodigoBarras.add(jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltallaProcesoCrearEtiquetasCodigoBarras.add(jLabeltallaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 2;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(0, 0, 0, 0);
		this.jPaneltallaProcesoCrearEtiquetasCodigoBarras.add(jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	}

	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltallaProcesoCrearEtiquetasCodigoBarras.add(jscrollPanetallaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelidProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelid_productoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelcodigoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelnombreProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelprecioProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPanelnumeroProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCrearEtiquetasCodigoBarras.add(this.jPaneltallaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposProcesoCrearEtiquetasCodigoBarras++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras.add(this.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras++;
	}
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iYPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iXPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras++;
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras.add(this.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);



	if(iXPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras % 2==0) {
		iXPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras=0;
		iYPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCrearEtiquetasCodigoBarras= new GridBagLayout();
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutAccionesProcesoCrearEtiquetasCodigoBarras);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCrearEtiquetasCodigoBarras= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutAccionesFormularioProcesoCrearEtiquetasCodigoBarras);
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jButtonModificarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);							

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
			
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);	
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;		
			//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCrearEtiquetasCodigoBarras = new ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Crear Etiquetas Codigo Barras DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Crear Etiquetas Codigo Barras DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Crear Etiquetas Codigo Barras Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCrearEtiquetasCodigoBarrasModel procesocrearetiquetascodigobarrasModel=new ProcesoCrearEtiquetasCodigoBarrasModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCrearEtiquetasCodigoBarrasModel.ProcesoCrearEtiquetasCodigoBarrasFocusTraversalPolicy procesocrearetiquetascodigobarrasFocusTraversalPolicy = procesocrearetiquetascodigobarrasModel.new ProcesoCrearEtiquetasCodigoBarrasFocusTraversalPolicy(this);
			
			//procesocrearetiquetascodigobarrasFocusTraversalPolicy.setprocesocrearetiquetascodigobarrasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocrearetiquetascodigobarrasModel);
			
			
			this.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutDetalleProcesoCrearEtiquetasCodigoBarras);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.add(jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras=   new JScrollPane(jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.add(jPanelCamposProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			
			
			
			
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
						//&& procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras= new GridBagConstraints();
						this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
						this.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.add(this.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
					this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.add(jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
				
					this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	        this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.add(this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);							
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.add(this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras=   new JScrollPane(this.jPanelCamposProcesoCrearEtiquetasCodigoBarras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			
			
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
			
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras;
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
