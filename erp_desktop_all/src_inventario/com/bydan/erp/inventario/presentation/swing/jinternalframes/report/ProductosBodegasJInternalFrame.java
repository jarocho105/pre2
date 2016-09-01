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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.inventario.util.report.ProductosBodegasConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.Classe;
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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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
public class ProductosBodegasJInternalFrame extends ProductosBodegasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductosBodegas;
	
	protected JMenuBar jmenuBarProductosBodegas;
	
	protected JMenu jmenuProductosBodegas;
	protected JMenu jmenuDatosProductosBodegas;
	protected JMenu jmenuArchivoProductosBodegas;
	protected JMenu jmenuAccionesProductosBodegas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosBodegas;	
	protected GridBagConstraints gridBagConstraintsProductosBodegas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosBodegasDetalleFormJInternalFrame jInternalFrameDetalleFormProductosBodegas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductosBodegas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductosBodegas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ProductosBodegasSessionBean productosbodegasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductosBodegas> productosbodegass;		
	public List<ProductosBodegas> productosbodegassEliminados;	
	public List<ProductosBodegas> productosbodegassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductosBodegas;		
	protected JButton jButtonAbrirOrderByProductosBodegas;
	
	
	//protected JPanel jPanelOrderByProductosBodegas;
	//public JScrollPane jScrollPanelOrderByProductosBodegas;	
	//protected JButton jButtonCerrarOrderByProductosBodegas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosBodegasLogic productosbodegasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductosBodegas;
	public JScrollPane jScrollPanelDatosEdicionProductosBodegas;
	public JScrollPane jScrollPanelDatosGeneralProductosBodegas;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosBodegasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductosBodegas;
	//public JScrollPane jScrollPanelImportacionProductosBodegas;
	
	
	
	protected JPanel jPanelAccionesProductosBodegas;
	
    protected JPanel jPanelPaginacionProductosBodegas;
    protected JPanel jPanelParametrosReportesProductosBodegas;
	protected JPanel jPanelParametrosReportesAccionesProductosBodegas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductosBodegas;
	protected JPanel jPanelParametrosAuxiliar2ProductosBodegas;
	protected JPanel jPanelParametrosAuxiliar3ProductosBodegas;
	protected JPanel jPanelParametrosAuxiliar4ProductosBodegas;
	//protected JPanel jPanelParametrosAuxiliar5ProductosBodegas;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductosBodegas;
	//protected JPanel jPanelImportacionProductosBodegas;
	
	
	public JTable jTableDatosProductosBodegas;
	
	
	
	//public JTable jTableDatosProductosBodegasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductosBodegas;
	protected JButton jButtonDuplicarProductosBodegas;
	protected JButton jButtonCopiarProductosBodegas;
	protected JButton jButtonVerFormProductosBodegas;
	protected JButton jButtonNuevoRelacionesProductosBodegas;
	protected JButton jButtonModificarProductosBodegas;
	
    protected JButton jButtonGuardarCambiosTablaProductosBodegas;
	protected JButton jButtonCerrarProductosBodegas;
	
	
	protected JButton jButtonRecargarInformacionProductosBodegas;
	protected JButton jButtonProcesarInformacionProductosBodegas;
	
	
	protected JButton jButtonAnterioresProductosBodegas;
	protected JButton jButtonSiguientesProductosBodegas;
	protected JButton jButtonNuevoGuardarCambiosProductosBodegas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductosBodegas;
	//protected JButton jButtonCerrarReporteDinamicoProductosBodegas;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductosBodegas;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductosBodegas;
	//protected JButton jButtonGenerarImportacionProductosBodegas;
	//protected JButton jButtonCerrarImportacionProductosBodegas;
	//protected JFileChooser jFileChooserImportacionProductosBodegas;
	//protected File fileImportacionProductosBodegas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosBodegas;
	protected JButton jButtonDuplicarToolBarProductosBodegas;
	protected JButton jButtonNuevoRelacionesToolBarProductosBodegas;
	
	
	public JButton jButtonGuardarCambiosToolBarProductosBodegas;
	protected JButton jButtonCopiarToolBarProductosBodegas;
	protected JButton jButtonVerFormToolBarProductosBodegas;
	public JButton jButtonGuardarCambiosTablaToolBarProductosBodegas;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosBodegas;
	protected JButton jButtonCerrarToolBarProductosBodegas;
	
	protected JButton jButtonRecargarInformacionToolBarProductosBodegas;
	protected JButton jButtonProcesarInformacionToolBarProductosBodegas;
	protected JButton jButtonAnterioresToolBarProductosBodegas;
	protected JButton jButtonSiguientesToolBarProductosBodegas;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductosBodegas;
	protected JButton jButtonAbrirOrderByToolBarProductosBodegas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosBodegas;
	protected JMenuItem jMenuItemDuplicarProductosBodegas;
	protected JMenuItem jMenuItemNuevoRelacionesProductosBodegas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductosBodegas;
	protected JMenuItem jMenuItemCopiarProductosBodegas;
	protected JMenuItem jMenuItemVerFormProductosBodegas;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosBodegas;
	protected JMenuItem jMenuItemCerrarProductosBodegas;
	protected JMenuItem jMenuItemDetalleCerrarProductosBodegas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductosBodegas;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosBodegas;
	
	protected JMenuItem jMenuItemRecargarInformacionProductosBodegas;
	protected JMenuItem jMenuItemProcesarInformacionProductosBodegas;
	protected JMenuItem jMenuItemAnterioresProductosBodegas;
	protected JMenuItem jMenuItemSiguientesProductosBodegas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosBodegas;
	protected JMenuItem jMenuItemAbrirOrderByProductosBodegas;
	protected JMenuItem jMenuItemMostrarOcultarProductosBodegas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosBodegas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductosBodegas;
	protected JCheckBox jCheckBoxSeleccionadosProductosBodegas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductosBodegas;
	protected JCheckBox jCheckBoxConGraficoReporteProductosBodegas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductosBodegas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductosBodegas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductosBodegas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductosBodegas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductosBodegas;
	protected JTextField jTextFieldValorCampoGeneralProductosBodegas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductosBodegas;
	//public JList<Reporte> jListColumnasSelectReporteProductosBodegas;
	//public JScrollPane jScrollColumnasSelectReporteProductosBodegas;
	
	//public JLabel jLabelRelacionesSelectReporteProductosBodegas;
	//public JList<Reporte> jListRelacionesSelectReporteProductosBodegas;
	//public JScrollPane jScrollRelacionesSelectReporteProductosBodegas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductosBodegas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductosBodegas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductosBodegas;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductosBodegas;
	
		
	//public JLabel jLabelArchivoImportacionProductosBodegas;	
	//public JLabel jLabelPathArchivoImportacionProductosBodegas;
	//protected JTextField jTextFieldPathArchivoImportacionProductosBodegas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductosBodegas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductosBodegas;
	
	//public JLabel jLabelColumnaCategoriaValorProductosBodegas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductosBodegas;
	
	//public JLabel jLabelColumnasValoresGraficoProductosBodegas;
	//public JList<Reporte> jListColumnasValoresGraficoProductosBodegas;
	//public JScrollPane jScrollColumnasValoresGraficoProductosBodegas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductosBodegas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductosBodegas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductosBodegas;
	public JPanel jPanelBusquedaProductosBodegasProductosBodegas;
	public JButton jButtonBusquedaProductosBodegasProductosBodegas;
	
	public JPanel jPanelid_bodegaBusquedaProductosBodegasProductosBodegas;
	public JLabel jLabelid_bodegaBusquedaProductosBodegasProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas;
	public JButton jButtonid_bodegaBusquedaProductosBodegasProductosBodegas= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosBodegasProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosBodegasProductosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProductosBodegasProductosBodegas;
	public JLabel jLabelid_lineaBusquedaProductosBodegasProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas;
	public JButton jButtonid_lineaBusquedaProductosBodegasProductosBodegas= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosBodegasProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosBodegasProductosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProductosBodegasProductosBodegas;
	public JLabel jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas;
	public JButton jButtonid_linea_grupoBusquedaProductosBodegasProductosBodegas= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosBodegasProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosBodegasProductosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProductosBodegasProductosBodegas;
	public JLabel jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas;
	public JButton jButtonid_linea_categoriaBusquedaProductosBodegasProductosBodegas= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosBodegasProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosBodegasProductosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProductosBodegasProductosBodegas;
	public JLabel jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas;
	public JButton jButtonid_linea_marcaBusquedaProductosBodegasProductosBodegas= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosBodegasProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosBodegasProductosBodegasBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
	//Esto va en DetalleForm
	//public int iHeightFormularioMaximo=0;
	//public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
	
	/*
	double start=(double)System.currentTimeMillis();	
	double end=0;
	double dif=0;
	
	end=(double)System.currentTimeMillis();			
	dif=end - start;			
	start=(double)System.currentTimeMillis();	
	System.out.println("Tiempo(ms) Carga TEST 1_2 DetalleMovimientoInventario: " + dif);		
	*/
	
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosBodegasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosBodegasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosBodegasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosBodegasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductosBodegas)	{
		this.jButtonRecargarInformacionProductosBodegas = jButtonRecargarInformacionProductosBodegas;
	}
	
	public JButton getjButtonProcesarInformacionProductosBodegas() {
		return this.jButtonProcesarInformacionProductosBodegas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosBodegas)	{
		this.jButtonProcesarInformacionProductosBodegas = jButtonProcesarInformacionProductosBodegas;
	}
	
	
	public JButton getjButtonRecargarInformacionProductosBodegas() {
		return this.jButtonRecargarInformacionProductosBodegas;
	}
	
	
	public List<ProductosBodegas> getproductosbodegass() {
		return this.productosbodegass;
	}

	public void setproductosbodegass(List<ProductosBodegas> productosbodegass) {
		this.productosbodegass = productosbodegass;
	}
	
	public List<ProductosBodegas> getproductosbodegassAux() {
		return this.productosbodegassAux;
	}

	public void setproductosbodegassAux(List<ProductosBodegas> productosbodegassAux) {
		this.productosbodegassAux = productosbodegassAux;
	}
	
	public List<ProductosBodegas> getproductosbodegassEliminados() {
		return this.productosbodegassEliminados;
	}

	public void setProductosBodegassEliminados(List<ProductosBodegas> productosbodegassEliminados) {
		this.productosbodegassEliminados = productosbodegassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductosBodegas() {
		return jComboBoxTiposSeleccionarProductosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductosBodegas(
			JComboBox jComboBoxTiposSeleccionarProductosBodegas) {
		this.jComboBoxTiposSeleccionarProductosBodegas = jComboBoxTiposSeleccionarProductosBodegas;
	}
	
	public void setBorderResaltarTiposSeleccionarProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductosBodegas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductosBodegas() {
		return jTextFieldValorCampoGeneralProductosBodegas;
	}

	public void setjTextFieldValorCampoGeneralProductosBodegas(
			JTextField jTextFieldValorCampoGeneralProductosBodegas) {
		this.jTextFieldValorCampoGeneralProductosBodegas = jTextFieldValorCampoGeneralProductosBodegas;
	}

	public void setBorderResaltarValorCampoGeneralProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductosBodegas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductosBodegas() {
		return this.jCheckBoxSeleccionarTodosProductosBodegas;
	}

	public void setjCheckBoxSeleccionarTodosProductosBodegas(
			JCheckBox jCheckBoxSeleccionarTodosProductosBodegas) {
		this.jCheckBoxSeleccionarTodosProductosBodegas = jCheckBoxSeleccionarTodosProductosBodegas;
	}

	public void setBorderResaltarSeleccionarTodosProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductosBodegas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductosBodegas() {
		return this.jCheckBoxSeleccionadosProductosBodegas;
	}

	public void setjCheckBoxSeleccionadosProductosBodegas(
			JCheckBox jCheckBoxSeleccionadosProductosBodegas) {
		this.jCheckBoxSeleccionadosProductosBodegas = jCheckBoxSeleccionadosProductosBodegas;
	}
	
	public void setBorderResaltarSeleccionadosProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductosBodegas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductosBodegas() {
		return this.jComboBoxTiposArchivosReportesProductosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductosBodegas(
			JComboBox jComboBoxTiposArchivosReportesProductosBodegas) {
		this.jComboBoxTiposArchivosReportesProductosBodegas = jComboBoxTiposArchivosReportesProductosBodegas;
	}

	public void setBorderResaltarTiposArchivosReportesProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductosBodegas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductosBodegas() {
		return this.jComboBoxTiposReportesProductosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductosBodegas(
			JComboBox jComboBoxTiposReportesProductosBodegas) {
		this.jComboBoxTiposReportesProductosBodegas = jComboBoxTiposReportesProductosBodegas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductosBodegas() {
	//	return jComboBoxTiposReportesDinamicoProductosBodegas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductosBodegas(
	//		JComboBox jComboBoxTiposReportesDinamicoProductosBodegas) {
	//	this.jComboBoxTiposReportesDinamicoProductosBodegas = jComboBoxTiposReportesDinamicoProductosBodegas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductosBodegas() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductosBodegas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductosBodegas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductosBodegas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductosBodegas = jComboBoxTiposArchivosReportesDinamicoProductosBodegas;
	//}
	
	public void setBorderResaltarTiposReportesProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductosBodegas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductosBodegas() {
		return this.jComboBoxTiposGraficosReportesProductosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductosBodegas(
			JComboBox jComboBoxTiposGraficosReportesProductosBodegas) {
		this.jComboBoxTiposGraficosReportesProductosBodegas = jComboBoxTiposGraficosReportesProductosBodegas;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductosBodegas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductosBodegas() {
		return this.jComboBoxTiposPaginacionProductosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductosBodegas(
			JComboBox jComboBoxTiposPaginacionProductosBodegas) {
		this.jComboBoxTiposPaginacionProductosBodegas = jComboBoxTiposPaginacionProductosBodegas;
	}
	
	public void setBorderResaltarTiposPaginacionProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductosBodegas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductosBodegas() {
		return this.jComboBoxTiposRelacionesProductosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosBodegas() {
		return this.jComboBoxTiposAccionesProductosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosBodegas(
			JComboBox jComboBoxTiposRelacionesProductosBodegas) {
		this.jComboBoxTiposRelacionesProductosBodegas = jComboBoxTiposRelacionesProductosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosBodegas(
			JComboBox jComboBoxTiposAccionesProductosBodegas) {
		this.jComboBoxTiposAccionesProductosBodegas = jComboBoxTiposAccionesProductosBodegas;
	}
	
	public void setBorderResaltarTiposRelacionesProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductosBodegas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductosBodegas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductosBodegas() {
	//	return jCheckBoxConGraficoDinamicoProductosBodegas;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductosBodegas(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductosBodegas) {
	//	this.jCheckBoxConGraficoDinamicoProductosBodegas = jCheckBoxConGraficoDinamicoProductosBodegas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductosBodegas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductosBodegas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductosBodegas .setBorder(borderResaltar);		
	//}
	
	
	
			
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
		
		this.productosbodegasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosbodegasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosbodegasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosBodegasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Bodegas MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosBodegasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductosBodegas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"nuevo","nuevo","Nuevo"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"duplicar","duplicar","Duplicar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"copiar","copiar","Copiar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"ver_form","ver_form","Ver"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"recargar","recargar","Buscar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductosBodegas,this.jTtoolBarProductosBodegas,
							"cerrar","cerrar","Salir"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductosBodegas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductosBodegas;
			
				this.jButtonProcesarInformacionToolBarProductosBodegas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductosBodegas;
				
		//protected JButton jButtonModificarToolBarProductosBodegas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductosBodegas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductosBodegas=new JMenuMe("General");
		this.jmenuArchivoProductosBodegas=new JMenuMe("Archivo");
		this.jmenuAccionesProductosBodegas=new JMenuMe("Acciones");
		this.jmenuDatosProductosBodegas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosBodegas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosBodegas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosBodegas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductosBodegas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductosBodegas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductosBodegas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductosBodegas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductosBodegas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductosBodegas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductosBodegas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosBodegas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosBodegas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductosBodegas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductosBodegas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductosBodegas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductosBodegas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductosBodegas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductosBodegas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductosBodegas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductosBodegas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductosBodegas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosBodegas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosBodegas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosBodegas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductosBodegas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductosBodegas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductosBodegas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductosBodegas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductosBodegas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductosBodegas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductosBodegas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductosBodegas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductosBodegas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductosBodegas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductosBodegas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductosBodegas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductosBodegas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductosBodegas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductosBodegas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosBodegas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosBodegas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosBodegas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductosBodegas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductosBodegas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductosBodegas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosBodegas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosBodegas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosBodegas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductosBodegas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductosBodegas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductosBodegas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductosBodegas.add(this.jMenuItemCerrarProductosBodegas);
			
			this.jmenuAccionesProductosBodegas.add(this.jMenuItemNuevoProductosBodegas);
			this.jmenuAccionesProductosBodegas.add(this.jMenuItemNuevoGuardarCambiosProductosBodegas);
			this.jmenuAccionesProductosBodegas.add(this.jMenuItemNuevoRelacionesProductosBodegas);
			this.jmenuAccionesProductosBodegas.add(this.jMenuItemGuardarCambiosTablaProductosBodegas);		
			this.jmenuAccionesProductosBodegas.add(this.jMenuItemDuplicarProductosBodegas);		
			this.jmenuAccionesProductosBodegas.add(this.jMenuItemCopiarProductosBodegas);		
			this.jmenuAccionesProductosBodegas.add(this.jMenuItemVerFormProductosBodegas);		
			
			this.jmenuDatosProductosBodegas.add(this.jMenuItemRecargarInformacionProductosBodegas);				
			this.jmenuDatosProductosBodegas.add(this.jMenuItemAnterioresProductosBodegas);				
			this.jmenuDatosProductosBodegas.add(this.jMenuItemSiguientesProductosBodegas);				
			this.jmenuDatosProductosBodegas.add(this.jMenuItemAbrirOrderByProductosBodegas);				
			this.jmenuDatosProductosBodegas.add(this.jMenuItemMostrarOcultarProductosBodegas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductosBodegas.add(this.jMenuItemGuardarCambiosProductosBodegas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductosBodegas.add(this.jmenuArchivoProductosBodegas);		
			this.jmenuBarProductosBodegas.add(this.jmenuAccionesProductosBodegas);		
			this.jmenuBarProductosBodegas.add(this.jmenuDatosProductosBodegas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductosBodegas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductosBodegas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosBodegasProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosBodegasProductosBodegas.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		this.jButtonBusquedaProductosBodegasProductosBodegas= new JButtonMe();
		this.jButtonBusquedaProductosBodegasProductosBodegas.setText("Buscar");
		this.jButtonBusquedaProductosBodegasProductosBodegas.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosBodegasProductosBodegas,"buscar_button","Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosBodegasProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProductosBodegasProductosBodegas = new JLabelMe();
		jLabelid_bodegaBusquedaProductosBodegasProductosBodegas.setText("Bodega :");
		jLabelid_bodegaBusquedaProductosBodegasProductosBodegas.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProductosBodegasProductosBodegas = new JLabelMe();
		jLabelid_lineaBusquedaProductosBodegasProductosBodegas.setText("Linea :");
		jLabelid_lineaBusquedaProductosBodegasProductosBodegas.setToolTipText("Linea");
		jLabelid_lineaBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas = new JLabelMe();
		jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas = new JLabelMe();
		jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductosBodegas=new JTabbedPane();


		this.jTabbedPaneBusquedasProductosBodegas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasProductosBodegas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasProductosBodegas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductosBodegas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
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
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleProductosBodegas = new ProductosBodegasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos Bodegas DATOS");
			this.jInternalFrameDetalleFormProductosBodegas = new ProductosBodegasDetalleFormJInternalFrame(jDesktopPane,this.productosbodegasSessionBean.getConGuardarRelaciones(),this.productosbodegasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductosBodegas = null;//new ProductosBodegasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosBodegas= new GridBagLayout();
		
		
		this.jTableDatosProductosBodegas = new JTableMe();      
		
		String sToolTipProductosBodegas="";
		sToolTipProductosBodegas=ProductosBodegasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosBodegas+="(Inventario.ProductosBodegas)";
		}
		
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosBodegas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductosBodegas.setToolTipText(sToolTipProductosBodegas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductosBodegas);
		this.jTableDatosProductosBodegas.setAutoCreateRowSorter(true);
		this.jTableDatosProductosBodegas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductosBodegas.setRowSelectionAllowed(true);
		this.jTableDatosProductosBodegas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductosBodegas = new JButtonMe();
		this.jButtonDuplicarProductosBodegas = new JButtonMe();
		this.jButtonCopiarProductosBodegas = new JButtonMe();
		this.jButtonVerFormProductosBodegas = new JButtonMe();
		this.jButtonNuevoRelacionesProductosBodegas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductosBodegas = new JButtonMe();
		this.jButtonCerrarProductosBodegas = new JButtonMe();
		
		this.jScrollPanelDatosProductosBodegas = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductosBodegas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Bodegas";
		
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Bodegases" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosBodegas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosBodegas.setToolTipText("Acciones");
        this.jPanelAccionesProductosBodegas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoProductosBodegas=new ReporteDinamicoJInternalFrame(ProductosBodegasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductosBodegas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductosBodegas=new ImportacionJInternalFrame(ProductosBodegasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductosBodegas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductosBodegas = new JButtonMe();
		
		this.jButtonAbrirOrderByProductosBodegas.setText("Orden");
		this.jButtonAbrirOrderByProductosBodegas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosBodegas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosBodegas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosBodegas,false,this);
			
			//this.cargarOrderByProductosBodegas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosBodegas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosBodegas,true,this);
			
			//this.cargarOrderByProductosBodegas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductosBodegas.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosProductosBodegas.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosProductosBodegas.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosProductosBodegas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosBodegas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosBodegas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductosBodegas.setText("Nuevo");
		this.jButtonDuplicarProductosBodegas.setText("Duplicar");
		this.jButtonCopiarProductosBodegas.setText("Copiar");
		this.jButtonVerFormProductosBodegas.setText("Ver");
		this.jButtonNuevoRelacionesProductosBodegas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductosBodegas.setText("Guardar");
		this.jButtonCerrarProductosBodegas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosBodegas,"nuevo_button","Nuevo",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductosBodegas,"duplicar_button","Duplicar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductosBodegas,"copiar_button","Copiar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductosBodegas,"ver_form","Ver",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductosBodegas,"nuevorelaciones_button","Nuevo Rel",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosBodegas,"guardarcambiostabla_button","Guardar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosBodegas,"cerrar_button","Salir",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductosBodegas.setToolTipText("Nuevo"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductosBodegas.setToolTipText("Duplicar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductosBodegas.setToolTipText("Copiar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductosBodegas.setToolTipText("Ver"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductosBodegas.setToolTipText("Nuevo Rel"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductosBodegas.setToolTipText("Guardar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosBodegas.setToolTipText("Salir"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		//String sMapKey = "";
		//InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoProductosBodegas";
		inputMap = this.jButtonNuevoProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosBodegas"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductosBodegas";
		inputMap = this.jButtonDuplicarProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductosBodegas"));
		
		//COPIAR
		sMapKey = "CopiarProductosBodegas";
		inputMap = this.jButtonCopiarProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductosBodegas"));
		
		//VEr FORM
		sMapKey = "VerFormProductosBodegas";
		inputMap = this.jButtonVerFormProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductosBodegas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductosBodegas";
		inputMap = this.jButtonNuevoRelacionesProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductosBodegas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductosBodegas";
		inputMap = this.jButtonModificarProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductosBodegas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductosBodegas";
		inputMap = this.jButtonCerrarProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosBodegas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosBodegas";
		inputMap = this.jButtonGuardarCambiosTablaProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosBodegas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductosBodegas.setName("jPanelParametrosReportesProductosBodegas"); 
		
		this.jPanelParametrosReportesAccionesProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductosBodegas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductosBodegas.setName("jPanelParametrosReportesAccionesProductosBodegas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductosBodegas = new JButtonMe();
		this.jButtonRecargarInformacionProductosBodegas.setText("Buscar");
		this.jButtonRecargarInformacionProductosBodegas.setToolTipText("Buscar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductosBodegas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductosBodegas.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductosBodegas = new JButtonMe();
		this.jButtonProcesarInformacionProductosBodegas.setText("Procesar");
		this.jButtonProcesarInformacionProductosBodegas.setToolTipText("Procesar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductosBodegas.setVisible(false);
			
		this.jButtonProcesarInformacionProductosBodegas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosBodegas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosBodegas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosBodegas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductosBodegas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosBodegas.setText("TIPO");       
		this.jComboBoxTiposReportesProductosBodegas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosBodegas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductosBodegas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductosBodegas.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductosBodegas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductosBodegas.setText("Accion");
		this.jComboBoxTiposRelacionesProductosBodegas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosBodegas.setText("Accion");
		this.jComboBoxTiposAccionesProductosBodegas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductosBodegas.setText("Accion");
		this.jComboBoxTiposSeleccionarProductosBodegas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductosBodegas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductosBodegas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosBodegas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosBodegas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductosBodegas = new JLabelMe();
		
		this.jLabelAccionesProductosBodegas.setText("Acciones");		
		this.jLabelAccionesProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductosBodegas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductosBodegas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductosBodegas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductosBodegas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductosBodegas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductosBodegas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductosBodegas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductosBodegas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductosBodegas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductosBodegas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductosBodegas.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductosBodegas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductosBodegas = new JButtonMe();
		//this.jButtonAnterioresProductosBodegas.setText("<<");
        this.jButtonAnterioresProductosBodegas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductosBodegas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductosBodegas = new JButtonMe();
		//this.jButtonSiguientesProductosBodegas.setText(">>");
        this.jButtonSiguientesProductosBodegas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductosBodegas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductosBodegas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductosBodegas.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductosBodegas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductosBodegas,"nuevoguardarcambios_button","Nue",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductosBodegas";
		inputMap = this.jButtonNuevoGuardarCambiosProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductosBodegas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductosBodegas";
		inputMap = this.jButtonRecargarInformacionProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductosBodegas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductosBodegas";
		inputMap = this.jButtonSiguientesProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductosBodegas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductosBodegas";
		inputMap = this.jButtonAnterioresProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductosBodegas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductosBodegas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductosBodegas.setMinimumSize(new Dimension(this.getWidth(),ProductosBodegasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosBodegasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosBodegas.setMaximumSize(new Dimension(this.getWidth(),ProductosBodegasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosBodegasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosBodegas.setPreferredSize(new Dimension(this.getWidth(),ProductosBodegasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosBodegasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductosBodegas = new GridBagLayout();

			this.jPanelPaginacionProductosBodegas.setLayout(gridaBagLayoutPaginacionProductosBodegas);						
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = 0;
			this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductosBodegas.add(this.jButtonAnterioresProductosBodegas, this.gridBagConstraintsProductosBodegas);
					
						
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosBodegas.gridy = 0;
			
			this.jPanelPaginacionProductosBodegas.add(this.jButtonNuevoGuardarCambiosProductosBodegas, this.gridBagConstraintsProductosBodegas);
						
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosBodegas.gridy = 0;
			this.jPanelPaginacionProductosBodegas.add(this.jButtonSiguientesProductosBodegas, this.gridBagConstraintsProductosBodegas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = 1;
			this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosBodegas.add(this.jButtonNuevoProductosBodegas, this.gridBagConstraintsProductosBodegas);
						
			
			
			if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
				this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductosBodegas.gridy = 1;
				this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductosBodegas.add(this.jButtonGuardarCambiosTablaProductosBodegas, this.gridBagConstraintsProductosBodegas);
			}
			
			
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = 1;
			this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosBodegas.add(this.jButtonDuplicarProductosBodegas, this.gridBagConstraintsProductosBodegas);
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = 1;
			this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosBodegas.add(this.jButtonCopiarProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = 1;
			this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosBodegas.add(this.jButtonVerFormProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = 1;
			this.gridBagConstraintsProductosBodegas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductosBodegas.add(this.jButtonCerrarProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
		
		
		this.jButtonRecargarInformacionProductosBodegas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosBodegas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosBodegas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductosBodegas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosBodegas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosBodegas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductosBodegas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosBodegas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosBodegas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductosBodegas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosBodegas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosBodegas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductosBodegas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosBodegas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosBodegas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductosBodegas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosBodegas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosBodegas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductosBodegas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosBodegas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosBodegas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductosBodegas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosBodegas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosBodegas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductosBodegas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosBodegas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosBodegas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductosBodegas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosBodegas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosBodegas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductosBodegas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosBodegas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosBodegas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductosBodegas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosBodegas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosBodegas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductosBodegas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductosBodegas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductosBodegas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductosBodegas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductosBodegas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductosBodegas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductosBodegas.setLayout(gridaBagParametrosReportesProductosBodegas);
			this.jPanelParametrosReportesAccionesProductosBodegas.setLayout(gridaBagParametrosReportesAccionesProductosBodegas);
			
			
			this.jPanelParametrosAuxiliar1ProductosBodegas.setLayout(gridaBagParametrosAuxiliar1ProductosBodegas);
			this.jPanelParametrosAuxiliar2ProductosBodegas.setLayout(gridaBagParametrosAuxiliar2ProductosBodegas);
			this.jPanelParametrosAuxiliar3ProductosBodegas.setLayout(gridaBagParametrosAuxiliar3ProductosBodegas);
			this.jPanelParametrosAuxiliar4ProductosBodegas.setLayout(gridaBagParametrosAuxiliar4ProductosBodegas);
			//this.jPanelParametrosAuxiliar5ProductosBodegas.setLayout(gridaBagParametrosAuxiliar2ProductosBodegas);			
			
			
			
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosBodegas.add(this.jButtonRecargarInformacionProductosBodegas, this.gridBagConstraintsProductosBodegas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosBodegas.add(this.jComboBoxTiposPaginacionProductosBodegas, this.gridBagConstraintsProductosBodegas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosBodegas.add(this.jCheckBoxConAltoMaximoTablaProductosBodegas, this.gridBagConstraintsProductosBodegas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosBodegas.add(this.jComboBoxTiposArchivosReportesProductosBodegas, this.gridBagConstraintsProductosBodegas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosBodegas.add(this.jPanelParametrosAuxiliar1ProductosBodegas, this.gridBagConstraintsProductosBodegas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosBodegas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductosBodegas.add(this.jComboBoxTiposReportesProductosBodegas, this.gridBagConstraintsProductosBodegas);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosBodegas.add(this.jPanelParametrosAuxiliar4ProductosBodegas, this.gridBagConstraintsProductosBodegas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosBodegas.add(this.jComboBoxTiposReportesProductosBodegas, this.gridBagConstraintsProductosBodegas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosBodegas.add(this.jCheckBoxGenerarReporteProductosBodegas, this.gridBagConstraintsProductosBodegas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosBodegas.add(this.jPanelParametrosAuxiliar2ProductosBodegas, this.gridBagConstraintsProductosBodegas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosBodegas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosBodegas.add(this.jLabelAccionesProductosBodegas, this.gridBagConstraintsProductosBodegas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
				this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductosBodegas.add(this.jButtonAbrirOrderByProductosBodegas, this.gridBagConstraintsProductosBodegas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosBodegas.add(this.jComboBoxTiposSeleccionarProductosBodegas, this.gridBagConstraintsProductosBodegas);			
			
			
			/*
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosBodegas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosBodegas.add(this.jCheckBoxSeleccionarTodosProductosBodegas, this.gridBagConstraintsProductosBodegas);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosBodegas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosBodegas.add(this.jCheckBoxSeleccionarTodosProductosBodegas, this.gridBagConstraintsProductosBodegas);															
				
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosBodegas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosBodegas.add(this.jCheckBoxSeleccionadosProductosBodegas, this.gridBagConstraintsProductosBodegas);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosBodegas.add(this.jPanelParametrosAuxiliar3ProductosBodegas, this.gridBagConstraintsProductosBodegas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosBodegas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosBodegas.add(this.jComboBoxTiposAccionesProductosBodegas, this.gridBagConstraintsProductosBodegas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductosBodegas = new GridBagLayout();

			this.jScrollPanelDatosProductosBodegas.setLayout(gridaBagLayoutDatosProductosBodegas);
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = 0;
			this.gridBagConstraintsProductosBodegas.gridx = 0;
			
			this.jScrollPanelDatosProductosBodegas.add(this.jTableDatosProductosBodegas, this.gridBagConstraintsProductosBodegas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductosBodegas.setViewportView(this.jTableDatosProductosBodegas);
		this.jTableDatosProductosBodegas.setFillsViewportHeight(true);
		this.jTableDatosProductosBodegas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductosBodegas= new GridBagLayout();
		this.jPanelAccionesProductosBodegas.setLayout(gridaBagLayoutAccionesProductosBodegas);
		
		
		/*	
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 0;
			
		this.jPanelAccionesProductosBodegas.add(this.jButtonNuevoProductosBodegas, this.gridBagConstraintsProductosBodegas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosBodegasProductosBodegas= new GridBagLayout();
		gridaBagLayoutBusquedaProductosBodegasProductosBodegas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosBodegasProductosBodegas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosBodegasProductosBodegas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosBodegasProductosBodegas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosBodegasProductosBodegas.setLayout(gridaBagLayoutBusquedaProductosBodegasProductosBodegas);

		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 0;
		gridBagConstraintsProductosBodegas.gridx = 0;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jLabelid_bodegaBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);

		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 0;
		gridBagConstraintsProductosBodegas.gridx = 1;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);


		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 1;
		gridBagConstraintsProductosBodegas.gridx = 0;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jLabelid_lineaBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);

		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 1;
		gridBagConstraintsProductosBodegas.gridx = 1;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);


		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 2;
		gridBagConstraintsProductosBodegas.gridx = 0;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jLabelid_linea_grupoBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);

		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 2;
		gridBagConstraintsProductosBodegas.gridx = 1;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);


		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 3;
		gridBagConstraintsProductosBodegas.gridx = 0;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jLabelid_linea_categoriaBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);

		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 3;
		gridBagConstraintsProductosBodegas.gridx = 1;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);


		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 4;
		gridBagConstraintsProductosBodegas.gridx = 0;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jLabelid_linea_marcaBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);

		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 4;
		gridBagConstraintsProductosBodegas.gridx = 1;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);

		gridBagConstraintsProductosBodegas = new GridBagConstraints();
		gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosBodegas.gridy = 5;
		gridBagConstraintsProductosBodegas.gridx =1;
		jPanelBusquedaProductosBodegasProductosBodegas.add(jButtonBusquedaProductosBodegasProductosBodegas, gridBagConstraintsProductosBodegas);

		jTabbedPaneBusquedasProductosBodegas.addTab("1.-Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ", jPanelBusquedaProductosBodegasProductosBodegas);
		jTabbedPaneBusquedasProductosBodegas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosBodegas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosBodegas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();						
			this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosBodegas.gridx = 0;		
			//this.gridBagConstraintsProductosBodegas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosBodegas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductosBodegas, this.gridBagConstraintsProductosBodegas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductosBodegas.gridx = 0;		
		//this.gridBagConstraintsProductosBodegas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductosBodegas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductosBodegas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosBodegas.gridx = 0;		
			this.gridBagConstraintsProductosBodegas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductosBodegas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductosBodegas, this.gridBagConstraintsProductosBodegas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductosBodegas, this.gridBagConstraintsProductosBodegas);								
		
		
		/*
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductosBodegas, this.gridBagConstraintsProductosBodegas);
		*/		
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosBodegas.gridx =0;
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosBodegas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosBodegas, this.gridBagConstraintsProductosBodegas);
				
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductosBodegas, this.gridBagConstraintsProductosBodegas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosBodegas = new GridBagLayout();
			this.jPanelBusquedasParametrosProductosBodegas.setLayout(gridaBagLayoutBusquedasParametrosProductosBodegas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductosBodegas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosBodegas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosBodegas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosBodegas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
			if(!Constantes.ISDEVELOPING) {
			} else {
				if(tieneColumnasOcultas) {
				}
			}					
			
		} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
		}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosBodegas, this.gridBagConstraintsProductosBodegas);
			
			
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
			
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosBodegas, this.gridBagConstraintsProductosBodegas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductosBodegas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductosBodegas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductosBodegas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductosBodegas.setName("jPanelReporteDinamicoProductosBodegas"); 
		
		this.jPanelReporteDinamicoProductosBodegas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosBodegas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosBodegas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductosBodegas.setLayout(gridaBagLayoutReporteDinamicoProductosBodegas);
		
		
		this.jInternalFrameReporteDinamicoProductosBodegas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductosBodegas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosBodegas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductosBodegas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductosBodegas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductosBodegas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductosBodegas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductosBodegas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductosBodegas.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductosBodegas.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductosBodegas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductosBodegas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosBodegas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosBodegas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Bodegases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductosBodegas = new JLabelMe();

		this.jLabelColumnasSelectReporteProductosBodegas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosBodegas.add(this.jLabelColumnasSelectReporteProductosBodegas, this.gridBagConstraintsProductosBodegas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductosBodegas = new JList<Reporte>();
		this.jListColumnasSelectReporteProductosBodegas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductosBodegas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductosBodegas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosBodegas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosBodegas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductosBodegas=new JScrollPane(this.jListColumnasSelectReporteProductosBodegas);
			
			this.jScrollColumnasSelectReporteProductosBodegas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosBodegas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosBodegas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductosBodegas.add(this.jListColumnasSelectReporteProductosBodegas, this.gridBagConstraintsProductosBodegas);
		this.jPanelReporteDinamicoProductosBodegas.add(this.jScrollColumnasSelectReporteProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductosBodegas = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductosBodegas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductosBodegas = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductosBodegas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductosBodegas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductosBodegas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosBodegas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosBodegas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductosBodegas=new JScrollPane(this.jListRelacionesSelectReporteProductosBodegas);
			
			this.jScrollRelacionesSelectReporteProductosBodegas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosBodegas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosBodegas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductosBodegas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductosBodegas = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductosBodegas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductosBodegas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductosBodegas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductosBodegas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosBodegas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosBodegas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductosBodegas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductosBodegas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductosBodegas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosBodegas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosBodegas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductosBodegas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductosBodegas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosBodegas.add(this.jLabelGenerarExcelReporteDinamicoProductosBodegas, this.gridBagConstraintsProductosBodegas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductosBodegas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductosBodegas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductosBodegas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductosBodegas.setToolTipText("Generar EXCEL"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductosBodegas.add(this.jButtonGenerarExcelReporteDinamicoProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosBodegas.add(this.jComboBoxTiposReportesDinamicoProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductosBodegas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductosBodegas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosBodegas.add(this.jLabelTiposArchivoReporteDinamicoProductosBodegas, this.gridBagConstraintsProductosBodegas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosBodegas.add(this.jComboBoxTiposArchivosReportesDinamicoProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductosBodegas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductosBodegas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductosBodegas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductosBodegas.setToolTipText("Generar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosBodegas.add(this.jButtonGenerarReporteDinamicoProductosBodegas, this.gridBagConstraintsProductosBodegas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductosBodegas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductosBodegas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductosBodegas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductosBodegas.setToolTipText("Cancelar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosBodegas.add(this.jButtonCerrarReporteDinamicoProductosBodegas, this.gridBagConstraintsProductosBodegas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductosBodegas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductosBodegas= new JScrollPane(jPanelReporteDinamicoProductosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductosBodegas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosBodegas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosBodegas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Bodegases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductosBodegas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductosBodegas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductosBodegas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductosBodegas);
		this.jInternalFrameReporteDinamicoProductosBodegas.getContentPane().add(this.jScrollPanelReporteDinamicoProductosBodegas, this.gridBagConstraintsProductosBodegas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductosBodegas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductosBodegas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductosBodegas.setName("jPanelImportacionProductosBodegas"); 
		
		this.jPanelImportacionProductosBodegas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosBodegas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosBodegas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductosBodegas.setLayout(gridaBagLayoutImportacionProductosBodegas);
		
		
		this.jInternalFrameImportacionProductosBodegas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductosBodegas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductosBodegas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosBodegas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductosBodegas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosBodegas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosBodegas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductosBodegas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosBodegas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosBodegas.setResizable(true);
	    this.jInternalFrameImportacionProductosBodegas.setClosable(true);
	    this.jInternalFrameImportacionProductosBodegas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductosBodegas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosBodegas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosBodegas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductosBodegas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosBodegas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosBodegas.setResizable(true);
	    this.jInternalFrameImportacionProductosBodegas.setClosable(true);
	    this.jInternalFrameImportacionProductosBodegas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductosBodegas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosBodegas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosBodegas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Bodegases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductosBodegas = new JLabelMe();

		this.jLabelArchivoImportacionProductosBodegas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosBodegas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosBodegas.add(this.jLabelArchivoImportacionProductosBodegas, this.gridBagConstraintsProductosBodegas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductosBodegas = new JFileChooser();		
		this.jFileChooserImportacionProductosBodegas.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductosBodegas = new JButtonMe();
		this.jButtonAbrirImportacionProductosBodegas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductosBodegas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductosBodegas.setToolTipText("Generar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosBodegas.add(this.jButtonAbrirImportacionProductosBodegas, this.gridBagConstraintsProductosBodegas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductosBodegas = new JLabelMe();

		this.jLabelPathArchivoImportacionProductosBodegas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosBodegas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosBodegas.add(this.jLabelPathArchivoImportacionProductosBodegas, this.gridBagConstraintsProductosBodegas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductosBodegas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductosBodegas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosBodegas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosBodegas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosBodegas.add(this.jTextFieldPathArchivoImportacionProductosBodegas, this.gridBagConstraintsProductosBodegas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductosBodegas = new JButtonMe();
		this.jButtonGenerarImportacionProductosBodegas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductosBodegas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductosBodegas.setToolTipText("Generar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosBodegas.add(this.jButtonGenerarImportacionProductosBodegas, this.gridBagConstraintsProductosBodegas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductosBodegas = new JButtonMe();
		this.jButtonCerrarImportacionProductosBodegas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductosBodegas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductosBodegas.setToolTipText("Cancelar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosBodegas.add(this.jButtonCerrarImportacionProductosBodegas, this.gridBagConstraintsProductosBodegas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductosBodegas = new GridBagLayout();
		
		this.jScrollPanelImportacionProductosBodegas= new JScrollPane(jPanelImportacionProductosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy =iPosYImportacion;
		this.gridBagConstraintsProductosBodegas.gridx =iPosXImportacion;
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductosBodegas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductosBodegas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductosBodegas);
		this.jInternalFrameImportacionProductosBodegas.getContentPane().add(this.jScrollPanelImportacionProductosBodegas, this.gridBagConstraintsProductosBodegas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductosBodegas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductosBodegas = new JButtonMe();
			this.jButtonAbrirOrderByProductosBodegas.setText("Orden");
			this.jButtonAbrirOrderByProductosBodegas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosBodegas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductosBodegas";
			inputMap = this.jButtonAbrirOrderByProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductosBodegas"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductosBodegas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductosBodegas.setName("jPanelOrderByProductosBodegas"); 
			
			this.jPanelOrderByProductosBodegas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosBodegas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosBodegas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductosBodegas.setLayout(gridaBagLayoutOrderByProductosBodegas);
			
			
			this.jTableDatosProductosBodegasOrderBy = new JTableMe();        
			this.jTableDatosProductosBodegasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosBodegasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosBodegasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosBodegasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosBodegasOrderBy.setViewportView(this.jTableDatosProductosBodegasOrderBy);
			this.jTableDatosProductosBodegasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosBodegasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductosBodegas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductosBodegas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductosBodegas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductosBodegas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductosBodegas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductosBodegas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductosBodegas.setTitle("Orden");
			this.jInternalFrameOrderByProductosBodegas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductosBodegas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductosBodegas.setResizable(true);
			this.jInternalFrameOrderByProductosBodegas.setClosable(true);
			this.jInternalFrameOrderByProductosBodegas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductosBodegas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosBodegas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosBodegas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Bodegases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductosBodegas.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductosBodegas.ipady =150;
				
			this.jPanelOrderByProductosBodegas.add(jScrollPanelDatosProductosBodegasOrderBy, this.gridBagConstraintsProductosBodegas);//this.jTableDatosProductosBodegasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductosBodegas = new JButtonMe();
			this.jButtonCerrarOrderByProductosBodegas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductosBodegas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductosBodegas.setToolTipText("Cancelar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductosBodegas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductosBodegas.add(this.jButtonCerrarOrderByProductosBodegas, this.gridBagConstraintsProductosBodegas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductosBodegas = new GridBagLayout();
			
			this.jScrollPanelOrderByProductosBodegas= new JScrollPane(jPanelOrderByProductosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductosBodegas.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductosBodegas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductosBodegas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductosBodegas);
			
			this.jInternalFrameOrderByProductosBodegas.getContentPane().add(this.jScrollPanelOrderByProductosBodegas, this.gridBagConstraintsProductosBodegas);			
		
		} else {
			this.jButtonAbrirOrderByProductosBodegas = new JButtonMe();
		}				
	}
	*/
	
	
	public void redimensionarTablaDatos(int iNumFilas) {
		this.redimensionarTablaDatos(iNumFilas,0);
	}
	
	public void redimensionarTablaDatos(int iNumFilas,int iTamanioFilaTabla) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    
		int iWidthTable=screenSize.width*2;//screenSize.width - (screenSize.width/8);
		int iWidthTableScroll=screenSize.width - (screenSize.width/8);
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productosbodegasSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
		//SI CALCULADO ES MENOR QUE MAXIMO
		/*
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		*/
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTableCalculado<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTableCalculado;
		}
		
		//NO VALE SIEMPRE PONE TAMANIO COLUMNA 200
		/*
		int iTotalWidth=0;
		int iWidthColumn=0;
		int iCountColumns=this.jTableDatosProductosBodegas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductosBodegas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductosBodegas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductosBodegas.getRowHeight();//ProductosBodegasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosBodegasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosBodegas.isSelected()) {
					iHeightTable=ProductosBodegasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosBodegasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosBodegasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosBodegasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosBodegas.isSelected()) {
					iHeightTable=ProductosBodegasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosBodegasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosBodegasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductosBodegas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosBodegas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosBodegas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductosBodegas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosBodegas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosBodegas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductosBodegas!=null && this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy()!=null) {
			//if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductosBodegas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductosBodegas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductosBodegas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductosBodegas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosBodegas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosBodegas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
		//VERSION 0
		/*
		//SI CALCULADO ES MENOR QUE MAXIMO
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTable<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTable;
		}
		*/
	}
	
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			//iSizeTabla=productosbodegasLogic.getProductosBodegass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosbodegass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductosBodegas> TraerProductosBodegasBeans(List<ProductosBodegas> productosbodegass,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductosBodegas productosbodegas:productosbodegass) {
					
				if(!(ProductosBodegasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosBodegasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productosbodegas.setsDetalleGeneralEntityReporte(ProductosBodegasConstantesFunciones.getProductosBodegasDescripcion(productosbodegas));
										
						
					
						
					
				} else  {
							
					//productosbodegas.setsDetalleGeneralEntityReporte(productosbodegas.getsDetalleGeneralEntityReporte());
										
				}
				
				//productosbodegasbeans.add(productosbodegasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productosbodegass;
    }
	//PARA REPORTES FIN
}
