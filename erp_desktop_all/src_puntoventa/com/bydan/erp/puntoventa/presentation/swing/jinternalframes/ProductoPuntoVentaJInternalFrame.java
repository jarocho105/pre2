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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.puntoventa.util.ProductoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class ProductoPuntoVentaJInternalFrame extends ProductoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoPuntoVenta;
	
	protected JMenuBar jmenuBarProductoPuntoVenta;
	
	protected JMenu jmenuProductoPuntoVenta;
	protected JMenu jmenuDatosProductoPuntoVenta;
	protected JMenu jmenuArchivoProductoPuntoVenta;
	protected JMenu jmenuAccionesProductoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsProductoPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormProductoPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductoPuntoVentaSessionBean productopuntoventaSessionBean;
		
	
	
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoPuntoVenta> productopuntoventas;		
	public List<ProductoPuntoVenta> productopuntoventasEliminados;	
	public List<ProductoPuntoVenta> productopuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoPuntoVenta;		
	protected JButton jButtonAbrirOrderByProductoPuntoVenta;
	
	
	//protected JPanel jPanelOrderByProductoPuntoVenta;
	//public JScrollPane jScrollPanelOrderByProductoPuntoVenta;	
	//protected JButton jButtonCerrarOrderByProductoPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoPuntoVentaLogic productopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionProductoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralProductoPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionProductoPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesProductoPuntoVenta;
	
    protected JPanel jPanelPaginacionProductoPuntoVenta;
    protected JPanel jPanelParametrosReportesProductoPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesProductoPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2ProductoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3ProductoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4ProductoPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5ProductoPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoPuntoVenta;
	//protected JPanel jPanelImportacionProductoPuntoVenta;
	
	
	public JTable jTableDatosProductoPuntoVenta;
	
	
	
	//public JTable jTableDatosProductoPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoPuntoVenta;
	protected JButton jButtonDuplicarProductoPuntoVenta;
	protected JButton jButtonCopiarProductoPuntoVenta;
	protected JButton jButtonVerFormProductoPuntoVenta;
	protected JButton jButtonNuevoRelacionesProductoPuntoVenta;
	protected JButton jButtonModificarProductoPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaProductoPuntoVenta;
	protected JButton jButtonCerrarProductoPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionProductoPuntoVenta;
	protected JButton jButtonProcesarInformacionProductoPuntoVenta;
	
	
	protected JButton jButtonAnterioresProductoPuntoVenta;
	protected JButton jButtonSiguientesProductoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosProductoPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoProductoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoPuntoVenta;
	//protected JButton jButtonGenerarImportacionProductoPuntoVenta;
	//protected JButton jButtonCerrarImportacionProductoPuntoVenta;
	//protected JFileChooser jFileChooserImportacionProductoPuntoVenta;
	//protected File fileImportacionProductoPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoPuntoVenta;
	protected JButton jButtonDuplicarToolBarProductoPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarProductoPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoPuntoVenta;
	protected JButton jButtonCopiarToolBarProductoPuntoVenta;
	protected JButton jButtonVerFormToolBarProductoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarProductoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoPuntoVenta;
	protected JButton jButtonCerrarToolBarProductoPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarProductoPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarProductoPuntoVenta;
	protected JButton jButtonAnterioresToolBarProductoPuntoVenta;
	protected JButton jButtonSiguientesToolBarProductoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarProductoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarProductoPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesProductoPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoPuntoVenta;
	protected JMenuItem jMenuItemCopiarProductoPuntoVenta;
	protected JMenuItem jMenuItemVerFormProductoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoPuntoVenta;
	protected JMenuItem jMenuItemCerrarProductoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarProductoPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionProductoPuntoVenta;
	protected JMenuItem jMenuItemAnterioresProductoPuntoVenta;
	protected JMenuItem jMenuItemSiguientesProductoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByProductoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarProductoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosProductoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralProductoPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteProductoPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteProductoPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteProductoPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteProductoPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteProductoPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionProductoPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionProductoPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionProductoPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorProductoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoProductoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoProductoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoProductoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoPuntoVenta;
	public JPanel jPanelFK_IdLineaProductoPuntoVenta;
	public JButton jButtonFK_IdLineaProductoPuntoVenta;
	public JPanel jPanelFK_IdLineaCategoriaProductoPuntoVenta;
	public JButton jButtonFK_IdLineaCategoriaProductoPuntoVenta;
	public JPanel jPanelFK_IdLineaGrupoProductoPuntoVenta;
	public JButton jButtonFK_IdLineaGrupoProductoPuntoVenta;
	public JPanel jPanelFK_IdLineaMarcaProductoPuntoVenta;
	public JButton jButtonFK_IdLineaMarcaProductoPuntoVenta;
	public JPanel jPanelFK_IdProductoProductoPuntoVenta;
	public JButton jButtonFK_IdProductoProductoPuntoVenta;
	
	public JPanel jPanelid_lineaFK_IdLineaProductoPuntoVenta;
	public JLabel jLabelid_lineaFK_IdLineaProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaProductoPuntoVenta;
	public JButton jButtonid_lineaFK_IdLineaProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaProductoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaProductoPuntoVentaArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta;
	public JLabel jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta;
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVentaArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta;
	public JLabel jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta;
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoProductoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoProductoPuntoVentaArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta;
	public JLabel jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta;
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaProductoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaProductoPuntoVentaArbol= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoPuntoVenta;
	public JLabel jLabelid_productoFK_IdProductoProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoPuntoVenta;
	public JButton jButtonid_productoFK_IdProductoProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta;
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoPuntoVenta)	{
		this.jButtonRecargarInformacionProductoPuntoVenta = jButtonRecargarInformacionProductoPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionProductoPuntoVenta() {
		return this.jButtonProcesarInformacionProductoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoPuntoVenta)	{
		this.jButtonProcesarInformacionProductoPuntoVenta = jButtonProcesarInformacionProductoPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoPuntoVenta() {
		return this.jButtonRecargarInformacionProductoPuntoVenta;
	}
	
	
	public List<ProductoPuntoVenta> getproductopuntoventas() {
		return this.productopuntoventas;
	}

	public void setproductopuntoventas(List<ProductoPuntoVenta> productopuntoventas) {
		this.productopuntoventas = productopuntoventas;
	}
	
	public List<ProductoPuntoVenta> getproductopuntoventasAux() {
		return this.productopuntoventasAux;
	}

	public void setproductopuntoventasAux(List<ProductoPuntoVenta> productopuntoventasAux) {
		this.productopuntoventasAux = productopuntoventasAux;
	}
	
	public List<ProductoPuntoVenta> getproductopuntoventasEliminados() {
		return this.productopuntoventasEliminados;
	}

	public void setProductoPuntoVentasEliminados(List<ProductoPuntoVenta> productopuntoventasEliminados) {
		this.productopuntoventasEliminados = productopuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoPuntoVenta() {
		return jComboBoxTiposSeleccionarProductoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarProductoPuntoVenta) {
		this.jComboBoxTiposSeleccionarProductoPuntoVenta = jComboBoxTiposSeleccionarProductoPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoPuntoVenta() {
		return jTextFieldValorCampoGeneralProductoPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralProductoPuntoVenta(
			JTextField jTextFieldValorCampoGeneralProductoPuntoVenta) {
		this.jTextFieldValorCampoGeneralProductoPuntoVenta = jTextFieldValorCampoGeneralProductoPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosProductoPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosProductoPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosProductoPuntoVenta) {
		this.jCheckBoxSeleccionarTodosProductoPuntoVenta = jCheckBoxSeleccionarTodosProductoPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoPuntoVenta() {
		return this.jCheckBoxSeleccionadosProductoPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosProductoPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosProductoPuntoVenta) {
		this.jCheckBoxSeleccionadosProductoPuntoVenta = jCheckBoxSeleccionadosProductoPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesProductoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesProductoPuntoVenta) {
		this.jComboBoxTiposArchivosReportesProductoPuntoVenta = jComboBoxTiposArchivosReportesProductoPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoPuntoVenta() {
		return this.jComboBoxTiposReportesProductoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoPuntoVenta(
			JComboBox jComboBoxTiposReportesProductoPuntoVenta) {
		this.jComboBoxTiposReportesProductoPuntoVenta = jComboBoxTiposReportesProductoPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoProductoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoProductoPuntoVenta = jComboBoxTiposReportesDinamicoProductoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesProductoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesProductoPuntoVenta) {
		this.jComboBoxTiposGraficosReportesProductoPuntoVenta = jComboBoxTiposGraficosReportesProductoPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoPuntoVenta() {
		return this.jComboBoxTiposPaginacionProductoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoPuntoVenta(
			JComboBox jComboBoxTiposPaginacionProductoPuntoVenta) {
		this.jComboBoxTiposPaginacionProductoPuntoVenta = jComboBoxTiposPaginacionProductoPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoPuntoVenta() {
		return this.jComboBoxTiposRelacionesProductoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoPuntoVenta() {
		return this.jComboBoxTiposAccionesProductoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesProductoPuntoVenta) {
		this.jComboBoxTiposRelacionesProductoPuntoVenta = jComboBoxTiposRelacionesProductoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoPuntoVenta(
			JComboBox jComboBoxTiposAccionesProductoPuntoVenta) {
		this.jComboBoxTiposAccionesProductoPuntoVenta = jComboBoxTiposAccionesProductoPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoProductoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoProductoPuntoVenta = jCheckBoxConGraficoDinamicoProductoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoPuntoVenta .setBorder(borderResaltar);		
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
		this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
		
		this.productopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"copiar","copiar","Copiar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"ver_form","ver_form","Ver"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"recargar","recargar","Recargar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,
							"cerrar","cerrar","Salir"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarProductoPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoPuntoVenta;
				
		//protected JButton jButtonModificarToolBarProductoPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoProductoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesProductoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosProductoPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoPuntoVenta.add(this.jMenuItemCerrarProductoPuntoVenta);
			
			this.jmenuAccionesProductoPuntoVenta.add(this.jMenuItemNuevoProductoPuntoVenta);
			this.jmenuAccionesProductoPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosProductoPuntoVenta);
			this.jmenuAccionesProductoPuntoVenta.add(this.jMenuItemNuevoRelacionesProductoPuntoVenta);
			this.jmenuAccionesProductoPuntoVenta.add(this.jMenuItemGuardarCambiosTablaProductoPuntoVenta);		
			this.jmenuAccionesProductoPuntoVenta.add(this.jMenuItemDuplicarProductoPuntoVenta);		
			this.jmenuAccionesProductoPuntoVenta.add(this.jMenuItemCopiarProductoPuntoVenta);		
			this.jmenuAccionesProductoPuntoVenta.add(this.jMenuItemVerFormProductoPuntoVenta);		
			
			this.jmenuDatosProductoPuntoVenta.add(this.jMenuItemRecargarInformacionProductoPuntoVenta);				
			this.jmenuDatosProductoPuntoVenta.add(this.jMenuItemAnterioresProductoPuntoVenta);				
			this.jmenuDatosProductoPuntoVenta.add(this.jMenuItemSiguientesProductoPuntoVenta);				
			this.jmenuDatosProductoPuntoVenta.add(this.jMenuItemAbrirOrderByProductoPuntoVenta);				
			this.jmenuDatosProductoPuntoVenta.add(this.jMenuItemMostrarOcultarProductoPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoPuntoVenta.add(this.jMenuItemGuardarCambiosProductoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoPuntoVenta.add(this.jmenuArchivoProductoPuntoVenta);		
			this.jmenuBarProductoPuntoVenta.add(this.jmenuAccionesProductoPuntoVenta);		
			this.jmenuBarProductoPuntoVenta.add(this.jmenuDatosProductoPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdLineaProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaProductoPuntoVenta.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaProductoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdLineaProductoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdLineaProductoPuntoVenta.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaProductoPuntoVenta,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaProductoPuntoVenta = new JLabelMe();
		jLabelid_lineaFK_IdLineaProductoPuntoVenta.setText("Linea :");
		jLabelid_lineaFK_IdLineaProductoPuntoVenta.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaCategoriaProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaCategoriaProductoPuntoVenta.setToolTipText("Buscar Por Linea Categoria ");
		this.jButtonFK_IdLineaCategoriaProductoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdLineaCategoriaProductoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdLineaCategoriaProductoPuntoVenta.setToolTipText("Buscar Por Linea Categoria ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaCategoriaProductoPuntoVenta,"buscar_button","Buscar Por Linea Categoria ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaCategoriaProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta = new JLabelMe();
		jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setText("Linea Categoria :");
		jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaGrupoProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaGrupoProductoPuntoVenta.setToolTipText("Buscar Por Linea Grupo ");
		this.jButtonFK_IdLineaGrupoProductoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdLineaGrupoProductoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdLineaGrupoProductoPuntoVenta.setToolTipText("Buscar Por Linea Grupo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaGrupoProductoPuntoVenta,"buscar_button","Buscar Por Linea Grupo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaGrupoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta = new JLabelMe();
		jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setText("Linea Grupo :");
		jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaMarcaProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaMarcaProductoPuntoVenta.setToolTipText("Buscar Por Linea Marca ");
		this.jButtonFK_IdLineaMarcaProductoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdLineaMarcaProductoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdLineaMarcaProductoPuntoVenta.setToolTipText("Buscar Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaMarcaProductoPuntoVenta,"buscar_button","Buscar Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaMarcaProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta = new JLabelMe();
		jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setText("Linea Marca :");
		jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setToolTipText("Linea Marca");
		jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoPuntoVenta.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdProductoProductoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdProductoProductoPuntoVenta.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoPuntoVenta,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoPuntoVenta = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoPuntoVenta.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoPuntoVenta.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta.setFocusable(false);


		this.jTabbedPaneBusquedasProductoPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoPuntoVenta = new ProductoPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Punto Venta DATOS");
			this.jInternalFrameDetalleFormProductoPuntoVenta = new ProductoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.productopuntoventaSessionBean.getConGuardarRelaciones(),this.productopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoPuntoVenta = null;//new ProductoPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosProductoPuntoVenta = new JTableMe();      
		
		String sToolTipProductoPuntoVenta="";
		sToolTipProductoPuntoVenta=ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoPuntoVenta+="(PuntoVenta.ProductoPuntoVenta)";
		}
		
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoPuntoVenta.setToolTipText(sToolTipProductoPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoPuntoVenta);
		this.jTableDatosProductoPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosProductoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosProductoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarProductoPuntoVenta = new JButtonMe();
		this.jButtonCopiarProductoPuntoVenta = new JButtonMe();
		this.jButtonVerFormProductoPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesProductoPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoPuntoVenta = new JButtonMe();
		this.jButtonCerrarProductoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosProductoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Punto Venta";
		
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesProductoPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoPuntoVenta=new ReporteDinamicoJInternalFrame(ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoPuntoVenta=new ImportacionJInternalFrame(ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByProductoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoPuntoVenta,false,this);
			
			//this.cargarOrderByProductoPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoPuntoVenta,true,this);
			
			//this.cargarOrderByProductoPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoPuntoVenta.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosProductoPuntoVenta.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosProductoPuntoVenta.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosProductoPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarProductoPuntoVenta.setText("Duplicar");
		this.jButtonCopiarProductoPuntoVenta.setText("Copiar");
		this.jButtonVerFormProductoPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesProductoPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.setText("Guardar");
		this.jButtonCerrarProductoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoPuntoVenta,"nuevo_button","Nuevo",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoPuntoVenta,"duplicar_button","Duplicar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoPuntoVenta,"copiar_button","Copiar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoPuntoVenta,"ver_form","Ver",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoPuntoVenta,"guardarcambiostabla_button","Guardar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoPuntoVenta,"cerrar_button","Salir",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoPuntoVenta.setToolTipText("Nuevo"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoPuntoVenta.setToolTipText("Duplicar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoPuntoVenta.setToolTipText("Copiar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoPuntoVenta.setToolTipText("Ver"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoPuntoVenta.setToolTipText("Nuevo Rel"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.setToolTipText("Guardar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoPuntoVenta.setToolTipText("Salir"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoPuntoVenta";
		inputMap = this.jButtonNuevoProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoPuntoVenta";
		inputMap = this.jButtonDuplicarProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarProductoPuntoVenta";
		inputMap = this.jButtonCopiarProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormProductoPuntoVenta";
		inputMap = this.jButtonVerFormProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoPuntoVenta";
		inputMap = this.jButtonModificarProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoPuntoVenta";
		inputMap = this.jButtonCerrarProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoPuntoVenta.setName("jPanelParametrosReportesProductoPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoPuntoVenta.setName("jPanelParametrosReportesAccionesProductoPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionProductoPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionProductoPuntoVenta.setToolTipText("Recargar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionProductoPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionProductoPuntoVenta.setToolTipText("Procesar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionProductoPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesProductoPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesProductoPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesProductoPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesProductoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresProductoPuntoVenta.setText("<<");
        this.jButtonAnterioresProductoPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesProductoPuntoVenta.setText(">>");
        this.jButtonSiguientesProductoPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoPuntoVenta,"nuevoguardarcambios_button","Nue",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoPuntoVenta";
		inputMap = this.jButtonRecargarInformacionProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoPuntoVenta";
		inputMap = this.jButtonSiguientesProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoPuntoVenta";
		inputMap = this.jButtonAnterioresProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),ProductoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),ProductoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),ProductoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionProductoPuntoVenta.setLayout(gridaBagLayoutPaginacionProductoPuntoVenta);						
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonAnterioresProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
					
						
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonNuevoGuardarCambiosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
						
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
			this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonSiguientesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 1;
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonNuevoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
						
			
			
			if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoPuntoVenta.gridy = 1;
				this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonGuardarCambiosTablaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 1;
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonDuplicarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 1;
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonCopiarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 1;
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonVerFormProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 1;
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoPuntoVenta.add(this.jButtonCerrarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionProductoPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoPuntoVenta.setLayout(gridaBagParametrosReportesProductoPuntoVenta);
			this.jPanelParametrosReportesAccionesProductoPuntoVenta.setLayout(gridaBagParametrosReportesAccionesProductoPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1ProductoPuntoVenta.setLayout(gridaBagParametrosAuxiliar1ProductoPuntoVenta);
			this.jPanelParametrosAuxiliar2ProductoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2ProductoPuntoVenta);
			this.jPanelParametrosAuxiliar3ProductoPuntoVenta.setLayout(gridaBagParametrosAuxiliar3ProductoPuntoVenta);
			this.jPanelParametrosAuxiliar4ProductoPuntoVenta.setLayout(gridaBagParametrosAuxiliar4ProductoPuntoVenta);
			//this.jPanelParametrosAuxiliar5ProductoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2ProductoPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jButtonRecargarInformacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoPuntoVenta.add(this.jComboBoxTiposPaginacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoPuntoVenta.add(this.jComboBoxTiposArchivosReportesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jPanelParametrosAuxiliar1ProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoPuntoVenta.add(this.jComboBoxTiposReportesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jPanelParametrosAuxiliar4ProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jComboBoxTiposReportesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jCheckBoxGenerarReporteProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jPanelParametrosAuxiliar2ProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jLabelAccionesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoPuntoVenta.add(this.jButtonAbrirOrderByProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jComboBoxTiposSeleccionarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jCheckBoxSeleccionarTodosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoPuntoVenta.add(this.jCheckBoxSeleccionarTodosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);															
				
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoPuntoVenta.add(this.jCheckBoxSeleccionadosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jPanelParametrosAuxiliar3ProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jComboBoxTiposAccionesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
	
				
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoPuntoVenta.add(this.jTextFieldValorCampoGeneralProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosProductoPuntoVenta.setLayout(gridaBagLayoutDatosProductoPuntoVenta);
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
			this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosProductoPuntoVenta.add(this.jTableDatosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoPuntoVenta.setViewportView(this.jTableDatosProductoPuntoVenta);
		this.jTableDatosProductoPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosProductoPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesProductoPuntoVenta.setLayout(gridaBagLayoutAccionesProductoPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
			
		this.jPanelAccionesProductoPuntoVenta.add(this.jButtonNuevoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdLineaProductoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdLineaProductoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaProductoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaProductoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaProductoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaProductoPuntoVenta.setLayout(gridaBagLayoutFK_IdLineaProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 0;
		jPanelFK_IdLineaProductoPuntoVenta.add(jLabelid_lineaFK_IdLineaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 1;
		jPanelFK_IdLineaProductoPuntoVenta.add(jComboBoxid_lineaFK_IdLineaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 1;
		gridBagConstraintsProductoPuntoVenta.gridx =1;
		jPanelFK_IdLineaProductoPuntoVenta.add(jButtonFK_IdLineaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		jTabbedPaneBusquedasProductoPuntoVenta.addTab("1.-Por Linea ", jPanelFK_IdLineaProductoPuntoVenta);
		jTabbedPaneBusquedasProductoPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdLineaCategoriaProductoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdLineaCategoriaProductoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaCategoriaProductoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaCategoriaProductoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaCategoriaProductoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaCategoriaProductoPuntoVenta.setLayout(gridaBagLayoutFK_IdLineaCategoriaProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 0;
		jPanelFK_IdLineaCategoriaProductoPuntoVenta.add(jLabelid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 1;
		jPanelFK_IdLineaCategoriaProductoPuntoVenta.add(jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 1;
		gridBagConstraintsProductoPuntoVenta.gridx =1;
		jPanelFK_IdLineaCategoriaProductoPuntoVenta.add(jButtonFK_IdLineaCategoriaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		jTabbedPaneBusquedasProductoPuntoVenta.addTab("2.-Por Linea Categoria ", jPanelFK_IdLineaCategoriaProductoPuntoVenta);
		jTabbedPaneBusquedasProductoPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdLineaGrupoProductoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdLineaGrupoProductoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaGrupoProductoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaGrupoProductoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaGrupoProductoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaGrupoProductoPuntoVenta.setLayout(gridaBagLayoutFK_IdLineaGrupoProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 0;
		jPanelFK_IdLineaGrupoProductoPuntoVenta.add(jLabelid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 1;
		jPanelFK_IdLineaGrupoProductoPuntoVenta.add(jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 1;
		gridBagConstraintsProductoPuntoVenta.gridx =1;
		jPanelFK_IdLineaGrupoProductoPuntoVenta.add(jButtonFK_IdLineaGrupoProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		jTabbedPaneBusquedasProductoPuntoVenta.addTab("3.-Por Linea Grupo ", jPanelFK_IdLineaGrupoProductoPuntoVenta);
		jTabbedPaneBusquedasProductoPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdLineaMarcaProductoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdLineaMarcaProductoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaMarcaProductoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaMarcaProductoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaMarcaProductoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaMarcaProductoPuntoVenta.setLayout(gridaBagLayoutFK_IdLineaMarcaProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 0;
		jPanelFK_IdLineaMarcaProductoPuntoVenta.add(jLabelid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 1;
		jPanelFK_IdLineaMarcaProductoPuntoVenta.add(jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 1;
		gridBagConstraintsProductoPuntoVenta.gridx =1;
		jPanelFK_IdLineaMarcaProductoPuntoVenta.add(jButtonFK_IdLineaMarcaProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		jTabbedPaneBusquedasProductoPuntoVenta.addTab("4.-Por Linea Marca ", jPanelFK_IdLineaMarcaProductoPuntoVenta);
		jTabbedPaneBusquedasProductoPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoPuntoVenta.setLayout(gridaBagLayoutFK_IdProductoProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 0;
		jPanelFK_IdProductoProductoPuntoVenta.add(jLabelid_productoFK_IdProductoProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 1;
		jPanelFK_IdProductoProductoPuntoVenta.add(jComboBoxid_productoFK_IdProductoProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);


		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoPuntoVenta.gridy = 0;
		gridBagConstraintsProductoPuntoVenta.gridx = 0;
		jPanelFK_IdProductoProductoPuntoVenta.add(this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPuntoVenta.gridy = 1;
		gridBagConstraintsProductoPuntoVenta.gridx =1;
		jPanelFK_IdProductoProductoPuntoVenta.add(jButtonFK_IdProductoProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);

		jTabbedPaneBusquedasProductoPuntoVenta.addTab("5.-Por Producto ", jPanelFK_IdProductoProductoPuntoVenta);
		jTabbedPaneBusquedasProductoPuntoVenta.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsProductoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsProductoPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoPuntoVenta.gridx = 0;		
			this.gridBagConstraintsProductoPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		*/		
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoPuntoVenta.gridx =0;
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
				
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosProductoPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			
			
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
			
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoPuntoVenta.setName("jPanelReporteDinamicoProductoPuntoVenta"); 
		
		this.jPanelReporteDinamicoProductoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoProductoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoProductoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jLabelColumnasSelectReporteProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteProductoPuntoVenta);
			
			this.jScrollColumnasSelectReporteProductoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jListColumnasSelectReporteProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jScrollColumnasSelectReporteProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteProductoPuntoVenta);
			
			this.jScrollRelacionesSelectReporteProductoPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoPuntoVenta.setToolTipText("Generar EXCEL"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoPuntoVenta.setToolTipText("Generar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jButtonGenerarReporteDinamicoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoPuntoVenta.setToolTipText("Cancelar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoPuntoVenta.add(this.jButtonCerrarReporteDinamicoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoPuntoVenta= new JScrollPane(jPanelReporteDinamicoProductoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoPuntoVenta);
		this.jInternalFrameReporteDinamicoProductoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoPuntoVenta.setName("jPanelImportacionProductoPuntoVenta"); 
		
		this.jPanelImportacionProductoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoPuntoVenta.setLayout(gridaBagLayoutImportacionProductoPuntoVenta);
		
		
		this.jInternalFrameImportacionProductoPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionProductoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionProductoPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionProductoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionProductoPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionProductoPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoPuntoVenta.add(this.jLabelArchivoImportacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionProductoPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionProductoPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoPuntoVenta.setToolTipText("Generar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoPuntoVenta.add(this.jButtonAbrirImportacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoPuntoVenta.add(this.jLabelPathArchivoImportacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoPuntoVenta.add(this.jTextFieldPathArchivoImportacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionProductoPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoPuntoVenta.setToolTipText("Generar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoPuntoVenta.add(this.jButtonGenerarImportacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionProductoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoPuntoVenta.setToolTipText("Cancelar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoPuntoVenta.add(this.jButtonCerrarImportacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoPuntoVenta= new JScrollPane(jPanelImportacionProductoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoPuntoVenta);
		this.jInternalFrameImportacionProductoPuntoVenta.getContentPane().add(this.jScrollPanelImportacionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByProductoPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByProductoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoPuntoVenta";
			inputMap = this.jButtonAbrirOrderByProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoPuntoVenta.setName("jPanelOrderByProductoPuntoVenta"); 
			
			this.jPanelOrderByProductoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoPuntoVenta.setLayout(gridaBagLayoutOrderByProductoPuntoVenta);
			
			
			this.jTableDatosProductoPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosProductoPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoPuntoVentaOrderBy.setViewportView(this.jTableDatosProductoPuntoVentaOrderBy);
			this.jTableDatosProductoPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByProductoPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByProductoPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByProductoPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoPuntoVenta.ipady =150;
				
			this.jPanelOrderByProductoPuntoVenta.add(jScrollPanelDatosProductoPuntoVentaOrderBy, this.gridBagConstraintsProductoPuntoVenta);//this.jTableDatosProductoPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByProductoPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoPuntoVenta.setToolTipText("Cancelar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoPuntoVenta.add(this.jButtonCerrarOrderByProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoPuntoVenta= new JScrollPane(jPanelOrderByProductoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoPuntoVenta);
			
			this.jInternalFrameOrderByProductoPuntoVenta.getContentPane().add(this.jScrollPanelOrderByProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByProductoPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productopuntoventaSessionBean.getConGuardarRelaciones()
			) {
		}
		
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
		int iCountColumns=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoPuntoVenta.getRowHeight();//ProductoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta.isSelected()) {
					iHeightTable=ProductoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoPuntoVenta.isSelected()) {
					iHeightTable=ProductoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoPuntoVenta!=null && this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productopuntoventaLogic.getProductoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productopuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoPuntoVenta> TraerProductoPuntoVentaBeans(List<ProductoPuntoVenta> productopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoPuntoVenta productopuntoventa:productopuntoventas) {
					
				if(!(ProductoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productopuntoventa.setsDetalleGeneralEntityReporte(ProductoPuntoVentaConstantesFunciones.getProductoPuntoVentaDescripcion(productopuntoventa));
										
					productopuntoventa.setesta_activo_descripcion(ProductoPuntoVentaConstantesFunciones.getesta_activoDescripcion(productopuntoventa));	
					
						
					
				} else  {
							
					//productopuntoventa.setsDetalleGeneralEntityReporte(productopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//productopuntoventabeans.add(productopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productopuntoventas;
    }
	//PARA REPORTES FIN
}
